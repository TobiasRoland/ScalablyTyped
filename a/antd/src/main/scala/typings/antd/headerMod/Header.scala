package typings.antd.headerMod

import typings.antd.AnonMonthReactNode
import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header
  extends Component[HeaderProps, js.Any, js.Any] {
  var calenderHeaderNode: js.Any = js.native
  def getCalenderHeaderNode(node: HTMLDivElement): Unit = js.native
  def getMonthSelectElement(prefixCls: String, month: Double, months: js.Array[Double]): Element = js.native
  def getMonthYearSelections(
    getPrefixCls: js.Function2[/* suffixCls */ String, /* customizePrefixCls */ js.UndefOr[String], String]
  ): AnonMonthReactNode = js.native
  def getTypeSwitch(): Element = js.native
  def getYearSelectElement(prefixCls: String, year: Double): Element = js.native
  def headerRenderCustom(headerRender: HeaderRender): ReactNode = js.native
  def onInternalTypeChange(e: RadioChangeEvent): Unit = js.native
  def onMonthChange(month: String): Unit = js.native
  def onTypeChange(`type`: String): Unit = js.native
  def onYearChange(year: String): Unit = js.native
  def renderHeader(hasGetPrefixCls: ConfigConsumerProps): js.UndefOr[js.Object | Null] = js.native
}

