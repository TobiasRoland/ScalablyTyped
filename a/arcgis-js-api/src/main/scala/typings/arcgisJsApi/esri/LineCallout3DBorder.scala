package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineCallout3DBorder extends AnonymousAccessor {
  /**
    * The color of the callout line border. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    *
    * @default white
    */
  var color: js.UndefOr[Color_] = js.undefined
}

object LineCallout3DBorder {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Color_ = null,
    get: /* propertyName */ String => _ = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, LineCallout3DBorder]) with (js.Function1[/* props */ HashMap[_], LineCallout3DBorder]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): LineCallout3DBorder = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[LineCallout3DBorder]
  }
}

