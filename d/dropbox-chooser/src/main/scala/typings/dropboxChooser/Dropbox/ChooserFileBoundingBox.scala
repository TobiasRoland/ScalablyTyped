package typings.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Refer to "Handling the response" section of: https://www.dropbox.com/developers/chooser
/* Rewritten from type alias, can be one of: 
  - typings.dropboxChooser.dropboxChooserNumbers.`75`
  - typings.dropboxChooser.dropboxChooserNumbers.`256`
  - typings.dropboxChooser.dropboxChooserNumbers.`800`
  - typings.dropboxChooser.dropboxChooserNumbers.`1280`
  - typings.dropboxChooser.dropboxChooserNumbers.`2048`
*/
trait ChooserFileBoundingBox extends js.Object

object ChooserFileBoundingBox {
  @scala.inline
  def `1280`: typings.dropboxChooser.dropboxChooserNumbers.`1280` = this.cast(1280)
  @scala.inline
  def `2048`: typings.dropboxChooser.dropboxChooserNumbers.`2048` = this.cast(2048)
  @scala.inline
  def `256`: typings.dropboxChooser.dropboxChooserNumbers.`256` = this.cast(256)
  @scala.inline
  def `75`: typings.dropboxChooser.dropboxChooserNumbers.`75` = this.cast(75)
  @scala.inline
  def `800`: typings.dropboxChooser.dropboxChooserNumbers.`800` = this.cast(800)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

