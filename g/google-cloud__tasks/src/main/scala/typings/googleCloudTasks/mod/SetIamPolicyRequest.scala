package typings.googleCloudTasks.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIamPolicyRequest extends js.Object {
  var policy: Partial[Policy]
}

object SetIamPolicyRequest {
  @scala.inline
  def apply(policy: Partial[Policy]): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
}

