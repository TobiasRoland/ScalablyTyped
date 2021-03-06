package typings.awsSdk.quicksightMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickSight extends Service {
  @JSName("config")
  var config_QuickSight: ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels an ongoing ingestion of data into SPICE.
    */
  def cancelIngestion(): Request[CancelIngestionResponse, AWSError] = js.native
  def cancelIngestion(callback: js.Function2[/* err */ AWSError, /* data */ CancelIngestionResponse, Unit]): Request[CancelIngestionResponse, AWSError] = js.native
  /**
    * Cancels an ongoing ingestion of data into SPICE.
    */
  def cancelIngestion(params: CancelIngestionRequest): Request[CancelIngestionResponse, AWSError] = js.native
  def cancelIngestion(
    params: CancelIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelIngestionResponse, Unit]
  ): Request[CancelIngestionResponse, AWSError] = js.native
  /**
    * Creates a dashboard from a template. To first create a template, see the CreateTemplate API operation. A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. The CreateDashboard, DescribeDashboard, and ListDashboardsByUser API operations act on the dashboard entity. If you have the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
    */
  def createDashboard(): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]): Request[CreateDashboardResponse, AWSError] = js.native
  /**
    * Creates a dashboard from a template. To first create a template, see the CreateTemplate API operation. A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. The CreateDashboard, DescribeDashboard, and ListDashboardsByUser API operations act on the dashboard entity. If you have the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
    */
  def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(
    params: CreateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]
  ): Request[CreateDashboardResponse, AWSError] = js.native
  /**
    * Creates a dataset.
    */
  def createDataSet(): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]): Request[CreateDataSetResponse, AWSError] = js.native
  /**
    * Creates a dataset.
    */
  def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(
    params: CreateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]
  ): Request[CreateDataSetResponse, AWSError] = js.native
  /**
    * Creates a data source.
    */
  def createDataSource(): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a data source.
    */
  def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]
  ): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group. 
    */
  def createGroupMembership(): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group. 
    */
  def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(
    params: CreateGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]
  ): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy will be assigned to specified groups or users of Amazon QuickSight. The users and groups need to be in the same namespace. 
    */
  def createIAMPolicyAssignment(): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  def createIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ CreateIAMPolicyAssignmentResponse, Unit]): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy will be assigned to specified groups or users of Amazon QuickSight. The users and groups need to be in the same namespace. 
    */
  def createIAMPolicyAssignment(params: CreateIAMPolicyAssignmentRequest): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  def createIAMPolicyAssignment(
    params: CreateIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIAMPolicyAssignmentResponse, Unit]
  ): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Creates and starts a new SPICE ingestion on a dataset Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an example, see How do I create an IAM policy to control access to Amazon EC2 resources using tags? in the AWS Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
    */
  def createIngestion(): Request[CreateIngestionResponse, AWSError] = js.native
  def createIngestion(callback: js.Function2[/* err */ AWSError, /* data */ CreateIngestionResponse, Unit]): Request[CreateIngestionResponse, AWSError] = js.native
  /**
    * Creates and starts a new SPICE ingestion on a dataset Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an example, see How do I create an IAM policy to control access to Amazon EC2 resources using tags? in the AWS Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
    */
  def createIngestion(params: CreateIngestionRequest): Request[CreateIngestionResponse, AWSError] = js.native
  def createIngestion(
    params: CreateIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIngestionResponse, Unit]
  ): Request[CreateIngestionResponse, AWSError] = js.native
  /**
    * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create a dashboard. A template is an entity in QuickSight that encapsulates the metadata required to create an analysis and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    */
  def createTemplate(): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create a dashboard. A template is an entity in QuickSight that encapsulates the metadata required to create an analysis and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    */
  def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(
    params: CreateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]
  ): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Creates a template alias for a template.
    */
  def createTemplateAlias(): Request[CreateTemplateAliasResponse, AWSError] = js.native
  def createTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateAliasResponse, Unit]): Request[CreateTemplateAliasResponse, AWSError] = js.native
  /**
    * Creates a template alias for a template.
    */
  def createTemplateAlias(params: CreateTemplateAliasRequest): Request[CreateTemplateAliasResponse, AWSError] = js.native
  def createTemplateAlias(
    params: CreateTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateAliasResponse, Unit]
  ): Request[CreateTemplateAliasResponse, AWSError] = js.native
  /**
    * Deletes a dashboard.
    */
  def deleteDashboard(): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]): Request[DeleteDashboardResponse, AWSError] = js.native
  /**
    * Deletes a dashboard.
    */
  def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(
    params: DeleteDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]
  ): Request[DeleteDashboardResponse, AWSError] = js.native
  /**
    * Deletes a dataset.
    */
  def deleteDataSet(): Request[DeleteDataSetResponse, AWSError] = js.native
  def deleteDataSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetResponse, Unit]): Request[DeleteDataSetResponse, AWSError] = js.native
  /**
    * Deletes a dataset.
    */
  def deleteDataSet(params: DeleteDataSetRequest): Request[DeleteDataSetResponse, AWSError] = js.native
  def deleteDataSet(
    params: DeleteDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetResponse, Unit]
  ): Request[DeleteDataSetResponse, AWSError] = js.native
  /**
    * Deletes the data source permanently. This action breaks all the datasets that reference the deleted data source.
    */
  def deleteDataSource(): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]): Request[DeleteDataSourceResponse, AWSError] = js.native
  /**
    * Deletes the data source permanently. This action breaks all the datasets that reference the deleted data source.
    */
  def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]
  ): Request[DeleteDataSourceResponse, AWSError] = js.native
  /**
    * Removes a user group from Amazon QuickSight. 
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Removes a user group from Amazon QuickSight. 
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Removes a user from a group so that the user is no longer a member of the group.
    */
  def deleteGroupMembership(): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Removes a user from a group so that the user is no longer a member of the group.
    */
  def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(
    params: DeleteGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]
  ): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Deletes an existing IAM policy assignment.
    */
  def deleteIAMPolicyAssignment(): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  def deleteIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIAMPolicyAssignmentResponse, Unit]): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Deletes an existing IAM policy assignment.
    */
  def deleteIAMPolicyAssignment(params: DeleteIAMPolicyAssignmentRequest): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  def deleteIAMPolicyAssignment(
    params: DeleteIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIAMPolicyAssignmentResponse, Unit]
  ): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Deletes a template.
    */
  def deleteTemplate(): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]): Request[DeleteTemplateResponse, AWSError] = js.native
  /**
    * Deletes a template.
    */
  def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(
    params: DeleteTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]
  ): Request[DeleteTemplateResponse, AWSError] = js.native
  /**
    * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the version of the template that the alias points to.
    */
  def deleteTemplateAlias(): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  def deleteTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateAliasResponse, Unit]): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  /**
    * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the version of the template that the alias points to.
    */
  def deleteTemplateAlias(params: DeleteTemplateAliasRequest): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  def deleteTemplateAlias(
    params: DeleteTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateAliasResponse, Unit]
  ): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call. 
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call. 
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a user identified by its principal ID. 
    */
  def deleteUserByPrincipalId(): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  /**
    * Deletes a user identified by its principal ID. 
    */
  def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(
    params: DeleteUserByPrincipalIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]
  ): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  /**
    * Provides a summary for a dashboard.
    */
  def describeDashboard(): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]): Request[DescribeDashboardResponse, AWSError] = js.native
  /**
    * Provides a summary for a dashboard.
    */
  def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(
    params: DescribeDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]
  ): Request[DescribeDashboardResponse, AWSError] = js.native
  /**
    * Describes read and write permissions for a dashboard.
    */
  def describeDashboardPermissions(): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  def describeDashboardPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardPermissionsResponse, Unit]): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Describes read and write permissions for a dashboard.
    */
  def describeDashboardPermissions(params: DescribeDashboardPermissionsRequest): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  def describeDashboardPermissions(
    params: DescribeDashboardPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardPermissionsResponse, Unit]
  ): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Describes a dataset. 
    */
  def describeDataSet(): Request[DescribeDataSetResponse, AWSError] = js.native
  def describeDataSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetResponse, Unit]): Request[DescribeDataSetResponse, AWSError] = js.native
  /**
    * Describes a dataset. 
    */
  def describeDataSet(params: DescribeDataSetRequest): Request[DescribeDataSetResponse, AWSError] = js.native
  def describeDataSet(
    params: DescribeDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetResponse, Unit]
  ): Request[DescribeDataSetResponse, AWSError] = js.native
  /**
    * Describes the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def describeDataSetPermissions(): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  def describeDataSetPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetPermissionsResponse, Unit]): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Describes the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def describeDataSetPermissions(params: DescribeDataSetPermissionsRequest): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  def describeDataSetPermissions(
    params: DescribeDataSetPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetPermissionsResponse, Unit]
  ): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Describes a data source.
    */
  def describeDataSource(): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Describes a data source.
    */
  def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(
    params: DescribeDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]
  ): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Describes the resource permissions for a data source.
    */
  def describeDataSourcePermissions(): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  def describeDataSourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcePermissionsResponse, Unit]): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Describes the resource permissions for a data source.
    */
  def describeDataSourcePermissions(params: DescribeDataSourcePermissionsRequest): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  def describeDataSourcePermissions(
    params: DescribeDataSourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcePermissionsResponse, Unit]
  ): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN). 
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN). 
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Describes an existing IAM policy assignment, as specified by the assignment name.
    */
  def describeIAMPolicyAssignment(): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  def describeIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIAMPolicyAssignmentResponse, Unit]): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Describes an existing IAM policy assignment, as specified by the assignment name.
    */
  def describeIAMPolicyAssignment(params: DescribeIAMPolicyAssignmentRequest): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  def describeIAMPolicyAssignment(
    params: DescribeIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIAMPolicyAssignmentResponse, Unit]
  ): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Describes a SPICE ingestion.
    */
  def describeIngestion(): Request[DescribeIngestionResponse, AWSError] = js.native
  def describeIngestion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIngestionResponse, Unit]): Request[DescribeIngestionResponse, AWSError] = js.native
  /**
    * Describes a SPICE ingestion.
    */
  def describeIngestion(params: DescribeIngestionRequest): Request[DescribeIngestionResponse, AWSError] = js.native
  def describeIngestion(
    params: DescribeIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIngestionResponse, Unit]
  ): Request[DescribeIngestionResponse, AWSError] = js.native
  /**
    * Describes a template's metadata.
    */
  def describeTemplate(): Request[DescribeTemplateResponse, AWSError] = js.native
  def describeTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateResponse, Unit]): Request[DescribeTemplateResponse, AWSError] = js.native
  /**
    * Describes a template's metadata.
    */
  def describeTemplate(params: DescribeTemplateRequest): Request[DescribeTemplateResponse, AWSError] = js.native
  def describeTemplate(
    params: DescribeTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateResponse, Unit]
  ): Request[DescribeTemplateResponse, AWSError] = js.native
  /**
    * Describes the template alias for a template.
    */
  def describeTemplateAlias(): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  def describeTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateAliasResponse, Unit]): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  /**
    * Describes the template alias for a template.
    */
  def describeTemplateAlias(params: DescribeTemplateAliasRequest): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  def describeTemplateAlias(
    params: DescribeTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateAliasResponse, Unit]
  ): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  /**
    * Describes read and write permissions on a template.
    */
  def describeTemplatePermissions(): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  def describeTemplatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplatePermissionsResponse, Unit]): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Describes read and write permissions on a template.
    */
  def describeTemplatePermissions(params: DescribeTemplatePermissionsRequest): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  def describeTemplatePermissions(
    params: DescribeTemplatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplatePermissionsResponse, Unit]
  ): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Returns information about a user, given the user name. 
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns information about a user, given the user name. 
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Generates a server-side embeddable URL and authorization code. For this process to work properly, first configure the dashboards and user permissions. For more information, see Embedding Amazon QuickSight Dashboards in the Amazon QuickSight User Guide or Embedding Amazon QuickSight Dashboards in the Amazon QuickSight API Reference. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.
    */
  def getDashboardEmbedUrl(): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  /**
    * Generates a server-side embeddable URL and authorization code. For this process to work properly, first configure the dashboards and user permissions. For more information, see Embedding Amazon QuickSight Dashboards in the Amazon QuickSight User Guide or Embedding Amazon QuickSight Dashboards in the Amazon QuickSight API Reference. Currently, you can use GetDashboardEmbedURL only from the server, not from the user’s browser.
    */
  def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(
    params: GetDashboardEmbedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]
  ): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  /**
    * Lists all the versions of the dashboards in the QuickSight subscription.
    */
  def listDashboardVersions(): Request[ListDashboardVersionsResponse, AWSError] = js.native
  def listDashboardVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardVersionsResponse, Unit]): Request[ListDashboardVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the dashboards in the QuickSight subscription.
    */
  def listDashboardVersions(params: ListDashboardVersionsRequest): Request[ListDashboardVersionsResponse, AWSError] = js.native
  def listDashboardVersions(
    params: ListDashboardVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardVersionsResponse, Unit]
  ): Request[ListDashboardVersionsResponse, AWSError] = js.native
  /**
    * Lists dashboards in an AWS account.
    */
  def listDashboards(): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]): Request[ListDashboardsResponse, AWSError] = js.native
  /**
    * Lists dashboards in an AWS account.
    */
  def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(
    params: ListDashboardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]
  ): Request[ListDashboardsResponse, AWSError] = js.native
  /**
    * Lists all of the datasets belonging to the current AWS account in an AWS Region. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/ *.
    */
  def listDataSets(): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * Lists all of the datasets belonging to the current AWS account in an AWS Region. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/ *.
    */
  def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(
    params: ListDataSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]
  ): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * Lists data sources in current AWS Region that belong to this AWS account.
    */
  def listDataSources(): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists data sources in current AWS Region that belong to this AWS account.
    */
  def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]
  ): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists member users in a group.
    */
  def listGroupMemberships(): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * Lists member users in a group.
    */
  def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(
    params: ListGroupMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]
  ): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * Lists all user groups in Amazon QuickSight. 
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists all user groups in Amazon QuickSight. 
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists IAM policy assignments in the current Amazon QuickSight account.
    */
  def listIAMPolicyAssignments(): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  def listIAMPolicyAssignments(callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsResponse, Unit]): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  /**
    * Lists IAM policy assignments in the current Amazon QuickSight account.
    */
  def listIAMPolicyAssignments(params: ListIAMPolicyAssignmentsRequest): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  def listIAMPolicyAssignments(
    params: ListIAMPolicyAssignmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  /**
    * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to the specified user and group or groups that the user belongs to.
    */
  def listIAMPolicyAssignmentsForUser(): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  def listIAMPolicyAssignmentsForUser(
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsForUserResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  /**
    * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to the specified user and group or groups that the user belongs to.
    */
  def listIAMPolicyAssignmentsForUser(params: ListIAMPolicyAssignmentsForUserRequest): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  def listIAMPolicyAssignmentsForUser(
    params: ListIAMPolicyAssignmentsForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsForUserResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  /**
    * Lists the history of SPICE ingestions for a dataset.
    */
  def listIngestions(): Request[ListIngestionsResponse, AWSError] = js.native
  def listIngestions(callback: js.Function2[/* err */ AWSError, /* data */ ListIngestionsResponse, Unit]): Request[ListIngestionsResponse, AWSError] = js.native
  /**
    * Lists the history of SPICE ingestions for a dataset.
    */
  def listIngestions(params: ListIngestionsRequest): Request[ListIngestionsResponse, AWSError] = js.native
  def listIngestions(
    params: ListIngestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIngestionsResponse, Unit]
  ): Request[ListIngestionsResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all the aliases of a template.
    */
  def listTemplateAliases(): Request[ListTemplateAliasesResponse, AWSError] = js.native
  def listTemplateAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateAliasesResponse, Unit]): Request[ListTemplateAliasesResponse, AWSError] = js.native
  /**
    * Lists all the aliases of a template.
    */
  def listTemplateAliases(params: ListTemplateAliasesRequest): Request[ListTemplateAliasesResponse, AWSError] = js.native
  def listTemplateAliases(
    params: ListTemplateAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateAliasesResponse, Unit]
  ): Request[ListTemplateAliasesResponse, AWSError] = js.native
  /**
    * Lists all the versions of the templates in the current Amazon QuickSight account.
    */
  def listTemplateVersions(): Request[ListTemplateVersionsResponse, AWSError] = js.native
  def listTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateVersionsResponse, Unit]): Request[ListTemplateVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the templates in the current Amazon QuickSight account.
    */
  def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse, AWSError] = js.native
  def listTemplateVersions(
    params: ListTemplateVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateVersionsResponse, Unit]
  ): Request[ListTemplateVersionsResponse, AWSError] = js.native
  /**
    * Lists all the templates in the current Amazon QuickSight account.
    */
  def listTemplates(): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Lists all the templates in the current Amazon QuickSight account.
    */
  def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(
    params: ListTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]
  ): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
    */
  def listUserGroups(): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]): Request[ListUserGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
    */
  def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(
    params: ListUserGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]
  ): Request[ListUserGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account. 
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account. 
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request. 
    */
  def registerUser(): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]): Request[RegisterUserResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request. 
    */
  def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(
    params: RegisterUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]
  ): Request[RegisterUserResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source, dashboard, and template.  Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:   You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on users and SPICE capacity, which aren't taggable resources.   QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.  
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source, dashboard, and template.  Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:   You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on users and SPICE capacity, which aren't taggable resources.   QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.  
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag or tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag or tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates a dashboard in an AWS account.
    */
  def updateDashboard(): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]): Request[UpdateDashboardResponse, AWSError] = js.native
  /**
    * Updates a dashboard in an AWS account.
    */
  def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(
    params: UpdateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]
  ): Request[UpdateDashboardResponse, AWSError] = js.native
  /**
    * Updates read and write permissions on a dashboard.
    */
  def updateDashboardPermissions(): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  def updateDashboardPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPermissionsResponse, Unit]): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Updates read and write permissions on a dashboard.
    */
  def updateDashboardPermissions(params: UpdateDashboardPermissionsRequest): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  def updateDashboardPermissions(
    params: UpdateDashboardPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPermissionsResponse, Unit]
  ): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Updates the published version of a dashboard.
    */
  def updateDashboardPublishedVersion(): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  def updateDashboardPublishedVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPublishedVersionResponse, Unit]
  ): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  /**
    * Updates the published version of a dashboard.
    */
  def updateDashboardPublishedVersion(params: UpdateDashboardPublishedVersionRequest): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  def updateDashboardPublishedVersion(
    params: UpdateDashboardPublishedVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPublishedVersionResponse, Unit]
  ): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  /**
    * Updates a dataset.
    */
  def updateDataSet(): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]): Request[UpdateDataSetResponse, AWSError] = js.native
  /**
    * Updates a dataset.
    */
  def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(
    params: UpdateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]
  ): Request[UpdateDataSetResponse, AWSError] = js.native
  /**
    * Updates the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def updateDataSetPermissions(): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  def updateDataSetPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetPermissionsResponse, Unit]): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def updateDataSetPermissions(params: UpdateDataSetPermissionsRequest): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  def updateDataSetPermissions(
    params: UpdateDataSetPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetPermissionsResponse, Unit]
  ): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Updates a data source.
    */
  def updateDataSource(): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]): Request[UpdateDataSourceResponse, AWSError] = js.native
  /**
    * Updates a data source.
    */
  def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]
  ): Request[UpdateDataSourceResponse, AWSError] = js.native
  /**
    * Updates the permissions to a data source.
    */
  def updateDataSourcePermissions(): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  def updateDataSourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourcePermissionsResponse, Unit]): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions to a data source.
    */
  def updateDataSourcePermissions(params: UpdateDataSourcePermissionsRequest): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  def updateDataSourcePermissions(
    params: UpdateDataSourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourcePermissionsResponse, Unit]
  ): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Changes a group description. 
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Changes a group description. 
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that are specified in the request.
    */
  def updateIAMPolicyAssignment(): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  def updateIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIAMPolicyAssignmentResponse, Unit]): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that are specified in the request.
    */
  def updateIAMPolicyAssignment(params: UpdateIAMPolicyAssignmentRequest): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  def updateIAMPolicyAssignment(
    params: UpdateIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIAMPolicyAssignmentResponse, Unit]
  ): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Updates a template from an existing Amazon QuickSight analysis or another template.
    */
  def updateTemplate(): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Updates a template from an existing Amazon QuickSight analysis or another template.
    */
  def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(
    params: UpdateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]
  ): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Updates the template alias of a template.
    */
  def updateTemplateAlias(): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  def updateTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateAliasResponse, Unit]): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  /**
    * Updates the template alias of a template.
    */
  def updateTemplateAlias(params: UpdateTemplateAliasRequest): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  def updateTemplateAlias(
    params: UpdateTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateAliasResponse, Unit]
  ): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  /**
    * Updates the resource permissions for a template.
    */
  def updateTemplatePermissions(): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  def updateTemplatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplatePermissionsResponse, Unit]): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Updates the resource permissions for a template.
    */
  def updateTemplatePermissions(params: UpdateTemplatePermissionsRequest): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  def updateTemplatePermissions(
    params: UpdateTemplatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplatePermissionsResponse, Unit]
  ): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Updates an Amazon QuickSight user.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates an Amazon QuickSight user.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}

