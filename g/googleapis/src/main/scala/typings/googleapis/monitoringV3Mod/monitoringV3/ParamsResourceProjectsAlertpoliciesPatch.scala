package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAlertpoliciesPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required if the policy exists. The resource name for this policy. The
    * syntax is: projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
    * [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy
    * is created. When calling the alertPolicies.create method, do not include
    * the name field in the alerting policy passed as part of the request.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAlertPolicy] = js.native
  /**
    * Optional. A list of alerting policy field names. If this field is not
    * empty, each listed field in the existing alerting policy is set to the
    * value of the corresponding field in the supplied policy (alert_policy),
    * or to the field's default value if the field is not in the supplied
    * alerting policy. Fields not listed retain their previous value.Examples
    * of valid field masks include display_name, documentation,
    * documentation.content, documentation.mime_type, user_labels,
    * user_label.nameofkey, enabled, conditions, combiner, etc.If this field is
    * empty, then the supplied alerting policy replaces the existing policy. It
    * is the same as deleting the existing policy and adding the supplied
    * policy, except for the following: The new policy will have the same
    * [ALERT_POLICY_ID] as the former policy. This gives you continuity with
    * the former policy in your notifications and incidents. Conditions in the
    * new policy will keep their former [CONDITION_ID] if the supplied
    * condition includes the name field with that [CONDITION_ID]. If the
    * supplied condition omits the name field, then a new [CONDITION_ID] is
    * created.
    */
  var updateMask: js.UndefOr[String] = js.native
}

