package pl.grizzlysoftware.blog.modules.processor.module1;

import org.springframework.stereotype.Component;
import pl.grizzlysoftware.blog.modules.entity.EmployeeEntity;
import pl.grizzlysoftware.blog.modules.processor.EntityProcessor;

import java.lang.reflect.Proxy;

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
@Component
public class NameChangingProcessor implements EntityProcessor<EmployeeEntity> {
    public void process(EmployeeEntity e) {
        e.setName("Modified_"+e.getName());
    }
}
