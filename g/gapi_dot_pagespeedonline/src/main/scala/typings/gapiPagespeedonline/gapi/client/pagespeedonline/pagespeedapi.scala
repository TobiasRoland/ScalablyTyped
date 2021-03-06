package typings.gapiPagespeedonline.gapi.client.pagespeedonline

import typings.gapi.gapi.client.HttpRequest
import typings.gapiPagespeedonline.AnonFields
import typings.gapiPagespeedonline.GoogleApiPageSpeedOnlineResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pagespeedapi extends js.Object {
  /**
    * Runs Page Speed analysis on the page at the specified URL, and returns a Page Speed score, a list of suggestions to make that page faster, and other information.
    */
  def runpagespeed(`object`: AnonFields): HttpRequest[GoogleApiPageSpeedOnlineResource]
}

object pagespeedapi {
  @scala.inline
  def apply(runpagespeed: AnonFields => HttpRequest[GoogleApiPageSpeedOnlineResource]): pagespeedapi = {
    val __obj = js.Dynamic.literal(runpagespeed = js.Any.fromFunction1(runpagespeed))
  
    __obj.asInstanceOf[pagespeedapi]
  }
}

