package typings.naverWhale.whale.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.windows.create")
@js.native
object create extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* window */ js.UndefOr[typings.chrome.chrome.windows.Window], Unit]): Unit = js.native
  def apply(createData: typings.chrome.chrome.windows.CreateData): Unit = js.native
  def apply(
    createData: typings.chrome.chrome.windows.CreateData,
    callback: js.Function1[/* window */ js.UndefOr[typings.chrome.chrome.windows.Window], Unit]
  ): Unit = js.native
}

