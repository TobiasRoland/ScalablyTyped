package typings.storybookComponents.previewMod

import typings.storybookComponents.sourceMod.SourceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var isColumn: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var withSource: js.UndefOr[SourceProps] = js.undefined
  var withToolbar: js.UndefOr[Boolean] = js.undefined
}

object PreviewProps {
  @scala.inline
  def apply(
    className: String = null,
    columns: Int | Double = null,
    isColumn: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    withSource: SourceProps = null,
    withToolbar: js.UndefOr[Boolean] = js.undefined
  ): PreviewProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumn)) __obj.updateDynamic("isColumn")(isColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (withSource != null) __obj.updateDynamic("withSource")(withSource.asInstanceOf[js.Any])
    if (!js.isUndefined(withToolbar)) __obj.updateDynamic("withToolbar")(withToolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewProps]
  }
}

