package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  var cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The security group description. Defaults to
    * "Managed by Pulumi". Cannot be "". __NOTE__: This field maps to the AWS
    * `GroupDescription` attribute, for which there is no Update API. If you'd like
    * to classify your security groups in a way that can be updated, use `tags`.
    */
  var description: js.UndefOr[Input[String]] = js.native
  var fromPort: Input[Double] = js.native
  var ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var protocol: Input[String] = js.native
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var self: js.UndefOr[Input[Boolean]] = js.native
  var toPort: Input[Double] = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(
    fromPort: Input[Double],
    protocol: Input[String],
    toPort: Input[Double],
    cidrBlocks: Input[js.Array[Input[String]]] = null,
    description: Input[String] = null,
    ipv6CidrBlocks: Input[js.Array[Input[String]]] = null,
    prefixListIds: Input[js.Array[Input[String]]] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    self: Input[Boolean] = null
  ): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlocks != null) __obj.updateDynamic("cidrBlocks")(cidrBlocks.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipv6CidrBlocks != null) __obj.updateDynamic("ipv6CidrBlocks")(ipv6CidrBlocks.asInstanceOf[js.Any])
    if (prefixListIds != null) __obj.updateDynamic("prefixListIds")(prefixListIds.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
}

