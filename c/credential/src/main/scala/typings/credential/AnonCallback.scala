package typings.credential

import typings.credential.mod.HashCallback
import typings.credential.mod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  def expired(hash: String, days: Double): Boolean = js.native
  def hash(password: String): js.Promise[String] = js.native
  def hash(password: String, callback: HashCallback): Unit = js.native
  def verify(hash: String, password: String): js.Promise[Boolean] = js.native
  // iterations(work: number, base): number;
  def verify(hash: String, password: String, callback: VerifyCallback): Unit = js.native
}

