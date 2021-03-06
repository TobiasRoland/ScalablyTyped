package typings.tensorflowTfjsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "registerBackend")
@js.native
object registerBackend extends js.Object {
  def apply(
    name: String,
    factory: js.Function0[
      typings.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typings.tensorflowTfjsCore.backendMod.KernelBackend]
    ]
  ): Boolean = js.native
  def apply(
    name: String,
    factory: js.Function0[
      typings.tensorflowTfjsCore.backendMod.KernelBackend | js.Promise[typings.tensorflowTfjsCore.backendMod.KernelBackend]
    ],
    priority: Double
  ): Boolean = js.native
}

