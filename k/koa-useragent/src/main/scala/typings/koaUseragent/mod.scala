package typings.koaUseragent

import typings.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-useragent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def userAgent(ctx: Context, next: js.Function0[js.Promise[Unit]]): js.Promise[Unit] = js.native
}

