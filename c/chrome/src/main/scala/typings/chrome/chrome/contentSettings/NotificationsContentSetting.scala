package typings.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsContentSetting extends ContentSetting {
  def set(details: NotificationsSetDetails): Unit = js.native
  def set(details: NotificationsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

