package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudmonitoring.AnonAggregator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptorsResource extends js.Object {
  /**
    * List the descriptors of the time series that match the metric and labels values and that have data points in the interval. Large responses are
    * paginated; use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: AnonAggregator): Request_[ListTimeseriesDescriptorsResponse]
}

object TimeseriesDescriptorsResource {
  @scala.inline
  def apply(list: AnonAggregator => Request_[ListTimeseriesDescriptorsResponse]): TimeseriesDescriptorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TimeseriesDescriptorsResource]
  }
}

