package typings.cfnResponse.mod

import typings.awsLambda.mod.CloudFormationCustomResourceEvent
import typings.awsLambda.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfn-response", "send")
@js.native
object send extends js.Object {
  def apply(event: CloudFormationCustomResourceEvent, context: Context, responseStatus: ResponseStatus): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object
  ): Unit = js.native
  def apply(
    event: CloudFormationCustomResourceEvent,
    context: Context,
    responseStatus: ResponseStatus,
    responseData: js.Object,
    physicalResourceId: String
  ): Unit = js.native
}

