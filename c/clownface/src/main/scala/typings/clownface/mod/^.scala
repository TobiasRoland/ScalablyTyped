package typings.clownface.mod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[D /* <: DatasetCore[Quad] */, T /* <: Term */](options: ClownfaceInit[D, T]): Clownface[D, T] = js.native
  def apply[D /* <: DatasetCore[Quad] */, T /* <: Term */](options: ClownfaceInitWithNodes[D, T]): SafeClownface[D, T] = js.native
}

