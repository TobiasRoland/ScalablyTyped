package typings.reResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSSize extends js.Object {
  var height: String
  var width: String
}

object CSSSize {
  @scala.inline
  def apply(height: String, width: String): CSSSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CSSSize]
  }
}

