package typings.azure

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyVersionEndpointEnvironmentName extends /* key */ StringDictionary[String] {
  var VersionEndpointEnvironmentName: String
}

object AnonKeyVersionEndpointEnvironmentName {
  @scala.inline
  def apply(
    VersionEndpointEnvironmentName: String,
    StringDictionary: /* key */ StringDictionary[String] = null
  ): AnonKeyVersionEndpointEnvironmentName = {
    val __obj = js.Dynamic.literal(VersionEndpointEnvironmentName = VersionEndpointEnvironmentName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKeyVersionEndpointEnvironmentName]
  }
}

