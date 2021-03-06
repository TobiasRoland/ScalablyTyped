package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One entry in a calendar, for example, a day of week or a month or an era.
  *
  * Derived from {@link com.sun.star.i18n.CalendarItem} this provides an additional member for narrow names.
  * @since LibreOffice 3.5
  */
trait CalendarItem2 extends CalendarItem {
  /** The narrow name, for example, **"S"** for Sunday or **"J"** for January. */
  var NarrowName: String
}

object CalendarItem2 {
  @scala.inline
  def apply(AbbrevName: String, FullName: String, ID: String, NarrowName: String): CalendarItem2 = {
    val __obj = js.Dynamic.literal(AbbrevName = AbbrevName, FullName = FullName, ID = ID, NarrowName = NarrowName)
  
    __obj.asInstanceOf[CalendarItem2]
  }
}

