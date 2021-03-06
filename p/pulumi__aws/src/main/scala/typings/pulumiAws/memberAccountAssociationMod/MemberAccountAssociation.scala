package typings.pulumiAws.memberAccountAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation")
@js.native
class MemberAccountAssociation protected () extends CustomResource {
  /**
    * Create a MemberAccountAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MemberAccountAssociationArgs) = this()
  def this(name: String, args: MemberAccountAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
    */
  val memberAccountId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/macie/memberAccountAssociation", "MemberAccountAssociation")
@js.native
object MemberAccountAssociation extends js.Object {
  /**
    * Get an existing MemberAccountAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): MemberAccountAssociation = js.native
  def get(name: String, id: Input[ID], state: MemberAccountAssociationState): MemberAccountAssociation = js.native
  def get(name: String, id: Input[ID], state: MemberAccountAssociationState, opts: CustomResourceOptions): MemberAccountAssociation = js.native
  /**
    * Returns true if the given object is an instance of MemberAccountAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean = js.native
}

