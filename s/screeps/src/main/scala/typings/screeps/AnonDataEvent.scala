package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEvent extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any
  var event: EVENT_OBJECT_DESTROYED
  var objectId: String
}

object AnonDataEvent {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any,
    event: EVENT_OBJECT_DESTROYED,
    objectId: String
  ): AnonDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataEvent]
  }
}

