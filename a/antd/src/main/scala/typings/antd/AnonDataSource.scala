package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSource extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: Boolean
  var titleText: String
}

object AnonDataSource {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], showSearch: Boolean, titleText: String): AnonDataSource = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataSource]
  }
}

