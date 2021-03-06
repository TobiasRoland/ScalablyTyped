package typings.pulumiAws

import typings.pulumiAws.policyMod.PolicyArgs
import typings.pulumiAws.policyMod.PolicyState
import typings.pulumiAws.scheduledActionMod.ScheduledActionArgs
import typings.pulumiAws.scheduledActionMod.ScheduledActionState
import typings.pulumiAws.targetMod.TargetArgs
import typings.pulumiAws.targetMod.TargetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling", JSImport.Namespace)
@js.native
object appautoscalingMod extends js.Object {
  @js.native
  class Policy protected ()
    extends typings.pulumiAws.policyMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ScheduledAction protected ()
    extends typings.pulumiAws.scheduledActionMod.ScheduledAction {
    /**
      * Create a ScheduledAction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduledActionArgs) = this()
    def this(name: String, args: ScheduledActionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Target protected ()
    extends typings.pulumiAws.targetMod.Target {
    /**
      * Create a Target resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetArgs) = this()
    def this(name: String, args: TargetArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.policyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.policyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.policyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ScheduledAction extends js.Object {
    /**
      * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState): typings.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState, opts: CustomResourceOptions): typings.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    /**
      * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/scheduledAction.ScheduledAction */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Target extends js.Object {
    /**
      * Get an existing Target resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.targetMod.Target = js.native
    def get(name: String, id: Input[ID], state: TargetState): typings.pulumiAws.targetMod.Target = js.native
    def get(name: String, id: Input[ID], state: TargetState, opts: CustomResourceOptions): typings.pulumiAws.targetMod.Target = js.native
    /**
      * Returns true if the given object is an instance of Target.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean = js.native
  }
  
}

