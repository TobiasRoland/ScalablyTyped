package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEnterprisesWebappsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of the web app in the form
    * enterprises/{enterpriseId}/webApps/{packageName}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWebApp] = js.native
  /**
    * The field mask indicating the fields to update. If not set, all
    * modifiable fields will be modified.
    */
  var updateMask: js.UndefOr[String] = js.native
}

