package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonControlOther extends js.Object {
  var control: String
  var other: String
  var root: String
  var selectWrapper: String
}

object AnonControlOther {
  @scala.inline
  def apply(control: String, other: String, root: String, selectWrapper: String): AnonControlOther = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonControlOther]
  }
}

