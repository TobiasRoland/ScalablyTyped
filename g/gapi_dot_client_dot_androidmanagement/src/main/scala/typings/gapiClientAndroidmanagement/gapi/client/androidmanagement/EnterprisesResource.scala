package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAccesstokenAlt
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallbackEnterpriseToken
import typings.gapiClientAndroidmanagement.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesResource extends js.Object {
  var applications: ApplicationsResource
  var devices: DevicesResource
  var enrollmentTokens: EnrollmentTokensResource
  var policies: PoliciesResource
  var webTokens: WebTokensResource
  /** Creates an enterprise by completing the enterprise signup flow. */
  def create(request: AnonAccesstokenAltBearertokenCallbackEnterpriseToken): Request_[Enterprise]
  /** Gets an enterprise. */
  def get(request: AnonAccesstokenAlt): Request_[Enterprise]
  /** Updates an enterprise. */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[Enterprise]
}

object EnterprisesResource {
  @scala.inline
  def apply(
    applications: ApplicationsResource,
    create: AnonAccesstokenAltBearertokenCallbackEnterpriseToken => Request_[Enterprise],
    devices: DevicesResource,
    enrollmentTokens: EnrollmentTokensResource,
    get: AnonAccesstokenAlt => Request_[Enterprise],
    patch: AnonAccesstokenAltBearertokenCallbackFields => Request_[Enterprise],
    policies: PoliciesResource,
    webTokens: WebTokensResource
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), devices = devices.asInstanceOf[js.Any], enrollmentTokens = enrollmentTokens.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), policies = policies.asInstanceOf[js.Any], webTokens = webTokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnterprisesResource]
  }
}

