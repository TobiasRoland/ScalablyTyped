package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsConfigsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of the RuntimeConfig resource to retrieve, in the format:
    * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    */
  var name: js.UndefOr[String] = js.native
}

