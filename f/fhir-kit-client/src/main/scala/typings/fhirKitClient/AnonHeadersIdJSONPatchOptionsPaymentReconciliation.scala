package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.PaymentReconciliation
import typings.jsonPatch.mod.OpPatch
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersIdJSONPatchOptionsPaymentReconciliation extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: PaymentReconciliation
}

object AnonHeadersIdJSONPatchOptionsPaymentReconciliation {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: PaymentReconciliation,
    headers: Headers = null,
    options: Options = null
  ): AnonHeadersIdJSONPatchOptionsPaymentReconciliation = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadersIdJSONPatchOptionsPaymentReconciliation]
  }
}

