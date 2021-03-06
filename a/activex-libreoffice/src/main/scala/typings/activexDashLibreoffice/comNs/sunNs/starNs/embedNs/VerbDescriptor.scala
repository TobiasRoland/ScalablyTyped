package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a verb. */
trait VerbDescriptor extends js.Object {
  /**
    * specifies the attributes of the verb.
    *
    * It can take values from {@link VerbAttributes} .
    */
  var VerbAttributes: Double
  /**
    * specifies the flags that are set for the verb.
    *
    * The flags can be used to build the verb's menu.
    */
  var VerbFlags: Double
  /** specifies the id of the verb. */
  var VerbID: Double
  /** specifies the name of the verb. */
  var VerbName: String
}

object VerbDescriptor {
  @scala.inline
  def apply(VerbAttributes: Double, VerbFlags: Double, VerbID: Double, VerbName: String): VerbDescriptor = {
    val __obj = js.Dynamic.literal(VerbAttributes = VerbAttributes, VerbFlags = VerbFlags, VerbID = VerbID, VerbName = VerbName)
  
    __obj.asInstanceOf[VerbDescriptor]
  }
}

