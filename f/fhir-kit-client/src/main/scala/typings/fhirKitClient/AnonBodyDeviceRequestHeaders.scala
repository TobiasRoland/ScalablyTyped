package typings.fhirKitClient

import typings.fhir.fhir.DeviceRequest
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDeviceRequestHeaders extends js.Object {
  var body: DeviceRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.DeviceRequest
}

object AnonBodyDeviceRequestHeaders {
  @scala.inline
  def apply(
    body: DeviceRequest,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.DeviceRequest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDeviceRequestHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDeviceRequestHeaders]
  }
}

