package typings.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom
  - typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome
*/
trait htmlEngine extends js.Object

object htmlEngine {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chrome: typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome = this.cast("chrome")
  @scala.inline
  def phantom: typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom = this.cast("phantom")
}

