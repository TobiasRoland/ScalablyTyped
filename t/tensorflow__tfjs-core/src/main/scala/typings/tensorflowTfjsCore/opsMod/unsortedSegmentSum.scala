package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "unsortedSegmentSum")
@js.native
object unsortedSegmentSum extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
}

