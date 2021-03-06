package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and settings of a control which is associated with a spinnable value. */
trait XSpinValue extends XInterface {
  /** returns the currently set maximum value of the control */
  var Maximum: Double
  /** returns the currently set minimum value of the control */
  var Minimum: Double
  /** returns the current orientation of the control */
  var Orientation: Double
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  var SpinIncrement: Double
  /** returns the current value of the control. */
  var Value: Double
  /** registers an adjustment event listener. */
  def addAdjustmentListener(listener: XAdjustmentListener): Unit
  /** returns the currently set maximum value of the control */
  def getMaximum(): Double
  /** returns the currently set minimum value of the control */
  def getMinimum(): Double
  /** returns the current orientation of the control */
  def getOrientation(): Double
  /** returns the value by which the current value of the control should be incremented or decremented upon spinning. */
  def getSpinIncrement(): Double
  /** returns the current value of the control. */
  def getValue(): Double
  /** unregisters an adjustment event listener. */
  def removeAdjustmentListener(listener: XAdjustmentListener): Unit
  /** sets the maximum value which can be set on the control */
  def setMaximum(maxValue: Double): Unit
  /** sets the minimum value which can be set on the control */
  def setMinimum(minValue: Double): Unit
  /**
    * controls the orientation of the control
    * @param orientation one of the {@link ScrollBarOrientation} values specifying the orientation
    * @throws com::sun::star::lang::NoSupportException in case the given orientation is not supported
    */
  def setOrientation(orientation: Double): Unit
  /** sets the value by which the current value of the control should be incremented or decremented upon spinning. */
  def setSpinIncrement(spinIncrement: Double): Unit
  /** sets the current value of the control */
  def setValue(value: Double): Unit
  /**
    * sets the value and value range of the control
    * @see setValue
    * @see setMinimum
    * @see setMaximum
    */
  def setValues(minValue: Double, maxValue: Double, currentValue: Double): Unit
}

object XSpinValue {
  @scala.inline
  def apply(
    Maximum: Double,
    Minimum: Double,
    Orientation: Double,
    SpinIncrement: Double,
    Value: Double,
    acquire: () => Unit,
    addAdjustmentListener: XAdjustmentListener => Unit,
    getMaximum: () => Double,
    getMinimum: () => Double,
    getOrientation: () => Double,
    getSpinIncrement: () => Double,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAdjustmentListener: XAdjustmentListener => Unit,
    setMaximum: Double => Unit,
    setMinimum: Double => Unit,
    setOrientation: Double => Unit,
    setSpinIncrement: Double => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit
  ): XSpinValue = {
    val __obj = js.Dynamic.literal(Maximum = Maximum, Minimum = Minimum, Orientation = Orientation, SpinIncrement = SpinIncrement, Value = Value, acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), getMaximum = js.Any.fromFunction0(getMaximum), getMinimum = js.Any.fromFunction0(getMinimum), getOrientation = js.Any.fromFunction0(getOrientation), getSpinIncrement = js.Any.fromFunction0(getSpinIncrement), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), setMaximum = js.Any.fromFunction1(setMaximum), setMinimum = js.Any.fromFunction1(setMinimum), setOrientation = js.Any.fromFunction1(setOrientation), setSpinIncrement = js.Any.fromFunction1(setSpinIncrement), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues))
  
    __obj.asInstanceOf[XSpinValue]
  }
}

