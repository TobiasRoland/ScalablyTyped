package typings.tensorflowTfjsCore.gpgpuMathMod

import typings.std.WebGLProgram
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gpgpu_math", "runProgram")
@js.native
object runProgram extends js.Object {
  def apply[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](gpgpu: GPGPUContext, binary: GPGPUBinary, inputs: js.Array[TensorData], output: TensorData): Unit = js.native
  def apply[T /* <: Tensor[Rank] */, K /* <: Tensor[Rank] */](
    gpgpu: GPGPUContext,
    binary: GPGPUBinary,
    inputs: js.Array[TensorData],
    output: TensorData,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): Unit = js.native
}

