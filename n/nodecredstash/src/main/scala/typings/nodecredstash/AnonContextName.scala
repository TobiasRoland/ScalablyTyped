package typings.nodecredstash

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextName extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var name: String
  var version: js.UndefOr[Double] = js.undefined
}

object AnonContextName {
  @scala.inline
  def apply(name: String, context: CredstashContext = null, version: Int | Double = null): AnonContextName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextName]
  }
}

