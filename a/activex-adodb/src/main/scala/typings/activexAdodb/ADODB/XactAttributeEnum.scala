package typings.activexAdodb.ADODB

import typings.activexAdodb.activexAdodbNumbers.`1048576`
import typings.activexAdodb.activexAdodbNumbers.`131072`
import typings.activexAdodb.activexAdodbNumbers.`262144`
import typings.activexAdodb.activexAdodbNumbers.`524288`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexAdodb.activexAdodbNumbers.`262144`
  - typings.activexAdodb.activexAdodbNumbers.`524288`
  - typings.activexAdodb.activexAdodbNumbers.`131072`
  - typings.activexAdodb.activexAdodbNumbers.`1048576`
*/
trait XactAttributeEnum extends js.Object

object XactAttributeEnum {
  @scala.inline
  def adXactAbortRetaining: `262144` = this.cast(262144)
  @scala.inline
  def adXactAsyncPhaseOne: `524288` = this.cast(524288)
  @scala.inline
  def adXactCommitRetaining: `131072` = this.cast(131072)
  @scala.inline
  def adXactSyncPhaseOne: `1048576` = this.cast(1048576)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

