package typings.evernote

import typings.evernote.mod.Evernote.SharedNotebookPrivilegeLevel
import typings.evernote.mod.Evernote.SharedNotebookRecipientSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowPreview extends js.Object {
  var allowPreview: js.UndefOr[Boolean] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var notebookModifiable: js.UndefOr[Boolean] = js.undefined
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  var recipientSettings: js.UndefOr[SharedNotebookRecipientSettings] = js.undefined
  var requireLogin: js.UndefOr[Boolean] = js.undefined
  var serviceCreated: js.UndefOr[Double] = js.undefined
  var serviceUpdated: js.UndefOr[Double] = js.undefined
  var shareKey: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AnonAllowPreview {
  @scala.inline
  def apply(
    allowPreview: js.UndefOr[Boolean] = js.undefined,
    email: String = null,
    id: Int | Double = null,
    notebookGuid: String = null,
    notebookModifiable: js.UndefOr[Boolean] = js.undefined,
    privilege: SharedNotebookPrivilegeLevel = null,
    recipientSettings: SharedNotebookRecipientSettings = null,
    requireLogin: js.UndefOr[Boolean] = js.undefined,
    serviceCreated: Int | Double = null,
    serviceUpdated: Int | Double = null,
    shareKey: String = null,
    userId: Int | Double = null,
    username: String = null
  ): AnonAllowPreview = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPreview)) __obj.updateDynamic("allowPreview")(allowPreview.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (!js.isUndefined(notebookModifiable)) __obj.updateDynamic("notebookModifiable")(notebookModifiable.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientSettings != null) __obj.updateDynamic("recipientSettings")(recipientSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(requireLogin)) __obj.updateDynamic("requireLogin")(requireLogin.asInstanceOf[js.Any])
    if (serviceCreated != null) __obj.updateDynamic("serviceCreated")(serviceCreated.asInstanceOf[js.Any])
    if (serviceUpdated != null) __obj.updateDynamic("serviceUpdated")(serviceUpdated.asInstanceOf[js.Any])
    if (shareKey != null) __obj.updateDynamic("shareKey")(shareKey.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowPreview]
  }
}

