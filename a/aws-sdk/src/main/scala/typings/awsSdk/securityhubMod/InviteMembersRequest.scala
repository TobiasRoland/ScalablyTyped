package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteMembersRequest extends js.Object {
  /**
    * A list of IDs of the AWS accounts that you want to invite to Security Hub as members. 
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
}

object InviteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): InviteMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteMembersRequest]
  }
}

