package typings.sipJs.userAgentsMod

import typings.sipJs.dialogsMod.SessionDialog
import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typings.sipJs.reInviteUserAgentClientMod.ReInviteUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
}

