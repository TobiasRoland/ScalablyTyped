package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XServiceDisplayName
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers spell checking functionality. */
trait SpellChecker
  extends XSpellChecker
     with XLinguServiceEventBroadcaster
     with XInitialization
     with XComponent
     with XServiceDisplayName

object SpellChecker {
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    dispose: () => Unit,
    getLocales: () => SafeArray[Locale],
    getServiceDisplayName: Locale => String,
    hasLocale: Locale => Boolean,
    initialize: SeqEquiv[_] => Unit,
    isValid: (String, Locale, PropertyValues) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    spell: (String, Locale, PropertyValues) => XSpellAlternatives
  ): SpellChecker = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addLinguServiceEventListener = js.Any.fromFunction1(addLinguServiceEventListener), dispose = js.Any.fromFunction0(dispose), getLocales = js.Any.fromFunction0(getLocales), getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), hasLocale = js.Any.fromFunction1(hasLocale), initialize = js.Any.fromFunction1(initialize), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeLinguServiceEventListener = js.Any.fromFunction1(removeLinguServiceEventListener), spell = js.Any.fromFunction3(spell))
  
    __obj.asInstanceOf[SpellChecker]
  }
}

