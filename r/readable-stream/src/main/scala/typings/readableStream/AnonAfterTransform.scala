package typings.readableStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterTransform extends js.Object {
  var needTransform: Boolean
  var transforming: Boolean
  var writecb: (js.Function1[/* err */ js.Any, _]) | Null
  var writechunk: js.Any
   // TODO
  var writeencoding: String | Null
  def afterTransform(er: js.Any, data: js.Any): Unit | Boolean
}

object AnonAfterTransform {
  @scala.inline
  def apply(
    afterTransform: (js.Any, js.Any) => Unit | Boolean,
    needTransform: Boolean,
    transforming: Boolean,
    writechunk: js.Any,
    writecb: /* err */ js.Any => _ = null,
    writeencoding: String = null
  ): AnonAfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = js.Any.fromFunction2(afterTransform), needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any])
    if (writecb != null) __obj.updateDynamic("writecb")(js.Any.fromFunction1(writecb))
    if (writeencoding != null) __obj.updateDynamic("writeencoding")(writeencoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfterTransform]
  }
}

