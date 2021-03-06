package typings.wegameApi.wx

import typings.wegameApi.AnonAudioSources
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getAvailableAudioSources")
@js.native
object getAvailableAudioSources extends js.Object {
  /**
    * 获取当前支持的音频输入源
    */
  def apply(param: CallbacksWithType[AnonAudioSources]): Unit = js.native
}

