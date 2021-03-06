package typings.rmcCalendar.datePickerBaseMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.rmcCalendar.AnonClient
import typings.rmcCalendar.AnonFirstDate
import typings.rmcCalendar.dataTypesMod.Models.CellData
import typings.rmcCalendar.dataTypesMod.Models.MonthData
import typings.rmcCalendar.datePickerPropsMod.PropsType
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker
  extends Component[PropsType, StateType, js.Any] {
  var visibleMonth: js.Array[MonthData] = js.native
  def canLoadNext(): Boolean = js.native
  def canLoadPrev(): Boolean = js.native
  @JSName("componentWillMount")
  def componentWillMount_MDatePicker(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDatePicker(nextProps: PropsType): Unit = js.native
  def computeVisible(clientHeight: Double, scrollTop: Double): Boolean = js.native
  def createOnScroll(): js.Function1[/* data */ AnonClient, Unit] = js.native
  def genMonthComponent(data: MonthData): ReactNode = js.native
  def genMonthData(): MonthData = js.native
  def genMonthData(date: Date): MonthData = js.native
  def genMonthData(date: Date, addMonth: Double): MonthData = js.native
  def genWeekData(firstDate: Date): js.Array[js.Array[CellData]] = js.native
  def getDateWithoutTime(): Double = js.native
  def getDateWithoutTime(date: Date): Double = js.native
  def getMonthDate(): AnonFirstDate = js.native
  def getMonthDate(date: Date): AnonFirstDate = js.native
  def getMonthDate(date: Date, addMonth: Double): AnonFirstDate = js.native
  def inDate(date: Double, tick: Double): Boolean = js.native
  def onCellClick(day: CellData): Unit = js.native
  def selectDateRange(startDate: Date): Unit = js.native
  def selectDateRange(startDate: Date, endDate: js.UndefOr[scala.Nothing], clear: Boolean): Unit = js.native
  def selectDateRange(startDate: Date, endDate: Date): Unit = js.native
  def selectDateRange(startDate: Date, endDate: Date, clear: Boolean): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MDatePicker(nextProps: PropsType, nextState: StateType, nextContext: js.Any): Boolean = js.native
}

