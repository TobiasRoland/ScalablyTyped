package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_end
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteEnd extends Token {
  var `type`: blockquote_end
}

object BlockquoteEnd {
  @scala.inline
  def apply(`type`: blockquote_end): BlockquoteEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteEnd]
  }
}

