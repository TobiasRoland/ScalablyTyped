package typings.meteorDashAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Insert extends js.Object {
  var insert: Boolean
  var remove: Boolean
  var update: Boolean
}

object Anon_Insert {
  @scala.inline
  def apply(insert: Boolean, remove: Boolean, update: Boolean): Anon_Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Insert]
  }
}

