package typings.sipJs.mod.Core

import typings.sipJs.dialogStateMod.DialogState
import typings.sipJs.sessionSessionDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SessionDialog")
@js.native
class SessionDialog protected ()
  extends typings.sipJs.coreMod.SessionDialog {
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteClientTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteServerTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteClientTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typings.sipJs.transactionsMod.InviteServerTransaction,
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}

