package typings.rmcTabs.defaultTabBarMod

import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.rmcTabs.AnonOffset
import typings.rmcTabs.AnonShowNext
import typings.rmcTabs.modelsMod.Models.TabData
import typings.rmcTabs.rmcTabsStrings.bottom
import typings.rmcTabs.rmcTabsStrings.left
import typings.rmcTabs.rmcTabsStrings.right
import typings.rmcTabs.rmcTabsStrings.top
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
@js.native
class DefaultTabBar protected ()
  extends Component[PropsType, StateType, js.Any] {
  def this(props: PropsType) = this()
  var layout: HTMLDivElement = js.native
  var onPan: AnonOffset = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDefaultTabBar(nextProps: PropsType): Unit = js.native
  def getTabSize(page: Double, tabLength: Double): Double = js.native
  def getTransformByIndex(props: PropsType): AnonShowNext = js.native
  def isTabBarVertical(): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_bottom(position: bottom): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_left(position: left): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_right(position: right): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_top(position: top): Boolean = js.native
  def onPress(index: Double): Unit = js.native
  def renderTab(t: TabData, i: Double, size: Double, isTabBarVertical: Boolean): Element = js.native
  def setContentLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
@js.native
object DefaultTabBar extends js.Object {
  var defaultProps: PropsType = js.native
}

