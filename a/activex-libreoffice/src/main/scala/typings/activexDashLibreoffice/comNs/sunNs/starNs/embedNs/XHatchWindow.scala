package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window is a kind of window that is adopted to contain an embedded object window to represent the contained window border and to handle
  * resizing/moving in a specific way: after user have selected the new size/placement the hatching window sends request to owner for resizing/moving.
  * Thus the window can not resize/move itself.
  */
trait XHatchWindow extends XComponent {
  var HatchBorderSize: Size
  /** sets the object that will control resizing/moving, if the object is not set the window can not be resized/moved. */
  def setController(xController: XHatchWindowController): Unit
}

object XHatchWindow {
  @scala.inline
  def apply(
    HatchBorderSize: Size,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setController: XHatchWindowController => Unit
  ): XHatchWindow = {
    val __obj = js.Dynamic.literal(HatchBorderSize = HatchBorderSize, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setController = js.Any.fromFunction1(setController))
  
    __obj.asInstanceOf[XHatchWindow]
  }
}

