package typings.tcomb.mod

import typings.tcomb.AnonIdentityKindName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// refinement
//
@js.native
trait Refinement_[T] extends Type[T] {
  @JSName("meta")
  var meta_Refinement_ : AnonIdentityKindName[T] = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

