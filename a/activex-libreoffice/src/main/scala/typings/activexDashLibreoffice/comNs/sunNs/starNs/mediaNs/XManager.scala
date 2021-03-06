package typings.activexDashLibreoffice.comNs.sunNs.starNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** the {@link com.sun.star.media.XPlayer} factory interface */
trait XManager extends js.Object {
  /**
    * creates a new media player
    * @param aURL the URL of the media to play
    */
  def createPlayer(aURL: String): XPlayer
}

object XManager {
  @scala.inline
  def apply(createPlayer: String => XPlayer): XManager = {
    val __obj = js.Dynamic.literal(createPlayer = js.Any.fromFunction1(createPlayer))
  
    __obj.asInstanceOf[XManager]
  }
}

