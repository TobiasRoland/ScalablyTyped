package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceSymbolParams */ js.Any, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation] | Null, 
    Unit, 
    Unit
  ] = js.native
}

