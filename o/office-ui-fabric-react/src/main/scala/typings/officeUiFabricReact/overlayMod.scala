package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Overlay", JSImport.Namespace)
@js.native
object overlayMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends typings.officeUiFabricReact.overlayBaseMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
  
  val Overlay: StatelessComponent[IOverlayProps] = js.native
}

