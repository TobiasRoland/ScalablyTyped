package typings.autolinker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  def onCloseTag(tagName: String, offset: Double): Unit
  def onComment(offset: Double): Unit
  def onDoctype(offset: Double): Unit
  def onOpenTag(tagName: String, offset: Double): Unit
  def onText(text: String, offset: Double): Unit
}

object AnonOffset {
  @scala.inline
  def apply(
    onCloseTag: (String, Double) => Unit,
    onComment: Double => Unit,
    onDoctype: Double => Unit,
    onOpenTag: (String, Double) => Unit,
    onText: (String, Double) => Unit
  ): AnonOffset = {
    val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2(onCloseTag), onComment = js.Any.fromFunction1(onComment), onDoctype = js.Any.fromFunction1(onDoctype), onOpenTag = js.Any.fromFunction2(onOpenTag), onText = js.Any.fromFunction2(onText))
  
    __obj.asInstanceOf[AnonOffset]
  }
}

