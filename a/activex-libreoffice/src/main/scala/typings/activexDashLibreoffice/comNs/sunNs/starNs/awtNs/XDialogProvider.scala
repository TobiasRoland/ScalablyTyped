package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
trait XDialogProvider extends XInterface {
  /**
    * creates a dialog for the given URL.
    * @param URL is the URL.
    * @returns a dialog implementing the {@link com.sun.star.awt.XDialog} interface.
    * @throws com::sun::star::lang::IllegalArgumentException if no dialog for the given URL is found or if the URL is invalid.
    */
  def createDialog(URL: String): XDialog
}

object XDialogProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDialog: String => XDialog,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDialogProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDialog = js.Any.fromFunction1(createDialog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDialogProvider]
  }
}

