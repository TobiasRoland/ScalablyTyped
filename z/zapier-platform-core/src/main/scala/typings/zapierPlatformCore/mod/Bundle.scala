package typings.zapierPlatformCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.zapierPlatformCore.AnonContent
import typings.zapierPlatformCore.AnonContentHeaders
import typings.zapierPlatformCore.AnonId
import typings.zapierPlatformCore.AnonIsFillingDynamicDropdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[InputData] extends js.Object {
  var authData: StringDictionary[String]
  var cleanedRequest: js.UndefOr[Partial[AnonContentHeaders] | js.Any] = js.undefined
  var inputData: InputData
  var inputDataRaw: StringDictionary[String]
  var meta: AnonIsFillingDynamicDropdown
  var rawRequest: js.UndefOr[Partial[AnonContent]] = js.undefined
  var subscribeData: js.UndefOr[AnonId] = js.undefined
  var targetUrl: js.UndefOr[String] = js.undefined
}

object Bundle {
  @scala.inline
  def apply[InputData](
    authData: StringDictionary[String],
    inputData: InputData,
    inputDataRaw: StringDictionary[String],
    meta: AnonIsFillingDynamicDropdown,
    cleanedRequest: Partial[AnonContentHeaders] | js.Any = null,
    rawRequest: Partial[AnonContent] = null,
    subscribeData: AnonId = null,
    targetUrl: String = null
  ): Bundle[InputData] = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], inputData = inputData.asInstanceOf[js.Any], inputDataRaw = inputDataRaw.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    if (cleanedRequest != null) __obj.updateDynamic("cleanedRequest")(cleanedRequest.asInstanceOf[js.Any])
    if (rawRequest != null) __obj.updateDynamic("rawRequest")(rawRequest.asInstanceOf[js.Any])
    if (subscribeData != null) __obj.updateDynamic("subscribeData")(subscribeData.asInstanceOf[js.Any])
    if (targetUrl != null) __obj.updateDynamic("targetUrl")(targetUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[InputData]]
  }
}

