package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserProfileRequest extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.native
  /**
    * The user IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
  /**
    * The user's new SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
  /**
    * The user's SSH user name. The allowable characters are [a-z], [A-Z], [0-9], '-', and '_'. If the specified name includes other punctuation marks, AWS OpsWorks Stacks removes them. For example, my.name will be changed to myname. If you do not specify an SSH user name, AWS OpsWorks Stacks generates one from the IAM user name. 
    */
  var SshUsername: js.UndefOr[String] = js.native
}

object UpdateUserProfileRequest {
  @scala.inline
  def apply(
    IamUserArn: String,
    AllowSelfManagement: js.UndefOr[scala.Boolean] = js.undefined,
    SshPublicKey: String = null,
    SshUsername: String = null
  ): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowSelfManagement)) __obj.updateDynamic("AllowSelfManagement")(AllowSelfManagement.asInstanceOf[js.Any])
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey.asInstanceOf[js.Any])
    if (SshUsername != null) __obj.updateDynamic("SshUsername")(SshUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
}

