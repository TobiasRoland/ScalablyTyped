package typings.pulumiAws.lambdaMod

import typings.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "CallbackFunction")
@js.native
class CallbackFunction[E, R] protected ()
  extends typings.pulumiAws.lambdaMixinsMod.CallbackFunction[E, R] {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}

