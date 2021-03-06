package typings.reactTable.mod

import typings.reactTable.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.Anon_CellColumns<D> ]:? react-table.Anon_CellColumns<D>[P]} */ trait UseTableColumnOptions[D /* <: js.Object */] extends Accessor[D]

object UseTableColumnOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    accessor: IdType[D] | (js.Function3[D, /* index */ Double, /* sub */ AnonData[D], CellValue]) = null,
    id: IdType[D] = null
  ): UseTableColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(accessor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTableColumnOptions[D]]
  }
}

