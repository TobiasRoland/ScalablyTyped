package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to notify a toolbar controller about events
  * @see com.sun.star.frame.ToolbarController
  * @since OOo 2.0
  */
trait XToolbarControllerListener extends XInterface {
  /**
    * gets called to notify a controller that a toolbar function has been selected.
    * @param aToolbarRes a string which identifies the toolbar where the function has been selected.
    * @param aCommand a string which identifies the function that has been selected.  This notification is normally used to implement the toolbar button/sub-t
    */
  def functionSelected(aToolbarRes: String, aCommand: String): Unit
}

object XToolbarControllerListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    functionSelected: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XToolbarControllerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), functionSelected = js.Any.fromFunction2(functionSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XToolbarControllerListener]
  }
}

