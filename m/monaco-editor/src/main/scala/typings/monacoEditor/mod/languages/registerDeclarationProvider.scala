package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "languages.registerDeclarationProvider")
@js.native
object registerDeclarationProvider extends js.Object {
  def apply(languageId: String, provider: DeclarationProvider): IDisposable = js.native
}

