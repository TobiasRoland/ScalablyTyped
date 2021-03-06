package typings.adone

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflchown extends js.Object {
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike, uid: Double, gid: Double): js.Promise[Unit]
}

object Typeoflchown {
  @scala.inline
  def apply(__promisify__ : (PathLike, Double, Double) => js.Promise[Unit]): Typeoflchown = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction3(__promisify__))
  
    __obj.asInstanceOf[Typeoflchown]
  }
}

