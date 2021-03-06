package typings.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "compose")
@js.native
object compose extends js.Object {
  def apply[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = js.native
}

