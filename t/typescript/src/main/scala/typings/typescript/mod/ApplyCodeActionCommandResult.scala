package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyCodeActionCommandResult extends js.Object {
  var successMessage: java.lang.String
}

object ApplyCodeActionCommandResult {
  @scala.inline
  def apply(successMessage: java.lang.String): ApplyCodeActionCommandResult = {
    val __obj = js.Dynamic.literal(successMessage = successMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplyCodeActionCommandResult]
  }
}

