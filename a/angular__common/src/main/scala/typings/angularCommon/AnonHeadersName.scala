package typings.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.httpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersName extends js.Object {
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object AnonHeadersName {
  @scala.inline
  def apply(
    headers: HttpHeaders | (StringDictionary[String | js.Array[String]]) = null,
    status: Int | Double = null,
    statusText: String = null
  ): AnonHeadersName = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadersName]
  }
}

