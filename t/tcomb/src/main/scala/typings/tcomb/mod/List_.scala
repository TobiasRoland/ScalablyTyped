package typings.tcomb.mod

import typings.tcomb.AnonIdentityKindNameType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// list
//
@js.native
trait List_[T]
  extends Type[js.Array[T]] {
  @JSName("meta")
  var meta_List_ : AnonIdentityKindNameType[T] = js.native
  @JSName("update")
  var update_Original: Update_[js.Array[T]] = js.native
  def update(instance: js.Array[T], spec: UpdatePatch): js.Array[T] = js.native
}

