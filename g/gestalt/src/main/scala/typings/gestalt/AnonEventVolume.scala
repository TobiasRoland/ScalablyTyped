package typings.gestalt

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventVolume extends js.Object {
  var event: SyntheticEvent[HTMLDivElement, Event_]
  var volume: Double
}

object AnonEventVolume {
  @scala.inline
  def apply(event: SyntheticEvent[HTMLDivElement, Event_], volume: Double): AnonEventVolume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventVolume]
  }
}

