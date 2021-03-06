package typings.intlRelativeformat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleData extends js.Object {
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName  :string,   relative  :std.Record<string, string>,   relativePeriod? :string,   relativeTime  :{  future  :std.Record<string, string>,   past  :std.Record<string, string>}}}
    */ typings.intlRelativeformat.intlRelativeformatStrings.LocaleData with js.Any
  ] = js.undefined
  var locale: String
  var parentLocale: js.UndefOr[String] = js.undefined
}

object LocaleData {
  @scala.inline
  def apply(
    locale: String,
    fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName  :string,   relative  :std.Record<string, string>,   relativePeriod? :string,   relativeTime  :{  future  :std.Record<string, string>,   past  :std.Record<string, string>}}}
    */ typings.intlRelativeformat.intlRelativeformatStrings.LocaleData with js.Any = null,
    parentLocale: String = null
  ): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (parentLocale != null) __obj.updateDynamic("parentLocale")(parentLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData]
  }
}

