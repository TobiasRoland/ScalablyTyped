package typings.bluebirdGlobal

import typings.bluebird.mod.Resolvable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnErrorOnFulfilled[T] extends js.Object {
  def apply[U](): Unit = js.native
  def apply[U](onFulfilled: js.Function1[/* value */ T, Resolvable[U]]): Unit = js.native
  def apply[U](
    onFulfilled: js.Function1[/* value */ T, Resolvable[U]],
    onRejected: js.Function1[/* error */ js.Any, Resolvable[U]]
  ): Unit = js.native
}

