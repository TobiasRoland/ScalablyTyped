package typings.fhirKitClient

import typings.fhir.fhir.AppointmentResponse
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppointmentResponseBody extends js.Object {
  var body: AppointmentResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.AppointmentResponse
}

object AnonAppointmentResponseBody {
  @scala.inline
  def apply(
    body: AppointmentResponse,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.AppointmentResponse,
    headers: Headers = null,
    options: Options = null
  ): AnonAppointmentResponseBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppointmentResponseBody]
  }
}

