package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.fusedUtilMod.Activation
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
@js.native
object conv2dWithBiasActivation extends js.Object {
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], bias: Tensor_[Rank]): Tensor_[Rank] = js.native
  def apply(x: Tensor_[Rank], kernel: Tensor_[Rank], bias: Tensor_[Rank], strides: js.Array[Double]): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    bias: Tensor_[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    bias: Tensor_[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    bias: Tensor_[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor_[Rank] = js.native
  def apply(
    x: Tensor_[Rank],
    kernel: Tensor_[Rank],
    bias: Tensor_[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: Activation
  ): Tensor_[Rank] = js.native
}

