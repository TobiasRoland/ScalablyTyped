package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", "safeLoadAll")
@js.native
object safeLoadAll extends js.Object {
  def apply(str: String): js.Array[_] = js.native
  def apply(str: String, iterator: js.UndefOr[scala.Nothing], opts: LoadOptions): js.Array[_] = js.native
  def apply(str: String, iterator: js.Function1[/* doc */ js.Any, Unit]): js.UndefOr[scala.Nothing] = js.native
  def apply(str: String, iterator: js.Function1[/* doc */ js.Any, Unit], opts: LoadOptions): js.UndefOr[scala.Nothing] = js.native
}

