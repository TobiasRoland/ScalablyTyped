package typings.deepExtend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-extend", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(target: js.Any, sources: js.Any*): js.Any = js.native
  def apply[T, U](target: T, source: U): T with U = js.native
  def apply[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
  def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
}

