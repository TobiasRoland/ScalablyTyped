package typings.octokitRest

import typings.octokitRest.mod.Endpoint
import typings.octokitRest.mod.EndpointOptions
import typings.octokitRest.mod.ReposGetProtectedBranchRestrictionsParams
import typings.octokitRest.mod.ReposGetProtectedBranchRestrictionsResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsPromiseReposGetProtectedBranchRestrictionsParams extends js.Object {
  @JSName("endpoint")
  var endpoint_Original: Endpoint = js.native
  def apply(): js.Promise[Response[ReposGetProtectedBranchRestrictionsResponse]] = js.native
  def apply(params: RequestOptions with ReposGetProtectedBranchRestrictionsParams): js.Promise[Response[ReposGetProtectedBranchRestrictionsResponse]] = js.native
  def endpoint(EndpointOptions: EndpointOptions): RequestOptions = js.native
  def endpoint(Route: String): RequestOptions = js.native
  def endpoint(Route: String, EndpointOptions: EndpointOptions): RequestOptions = js.native
}

