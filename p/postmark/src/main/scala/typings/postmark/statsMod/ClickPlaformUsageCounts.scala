package typings.postmark.statsMod

import typings.postmark.AnonDateDesktopMobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickPlaformUsageCounts extends js.Object {
  var Days: js.Array[AnonDateDesktopMobile]
  var Desktop: Double
  var Mobile: Double
  var Unknown: Double
}

object ClickPlaformUsageCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDateDesktopMobile], Desktop: Double, Mobile: Double, Unknown: Double): ClickPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickPlaformUsageCounts]
  }
}

