package typings.cesium.mod

import typings.cesium.AnonContainerLowFrameRateMessage
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerformanceWatchdog")
@js.native
class PerformanceWatchdog () extends js.Object {
  def this(options: AnonContainerLowFrameRateMessage) = this()
  var container: Element = js.native
  var viewModel: PerformanceWatchdogViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

