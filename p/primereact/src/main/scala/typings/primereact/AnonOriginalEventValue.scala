package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalEventValue extends js.Object {
  var originalEvent: Event_
  var value: js.Any
}

object AnonOriginalEventValue {
  @scala.inline
  def apply(originalEvent: Event_, value: js.Any): AnonOriginalEventValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalEventValue]
  }
}

