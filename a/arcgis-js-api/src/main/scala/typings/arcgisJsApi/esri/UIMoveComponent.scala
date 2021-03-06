package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIMoveComponent extends Object {
  /**
    * The component to move. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var component: Widget_ | HTMLElement | String
  /**
    * The destination position. The component will be placed in the UI [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container) when not provided. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. **Possible Values:** bottom-leading | bottom-left | bottom-right | bottom-trailing | top-leading | top-left | top-right | top-trailing | manual
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var position: js.UndefOr[String] = js.undefined
}

object UIMoveComponent {
  @scala.inline
  def apply(
    component: Widget_ | HTMLElement | String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    position: String = null
  ): UIMoveComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIMoveComponent]
  }
}

