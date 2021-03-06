package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdUnitIdStyle extends js.Object {
  /**
    * 推荐单元 id
    */
  var adUnitId: String
  /**
    * 小游戏推荐banner组件样式
    */
  var style: AnonLeft
}

object AnonAdUnitIdStyle {
  @scala.inline
  def apply(adUnitId: String, style: AnonLeft): AnonAdUnitIdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdUnitIdStyle]
  }
}

