package typings.arangodb

import typings.arangodb.ArangoDB.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: js.UndefOr[HttpMethod] = js.undefined
  var url: String
}

object AnonMethod {
  @scala.inline
  def apply(url: String, method: HttpMethod = null): AnonMethod = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

