package typings.storybookComponents.iconMod

import typings.storybookComponents.iconsMod.IconKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconsProps extends js.Object {
  var icon: IconKey
}

object IconsProps {
  @scala.inline
  def apply(icon: IconKey): IconsProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IconsProps]
  }
}

