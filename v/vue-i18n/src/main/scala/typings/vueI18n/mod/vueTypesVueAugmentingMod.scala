package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vueI18n.FnArgs
import typings.vueI18n.FnArgsKey
import typings.vueI18n.FnChoice
import typings.vueI18n.FnKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$d")
    var $d_Original: FnArgs = js.native
    @JSName("$i18n")
    val $i18n: VueI18n with IVueI18n = js.native
    @JSName("$n")
    var $n_Original: FnArgsKey = js.native
    @JSName("$t")
    var $t_Original: FnKey = js.native
    @JSName("$tc")
    var $tc_Original: FnChoice = js.native
    @JSName("$te")
    var $te_Original: js.Function2[
        /* key */ typings.vueI18n.mod.VueI18n.Path, 
        /* locale */ js.UndefOr[typings.vueI18n.mod.VueI18n.Locale], 
        Boolean
      ] = js.native
    @JSName("$d")
    def $d(value: Double): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$n")
    def $n(value: Double): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult = js.native
    @JSName("$t")
    def $t(key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typings.vueI18n.mod.VueI18n.Path,
      locale: typings.vueI18n.mod.VueI18n.Locale,
      values: typings.vueI18n.mod.VueI18n.Values
    ): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(key: typings.vueI18n.mod.VueI18n.Path, values: typings.vueI18n.mod.VueI18n.Values): typings.vueI18n.mod.VueI18n.TranslateResult = js.native
    @JSName("$tc")
    def $tc(key: typings.vueI18n.mod.VueI18n.Path): String = js.native
    @JSName("$tc")
    def $tc(key: typings.vueI18n.mod.VueI18n.Path, choice: typings.vueI18n.mod.VueI18n.Choice): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueI18n.mod.VueI18n.Path,
      choice: typings.vueI18n.mod.VueI18n.Choice,
      locale: typings.vueI18n.mod.VueI18n.Locale
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueI18n.mod.VueI18n.Path,
      choice: typings.vueI18n.mod.VueI18n.Choice,
      locale: typings.vueI18n.mod.VueI18n.Locale,
      values: typings.vueI18n.mod.VueI18n.Values
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueI18n.mod.VueI18n.Path,
      choice: typings.vueI18n.mod.VueI18n.Choice,
      values: typings.vueI18n.mod.VueI18n.Values
    ): String = js.native
    @JSName("$te")
    def $te(key: typings.vueI18n.mod.VueI18n.Path): Boolean = js.native
    @JSName("$te")
    def $te(key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): Boolean = js.native
  }
  
}

