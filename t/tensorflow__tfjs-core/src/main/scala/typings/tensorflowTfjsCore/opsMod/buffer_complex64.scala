package typings.tensorflowTfjsCore.opsMod

import typings.std.Float32Array
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.TensorBuffer
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "buffer")
@js.native
object buffer_complex64 extends js.Object {
  def apply[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = js.native
  def apply[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): TensorBuffer[R, complex64] = js.native
}

