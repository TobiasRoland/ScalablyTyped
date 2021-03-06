package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频播放控制
trait PlayVoiceOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要播放的语音文件的文件路径 */
  var filePath: String
}

object PlayVoiceOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): PlayVoiceOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PlayVoiceOptions]
  }
}

