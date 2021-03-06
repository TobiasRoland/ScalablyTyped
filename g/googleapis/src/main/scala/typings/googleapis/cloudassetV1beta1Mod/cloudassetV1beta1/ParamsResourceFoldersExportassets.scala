package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFoldersExportassets extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The relative name of the root asset. This can only be an
    * organization number (such as "organizations/123"), a project ID (such as
    * "projects/my-project-id"), a project number (such as "projects/12345"),
    * or a folder number (such as "folders/123").
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExportAssetsRequest] = js.native
}

