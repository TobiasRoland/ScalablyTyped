package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[InventoryCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object InventoryCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[InventoryCustomBatchResponseEntry] = null, kind: String = null): InventoryCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryCustomBatchResponse]
  }
}

