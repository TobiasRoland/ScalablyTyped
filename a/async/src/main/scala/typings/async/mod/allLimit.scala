package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "allLimit")
@js.native
object allLimit extends js.Object {
  def apply[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
}

