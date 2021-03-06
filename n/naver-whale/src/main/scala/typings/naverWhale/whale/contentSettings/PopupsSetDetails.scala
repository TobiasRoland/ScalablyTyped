package typings.naverWhale.whale.contentSettings

import typings.naverWhale.naverWhaleStrings.allow
import typings.naverWhale.naverWhaleStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupsSetDetails
  extends typings.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_PopupsSetDetails: allow | block
}

object PopupsSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block,
    resourceIdentifier: typings.chrome.chrome.contentSettings.ResourceIdentifier = null,
    scope: typings.chrome.chrome.contentSettings.ScopeEnum = null,
    secondaryPattern: String = null
  ): PopupsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupsSetDetails]
  }
}

