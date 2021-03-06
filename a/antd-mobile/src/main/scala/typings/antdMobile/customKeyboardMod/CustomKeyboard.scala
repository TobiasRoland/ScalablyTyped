package typings.antdMobile.customKeyboardMod

import typings.antdMobile.AnonArialabel
import typings.antdMobile.AnonArialabelIconOnly
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLTableDataCellElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomKeyboard
  extends Component[js.Any, js.Any, js.Any] {
  var antmKeyboard: HTMLDivElement | Null = js.native
  var confirmDisabled: Boolean = js.native
  var confirmKeyboardItem: HTMLTableDataCellElement | Null = js.native
  var linkedInput: js.Any = js.native
  def getAriaAttr(label: String): AnonArialabel | AnonArialabelIconOnly = js.native
  def onKeyboardClick(e: typings.react.mod.MouseEvent[HTMLTableDataCellElement, MouseEvent]): js.UndefOr[Null] = js.native
  def onKeyboardClick(e: typings.react.mod.MouseEvent[HTMLTableDataCellElement, MouseEvent], value: String): js.UndefOr[Null] = js.native
  def renderKeyboardItem(item: String, index: Double): Element = js.native
}

