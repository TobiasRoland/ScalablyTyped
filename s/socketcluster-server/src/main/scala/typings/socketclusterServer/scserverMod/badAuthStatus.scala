package typings.socketclusterServer.scserverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait badAuthStatus extends js.Object {
  var authError: Error
  var signedAuthToken: String
}

object badAuthStatus {
  @scala.inline
  def apply(authError: Error, signedAuthToken: String): badAuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[badAuthStatus]
  }
}

