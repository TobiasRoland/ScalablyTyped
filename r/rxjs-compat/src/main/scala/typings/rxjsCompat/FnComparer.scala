package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnComparer extends js.Object {
  def apply[T](): js.Any = js.native
  def apply[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): js.Any = js.native
}

