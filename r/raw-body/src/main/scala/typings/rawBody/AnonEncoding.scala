package typings.rawBody

import typings.rawBody.mod.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var encoding: Encoding
}

object AnonEncoding {
  @scala.inline
  def apply(encoding: Encoding): AnonEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEncoding]
  }
}

