package typings.officeJsPreview

import typings.officeJsPreview.Office.HostType
import typings.officeJsPreview.Office.PlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: HostType
  var platform: PlatformType
}

object AnonHost {
  @scala.inline
  def apply(host: HostType, platform: PlatformType): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHost]
  }
}

