package typings.angularCompiler.publicApiMod

import typings.angularCompiler.AnonErrors
import typings.angularCompiler.templateMod.ParseTemplateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "parseTemplate")
@js.native
object parseTemplate extends js.Object {
  def apply(template: String, templateUrl: String): AnonErrors = js.native
  def apply(template: String, templateUrl: String, options: ParseTemplateOptions): AnonErrors = js.native
}

