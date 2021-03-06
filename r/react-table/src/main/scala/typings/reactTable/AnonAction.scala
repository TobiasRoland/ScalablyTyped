package typings.reactTable

import typings.reactTable.mod.ActionType
import typings.reactTable.mod.Column
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Meta
import typings.reactTable.mod.MetaBase
import typings.reactTable.mod.TableState
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction[D /* <: js.Object */] extends js.Object {
  var defaultColumn: Partial[Column[D]]
  var initialRowStateKey: IdType[D]
  var initialState: Partial[TableState[D]]
  def getRowId(originalRow: D, relativeIndex: Double): IdType[D]
  def getSubRows(originalRow: D, relativeIndex: Double): js.Array[D]
  def reducer(newState: TableState[D], action: ActionType, previousState: TableState[D]): TableState[D]
  def useControlledState(state: TableState[D], meta: Meta[D, scala.Nothing, MetaBase[D]]): TableState[D]
}

object AnonAction {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultColumn: Partial[Column[D]],
    getRowId: (D, Double) => IdType[D],
    getSubRows: (D, Double) => js.Array[D],
    initialRowStateKey: IdType[D],
    initialState: Partial[TableState[D]],
    reducer: (TableState[D], ActionType, TableState[D]) => TableState[D],
    useControlledState: (TableState[D], Meta[D, scala.Nothing, MetaBase[D]]) => TableState[D]
  ): AnonAction[D] = {
    val __obj = js.Dynamic.literal(defaultColumn = defaultColumn.asInstanceOf[js.Any], getRowId = js.Any.fromFunction2(getRowId), getSubRows = js.Any.fromFunction2(getSubRows), initialRowStateKey = initialRowStateKey.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], reducer = js.Any.fromFunction3(reducer), useControlledState = js.Any.fromFunction2(useControlledState))
  
    __obj.asInstanceOf[AnonAction[D]]
  }
}

