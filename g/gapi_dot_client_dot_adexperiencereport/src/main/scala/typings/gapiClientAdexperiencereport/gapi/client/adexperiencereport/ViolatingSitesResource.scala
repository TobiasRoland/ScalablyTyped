package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexperiencereport.AnonAccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViolatingSitesResource extends js.Object {
  /** Lists sites with Ad Experience Report statuses of "Failing" or "Warning". */
  def list(request: AnonAccesstokenAlt): Request_[ViolatingSitesResponse]
}

object ViolatingSitesResource {
  @scala.inline
  def apply(list: AnonAccesstokenAlt => Request_[ViolatingSitesResponse]): ViolatingSitesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ViolatingSitesResource]
  }
}

