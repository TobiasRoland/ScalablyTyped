package typings.reactVirtualized

import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import typings.reactVirtualized.esTableMod.MultiSortOptions
import typings.reactVirtualized.esTableMod.MultiSortReturn
import typings.reactVirtualized.esTableMod.SortDirectionStatic
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  @js.native
  class Column ()
    extends typings.reactVirtualized.esTableMod.Column
  
  @js.native
  class Table ()
    extends typings.reactVirtualized.esTableMod.Table
  
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: StatelessComponent[AnonSortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ AnonSortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ AnonSortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
  /* static members */
  @js.native
  object Column extends js.Object {
    var defaultProps: Anon01CellDataGetter = js.native
    var propTypes: AnonArialabelCellDataGetter = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var defaultProps: Anon0110 = js.native
    var propTypes: AnonArialabelAutoHeight = js.native
  }
  
}

