package typings.antd

import typings.antd.tabsMod.TabsProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tabs/TabBar", JSImport.Namespace)
@js.native
object tabBarMod extends js.Object {
  @js.native
  trait TabBar
    extends Component[TabsProps, js.Object, js.Any]
  
  @js.native
  class default () extends TabBar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonAnimated = js.native
  }
  
}

