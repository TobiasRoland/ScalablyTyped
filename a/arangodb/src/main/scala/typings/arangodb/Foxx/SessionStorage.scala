package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionStorage extends js.Object {
  var `new`: js.UndefOr[js.Function0[Session]] = js.undefined
  def forClient(session: Session): String | Null
  def fromClient(sid: String): Session | Null
}

object SessionStorage {
  @scala.inline
  def apply(
    forClient: Session => String | Null,
    fromClient: String => Session | Null,
    `new`: () => Session = null
  ): SessionStorage = {
    val __obj = js.Dynamic.literal(forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction0(`new`))
    __obj.asInstanceOf[SessionStorage]
  }
}

