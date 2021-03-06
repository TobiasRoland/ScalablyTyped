package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /** The timestamp at which the command was created. The timestamp is automatically generated by the server. */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * The duration for which the command is valid. The command will expire if not executed by the device during this time. The default duration if
    * unspecified is ten minutes. There is no maximum duration.
    */
  var duration: js.UndefOr[String] = js.undefined
  /** For commands of type RESET_PASSWORD, optionally specifies the new password. */
  var newPassword: js.UndefOr[String] = js.undefined
  /** For commands of type RESET_PASSWORD, optionally specifies flags. */
  var resetPasswordFlags: js.UndefOr[js.Array[String]] = js.undefined
  /** The type of the command. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(
    createTime: String = null,
    duration: String = null,
    newPassword: String = null,
    resetPasswordFlags: js.Array[String] = null,
    `type`: String = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (newPassword != null) __obj.updateDynamic("newPassword")(newPassword.asInstanceOf[js.Any])
    if (resetPasswordFlags != null) __obj.updateDynamic("resetPasswordFlags")(resetPasswordFlags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

