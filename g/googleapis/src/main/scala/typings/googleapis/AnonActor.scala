package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActor extends js.Object {
  var actor: js.UndefOr[AnonClientSpecificActorInfoDisplayName] = js.native
  var attachments: js.UndefOr[js.Array[AnonContent]] = js.native
  var content: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var objectType: js.UndefOr[String] = js.native
  var originalContent: js.UndefOr[String] = js.native
  var plusoners: js.UndefOr[AnonSelfLink] = js.native
  var replies: js.UndefOr[AnonSelfLink] = js.native
  var resharers: js.UndefOr[AnonSelfLink] = js.native
  var url: js.UndefOr[String] = js.native
}

object AnonActor {
  @scala.inline
  def apply(
    actor: AnonClientSpecificActorInfoDisplayName = null,
    attachments: js.Array[AnonContent] = null,
    content: String = null,
    id: String = null,
    objectType: String = null,
    originalContent: String = null,
    plusoners: AnonSelfLink = null,
    replies: AnonSelfLink = null,
    resharers: AnonSelfLink = null,
    url: String = null
  ): AnonActor = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (resharers != null) __obj.updateDynamic("resharers")(resharers.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActor]
  }
}

