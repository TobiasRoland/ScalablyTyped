package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an enum type. */
trait XEnumTypeDescription extends XTypeDescription {
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  val DefaultEnumValue: Double
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  val EnumNames: SafeArray[String]
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  val EnumValues: SafeArray[Double]
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  def getDefaultEnumValue(): Double
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  def getEnumNames(): SafeArray[String]
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  def getEnumValues(): SafeArray[Double]
}

object XEnumTypeDescription {
  @scala.inline
  def apply(
    DefaultEnumValue: Double,
    EnumNames: SafeArray[String],
    EnumValues: SafeArray[Double],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDefaultEnumValue: () => Double,
    getEnumNames: () => SafeArray[String],
    getEnumValues: () => SafeArray[Double],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnumTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultEnumValue = DefaultEnumValue, EnumNames = EnumNames, EnumValues = EnumValues, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getDefaultEnumValue = js.Any.fromFunction0(getDefaultEnumValue), getEnumNames = js.Any.fromFunction0(getEnumNames), getEnumValues = js.Any.fromFunction0(getEnumValues), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEnumTypeDescription]
  }
}

