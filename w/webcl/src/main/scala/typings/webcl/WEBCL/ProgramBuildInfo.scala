package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x1181`
import typings.webcl.webclNumbers.`0x1182`
import typings.webcl.webclNumbers.`0x1183`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_program_build_info */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1181`
  - typings.webcl.webclNumbers.`0x1182`
  - typings.webcl.webclNumbers.`0x1183`
*/
trait ProgramBuildInfo extends js.Object

object ProgramBuildInfo {
  @scala.inline
  def PROGRAM_BUILD_LOG: `0x1183` = this.cast(0x1183)
  @scala.inline
  def PROGRAM_BUILD_OPTIONS: `0x1182` = this.cast(0x1182)
  @scala.inline
  def PROGRAM_BUILD_STATUS: `0x1181` = this.cast(0x1181)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

