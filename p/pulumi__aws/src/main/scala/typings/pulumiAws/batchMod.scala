package typings.pulumiAws

import typings.pulumiAws.computeEnvironmentMod.ComputeEnvironmentArgs
import typings.pulumiAws.computeEnvironmentMod.ComputeEnvironmentState
import typings.pulumiAws.getComputeEnvironmentMod.GetComputeEnvironmentArgs
import typings.pulumiAws.getComputeEnvironmentMod.GetComputeEnvironmentResult
import typings.pulumiAws.getJobQueueMod.GetJobQueueArgs
import typings.pulumiAws.getJobQueueMod.GetJobQueueResult
import typings.pulumiAws.jobDefinitionMod.JobDefinitionArgs
import typings.pulumiAws.jobDefinitionMod.JobDefinitionState
import typings.pulumiAws.jobQueueMod.JobQueueArgs
import typings.pulumiAws.jobQueueMod.JobQueueState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch", JSImport.Namespace)
@js.native
object batchMod extends js.Object {
  @js.native
  class ComputeEnvironment protected ()
    extends typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment {
    /**
      * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComputeEnvironmentArgs) = this()
    def this(name: String, args: ComputeEnvironmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JobDefinition protected ()
    extends typings.pulumiAws.jobDefinitionMod.JobDefinition {
    /**
      * Create a JobDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobDefinitionArgs) = this()
    def this(name: String, args: JobDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JobQueue protected ()
    extends typings.pulumiAws.jobQueueMod.JobQueue {
    /**
      * Create a JobQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobQueueArgs) = this()
    def this(name: String, args: JobQueueArgs, opts: CustomResourceOptions) = this()
  }
  
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  /* static members */
  @js.native
  object ComputeEnvironment extends js.Object {
    /**
      * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    /**
      * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobDefinition extends js.Object {
    /**
      * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState): typings.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): typings.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    /**
      * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobQueue extends js.Object {
    /**
      * Get an existing JobQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.jobQueueMod.JobQueue = js.native
    def get(name: String, id: Input[ID], state: JobQueueState): typings.pulumiAws.jobQueueMod.JobQueue = js.native
    def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): typings.pulumiAws.jobQueueMod.JobQueue = js.native
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
  }
  
}

