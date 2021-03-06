package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface for an executable dialog. */
trait XExecutableDialog extends XInterface {
  /**
    * Executes (shows) the dialog.
    * @returns A status code of type {@link ExecutableDialogResults} .
    */
  def execute(): Double
  /**
    * Sets the title of the dialog.
    * @param aTitle Set an arbitrary title for the dialog, may be an empty string if the dialog should not have a title.
    */
  def setTitle(aTitle: String): Unit
}

object XExecutableDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XExecutableDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XExecutableDialog]
  }
}

