package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleMaps.googleMapsStrings.OK
  - typings.googleMaps.googleMapsStrings.INVALID_REQUEST
  - typings.googleMaps.googleMapsStrings.OVER_DAILY_LIMIT
  - typings.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT
  - typings.googleMaps.googleMapsStrings.REQUEST_DENIED
  - typings.googleMaps.googleMapsStrings.UNKNOWN_ERROR
*/
trait ElevationResponseStatus extends js.Object

object ElevationResponseStatus {
  @scala.inline
  def INVALID_REQUEST: typings.googleMaps.googleMapsStrings.INVALID_REQUEST = this.cast("INVALID_REQUEST")
  @scala.inline
  def OK: typings.googleMaps.googleMapsStrings.OK = this.cast("OK")
  @scala.inline
  def OVER_DAILY_LIMIT: typings.googleMaps.googleMapsStrings.OVER_DAILY_LIMIT = this.cast("OVER_DAILY_LIMIT")
  @scala.inline
  def OVER_QUERY_LIMIT: typings.googleMaps.googleMapsStrings.OVER_QUERY_LIMIT = this.cast("OVER_QUERY_LIMIT")
  @scala.inline
  def REQUEST_DENIED: typings.googleMaps.googleMapsStrings.REQUEST_DENIED = this.cast("REQUEST_DENIED")
  @scala.inline
  def UNKNOWN_ERROR: typings.googleMaps.googleMapsStrings.UNKNOWN_ERROR = this.cast("UNKNOWN_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

