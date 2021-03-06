package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface must be implemented for a server that can support MSAA com objects and send win32 accessible events */
trait XMSAAService extends XComponent {
  /**
    * Return com object pointer.
    * @returns A reference to the object that contains the actual accessibility information.
    * @see AccessibleContext
    */
  def getAccObjectPtr(hWnd: Double, lParam: Double, wParam: Double): Double
  def handleWindowOpened(i: Double): Unit
}

object XMSAAService {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getAccObjectPtr: (Double, Double, Double) => Double,
    handleWindowOpened: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XMSAAService = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getAccObjectPtr = js.Any.fromFunction3(getAccObjectPtr), handleWindowOpened = js.Any.fromFunction1(handleWindowOpened), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XMSAAService]
  }
}

