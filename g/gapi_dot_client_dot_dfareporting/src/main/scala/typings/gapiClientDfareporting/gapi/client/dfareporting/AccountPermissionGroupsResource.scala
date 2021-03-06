package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsResource extends js.Object {
  /** Gets one account permission group by ID. */
  def get(request: AnonAltFields): Request_[AccountPermissionGroup]
  /** Retrieves the list of account permission groups. */
  def list(request: AnonAltFieldsKey): Request_[AccountPermissionGroupsListResponse]
}

object AccountPermissionGroupsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[AccountPermissionGroup],
    list: AnonAltFieldsKey => Request_[AccountPermissionGroupsListResponse]
  ): AccountPermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountPermissionGroupsResource]
  }
}

