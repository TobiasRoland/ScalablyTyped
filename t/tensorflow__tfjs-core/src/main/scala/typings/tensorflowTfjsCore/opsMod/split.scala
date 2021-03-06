package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "split")
@js.native
object split extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
}

