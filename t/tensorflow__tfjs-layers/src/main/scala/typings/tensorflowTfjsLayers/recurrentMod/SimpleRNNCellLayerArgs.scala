package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRNNCellLayerArgs extends LayerArgs {
  /**
    * Activation function to use.
    * Default: hyperbolic tangent ('tanh').
    * If you pass `null`,  'linear' activation will be applied.
    */
  var activation: js.UndefOr[ActivationIdentifier] = js.undefined
  /**
    * Constraintfunction applied to the bias vector.
    */
  var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the bias vector.
    */
  var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the bias vector.
    */
  var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * Float number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the inputs.
    */
  var dropout: js.UndefOr[Double] = js.undefined
  /**
    * Constraint function applied to the `kernel` weights matrix.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the `kernel` weights matrix, used for the linear
    * transformation of the inputs.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the `kernel` weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * Constraint function applied to the `recurrentKernel` weights matrix.
    */
  var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Float number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the recurrent state.
    */
  var recurrentDropout: js.UndefOr[Double] = js.undefined
  /**
    * Initializer for the `recurrentKernel` weights matrix, used for
    * linear transformation of the recurrent state.
    */
  var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the `recurrent_kernel` weights matrix.
    */
  var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * units: Positive integer, dimensionality of the output space.
    */
  var units: Double
  /**
    * Whether the layer uses a bias vector.
    */
  var useBias: js.UndefOr[Boolean] = js.undefined
}

object SimpleRNNCellLayerArgs {
  @scala.inline
  def apply(
    units: Double,
    activation: ActivationIdentifier = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    biasConstraint: ConstraintIdentifier | Constraint = null,
    biasInitializer: InitializerIdentifier | Initializer = null,
    biasRegularizer: RegularizerIdentifier | Regularizer = null,
    dropout: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    kernelConstraint: ConstraintIdentifier | Constraint = null,
    kernelInitializer: InitializerIdentifier | Initializer = null,
    kernelRegularizer: RegularizerIdentifier | Regularizer = null,
    name: String = null,
    recurrentConstraint: ConstraintIdentifier | Constraint = null,
    recurrentDropout: Int | Double = null,
    recurrentInitializer: InitializerIdentifier | Initializer = null,
    recurrentRegularizer: RegularizerIdentifier | Regularizer = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    useBias: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): SimpleRNNCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dropout != null) __obj.updateDynamic("dropout")(dropout.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recurrentConstraint != null) __obj.updateDynamic("recurrentConstraint")(recurrentConstraint.asInstanceOf[js.Any])
    if (recurrentDropout != null) __obj.updateDynamic("recurrentDropout")(recurrentDropout.asInstanceOf[js.Any])
    if (recurrentInitializer != null) __obj.updateDynamic("recurrentInitializer")(recurrentInitializer.asInstanceOf[js.Any])
    if (recurrentRegularizer != null) __obj.updateDynamic("recurrentRegularizer")(recurrentRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNCellLayerArgs]
  }
}

