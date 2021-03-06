package typings.pulumiAws.ipGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.IpGroupRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup")
@js.native
class IpGroup protected () extends CustomResource {
  /**
    * Create a IpGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: IpGroupArgs) = this()
  def this(name: String, args: IpGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The description.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the IP group.
    */
  val name: Output_[String] = js.native
  /**
    * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
    */
  val rules: Output_[js.UndefOr[js.Array[IpGroupRule]]] = js.native
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup")
@js.native
object IpGroup extends js.Object {
  /**
    * Get an existing IpGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): IpGroup = js.native
  def get(name: String, id: Input[ID], state: IpGroupState): IpGroup = js.native
  def get(name: String, id: Input[ID], state: IpGroupState, opts: CustomResourceOptions): IpGroup = js.native
  /**
    * Returns true if the given object is an instance of IpGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean = js.native
}

