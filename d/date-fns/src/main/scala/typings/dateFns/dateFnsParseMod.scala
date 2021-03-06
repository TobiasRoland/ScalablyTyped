package typings.dateFns

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("date-fns/parse", JSImport.Namespace)
@js.native
object dateFnsParseMod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(dateString: String, formatString: String, backupDate: Double): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Double,
      options: Anon01234567FirstWeekContainsDateLocaleUseAdditionalDayOfYearTokens
    ): Date = js.native
    def apply(dateString: String, formatString: String, backupDate: Date): Date = js.native
    def apply(
      dateString: String,
      formatString: String,
      backupDate: Date,
      options: Anon01234567FirstWeekContainsDateLocaleUseAdditionalDayOfYearTokens
    ): Date = js.native
  }
  
}

