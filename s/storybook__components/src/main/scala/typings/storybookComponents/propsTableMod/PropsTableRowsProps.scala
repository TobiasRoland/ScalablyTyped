package typings.storybookComponents.propsTableMod

import typings.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsTableRowsProps extends PropsTableProps {
  var rows: js.Array[PropDef]
}

object PropsTableRowsProps {
  @scala.inline
  def apply(rows: js.Array[PropDef]): PropsTableRowsProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropsTableRowsProps]
  }
}

