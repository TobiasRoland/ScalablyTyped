package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeletedCount extends js.Object {
  var deletedCount: Double
  var result: Anon01N
}

object AnonDeletedCount {
  @scala.inline
  def apply(deletedCount: Double, result: Anon01N): AnonDeletedCount = {
    val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeletedCount]
  }
}

