package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.paginationPaginationMod.PaginationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderedDataSource extends js.Object {
  var bordered: Boolean
  var dataSource: js.Array[scala.Nothing]
  var loading: Boolean
  var pagination: js.UndefOr[`false` | PaginationConfig] = js.undefined
  var split: Boolean
}

object AnonBorderedDataSource {
  @scala.inline
  def apply(
    bordered: Boolean,
    dataSource: js.Array[scala.Nothing],
    loading: Boolean,
    split: Boolean,
    pagination: `false` | PaginationConfig = null
  ): AnonBorderedDataSource = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderedDataSource]
  }
}

