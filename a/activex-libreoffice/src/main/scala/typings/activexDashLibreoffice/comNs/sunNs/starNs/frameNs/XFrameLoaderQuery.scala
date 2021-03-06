package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use service {@link FrameLoaderFactory} instead of this
  * @deprecated Deprecated
  */
trait XFrameLoaderQuery extends XInterface {
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  val AvailableFilterNames: SafeArray[String]
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getAvailableFilterNames(): SafeArray[String]
  /**
    * use member {@link com.sun.star.container.XNameAccess.getByName()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getLoaderProperties(sFilterName: String): SafeArray[PropertyValue]
  /**
    * use member {@link com.sun.star.container.XContainerQuery} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def searchFilter(sURL: String, seqArguments: SeqEquiv[PropertyValue]): String
}

object XFrameLoaderQuery {
  @scala.inline
  def apply(
    AvailableFilterNames: SafeArray[String],
    acquire: () => Unit,
    getAvailableFilterNames: () => SafeArray[String],
    getLoaderProperties: String => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    searchFilter: (String, SeqEquiv[PropertyValue]) => String
  ): XFrameLoaderQuery = {
    val __obj = js.Dynamic.literal(AvailableFilterNames = AvailableFilterNames, acquire = js.Any.fromFunction0(acquire), getAvailableFilterNames = js.Any.fromFunction0(getAvailableFilterNames), getLoaderProperties = js.Any.fromFunction1(getLoaderProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), searchFilter = js.Any.fromFunction2(searchFilter))
  
    __obj.asInstanceOf[XFrameLoaderQuery]
  }
}

