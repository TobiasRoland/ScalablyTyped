package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouderrorreporting.AnonAccesstokenAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStatsResource extends js.Object {
  /** Lists the specified groups. */
  def list(request: AnonAccesstokenAlignment): Request_[ListGroupStatsResponse]
}

object GroupStatsResource {
  @scala.inline
  def apply(list: AnonAccesstokenAlignment => Request_[ListGroupStatsResponse]): GroupStatsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GroupStatsResource]
  }
}

