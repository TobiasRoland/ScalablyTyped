package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexExcel.activexExcelNumbers.`1`
  - typings.activexExcel.activexExcelNumbers.`0`
  - typings.activexExcel.activexExcelNumbers.`2`
*/
trait XlParameterType extends js.Object

object XlParameterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xlConstant: `1` = this.cast(1)
  @scala.inline
  def xlPrompt: `0` = this.cast(0)
  @scala.inline
  def xlRange: `2` = this.cast(2)
}

