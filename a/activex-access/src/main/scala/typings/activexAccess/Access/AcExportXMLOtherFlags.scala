package typings.activexAccess.Access

import typings.activexAccess.activexAccessNumbers.`16`
import typings.activexAccess.activexAccessNumbers.`1`
import typings.activexAccess.activexAccessNumbers.`2`
import typings.activexAccess.activexAccessNumbers.`32`
import typings.activexAccess.activexAccessNumbers.`4`
import typings.activexAccess.activexAccessNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexAccess.activexAccessNumbers.`1`
  - typings.activexAccess.activexAccessNumbers.`2`
  - typings.activexAccess.activexAccessNumbers.`32`
  - typings.activexAccess.activexAccessNumbers.`8`
  - typings.activexAccess.activexAccessNumbers.`16`
  - typings.activexAccess.activexAccessNumbers.`4`
*/
trait AcExportXMLOtherFlags extends js.Object

object AcExportXMLOtherFlags {
  @scala.inline
  def acEmbedSchema: `1` = this.cast(1)
  @scala.inline
  def acExcludePrimaryKeyAndIndexes: `2` = this.cast(2)
  @scala.inline
  def acExportAllTableAndFieldProperties: `32` = this.cast(32)
  @scala.inline
  def acLiveReportSource: `8` = this.cast(8)
  @scala.inline
  def acPersistReportML: `16` = this.cast(16)
  @scala.inline
  def acRunFromServer: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

