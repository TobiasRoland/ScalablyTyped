package typings.wegameApi.wx.types

import typings.wegameApi.AnonDataArrayBuffer
import typings.wegameApi.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var encoding: js.UndefOr[FileContentEncoding] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  var filePath: String
  var success: js.UndefOr[js.Function1[/* res */ AnonDataArrayBuffer, Unit]] = js.undefined
}

object ReadfileParams {
  @scala.inline
  def apply(
    filePath: String,
    complete: () => Unit = null,
    encoding: FileContentEncoding = null,
    fail: /* res */ AnonErrMsg => Unit = null,
    success: /* res */ AnonDataArrayBuffer => Unit = null
  ): ReadfileParams = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ReadfileParams]
  }
}

