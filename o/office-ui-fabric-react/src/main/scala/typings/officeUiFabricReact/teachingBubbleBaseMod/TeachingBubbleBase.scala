package typings.officeUiFabricReact.teachingBubbleBaseMod

import typings.officeUiFabricReact.AnonCalloutProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
class TeachingBubbleBase protected () extends BaseComponent[ITeachingBubbleProps, ITeachingBubbleState] {
  def this(props: ITeachingBubbleProps) = this()
  var _defaultCalloutProps: js.Any = js.native
  var rootElement: RefObject[HTMLDivElement] = js.native
  def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
object TeachingBubbleBase extends js.Object {
  var defaultProps: AnonCalloutProps = js.native
}

