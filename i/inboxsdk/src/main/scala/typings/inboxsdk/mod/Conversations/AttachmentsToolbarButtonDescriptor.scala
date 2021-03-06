package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsToolbarButtonDescriptor extends js.Object {
  var iconUrl: String
  var tooltip: String
  def onClick(event: AttachmentsToolbarButtonEvent): Unit
}

object AttachmentsToolbarButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentsToolbarButtonEvent => Unit, tooltip: String): AttachmentsToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachmentsToolbarButtonDescriptor]
  }
}

