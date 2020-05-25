/*
 * Corona-Warn-App
 * SAP SE and all other contributors /
 * copyright owners license this file to you under the Apache
 * License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package app.coronawarn.server.common.persistence.domain.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = ValidRollingStartIntervalNumberValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidRollingStartIntervalNumber {

  /**
   * Error message.
   *
   * @return the error message
   */
  String message() default "Rolling start number must be greater 0 and cannot be in the future.";

  /**
   * Groups.
   *
   * @return
   */
  Class<?>[] groups() default {};

  /**
   * Payload.
   *
   * @return
   */
  Class<? extends Payload>[] payload() default {};
}
