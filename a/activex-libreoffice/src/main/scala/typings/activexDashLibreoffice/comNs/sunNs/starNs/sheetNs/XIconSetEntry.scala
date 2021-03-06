package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XIconSetEntry extends js.Object {
  var Formula: String
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  var Type: Double
  def getFormula(): String
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def getType(): Double
  def setFormula(Formula: String): Unit
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def setType(Type: Double): Unit
}

object XIconSetEntry {
  @scala.inline
  def apply(
    Formula: String,
    Type: Double,
    getFormula: () => String,
    getType: () => Double,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XIconSetEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula, Type = Type, getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XIconSetEntry]
  }
}

