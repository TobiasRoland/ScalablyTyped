package typings.pulumiAws.mod

import typings.pulumiAws.dmsCertificateMod.CertificateArgs
import typings.pulumiAws.dmsCertificateMod.CertificateState
import typings.pulumiAws.endpointMod.EndpointArgs
import typings.pulumiAws.endpointMod.EndpointState
import typings.pulumiAws.replicationInstanceMod.ReplicationInstanceArgs
import typings.pulumiAws.replicationInstanceMod.ReplicationInstanceState
import typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroupState
import typings.pulumiAws.replicationTaskMod.ReplicationTaskArgs
import typings.pulumiAws.replicationTaskMod.ReplicationTaskState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "dms")
@js.native
object dms extends js.Object {
  @js.native
  class Certificate protected ()
    extends typings.pulumiAws.dmsMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.dmsMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationInstance protected ()
    extends typings.pulumiAws.dmsMod.ReplicationInstance {
    /**
      * Create a ReplicationInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationInstanceArgs) = this()
    def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationSubnetGroup protected ()
    extends typings.pulumiAws.dmsMod.ReplicationSubnetGroup {
    /**
      * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationSubnetGroupArgs) = this()
    def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ReplicationTask protected ()
    extends typings.pulumiAws.dmsMod.ReplicationTask {
    /**
      * Create a ReplicationTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationTaskArgs) = this()
    def this(name: String, args: ReplicationTaskArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typings.pulumiAws.dmsCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/certificate.Certificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Endpoint extends js.Object {
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.endpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.endpointMod.Endpoint = js.native
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.endpointMod.Endpoint = js.native
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/endpoint.Endpoint */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationInstance extends js.Object {
    /**
      * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typings.pulumiAws.replicationInstanceMod.ReplicationInstance = js.native
    /**
      * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationSubnetGroup extends js.Object {
    /**
      * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.replicationSubnetGroupMod.ReplicationSubnetGroup = js.native
    /**
      * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReplicationTask extends js.Object {
    /**
      * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): typings.pulumiAws.replicationTaskMod.ReplicationTask = js.native
    /**
      * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
  }
  
}

