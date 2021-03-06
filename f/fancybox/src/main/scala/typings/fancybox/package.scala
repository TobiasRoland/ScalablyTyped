package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fancybox {
  type FancyBoxInteractionMethod = js.Function2[
    /* slide */ js.UndefOr[typings.fancybox.FancyBoxSlide], 
    /* event */ js.UndefOr[typings.jquery.JQuery_.Event], 
    typings.fancybox.FancyBoxInteractionTypes
  ]
  type FancyBoxInteractions = typings.fancybox.FancyBoxInteractionTypes | typings.fancybox.FancyBoxInteractionMethod
  type FancyBoxInternationalizationOptions = org.scalablytyped.runtime.StringDictionary[typings.fancybox.FancyBoxInternationalizatioObject]
  type FancyBoxPlainObject = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Function0[scala.Unit]]
}
