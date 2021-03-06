package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "ODatabasePoolFactory")
@js.native
class ODatabasePoolFactory () extends js.Object {
  def create(): js.Promise[ODatabase] = js.native
  def destroy(db: ODatabase): js.Promise[Unit] = js.native
}

