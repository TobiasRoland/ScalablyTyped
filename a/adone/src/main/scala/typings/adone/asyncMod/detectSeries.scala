package typings.adone.asyncMod

import typings.async.asyncMod.AsyncBooleanIterator
import typings.async.asyncMod.AsyncResultCallback
import typings.async.asyncMod.IterableCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/async", "detectSeries")
@js.native
object detectSeries extends js.Object {
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
}

