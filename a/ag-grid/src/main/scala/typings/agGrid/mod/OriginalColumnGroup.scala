package typings.agGrid.mod

import typings.agGrid.colDefMod.ColGroupDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "OriginalColumnGroup")
@js.native
class OriginalColumnGroup protected ()
  extends typings.agGrid.originalColumnGroupMod.OriginalColumnGroup {
  def this(colGroupDef: ColGroupDef, groupId: String, padding: Boolean, level: Double) = this()
}

/* static members */
@JSImport("ag-grid", "OriginalColumnGroup")
@js.native
object OriginalColumnGroup extends js.Object {
  var EVENT_EXPANDABLE_CHANGED: String = js.native
  var EVENT_EXPANDED_CHANGED: String = js.native
}

