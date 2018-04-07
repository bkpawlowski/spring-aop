package pl.grizzlysoftware.blog.modules;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.grizzlysoftware.blog.modules.config.ApplicationConfiguration;
import pl.grizzlysoftware.blog.modules.entity.EmployeeEntity;
import pl.grizzlysoftware.blog.modules.service.EmployeeService;

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
public class ApplicationStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(ApplicationConfiguration.class);
        appContext.refresh();
        EmployeeService employeeService = (EmployeeService) appContext.getBean(EmployeeService.class);


        EmployeeEntity e = new EmployeeEntity(1l, "John", "Doe");

        System.out.println("before save: "+e.toString());
        employeeService.save(e);
        System.out.println("after save: "+e.toString());
    }
}
