package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.ReposGetProtectedBranchPullRequestReviewEnforcementParams
import typings.octokitRest.mod.ReposGetProtectedBranchPullRequestReviewEnforcementResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposGetProtectedBranchPullRequestReviewEnforcementParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposGetProtectedBranchPullRequestReviewEnforcementResponse]] = js.native
  def apply(params: RequestOptions with ReposGetProtectedBranchPullRequestReviewEnforcementParams): js.Promise[Response[ReposGetProtectedBranchPullRequestReviewEnforcementResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

