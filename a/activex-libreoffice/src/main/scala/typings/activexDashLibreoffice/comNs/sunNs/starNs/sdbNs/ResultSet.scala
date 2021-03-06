package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XArray
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XBlob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XClob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRef
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link com.sun.star.sdbcx.ResultSet} by a more sophisticated access to the result sets data. */
trait ResultSet
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.ResultSet
     with XColumnsSupplier

object ResultSet {
  @scala.inline
  def apply(
    Bookmark: js.Any,
    CanUpdateInsertedRows: Boolean,
    Columns: XNameAccess,
    CursorName: String,
    FetchDirection: Double,
    FetchSize: Double,
    IsBookmarkable: Boolean,
    MetaData: XResultSetMetaData,
    PropertySetInfo: XPropertySetInfo,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    Row: Double,
    Statement: XInterface,
    Warnings: js.Any,
    absolute: Double => Boolean,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    afterLast: () => Unit,
    beforeFirst: () => Unit,
    cancel: () => Unit,
    cancelRowUpdates: () => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    compareBookmarks: (js.Any, js.Any) => Double,
    deleteRow: () => Unit,
    deleteRows: SeqEquiv[_] => SafeArray[Double],
    dispose: () => Unit,
    findColumn: String => Double,
    first: () => Boolean,
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBookmark: () => js.Any,
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getColumns: () => XNameAccess,
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: () => XResultSetMetaData,
    getObject: (Double, XNameAccess) => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRef: Double => XRef,
    getRow: () => Double,
    getShort: Double => Double,
    getStatement: () => XInterface,
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    getWarnings: () => js.Any,
    hasOrderedBookmarks: () => Boolean,
    hashBookmark: js.Any => Double,
    insertRow: () => Unit,
    isAfterLast: () => Boolean,
    isBeforeFirst: () => Boolean,
    isFirst: () => Boolean,
    isLast: () => Boolean,
    last: () => Boolean,
    moveRelativeToBookmark: (js.Any, Double) => Boolean,
    moveToBookmark: js.Any => Boolean,
    moveToCurrentRow: () => Unit,
    moveToInsertRow: () => Unit,
    next: () => Boolean,
    previous: () => Boolean,
    queryInterface: `type` => js.Any,
    refreshRow: () => Unit,
    relative: Double => Boolean,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rowDeleted: () => Boolean,
    rowInserted: () => Boolean,
    rowUpdated: () => Boolean,
    setPropertyValue: (String, js.Any) => Unit,
    updateBinaryStream: (Double, XInputStream, Double) => Unit,
    updateBoolean: (Double, Boolean) => Unit,
    updateByte: (Double, Double) => Unit,
    updateBytes: (Double, SeqEquiv[Double]) => Unit,
    updateCharacterStream: (Double, XInputStream, Double) => Unit,
    updateDate: (Double, Date) => Unit,
    updateDouble: (Double, Double) => Unit,
    updateFloat: (Double, Double) => Unit,
    updateInt: (Double, Double) => Unit,
    updateLong: (Double, Double) => Unit,
    updateNull: Double => Unit,
    updateNumericObject: (Double, js.Any, Double) => Unit,
    updateObject: (Double, js.Any) => Unit,
    updateRow: () => Unit,
    updateShort: (Double, Double) => Unit,
    updateString: (Double, String) => Unit,
    updateTime: (Double, Time) => Unit,
    updateTimestamp: (Double, DateTime) => Unit,
    wasNull: () => Boolean
  ): ResultSet = {
    val __obj = js.Dynamic.literal(Bookmark = Bookmark, CanUpdateInsertedRows = CanUpdateInsertedRows, Columns = Columns, CursorName = CursorName, FetchDirection = FetchDirection, FetchSize = FetchSize, IsBookmarkable = IsBookmarkable, MetaData = MetaData, PropertySetInfo = PropertySetInfo, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, Row = Row, Statement = Statement, Warnings = Warnings, absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), cancel = js.Any.fromFunction0(cancel), cancelRowUpdates = js.Any.fromFunction0(cancelRowUpdates), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), compareBookmarks = js.Any.fromFunction2(compareBookmarks), deleteRow = js.Any.fromFunction0(deleteRow), deleteRows = js.Any.fromFunction1(deleteRows), dispose = js.Any.fromFunction0(dispose), findColumn = js.Any.fromFunction1(findColumn), first = js.Any.fromFunction0(first), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBookmark = js.Any.fromFunction0(getBookmark), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getColumns = js.Any.fromFunction0(getColumns), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = js.Any.fromFunction0(getMetaData), getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getRow = js.Any.fromFunction0(getRow), getShort = js.Any.fromFunction1(getShort), getStatement = js.Any.fromFunction0(getStatement), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getWarnings = js.Any.fromFunction0(getWarnings), hasOrderedBookmarks = js.Any.fromFunction0(hasOrderedBookmarks), hashBookmark = js.Any.fromFunction1(hashBookmark), insertRow = js.Any.fromFunction0(insertRow), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), moveRelativeToBookmark = js.Any.fromFunction2(moveRelativeToBookmark), moveToBookmark = js.Any.fromFunction1(moveToBookmark), moveToCurrentRow = js.Any.fromFunction0(moveToCurrentRow), moveToInsertRow = js.Any.fromFunction0(moveToInsertRow), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated), setPropertyValue = js.Any.fromFunction2(setPropertyValue), updateBinaryStream = js.Any.fromFunction3(updateBinaryStream), updateBoolean = js.Any.fromFunction2(updateBoolean), updateByte = js.Any.fromFunction2(updateByte), updateBytes = js.Any.fromFunction2(updateBytes), updateCharacterStream = js.Any.fromFunction3(updateCharacterStream), updateDate = js.Any.fromFunction2(updateDate), updateDouble = js.Any.fromFunction2(updateDouble), updateFloat = js.Any.fromFunction2(updateFloat), updateInt = js.Any.fromFunction2(updateInt), updateLong = js.Any.fromFunction2(updateLong), updateNull = js.Any.fromFunction1(updateNull), updateNumericObject = js.Any.fromFunction3(updateNumericObject), updateObject = js.Any.fromFunction2(updateObject), updateRow = js.Any.fromFunction0(updateRow), updateShort = js.Any.fromFunction2(updateShort), updateString = js.Any.fromFunction2(updateString), updateTime = js.Any.fromFunction2(updateTime), updateTimestamp = js.Any.fromFunction2(updateTimestamp), wasNull = js.Any.fromFunction0(wasNull))
  
    __obj.asInstanceOf[ResultSet]
  }
}

