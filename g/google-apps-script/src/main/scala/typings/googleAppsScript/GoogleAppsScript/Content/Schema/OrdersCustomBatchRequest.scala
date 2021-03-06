package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[OrdersCustomBatchRequestEntry]] = js.undefined
}

object OrdersCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[OrdersCustomBatchRequestEntry] = null): OrdersCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchRequest]
  }
}

