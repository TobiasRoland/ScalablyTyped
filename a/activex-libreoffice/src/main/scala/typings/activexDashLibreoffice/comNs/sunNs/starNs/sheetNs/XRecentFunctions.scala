package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a list of recently used functions.
  * @see com.sun.star.sheet.RecentFunctions
  */
trait XRecentFunctions extends XInterface {
  /** returns the maximum number of entries that will be stored as recently used functions. */
  val MaxRecentFunctions: Double
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  var RecentFunctionIds: SafeArray[Double]
  /** returns the maximum number of entries that will be stored as recently used functions. */
  def getMaxRecentFunctions(): Double
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  def getRecentFunctionIds(): SafeArray[Double]
  /**
    * sets the list of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @param aRecentFunctionIds the sequence of function identifiers most recently used.
    */
  def setRecentFunctionIds(aRecentFunctionIds: SeqEquiv[Double]): Unit
}

object XRecentFunctions {
  @scala.inline
  def apply(
    MaxRecentFunctions: Double,
    RecentFunctionIds: SafeArray[Double],
    acquire: () => Unit,
    getMaxRecentFunctions: () => Double,
    getRecentFunctionIds: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRecentFunctionIds: SeqEquiv[Double] => Unit
  ): XRecentFunctions = {
    val __obj = js.Dynamic.literal(MaxRecentFunctions = MaxRecentFunctions, RecentFunctionIds = RecentFunctionIds, acquire = js.Any.fromFunction0(acquire), getMaxRecentFunctions = js.Any.fromFunction0(getMaxRecentFunctions), getRecentFunctionIds = js.Any.fromFunction0(getRecentFunctionIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRecentFunctionIds = js.Any.fromFunction1(setRecentFunctionIds))
  
    __obj.asInstanceOf[XRecentFunctions]
  }
}

