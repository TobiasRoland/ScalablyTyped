package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.baseMod.DynamicMessageCreator
import typings.expressValidator.expressValidatorStrings.ES
import typings.expressValidator.expressValidatorStrings.any
import typings.expressValidator.optionsMod.AlphaLocale
import typings.expressValidator.optionsMod.AlphanumericLocale
import typings.expressValidator.optionsMod.HashAlgorithm
import typings.expressValidator.optionsMod.IPVersion
import typings.expressValidator.optionsMod.IsCurrencyOptions
import typings.expressValidator.optionsMod.IsDecimalOptions
import typings.expressValidator.optionsMod.IsEmailOptions
import typings.expressValidator.optionsMod.IsEmptyOptions
import typings.expressValidator.optionsMod.IsFQDNOptions
import typings.expressValidator.optionsMod.IsFloatOptions
import typings.expressValidator.optionsMod.IsISO8601Options
import typings.expressValidator.optionsMod.IsISSNOptions
import typings.expressValidator.optionsMod.IsIntOptions
import typings.expressValidator.optionsMod.IsMACAddressOptions
import typings.expressValidator.optionsMod.IsMobilePhoneOptions
import typings.expressValidator.optionsMod.IsNumericOptions
import typings.expressValidator.optionsMod.IsURLOptions
import typings.expressValidator.optionsMod.MinMaxExtendedOptions
import typings.expressValidator.optionsMod.MinMaxOptions
import typings.expressValidator.optionsMod.MobilePhoneLocale
import typings.expressValidator.optionsMod.PostalCodeLocale
import typings.expressValidator.optionsMod.UUIDVersion
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/validators", JSImport.Namespace)
@js.native
object validatorsMod extends js.Object {
  @js.native
  trait Validators[Return] extends js.Object {
    def contains(elem: js.Any): Return = js.native
    def custom(validator: CustomValidator): Return = js.native
    def equals(comparison: String): Return = js.native
    def exists(): Return = js.native
    def exists(options: AnonCheckFalsy): Return = js.native
    def isAfter(): Return = js.native
    def isAfter(date: String): Return = js.native
    def isAlpha(): Return = js.native
    def isAlpha(locale: AlphaLocale): Return = js.native
    def isAlphanumeric(): Return = js.native
    def isAlphanumeric(locale: AlphanumericLocale): Return = js.native
    def isArray(): Return = js.native
    def isArray(options: AnonMax): Return = js.native
    def isAscii(): Return = js.native
    def isBase32(): Return = js.native
    def isBase64(): Return = js.native
    def isBefore(): Return = js.native
    def isBefore(date: String): Return = js.native
    def isBoolean(): Return = js.native
    def isByteLength(options: MinMaxExtendedOptions): Return = js.native
    def isCreditCard(): Return = js.native
    def isCurrency(): Return = js.native
    def isCurrency(options: IsCurrencyOptions): Return = js.native
    def isDataURI(): Return = js.native
    def isDecimal(): Return = js.native
    def isDecimal(options: IsDecimalOptions): Return = js.native
    def isDivisibleBy(number: Double): Return = js.native
    def isEmail(): Return = js.native
    def isEmail(options: IsEmailOptions): Return = js.native
    def isEmpty(): Return = js.native
    def isEmpty(options: IsEmptyOptions): Return = js.native
    def isFQDN(): Return = js.native
    def isFQDN(options: IsFQDNOptions): Return = js.native
    def isFloat(): Return = js.native
    def isFloat(options: IsFloatOptions): Return = js.native
    def isFullWidth(): Return = js.native
    def isHalfWidth(): Return = js.native
    def isHash(algorithm: HashAlgorithm): Return = js.native
    def isHexColor(): Return = js.native
    def isHexadecimal(): Return = js.native
    def isIP(): Return = js.native
    def isIP(version: IPVersion): Return = js.native
    def isIPRange(): Return = js.native
    def isISBN(): Return = js.native
    def isISBN(version: Double): Return = js.native
    def isISIN(): Return = js.native
    def isISO31661Alpha2(): Return = js.native
    def isISO31661Alpha3(): Return = js.native
    def isISO8601(): Return = js.native
    def isISO8601(options: IsISO8601Options): Return = js.native
    def isISRC(): Return = js.native
    def isISSN(): Return = js.native
    def isISSN(options: IsISSNOptions): Return = js.native
    def isIdentityCard(): Return = js.native
    @JSName("isIdentityCard")
    def isIdentityCard_ES(locale: js.Array[ES]): Return = js.native
    @JSName("isIdentityCard")
    def isIdentityCard_any(locale: any): Return = js.native
    def isIn(values: js.Array[_]): Return = js.native
    def isInt(): Return = js.native
    def isInt(options: IsIntOptions): Return = js.native
    def isJSON(): Return = js.native
    def isJWT(): Return = js.native
    def isLatLong(): Return = js.native
    def isLength(options: MinMaxOptions): Return = js.native
    def isLowercase(): Return = js.native
    def isMACAddress(): Return = js.native
    def isMACAddress(options: IsMACAddressOptions): Return = js.native
    def isMD5(): Return = js.native
    def isMagnetURI(): Return = js.native
    def isMimeType(): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale): Return = js.native
    def isMobilePhone(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Return = js.native
    def isMongoId(): Return = js.native
    def isMultibyte(): Return = js.native
    def isNumeric(): Return = js.native
    def isNumeric(options: IsNumericOptions): Return = js.native
    def isPort(): Return = js.native
    def isPostalCode(locale: PostalCodeLocale): Return = js.native
    def isRFC3339(): Return = js.native
    def isString(): Return = js.native
    def isSurrogatePair(): Return = js.native
    def isURL(): Return = js.native
    def isURL(options: IsURLOptions): Return = js.native
    def isUUID(): Return = js.native
    def isUUID(version: UUIDVersion): Return = js.native
    def isUppercase(): Return = js.native
    def isVariableWidth(): Return = js.native
    def isWhitelisted(chars: String): Return = js.native
    def isWhitelisted(chars: js.Array[String]): Return = js.native
    def matches(pattern: String): Return = js.native
    def matches(pattern: String, modifiers: String): Return = js.native
    def matches(pattern: RegExp): Return = js.native
    def matches(pattern: RegExp, modifiers: String): Return = js.native
    def not(): Return = js.native
    def notEmpty(): Return = js.native
    def notEmpty(options: IsEmptyOptions): Return = js.native
    def withMessage(message: js.Any): Return = js.native
    def withMessage(message: DynamicMessageCreator): Return = js.native
  }
  
}

