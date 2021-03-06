package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a constant.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANT.
  *
  * Constants may be contained in constants groups and modules.
  * @see XModuleTypeDescription
  * @see XConstantsTypeDescription
  * @since OOo 1.1.2
  */
trait XConstantTypeDescription extends XTypeDescription {
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  val ConstantValue: js.Any
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  def getConstantValue(): js.Any
}

object XConstantTypeDescription {
  @scala.inline
  def apply(
    ConstantValue: js.Any,
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstantValue: () => js.Any,
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConstantTypeDescription = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getConstantValue = js.Any.fromFunction0(getConstantValue), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XConstantTypeDescription]
  }
}

