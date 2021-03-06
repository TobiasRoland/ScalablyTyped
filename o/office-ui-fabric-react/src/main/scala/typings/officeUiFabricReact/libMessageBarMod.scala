package typings.officeUiFabricReact

import typings.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/MessageBar", JSImport.Namespace)
@js.native
object libMessageBarMod extends js.Object {
  @js.native
  class MessageBarBase protected ()
    extends typings.officeUiFabricReact.messageBarMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  
  val MessageBar: StatelessComponent[IMessageBarProps] = js.native
  /* static members */
  @js.native
  object MessageBarBase extends js.Object {
    var defaultProps: IMessageBarProps = js.native
  }
  
  @js.native
  object MessageBarType extends js.Object {
    /* 2 */ val blocked: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.blocked with Double = js.native
    /* 1 */ val error: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.error with Double = js.native
    /* 0 */ val info: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.info with Double = js.native
    /* 90000 */ val remove: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.remove with Double = js.native
    /* 3 */ val severeWarning: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.severeWarning with Double = js.native
    /* 4 */ val success: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.success with Double = js.native
    /* 5 */ val warning: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.messageBarTypesMod.MessageBarType with Double] = js.native
  }
  
}

