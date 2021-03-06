package typings.reactIntl

import org.scalablytyped.runtime.Instantiable0
import typings.formatjsIntlListformat.mod.IntlListFormatOptions
import typings.formatjsIntlListformat.mod.default
import typings.formatjsIntlUtils.listTypesMod.ListPatternFieldsData
import typings.formatjsIntlUtils.listTypesMod.ListPatternLocaleData
import typings.reactIntl.reactIntlStrings.localeMatcher
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassIntlListFormat extends Instantiable0[default] {
  val __INTERNAL_SLOT_MAP__ : js.Any = js.native
  var __defaultLocale: js.Any = js.native
  var availableLocales: js.Any = js.native
  var getDefaultLocale: js.Any = js.native
  var localeData: Record[String, ListPatternFieldsData] = js.native
  var polyfilled: Boolean = js.native
  var relevantExtensionKeys: js.Any = js.native
  def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, options: Pick[IntlListFormatOptions, localeMatcher]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[IntlListFormatOptions, localeMatcher]): js.Array[String] = js.native
}

