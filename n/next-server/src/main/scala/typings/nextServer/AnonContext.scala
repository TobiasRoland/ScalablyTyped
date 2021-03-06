package typings.nextServer

import typings.nextServer.libUtilsMod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[C /* <: BaseContext */, IP] extends js.Object {
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply[C /* <: BaseContext */, IP](getInitialProps: /* context */ C => IP | js.Promise[IP] = null): AnonContext[C, IP] = {
    val __obj = js.Dynamic.literal()
    if (getInitialProps != null) __obj.updateDynamic("getInitialProps")(js.Any.fromFunction1(getInitialProps))
    __obj.asInstanceOf[AnonContext[C, IP]]
  }
}

