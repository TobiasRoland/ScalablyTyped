package typings.awsSdk.marketplacecatalogMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceCatalog extends Service {
  @JSName("config")
  var config_MarketplaceCatalog: ConfigBase with ClientConfiguration = js.native
  /**
    * Used to cancel an open change request. Must be sent before the status of the request changes to APPLYING, the final stage of completing your change request. You can describe a change during the 60-day request history retention period for API calls.
    */
  def cancelChangeSet(): Request[CancelChangeSetResponse, AWSError] = js.native
  def cancelChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ CancelChangeSetResponse, Unit]): Request[CancelChangeSetResponse, AWSError] = js.native
  /**
    * Used to cancel an open change request. Must be sent before the status of the request changes to APPLYING, the final stage of completing your change request. You can describe a change during the 60-day request history retention period for API calls.
    */
  def cancelChangeSet(params: CancelChangeSetRequest): Request[CancelChangeSetResponse, AWSError] = js.native
  def cancelChangeSet(
    params: CancelChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelChangeSetResponse, Unit]
  ): Request[CancelChangeSetResponse, AWSError] = js.native
  /**
    * Provides information about a given change set.
    */
  def describeChangeSet(): Request[DescribeChangeSetResponse, AWSError] = js.native
  def describeChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetResponse, Unit]): Request[DescribeChangeSetResponse, AWSError] = js.native
  /**
    * Provides information about a given change set.
    */
  def describeChangeSet(params: DescribeChangeSetRequest): Request[DescribeChangeSetResponse, AWSError] = js.native
  def describeChangeSet(
    params: DescribeChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChangeSetResponse, Unit]
  ): Request[DescribeChangeSetResponse, AWSError] = js.native
  /**
    * Returns the metadata and content of the entity.
    */
  def describeEntity(): Request[DescribeEntityResponse, AWSError] = js.native
  def describeEntity(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityResponse, Unit]): Request[DescribeEntityResponse, AWSError] = js.native
  /**
    * Returns the metadata and content of the entity.
    */
  def describeEntity(params: DescribeEntityRequest): Request[DescribeEntityResponse, AWSError] = js.native
  def describeEntity(
    params: DescribeEntityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntityResponse, Unit]
  ): Request[DescribeEntityResponse, AWSError] = js.native
  /**
    * Returns the list of change sets owned by the account being used to make the call. You can filter this list by providing any combination of entityId, ChangeSetName, and status. If you provide more than one filter, the API operation applies a logical AND between the filters. You can describe a change during the 60-day request history retention period for API calls.
    */
  def listChangeSets(): Request[ListChangeSetsResponse, AWSError] = js.native
  def listChangeSets(callback: js.Function2[/* err */ AWSError, /* data */ ListChangeSetsResponse, Unit]): Request[ListChangeSetsResponse, AWSError] = js.native
  /**
    * Returns the list of change sets owned by the account being used to make the call. You can filter this list by providing any combination of entityId, ChangeSetName, and status. If you provide more than one filter, the API operation applies a logical AND between the filters. You can describe a change during the 60-day request history retention period for API calls.
    */
  def listChangeSets(params: ListChangeSetsRequest): Request[ListChangeSetsResponse, AWSError] = js.native
  def listChangeSets(
    params: ListChangeSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChangeSetsResponse, Unit]
  ): Request[ListChangeSetsResponse, AWSError] = js.native
  /**
    * Provides the list of entities of a given type.
    */
  def listEntities(): Request[ListEntitiesResponse, AWSError] = js.native
  def listEntities(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesResponse, Unit]): Request[ListEntitiesResponse, AWSError] = js.native
  /**
    * Provides the list of entities of a given type.
    */
  def listEntities(params: ListEntitiesRequest): Request[ListEntitiesResponse, AWSError] = js.native
  def listEntities(
    params: ListEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesResponse, Unit]
  ): Request[ListEntitiesResponse, AWSError] = js.native
  /**
    * This operation allows you to request changes in your entities.
    */
  def startChangeSet(): Request[StartChangeSetResponse, AWSError] = js.native
  def startChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ StartChangeSetResponse, Unit]): Request[StartChangeSetResponse, AWSError] = js.native
  /**
    * This operation allows you to request changes in your entities.
    */
  def startChangeSet(params: StartChangeSetRequest): Request[StartChangeSetResponse, AWSError] = js.native
  def startChangeSet(
    params: StartChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChangeSetResponse, Unit]
  ): Request[StartChangeSetResponse, AWSError] = js.native
}

