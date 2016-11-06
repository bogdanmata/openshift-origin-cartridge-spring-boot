/*
 * Copyright 2016-* to the Bogdan MATA.
 *
 * For License read the license attached.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bogdanmata.openshift.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main entry in the application
 *
 * Created Nov 6, 2016
 *
 * @author Bogdan MATA
 * @since 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {
    "org.bogdanmata.openshift.configurations"
})
public class Application {

  private static ApplicationContext applicationContext;

  public static void main(String... args) {
    applicationContext = SpringApplication.run(Application.class, args);
  }

  public static void exit() {
    SpringApplication.exit(applicationContext);
  }
}
