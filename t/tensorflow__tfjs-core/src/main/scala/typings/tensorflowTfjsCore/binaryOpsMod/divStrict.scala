package typings.tensorflowTfjsCore.binaryOpsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/binary_ops", "divStrict")
@js.native
object divStrict extends js.Object {
  def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}

