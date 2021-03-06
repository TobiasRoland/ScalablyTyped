package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设置
trait SettingOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.undefined
}

object SettingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ AuthSetting => Unit = null
  ): SettingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SettingOptions]
  }
}

