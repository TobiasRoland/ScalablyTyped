package typings.octokitRest

import typings.octokitRest.mod.AnyResponse
import typings.octokitRest.mod.EmptyParams
import typings.octokitRest.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  /**
    * Lists all the emojis available to use on GitHub.
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsAnyResponseEmptyParams = js.native
  /**
    * Lists all the emojis available to use on GitHub.
    */
  def get(): js.Promise[AnyResponse] = js.native
  def get(params: RequestOptions with EmptyParams): js.Promise[AnyResponse] = js.native
}

