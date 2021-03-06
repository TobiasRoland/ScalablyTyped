package typings.vueLs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("vue-ls", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait Local extends Types
  
  @js.native
  sealed trait Memory extends Types
  
  @js.native
  sealed trait Session extends Types
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Types with String] = js.native
  /* "local" */ @js.native
  object Local extends TopLevel[Local with String]
  
  /* "memory" */ @js.native
  object Memory extends TopLevel[Memory with String]
  
  /* "session" */ @js.native
  object Session extends TopLevel[Session with String]
  
}

