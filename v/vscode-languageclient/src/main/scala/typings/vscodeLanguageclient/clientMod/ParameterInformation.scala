package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ParameterInformation")
@js.native
object ParameterInformation extends js.Object {
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  def create(label: String): typings.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: String, documentation: String): typings.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double]): typings.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double], documentation: String): typings.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
}

