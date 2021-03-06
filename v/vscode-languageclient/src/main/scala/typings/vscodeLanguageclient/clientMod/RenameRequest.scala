package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typings.vscodeLanguageserverProtocol.protocolMod.RenameRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    RenameParams, 
    typings.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}

