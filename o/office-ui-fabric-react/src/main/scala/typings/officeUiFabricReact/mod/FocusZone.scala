package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "FocusZone")
@js.native
class FocusZone protected ()
  extends typings.officeUiFabricReact.libFocusZoneMod.FocusZone {
  def this(props: IFocusZoneProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "FocusZone")
@js.native
object FocusZone extends js.Object {
  var defaultProps: IFocusZoneProps = js.native
  /** Used for testing purposes only. */
  def getOuterZones(): Double = js.native
}

