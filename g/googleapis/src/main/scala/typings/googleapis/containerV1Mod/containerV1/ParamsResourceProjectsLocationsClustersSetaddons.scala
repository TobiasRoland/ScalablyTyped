package typings.googleapis.containerV1Mod.containerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsClustersSetaddons extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name (project, location, cluster) of the cluster to set addons.
    * Specified in the format 'projects/x/locations/x/clusters/x'.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetAddonsConfigRequest] = js.native
}

