package typings.formstate

import typings.formstate.formStateMod.ValidatableMapOrArray
import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalseHasError[TValue /* <: ValidatableMapOrArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object AnonFalseHasError {
  @scala.inline
  def apply[TValue /* <: ValidatableMapOrArray */](hasError: `false`, value: TValue): AnonFalseHasError[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFalseHasError[TValue]]
  }
}

