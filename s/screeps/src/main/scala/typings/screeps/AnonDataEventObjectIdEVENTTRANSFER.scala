package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEventObjectIdEVENTTRANSFER extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any
  var event: EVENT_TRANSFER
  var objectId: String
}

object AnonDataEventObjectIdEVENTTRANSFER {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any,
    event: EVENT_TRANSFER,
    objectId: String
  ): AnonDataEventObjectIdEVENTTRANSFER = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataEventObjectIdEVENTTRANSFER]
  }
}

