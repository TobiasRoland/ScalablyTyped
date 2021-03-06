package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /**
    * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If
    * any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
    *
    * For more information, see Deleting snaphots.
    */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot): Request_[Operation]
  /** Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserSnapshot): Request_[Snapshot]
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(request: AnonAlt): Request_[SnapshotList]
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource): Request_[Operation]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRequestIdSnapshot => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserSnapshot => Request_[Snapshot],
    list: AnonAlt => Request_[SnapshotList],
    setLabels: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource => Request_[Operation]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
  
    __obj.asInstanceOf[SnapshotsResource]
  }
}

