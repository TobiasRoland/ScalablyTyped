package typings.sipJs.coreMod

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InfoUserAgentClient")
@js.native
class InfoUserAgentClient protected ()
  extends typings.sipJs.userAgentsMod.InfoUserAgentClient {
  def this(dialog: typings.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

