package typings.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionResponse extends js.Object {
  /**
    * The time in ISO 8601 format for when the connection was established.
    */
  var ConnectedAt: js.UndefOr[timestampIso8601] = js.native
  var Identity: js.UndefOr[typings.awsSdk.apigatewaymanagementapiMod.Identity] = js.native
  /**
    * The time in ISO 8601 format for when the connection was last active.
    */
  var LastActiveAt: js.UndefOr[timestampIso8601] = js.native
}

object GetConnectionResponse {
  @scala.inline
  def apply(
    ConnectedAt: timestampIso8601 = null,
    Identity: Identity = null,
    LastActiveAt: timestampIso8601 = null
  ): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectedAt != null) __obj.updateDynamic("ConnectedAt")(ConnectedAt.asInstanceOf[js.Any])
    if (Identity != null) __obj.updateDynamic("Identity")(Identity.asInstanceOf[js.Any])
    if (LastActiveAt != null) __obj.updateDynamic("LastActiveAt")(LastActiveAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionResponse]
  }
}

