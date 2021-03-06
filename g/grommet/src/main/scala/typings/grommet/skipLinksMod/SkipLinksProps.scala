package typings.grommet.skipLinksMod

import typings.grommet.AnonSkipTo
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: ReactNode
  var messages: js.UndefOr[AnonSkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: ReactNode = null, messages: AnonSkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinksProps]
  }
}

