package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdId
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagsResource extends js.Object {
  /** Deletes an existing event tag. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets one event tag by ID. */
  def get(request: AnonAltFields): Request_[EventTag]
  /** Inserts a new event tag. */
  def insert(request: AnonAltFieldsKey): Request_[EventTag]
  /** Retrieves a list of event tags, possibly filtered. */
  def list(request: AnonAdId): Request_[EventTagsListResponse]
  /** Updates an existing event tag. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[EventTag]
  /** Updates an existing event tag. */
  def update(request: AnonAltFieldsKey): Request_[EventTag]
}

object EventTagsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[EventTag],
    insert: AnonAltFieldsKey => Request_[EventTag],
    list: AnonAdId => Request_[EventTagsListResponse],
    patch: AnonAltFields => Request_[EventTag],
    update: AnonAltFieldsKey => Request_[EventTag]
  ): EventTagsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EventTagsResource]
  }
}

