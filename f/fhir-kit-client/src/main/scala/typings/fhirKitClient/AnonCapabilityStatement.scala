package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.CapabilityStatement
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapabilityStatement extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: CapabilityStatement
  var version: String
}

object AnonCapabilityStatement {
  @scala.inline
  def apply(
    id: String,
    resourceType: CapabilityStatement,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): AnonCapabilityStatement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapabilityStatement]
  }
}

