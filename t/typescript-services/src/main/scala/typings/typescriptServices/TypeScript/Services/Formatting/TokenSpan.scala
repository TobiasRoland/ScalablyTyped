package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.TokenSpan")
@js.native
class TokenSpan protected () extends TextSpan {
  def this(kind: SyntaxKind, start: Double, length: Double) = this()
  var _kind: js.Any = js.native
  def kind(): SyntaxKind = js.native
}

