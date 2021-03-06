package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSyntheticEvent extends js.Object {
  var syntheticEvent: SyntheticEvent[HTMLInputElement, Event_]
  var value: String
}

object AnonSyntheticEvent {
  @scala.inline
  def apply(syntheticEvent: SyntheticEvent[HTMLInputElement, Event_], value: String): AnonSyntheticEvent = {
    val __obj = js.Dynamic.literal(syntheticEvent = syntheticEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSyntheticEvent]
  }
}

