package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTriggersDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the project that owns the trigger.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * ID of the `BuildTrigger` to delete.
    */
  var triggerId: js.UndefOr[String] = js.native
}

