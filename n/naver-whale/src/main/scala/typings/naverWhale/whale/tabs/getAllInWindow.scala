package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.getAllInWindow")
@js.native
object getAllInWindow extends js.Object {
  def apply(callback: js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, Unit]): Unit = js.native
  def apply(windowId: Double, callback: js.Function1[/* tab */ typings.chrome.chrome.tabs.Tab, Unit]): Unit = js.native
}

