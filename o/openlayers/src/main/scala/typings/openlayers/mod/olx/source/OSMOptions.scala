package typings.openlayers.mod.olx.source

import typings.openlayers.mod.AttributionLike
import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSMOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object OSMOptions {
  @scala.inline
  def apply(
    attributions: AttributionLike = null,
    cacheSize: Int | Double = null,
    crossOrigin: String = null,
    maxZoom: Int | Double = null,
    opaque: js.UndefOr[Boolean] = js.undefined,
    reprojectionErrorThreshold: Int | Double = null,
    tileLoadFunction: (/* tile */ Tile, /* url */ String) => Unit = null,
    url: String = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): OSMOptions = {
    val __obj = js.Dynamic.literal()
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    if (reprojectionErrorThreshold != null) __obj.updateDynamic("reprojectionErrorThreshold")(reprojectionErrorThreshold.asInstanceOf[js.Any])
    if (tileLoadFunction != null) __obj.updateDynamic("tileLoadFunction")(js.Any.fromFunction2(tileLoadFunction))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSMOptions]
  }
}

