package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupsContentSetting
  extends typings.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typings.chrome.chrome.contentSettings.PopupsSetDetails): Unit = js.native
  def set(details: typings.chrome.chrome.contentSettings.PopupsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

