package typings.nodegit.credMod.Cred

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cred", "Cred")
@js.native
object ^ extends js.Object {
  def defaultNew(): typings.nodegit.credMod.Cred = js.native
  def sshKeyFromAgent(username: String): typings.nodegit.credMod.Cred = js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typings.nodegit.credMod.Cred] = js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typings.nodegit.credMod.Cred = js.native
  def usernameNew(username: String): js.Promise[typings.nodegit.credMod.Cred] = js.native
  def userpassPlaintextNew(username: String, password: String): typings.nodegit.credMod.Cred = js.native
}

