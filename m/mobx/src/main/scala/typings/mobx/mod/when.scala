package typings.mobx.mod

import typings.mobx.AnonCancel
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.utilsMod.Lambda
import typings.mobx.whenMod.IWhenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "when")
@js.native
object when extends js.Object {
  def apply(predicate: js.Function0[Boolean]): js.Promise[Unit] with AnonCancel = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], opts: IWhenOptions): js.Promise[Unit] with AnonCancel = js.native
}

