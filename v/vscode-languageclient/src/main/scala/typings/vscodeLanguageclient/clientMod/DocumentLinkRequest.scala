package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentLinkRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    DocumentLinkParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

