package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TableStyle")
@js.native
class TableStyle protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPage: Double = js.native
  var AllowPageBreaks: Boolean = js.native
  val Application: typings.activexWord.Word.Application = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  var BottomPadding: Double = js.native
  var ColumnStripe: Double = js.native
  val Creator: Double = js.native
  var LeftIndent: Double = js.native
  var LeftPadding: Double = js.native
  val Parent: js.Any = js.native
  var RightPadding: Double = js.native
  var RowStripe: Double = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  var Spacing: Double = js.native
  var TableDirection: WdTableDirection = js.native
  var TopPadding: Double = js.native
  @JSName("Word.TableStyle_typekey")
  var WordDotTableStyle_typekey: TableStyle = js.native
  def Condition(ConditionCode: WdConditionCode): ConditionalStyle = js.native
}

