package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLogging.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Lists the descriptors for monitored resource types used by Stackdriver Logging. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize): Request_[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    list: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize => Request_[ListMonitoredResourceDescriptorsResponse]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

