package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import typings.gapiClientGmail.AnonAltFields
import typings.gapiClientGmail.AnonAltFieldsFormat
import typings.gapiClientGmail.AnonAltFieldsIncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: AnonAlt): Request_[Draft]
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets the specified draft. */
  def get(request: AnonAltFieldsFormat): Request_[Draft]
  /** Lists the drafts in the user's mailbox. */
  def list(request: AnonAltFieldsIncludeSpamTrash): Request_[ListDraftsResponse]
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: AnonAlt): Request_[Message]
  /** Replaces a draft's content. */
  def update(request: AnonAltFields): Request_[Draft]
}

object DraftsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Draft],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFieldsFormat => Request_[Draft],
    list: AnonAltFieldsIncludeSpamTrash => Request_[ListDraftsResponse],
    send: AnonAlt => Request_[Message],
    update: AnonAltFields => Request_[Draft]
  ): DraftsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), send = js.Any.fromFunction1(send), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DraftsResource]
  }
}

