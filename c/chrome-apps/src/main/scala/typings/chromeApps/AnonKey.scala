package typings.chromeApps

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestConditionsList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /** Arguments, see original condition docs in chrome.webViewRequest */
/* key */ StringDictionary[js.Any | js.Array[_]] {
  /** Condition */
  var `type`: DeclarativeWebRequestConditionsList
}

object AnonKey {
  @scala.inline
  def apply(
    `type`: DeclarativeWebRequestConditionsList,
    StringDictionary: /** Arguments, see original condition docs in chrome.webViewRequest */
  /* key */ StringDictionary[js.Any | js.Array[_]] = null
  ): AnonKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

