package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderLineItem extends js.Object {
  var product: js.UndefOr[TestOrderLineItemProduct] = js.undefined
  var quantityOrdered: js.UndefOr[Double] = js.undefined
  var returnInfo: js.UndefOr[OrderLineItemReturnInfo] = js.undefined
  var shippingDetails: js.UndefOr[OrderLineItemShippingDetails] = js.undefined
  var unitTax: js.UndefOr[Price] = js.undefined
}

object TestOrderLineItem {
  @scala.inline
  def apply(
    product: TestOrderLineItemProduct = null,
    quantityOrdered: Int | Double = null,
    returnInfo: OrderLineItemReturnInfo = null,
    shippingDetails: OrderLineItemShippingDetails = null,
    unitTax: Price = null
  ): TestOrderLineItem = {
    val __obj = js.Dynamic.literal()
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (quantityOrdered != null) __obj.updateDynamic("quantityOrdered")(quantityOrdered.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (shippingDetails != null) __obj.updateDynamic("shippingDetails")(shippingDetails.asInstanceOf[js.Any])
    if (unitTax != null) __obj.updateDynamic("unitTax")(unitTax.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOrderLineItem]
  }
}

