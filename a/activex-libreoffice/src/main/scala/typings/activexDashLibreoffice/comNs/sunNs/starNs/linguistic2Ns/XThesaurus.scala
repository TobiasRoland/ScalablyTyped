package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for the retrieval of possible meanings for a given word and language.
  *
  * The meaning of a word is in essence a descriptive text for that word. Each meaning may have several synonyms where a synonym is a word (or small text)
  * with the same or similar meaning.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XThesaurus extends XSupportedLocales {
  /**
    * @param aTerm the word to query for its meanings.
    * @param aLocale specifies the language of the word.  If the language is not supported, an {@link com.sun.star.lang.IllegalArgumentException} exception is
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns a list of meanings for the given word and language.
    * @see com.sun.star.lang.Locale
    * @see com.sun.star.linguistic2.XMeaning
    */
  def queryMeanings(aTerm: String, aLocale: Locale, aProperties: PropertyValues): SafeArray[XMeaning]
}

object XThesaurus {
  @scala.inline
  def apply(
    Locales: SafeArray[Locale],
    acquire: () => Unit,
    getLocales: () => SafeArray[Locale],
    hasLocale: Locale => Boolean,
    queryInterface: `type` => js.Any,
    queryMeanings: (String, Locale, PropertyValues) => SafeArray[XMeaning],
    release: () => Unit
  ): XThesaurus = {
    val __obj = js.Dynamic.literal(Locales = Locales, acquire = js.Any.fromFunction0(acquire), getLocales = js.Any.fromFunction0(getLocales), hasLocale = js.Any.fromFunction1(hasLocale), queryInterface = js.Any.fromFunction1(queryInterface), queryMeanings = js.Any.fromFunction3(queryMeanings), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XThesaurus]
  }
}

