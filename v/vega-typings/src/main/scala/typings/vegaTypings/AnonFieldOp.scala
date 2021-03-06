package typings.vegaTypings

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._SortField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldOp extends _SortField {
  var field: js.UndefOr[ScaleField] = js.undefined
  var op: ScaleField
  var order: js.UndefOr[SortOrder] = js.undefined
}

object AnonFieldOp {
  @scala.inline
  def apply(op: ScaleField, field: ScaleField = null, order: SortOrder = null): AnonFieldOp = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldOp]
  }
}

