package typings.officeUiFabricReact.mod

import typings.std.Element
import typings.std.Event_
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "on")
@js.native
object on extends js.Object {
  def apply(element: Element, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def apply(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(element: Window_, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def apply(
    element: Window_,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
}

