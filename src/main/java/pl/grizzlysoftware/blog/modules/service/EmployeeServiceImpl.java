package pl.grizzlysoftware.blog.modules.service;

import org.springframework.stereotype.Service;
import pl.grizzlysoftware.blog.modules.entity.EmployeeEntity;

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
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public void save(EmployeeEntity employee) {
        //do some stuff here
    }
}
