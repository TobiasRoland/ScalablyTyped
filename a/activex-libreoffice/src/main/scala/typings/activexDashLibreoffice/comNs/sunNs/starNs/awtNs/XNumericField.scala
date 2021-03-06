package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a numeric field. */
trait XNumericField extends XInterface {
  /** returns the currently set number of decimals. */
  var DecimalDigits: Double
  /** returns the currently set first value which is set on POS1 key. */
  var First: Double
  /** returns the currently set last value which is set on END key. */
  var Last: Double
  /** returns the currently set maximum value that can be entered by the user. */
  var Max: Double
  /** returns the currently set minimum value that can be entered by the user. */
  var Min: Double
  /** returns the currently set increment value for the spin button. */
  var SpinSize: Double
  /** returns the value which is currently displayed in the numeric field. */
  var Value: Double
  /** returns the currently set number of decimals. */
  def getDecimalDigits(): Double
  /** returns the currently set first value which is set on POS1 key. */
  def getFirst(): Double
  /** returns the currently set last value which is set on END key. */
  def getLast(): Double
  /** returns the currently set maximum value that can be entered by the user. */
  def getMax(): Double
  /** returns the currently set minimum value that can be entered by the user. */
  def getMin(): Double
  /** returns the currently set increment value for the spin button. */
  def getSpinSize(): Double
  /** returns the value which is currently displayed in the numeric field. */
  def getValue(): Double
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  /** sets the number of decimals. */
  def setDecimalDigits(nDigits: Double): Unit
  /** sets the first value to be set on POS1 key. */
  def setFirst(Value: Double): Unit
  /** sets the last value to be set on END key. */
  def setLast(Value: Double): Unit
  /** sets the maximum value that can be entered by the user. */
  def setMax(Value: Double): Unit
  /** sets the minimum value that can be entered by the user. */
  def setMin(Value: Double): Unit
  /** sets the increment value for the spin button. */
  def setSpinSize(Value: Double): Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  /** sets the value which is displayed in the numeric field. */
  def setValue(Value: Double): Unit
}

object XNumericField {
  @scala.inline
  def apply(
    DecimalDigits: Double,
    First: Double,
    Last: Double,
    Max: Double,
    Min: Double,
    SpinSize: Double,
    Value: Double,
    acquire: () => Unit,
    getDecimalDigits: () => Double,
    getFirst: () => Double,
    getLast: () => Double,
    getMax: () => Double,
    getMin: () => Double,
    getSpinSize: () => Double,
    getValue: () => Double,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDecimalDigits: Double => Unit,
    setFirst: Double => Unit,
    setLast: Double => Unit,
    setMax: Double => Unit,
    setMin: Double => Unit,
    setSpinSize: Double => Unit,
    setStrictFormat: Boolean => Unit,
    setValue: Double => Unit
  ): XNumericField = {
    val __obj = js.Dynamic.literal(DecimalDigits = DecimalDigits, First = First, Last = Last, Max = Max, Min = Min, SpinSize = SpinSize, Value = Value, acquire = js.Any.fromFunction0(acquire), getDecimalDigits = js.Any.fromFunction0(getDecimalDigits), getFirst = js.Any.fromFunction0(getFirst), getLast = js.Any.fromFunction0(getLast), getMax = js.Any.fromFunction0(getMax), getMin = js.Any.fromFunction0(getMin), getSpinSize = js.Any.fromFunction0(getSpinSize), getValue = js.Any.fromFunction0(getValue), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDecimalDigits = js.Any.fromFunction1(setDecimalDigits), setFirst = js.Any.fromFunction1(setFirst), setLast = js.Any.fromFunction1(setLast), setMax = js.Any.fromFunction1(setMax), setMin = js.Any.fromFunction1(setMin), setSpinSize = js.Any.fromFunction1(setSpinSize), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[XNumericField]
  }
}

