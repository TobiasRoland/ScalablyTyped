package typings.reactNativeCommunityCli.mod

import typings.reactNativeCommunityCli.AnonCmd
import typings.reactNativeCommunityCli.AnonCtx
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var examples: js.UndefOr[js.Array[AnonCmd]] = js.undefined
  var name: String
  var options: js.UndefOr[js.Array[AnonCtx]] = js.undefined
  def func(argv: js.Array[String], ctx: Config_, args: Record[String, String]): js.Promise[Unit]
}

object Command {
  @scala.inline
  def apply(
    func: (js.Array[String], Config_, Record[String, String]) => js.Promise[Unit],
    name: String,
    description: String = null,
    examples: js.Array[AnonCmd] = null,
    options: js.Array[AnonCtx] = null
  ): Command = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

