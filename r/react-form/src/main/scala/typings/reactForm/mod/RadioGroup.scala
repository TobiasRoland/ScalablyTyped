package typings.reactForm.mod

import typings.react.mod.ChildContextProvider
import typings.react.mod.Component
import typings.reactForm.AnonChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", "RadioGroup")
@js.native
class RadioGroup ()
  extends Component[FieldProps with AnonChildrenProps, js.Object, js.Any]
     with ChildContextProvider[RadioGroupContext] {
  /* CompleteClass */
  override def getChildContext(): RadioGroupContext = js.native
}

