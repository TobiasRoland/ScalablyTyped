package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.imageMod.ImageOptions
import typings.actionsOnGoogle.incomingMod._IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "Image")
@js.native
class Image protected ()
  extends typings.actionsOnGoogle.conversationMod.Image
     with _IncomingMessage {
  /**
    * @param options Image options
    * @public
    */
  def this(option: ImageOptions) = this()
}

