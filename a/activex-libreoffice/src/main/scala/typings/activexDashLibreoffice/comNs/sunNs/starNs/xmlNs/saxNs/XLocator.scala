package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to associate a SAX event with a document location.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.Locator** .
  */
trait XLocator extends XInterface {
  /** @returns the column number where the current document event ends. */
  val ColumnNumber: Double
  /** @returns the line number where the current document event ends. */
  val LineNumber: Double
  /** @returns the public identifier for the current document event. */
  val PublicId: String
  /** @returns the system identifier for the current document event. */
  val SystemId: String
  /** @returns the column number where the current document event ends. */
  def getColumnNumber(): Double
  /** @returns the line number where the current document event ends. */
  def getLineNumber(): Double
  /** @returns the public identifier for the current document event. */
  def getPublicId(): String
  /** @returns the system identifier for the current document event. */
  def getSystemId(): String
}

object XLocator {
  @scala.inline
  def apply(
    ColumnNumber: Double,
    LineNumber: Double,
    PublicId: String,
    SystemId: String,
    acquire: () => Unit,
    getColumnNumber: () => Double,
    getLineNumber: () => Double,
    getPublicId: () => String,
    getSystemId: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLocator = {
    val __obj = js.Dynamic.literal(ColumnNumber = ColumnNumber, LineNumber = LineNumber, PublicId = PublicId, SystemId = SystemId, acquire = js.Any.fromFunction0(acquire), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getLineNumber = js.Any.fromFunction0(getLineNumber), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLocator]
  }
}

