package typings.gapiClientSheets.gapi.client.sheets

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSheets.AnonAccesstokenAltCallback
import typings.gapiClientSheets.AnonAccesstokenAltCallbackFieldsIncludeGridData
import typings.gapiClientSheets.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceSpreadsheetIdUploadType
import typings.gapiClientSheets.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceSpreadsheetIdUploadTypeUploadprotocol
import typings.gapiClientSheets.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceUploadType
import typings.gapiClientSheets.AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetsResource extends js.Object {
  var developerMetadata: DeveloperMetadataResource = js.native
  var sheets: SheetsResource = js.native
  var values: ValuesResource = js.native
  /**
    * Applies one or more updates to the spreadsheet.
    *
    * Each request is validated before
    * being applied. If any request is not valid then the entire request will
    * fail and nothing will be applied.
    *
    * Some requests have replies to
    * give you some information about how
    * they are applied. The replies will mirror the requests.  For example,
    * if you applied 4 updates and the 3rd one had a reply, then the
    * response will have 2 empty replies, the actual reply, and another empty
    * reply, in that order.
    *
    * Due to the collaborative nature of spreadsheets, it is not guaranteed that
    * the spreadsheet will reflect exactly your changes after this completes,
    * however it is guaranteed that the updates in the request will be
    * applied together atomically. Your changes may be altered with respect to
    * collaborator changes. If there are no collaborators, the spreadsheet
    * should reflect your changes.
    */
  def batchUpdate(
    request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceSpreadsheetIdUploadType
  ): Request_[BatchUpdateSpreadsheetResponse] = js.native
  def batchUpdate(request: AnonAccesstokenAltCallback, body: BatchUpdateSpreadsheetRequest): Request_[BatchUpdateSpreadsheetResponse] = js.native
  /** Creates a spreadsheet, returning the newly created spreadsheet. */
  def create(request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceUploadType): Request_[Spreadsheet] = js.native
  def create(
    request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserUploadType,
    body: Spreadsheet
  ): Request_[Spreadsheet] = js.native
  /**
    * Returns the spreadsheet at the given ID.
    * The caller must specify the spreadsheet ID.
    *
    * By default, data within grids will not be returned.
    * You can include grid data one of two ways:
    *
    * &#42; Specify a field mask listing your desired fields using the `fields` URL
    * parameter in HTTP
    *
    * &#42; Set the includeGridData
    * URL parameter to true.  If a field mask is set, the `includeGridData`
    * parameter is ignored
    *
    * For large spreadsheets, it is recommended to retrieve only the specific
    * fields of the spreadsheet that you want.
    *
    * To retrieve only subsets of the spreadsheet, use the
    * ranges URL parameter.
    * Multiple ranges can be specified.  Limiting the range will
    * return only the portions of the spreadsheet that intersect the requested
    * ranges. Ranges are specified using A1 notation.
    */
  def get(request: AnonAccesstokenAltCallbackFieldsIncludeGridData): Request_[Spreadsheet] = js.native
  /**
    * Returns the spreadsheet at the given ID.
    * The caller must specify the spreadsheet ID.
    *
    * This method differs from GetSpreadsheet in that it allows selecting
    * which subsets of spreadsheet data to return by specifying a
    * dataFilters parameter.
    * Multiple DataFilters can be specified.  Specifying one or
    * more data filters will return the portions of the spreadsheet that
    * intersect ranges matched by any of the filters.
    *
    * By default, data within grids will not be returned.
    * You can include grid data one of two ways:
    *
    * &#42; Specify a field mask listing your desired fields using the `fields` URL
    * parameter in HTTP
    *
    * &#42; Set the includeGridData
    * parameter to true.  If a field mask is set, the `includeGridData`
    * parameter is ignored
    *
    * For large spreadsheets, it is recommended to retrieve only the specific
    * fields of the spreadsheet that you want.
    */
  def getByDataFilter(
    request: AnonAccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceSpreadsheetIdUploadTypeUploadprotocol
  ): Request_[Spreadsheet] = js.native
  def getByDataFilter(request: AnonAccesstokenAltCallback, body: GetSpreadsheetByDataFilterRequest): Request_[Spreadsheet] = js.native
}

