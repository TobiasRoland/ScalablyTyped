package typings.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var until: String
}

object AnonId {
  @scala.inline
  def apply(id: String, until: String): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

