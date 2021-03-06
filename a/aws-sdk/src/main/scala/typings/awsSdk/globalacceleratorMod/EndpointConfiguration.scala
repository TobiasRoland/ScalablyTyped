package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfiguration extends js.Object {
  /**
    * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value is true or false. The default value is true for new accelerators.  If the value is set to true, the client's IP address is preserved in the X-Forwarded-For request header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator. For more information, see  Viewing Client IP Addresses in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
    */
  var EndpointId: js.UndefOr[GenericString] = js.native
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide.
    */
  var Weight: js.UndefOr[EndpointWeight] = js.native
}

object EndpointConfiguration {
  @scala.inline
  def apply(
    ClientIPPreservationEnabled: js.UndefOr[Boolean] = js.undefined,
    EndpointId: GenericString = null,
    Weight: Int | Double = null
  ): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClientIPPreservationEnabled)) __obj.updateDynamic("ClientIPPreservationEnabled")(ClientIPPreservationEnabled.asInstanceOf[js.Any])
    if (EndpointId != null) __obj.updateDynamic("EndpointId")(EndpointId.asInstanceOf[js.Any])
    if (Weight != null) __obj.updateDynamic("Weight")(Weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfiguration]
  }
}

