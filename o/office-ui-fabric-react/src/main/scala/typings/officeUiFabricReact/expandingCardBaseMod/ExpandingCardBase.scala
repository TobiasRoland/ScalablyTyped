package typings.officeUiFabricReact.expandingCardBaseMod

import typings.officeUiFabricReact.AnonCompactCardHeight
import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.base", "ExpandingCardBase")
@js.native
class ExpandingCardBase protected () extends BaseComponent[IExpandingCardProps, IExpandingCardState] {
  def this(props: IExpandingCardProps) = this()
  var _checkNeedsScroll: js.Any = js.native
  var _classNames: js.Any = js.native
  var _expandedElem: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onRenderCompactCard: js.Any = js.native
  var _onRenderExpandedCard: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MExpandingCardBase(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MExpandingCardBase(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.base", "ExpandingCardBase")
@js.native
object ExpandingCardBase extends js.Object {
  var defaultProps: AnonCompactCardHeight = js.native
}

