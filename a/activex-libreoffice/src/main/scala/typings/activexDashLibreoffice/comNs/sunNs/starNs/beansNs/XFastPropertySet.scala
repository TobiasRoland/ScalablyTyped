package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a fast way of accessing and changing property values.
  *
  * This interface is an extension to the {@link XPropertySet} interface. The get and set methods use handles to access the property values instead of
  * character strings.
  */
trait XFastPropertySet extends XInterface {
  /**
    * @param nHandle contains the implementation handle of the implementation for the property.
    * @returns the value of the property with the name PropertyName.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getFastPropertyValue(nHandle: Double): js.Any
  /**
    * sets the value to the property with the specified name.
    * @param nHandle contains the implementation handle of the implementation for the property.
    * @param aValue contains the new value of the property.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws PropertyVetoException if a vetoable listener does not approve the change of a property value.
    * @throws IllegalArgumentException if the new value cannot be converted to the type of the underlying property by an identity or widening conversion.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def setFastPropertyValue(nHandle: Double, aValue: js.Any): Unit
}

object XFastPropertySet {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getFastPropertyValue: Double => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit
  ): XFastPropertySet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
  
    __obj.asInstanceOf[XFastPropertySet]
  }
}

