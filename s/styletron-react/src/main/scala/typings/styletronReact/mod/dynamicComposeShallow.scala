package typings.styletronReact.mod

import typings.std.ReturnType
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-react", "dynamicComposeShallow")
@js.native
object dynamicComposeShallow extends js.Object {
  def apply(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* reducer */ js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject], 
      Styletron
    ]
  ] = js.native
}

