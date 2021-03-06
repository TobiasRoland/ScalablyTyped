package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compress extends js.Object {
  /**
    * If true, the file data will be deflated (compression method 8).
    *
    * If false, the file data will be stored (compression method 0)
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  /**
    * Use ZIP64 format in this entry's Data Descriptor and Central Directory Record
    * regardless of if it's required or not (this may be useful for testing.).
    * Otherwise, packer will use ZIP64 format where necessary.
    */
  var forceZip64Format: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines file mode, 0o100664 by default
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * Defines modified date, now by default
    */
  var mtime: js.UndefOr[Double] = js.undefined
}

object Anon_Compress {
  @scala.inline
  def apply(
    compress: js.UndefOr[Boolean] = js.undefined,
    forceZip64Format: js.UndefOr[Boolean] = js.undefined,
    mode: Int | Double = null,
    mtime: Int | Double = null
  ): Anon_Compress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (!js.isUndefined(forceZip64Format)) __obj.updateDynamic("forceZip64Format")(forceZip64Format)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compress]
  }
}

