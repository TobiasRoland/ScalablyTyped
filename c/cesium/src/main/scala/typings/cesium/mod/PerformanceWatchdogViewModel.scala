package typings.cesium.mod

import typings.cesium.AnonLowFrameRateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerformanceWatchdogViewModel")
@js.native
class PerformanceWatchdogViewModel () extends js.Object {
  def this(options: AnonLowFrameRateMessage) = this()
  var dismissMessage: Command = js.native
  var lowFrameRateMessage: String = js.native
  var lowFrameRateMessageDismissed: Boolean = js.native
  var scene: Scene = js.native
  var showingLowFrameRateMessage: Boolean = js.native
}

