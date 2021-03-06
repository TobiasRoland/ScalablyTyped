package typings.pulumiAws.rdsMod

import typings.pulumiAws.rdsInstanceMod.InstanceArgs
import typings.pulumiAws.rdsInstanceMod.InstanceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "Instance")
@js.native
class Instance protected ()
  extends typings.pulumiAws.rdsInstanceMod.Instance {
  /**
    * Create a Instance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceArgs) = this()
  def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/rds", "Instance")
@js.native
object Instance extends js.Object {
  /**
    * Get an existing Instance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.rdsInstanceMod.Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState): typings.pulumiAws.rdsInstanceMod.Instance = js.native
  def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typings.pulumiAws.rdsInstanceMod.Instance = js.native
  /**
    * Returns true if the given object is an instance of Instance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/instance.Instance */ Boolean = js.native
}

