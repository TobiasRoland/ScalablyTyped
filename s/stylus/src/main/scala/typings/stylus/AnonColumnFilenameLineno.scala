package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnFilenameLineno extends js.Object {
  var column: Double
  var filename: String
  var lineno: Double
  var quote: String
  var `val`: String
}

object AnonColumnFilenameLineno {
  @scala.inline
  def apply(column: Double, filename: String, lineno: Double, quote: String, `val`: String): AnonColumnFilenameLineno = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnFilenameLineno]
  }
}

