package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XMultiPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XMultiPropertyStates
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows access to a single automatic style. */
trait XAutoStyle
  extends XMultiPropertySet
     with XMultiPropertyStates {
  /** returns a sequence of all properties that are set in the style */
  val Properties: PropertyValues
  /** returns a sequence of all properties that are set in the style */
  def getProperties(): PropertyValues
}

object XAutoStyle {
  @scala.inline
  def apply(
    Properties: PropertyValues,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getProperties: () => PropertyValues,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): XAutoStyle = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getProperties = js.Any.fromFunction0(getProperties), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValues = js.Any.fromFunction1(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
  
    __obj.asInstanceOf[XAutoStyle]
  }
}

