package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesForTargetRequest extends js.Object {
  /**
    * The type of policy that you want to include in the returned list.
    */
  var Filter: PolicyType = js.native
  /**
    * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.organizationsMod.MaxResults] = js.native
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * The unique identifier (ID) of the root, organizational unit, or account whose policies you want to list. The regex pattern for a target ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Account - A string that consists of exactly 12 digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var TargetId: PolicyTargetId = js.native
}

object ListPoliciesForTargetRequest {
  @scala.inline
  def apply(
    Filter: PolicyType,
    TargetId: PolicyTargetId,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListPoliciesForTargetRequest = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], TargetId = TargetId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesForTargetRequest]
  }
}

