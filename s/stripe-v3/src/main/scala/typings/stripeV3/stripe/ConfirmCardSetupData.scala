package typings.stripeV3.stripe

import typings.stripeV3.AnonBillingdetailsCardAnonToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmCardSetupData extends js.Object {
  /*
    * Pass an object to confirm using data collected by a card or
    * cardNumber Element or an with an existing token and to supply
    * additional data relevant to the PaymentMethod, such as billing
    * details:
    */
  var payment_method: js.UndefOr[String | AnonBillingdetailsCardAnonToken] = js.undefined
}

object ConfirmCardSetupData {
  @scala.inline
  def apply(payment_method: String | AnonBillingdetailsCardAnonToken = null): ConfirmCardSetupData = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmCardSetupData]
  }
}

