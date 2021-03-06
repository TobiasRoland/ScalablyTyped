package typings.gapiClientCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtmlTitle extends js.Object {
  var htmlTitle: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonHtmlTitle {
  @scala.inline
  def apply(htmlTitle: String = null, link: String = null, title: String = null, url: String = null): AnonHtmlTitle = {
    val __obj = js.Dynamic.literal()
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHtmlTitle]
  }
}

