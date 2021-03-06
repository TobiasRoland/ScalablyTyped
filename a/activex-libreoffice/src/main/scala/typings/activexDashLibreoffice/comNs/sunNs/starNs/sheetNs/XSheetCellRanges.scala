package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access cell ranges in a collection via index and other helper methods.
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetCellRanges extends XIndexAccess {
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  val Cells: XEnumerationAccess
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  val RangeAddresses: SafeArray[CellRangeAddress]
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  val RangeAddressesAsString: String
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  def getCells(): XEnumerationAccess
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  def getRangeAddresses(): SafeArray[CellRangeAddress]
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  def getRangeAddressesAsString(): String
}

object XSheetCellRanges {
  @scala.inline
  def apply(
    Cells: XEnumerationAccess,
    Count: Double,
    ElementType: `type`,
    RangeAddresses: SafeArray[CellRangeAddress],
    RangeAddressesAsString: String,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCells: () => XEnumerationAccess,
    getCount: () => Double,
    getElementType: () => `type`,
    getRangeAddresses: () => SafeArray[CellRangeAddress],
    getRangeAddressesAsString: () => String,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetCellRanges = {
    val __obj = js.Dynamic.literal(Cells = Cells, Count = Count, ElementType = ElementType, RangeAddresses = RangeAddresses, RangeAddressesAsString = RangeAddressesAsString, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCells = js.Any.fromFunction0(getCells), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getRangeAddresses = js.Any.fromFunction0(getRangeAddresses), getRangeAddressesAsString = js.Any.fromFunction0(getRangeAddressesAsString), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetCellRanges]
  }
}

