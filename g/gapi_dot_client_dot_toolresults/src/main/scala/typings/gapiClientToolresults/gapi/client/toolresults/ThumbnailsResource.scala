package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientToolresults.AnonAltExecutionIdFieldsHistoryIdKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /**
    * Lists thumbnails of images attached to a step.
    *
    * May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from the project, or from any of the
    * images - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step does not exist, or if any of the images do not exist
    */
  def list(request: AnonAltExecutionIdFieldsHistoryIdKeyOauthtoken): Request_[ListStepThumbnailsResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(list: AnonAltExecutionIdFieldsHistoryIdKeyOauthtoken => Request_[ListStepThumbnailsResponse]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

