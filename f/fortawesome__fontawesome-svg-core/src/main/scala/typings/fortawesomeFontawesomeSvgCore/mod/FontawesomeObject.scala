package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontawesomeObject extends js.Object {
  val `abstract`: js.Array[AbstractElement]
  val html: js.Array[String]
  val node: HTMLCollection
}

object FontawesomeObject {
  @scala.inline
  def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): FontawesomeObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontawesomeObject]
  }
}

