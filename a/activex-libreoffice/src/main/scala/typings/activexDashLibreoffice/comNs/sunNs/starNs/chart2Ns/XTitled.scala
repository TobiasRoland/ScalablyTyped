package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented by objects that support having a title of type {@link XTitle} . */
trait XTitled extends XInterface {
  /** get the object holding the title's content and formatting */
  var TitleObject: XTitle
  /** get the object holding the title's content and formatting */
  def getTitleObject(): XTitle
  /** set a new title object replacing the former one */
  def setTitleObject(Title: XTitle): Unit
}

object XTitled {
  @scala.inline
  def apply(
    TitleObject: XTitle,
    acquire: () => Unit,
    getTitleObject: () => XTitle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitleObject: XTitle => Unit
  ): XTitled = {
    val __obj = js.Dynamic.literal(TitleObject = TitleObject, acquire = js.Any.fromFunction0(acquire), getTitleObject = js.Any.fromFunction0(getTitleObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitleObject = js.Any.fromFunction1(setTitleObject))
  
    __obj.asInstanceOf[XTitled]
  }
}

