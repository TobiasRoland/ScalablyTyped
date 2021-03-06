package typings.adone.adoneNs.compressorNs.INs.zlibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var finishFlush: js.UndefOr[Double] = js.undefined
  var flush: js.UndefOr[Double] = js.undefined
  /**
    * The base two logarithm of the window size (the size of the history buffer).
    * It should be in the range 8..15.
    * Larger values of this parameter result in better compression at the expense of memory usage.
    */
  var windowBits: js.UndefOr[Double] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    windowBits: Int | Double = null
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

