package typings.ejs

import typings.ejs.ejsBooleans.`false`
import typings.ejs.ejsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncClientFalseTrue extends js.Object {
  var async: js.UndefOr[`false`] = js.undefined
  var client: `true`
}

object AnonAsyncClientFalseTrue {
  @scala.inline
  def apply(client: `true`, async: `false` = null): AnonAsyncClientFalseTrue = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncClientFalseTrue]
  }
}

