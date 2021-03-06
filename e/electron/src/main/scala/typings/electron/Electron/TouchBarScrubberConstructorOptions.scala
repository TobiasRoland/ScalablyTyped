package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarScrubberConstructorOptions extends js.Object {
  /**
    * Defaults to true.
    */
  var continuous: Boolean
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem]
  /**
    * Defaults to free.
    */
  var mode: String
  /**
    * Selected overlay item style. Defaults to null.
    */
  var overlayStyle: String
  /**
    * Selected item style. Defaults to null.
    */
  var selectedStyle: String
  /**
    * Defaults to false.
    */
  var showArrowButtons: Boolean
  /**
    * Called when the user taps any item.
    */
  def highlight(highlightedIndex: Double): Unit
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  def select(selectedIndex: Double): Unit
}

object TouchBarScrubberConstructorOptions {
  @scala.inline
  def apply(
    continuous: Boolean,
    highlight: Double => Unit,
    items: js.Array[ScrubberItem],
    mode: String,
    overlayStyle: String,
    select: Double => Unit,
    selectedStyle: String,
    showArrowButtons: Boolean
  ): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], highlight = js.Any.fromFunction1(highlight), items = items.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], overlayStyle = overlayStyle.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), selectedStyle = selectedStyle.asInstanceOf[js.Any], showArrowButtons = showArrowButtons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
}

