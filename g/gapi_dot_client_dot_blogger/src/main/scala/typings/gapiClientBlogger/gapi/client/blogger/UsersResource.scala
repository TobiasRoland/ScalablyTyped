package typings.gapiClientBlogger.gapi.client.blogger

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBlogger.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Gets one user by ID. */
  def get(request: AnonAltFieldsKey): Request_[User]
}

object UsersResource {
  @scala.inline
  def apply(get: AnonAltFieldsKey => Request_[User]): UsersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UsersResource]
  }
}

