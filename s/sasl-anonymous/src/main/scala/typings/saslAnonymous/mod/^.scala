package typings.saslAnonymous.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saslAnonymous.TypeofClassAnonymousMechanism
import typings.saslAnonymous.saslAnonymousBooleans.`true`
import typings.saslAnonymous.saslAnonymousStrings.ANONYMOUS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sasl-anonymous", JSImport.Namespace)
@js.native
class ^ () extends AnonymousMechanism {
  /* CompleteClass */
  override var clientFirst: `true` = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override var name_AnonymousMechanism: ANONYMOUS = js.native
  /* CompleteClass */
  override def challenge(chal: String): Unit = js.native
  /* CompleteClass */
  override def response(cred: StringDictionary[js.Any]): String = js.native
  /* CompleteClass */
  override def response(cred: Credentials): String = js.native
}

@JSImport("sasl-anonymous", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mechanism: TypeofClassAnonymousMechanism = js.native
}

