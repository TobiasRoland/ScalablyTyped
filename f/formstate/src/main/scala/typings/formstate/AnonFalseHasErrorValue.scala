package typings.formstate

import typings.formstate.formStateLazyMod.ValidatableArray
import typings.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalseHasErrorValue[TValue /* <: ValidatableArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object AnonFalseHasErrorValue {
  @scala.inline
  def apply[TValue /* <: ValidatableArray */](hasError: `false`, value: TValue): AnonFalseHasErrorValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFalseHasErrorValue[TValue]]
  }
}

