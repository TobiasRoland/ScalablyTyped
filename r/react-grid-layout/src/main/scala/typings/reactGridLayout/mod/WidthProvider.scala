package typings.reactGridLayout.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-grid-layout", "WidthProvider")
@js.native
object WidthProvider extends js.Object {
  def apply[P](component: ComponentClass[P, ComponentState]): ComponentClass[P with WidthProviderProps, ComponentState] = js.native
}

