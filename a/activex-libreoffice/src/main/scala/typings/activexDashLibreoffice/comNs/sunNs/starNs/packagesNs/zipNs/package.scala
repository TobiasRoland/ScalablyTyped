package typings.activexDashLibreoffice.comNs.sunNs.starNs.packagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zipNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.IOException
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception

  /**
    * used to indicate that a ZIP exception has occurred.
    *
    * This interface is an IDL version of the Java interface **java.util.zip.ZipException** with some minor adaptations.
    */
  type ZipException = Exception
  /**
    * used to indicate that a ZIP exception has occurred. Usually can be thrown from XInputStream interface implementations.
    *
    * This interface is an IDL version of the Java interface **java.util.zip.ZipException** with some minor adaptations.
    * @since OOo 1.1.2
    */
  type ZipIOException = IOException
}
