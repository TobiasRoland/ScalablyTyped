package typings.tstl.mod

import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ReverseIteratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "rbegin")
@js.native
object rbegin extends js.Object {
  def apply[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
}

