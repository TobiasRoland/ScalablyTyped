package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typings.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typings.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typings.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typings.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/GroupedList", JSImport.Namespace)
@js.native
object libGroupedListMod extends js.Object {
  @js.native
  class GroupedListBase protected ()
    extends typings.officeUiFabricReact.groupedListMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  
  val GroupFooter: StatelessComponent[IGroupFooterProps] = js.native
  val GroupHeader: StatelessComponent[IGroupHeaderProps] = js.native
  val GroupShowAll: StatelessComponent[IGroupShowAllProps] = js.native
  val GroupSpacer: FunctionComponent[IGroupSpacerProps] = js.native
  val GroupedList: StatelessComponent[IGroupedListProps] = js.native
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    var defaultProps: AnonCompact = js.native
  }
  
}

