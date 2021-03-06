package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApksResource extends js.Object {
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to
    * enterprises using Google Play for Work whose application is configured to restrict distribution to the enterprise domain.
    */
  def addexternallyhosted(request: AnonAltEditId): Request_[ApksAddExternallyHostedResponse]
  def list(request: AnonAltEditId): Request_[ApksListResponse]
  def upload(request: AnonAltEditId): Request_[Apk]
}

object ApksResource {
  @scala.inline
  def apply(
    addexternallyhosted: AnonAltEditId => Request_[ApksAddExternallyHostedResponse],
    list: AnonAltEditId => Request_[ApksListResponse],
    upload: AnonAltEditId => Request_[Apk]
  ): ApksResource = {
    val __obj = js.Dynamic.literal(addexternallyhosted = js.Any.fromFunction1(addexternallyhosted), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ApksResource]
  }
}

