package pl.grizzlysoftware.blog.modules.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.grizzlysoftware.blog.modules.entity.EmployeeEntity;
import pl.grizzlysoftware.blog.modules.processor.EntityProcessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

/**
 * Copyright 2018, Bartosz Pawłowski, Grizzly Software
 * https://www.grizzlysoftware.pl
 * bpawlowski@grizzlysoftware.pl
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
@Aspect
@Component
public class EmployeeProcessingAspect {
    private Collection<EntityProcessor<EmployeeEntity>> processors;

    @Autowired
    public EmployeeProcessingAspect(Optional<Collection<EntityProcessor<EmployeeEntity>>> processors) {
        this.processors = processors.orElseGet(() -> new ArrayList<>());
    }

    public EmployeeProcessingAspect(Collection<EntityProcessor<EmployeeEntity>> processors) {
        this.processors = processors;
    }

    @Before(value = "execution(* pl.grizzlysoftware.blog.modules.service.EmployeeService.save(pl.grizzlysoftware.blog.modules.entity.EmployeeEntity)) && args(employee)", argNames = "employee")
    private void savePointCut(EmployeeEntity employee) {
        for (EntityProcessor<EmployeeEntity> processor : processors) {
            processor.process(employee);
        }
    }
}
