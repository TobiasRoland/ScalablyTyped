package typings.chessJs

import typings.chessJs.chessJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalseVerbose extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[`false`] = js.undefined
}

object AnonFalseVerbose {
  @scala.inline
  def apply(verbose: `false` = null): AnonFalseVerbose = {
    val __obj = js.Dynamic.literal()
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalseVerbose]
  }
}

