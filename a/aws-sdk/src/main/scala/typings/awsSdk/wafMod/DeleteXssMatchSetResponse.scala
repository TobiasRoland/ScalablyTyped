package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteXssMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the DeleteXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
}

object DeleteXssMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): DeleteXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteXssMatchSetResponse]
  }
}

