package typings.baiduApp.swan

import typings.baiduApp.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExtConfigOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetExtConfigOptions(res: AnonErrMsg with ExtConfig): Unit
}

object GetExtConfigOptions {
  @scala.inline
  def apply(
    success: AnonErrMsg with ExtConfig => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetExtConfigOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetExtConfigOptions]
  }
}

