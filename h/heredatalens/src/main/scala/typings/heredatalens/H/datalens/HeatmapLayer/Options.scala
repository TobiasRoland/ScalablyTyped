package typings.heredatalens.H.datalens.HeatmapLayer

import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and rendering options for HeatmapLayer.
  * The data processing flow of HeatmapLayer is similar to RasterLayer. The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with HeatmapLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  * To collect the rows for a tile including buffer, the rows must be translated to HeatmapLayer.TilePoint. This translation must be specified with the rowToTilePoint callback.
  * Other options define the blending options for the heat map.
  */
trait Options extends js.Object {
  /**
    * Specifies which type of aggregation was applied (eg. type of aggregation function for bucket in the Data Lens query).
    * Possible values are SUM or AVERAGE. If the aggregation type is AVERAGE , then an averaged heat map is rendered.
    */
  var aggregation: js.UndefOr[Aggregation] = js.undefined
  /**
    * Defines the alpha mask value as a function of the normalized count.
    * You can use D3.js library scale functions with the domain [0, 1] and the range [0, 1].
    */
  var alphaScale: js.UndefOr[js.Function1[/* scale */ Double, Double]] = js.undefined
  /**
    * Describes the bandwidth behavior in relation to current zoom level A numeric value sets it static across all levels
    * An Object with zoom, value and optional zoomIncrementFactor (1 equals doubling on every zoom increment) defines a behavior across all zoom levels
    * An Array of one or more zoom, value objects describes the behavior between the two defined levels and extrapolates the implied change outside of the defined range
    * Alternatively defines the level of smoothing as a function of the zoom level. The callback must return a value in pixels.
    * The cut-off of the Gaussian kernel is defined as 3 * bandwidth , a multiple (default 3) of bandwidth.
    */
  var bandwidth: js.UndefOr[Bandwidth | BandwidthStop | js.Array[BandwidthStop] | BandwidthCallback] = js.undefined
  /**
    * Defines a color palette as a function of the normalized value.
    * You can use D3.js library scale functions with the domain [0, 1].
    */
  var colorScale: js.UndefOr[js.Function1[/* scale */ Double, String]] = js.undefined
  /**
    * Defines the range for the density alpha mask as a function of the zoom level.
    * When defined, the density alpha mask is applied. The returned value must be an array of 2 numbers.
    */
  var countRange: js.UndefOr[js.Function1[/* zoom */ Zoom, js.Array[Double]]] = js.undefined
  /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
  var dataToRows: js.UndefOr[
    js.Function4[
      /* data */ Data, 
      /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, 
      /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, 
      /* zoom */ Zoom, 
      js.Array[Row]
    ]
  ] = js.undefined
  /**
    * Defines the scale (eg logarithmic scale) of the TilePoint value.
    * Note: if the value is not in a linear scale, then the aggregation in the source query must be defined with respect to the scale type.
    * For example, before applying the average aggregation function in a query, the value must be transformed to the linear scale. This guarantees correct linear averaging of values.
    */
  var inputScale: js.UndefOr[InputScale] = js.undefined
  /**
    * Defines the range for the color scale as a function of the zoom level.
    * The returned value must be an array of 2 numbers.
    */
  var valueRange: js.UndefOr[js.Function1[/* zoom */ Zoom, js.Array[Double]]] = js.undefined
  /** Defines how the row is translated to the HeatmapLayer.TilePoint. This callback is called for each row that is returned from dataToRows. */
  def rowToTilePoint(row: Row, x: X, y: Y): TilePoint
}

object Options {
  @scala.inline
  def apply(
    rowToTilePoint: (Row, X, Y) => TilePoint,
    aggregation: Aggregation = null,
    alphaScale: /* scale */ Double => Double = null,
    bandwidth: Bandwidth | BandwidthStop | js.Array[BandwidthStop] | BandwidthCallback = null,
    colorScale: /* scale */ Double => String = null,
    countRange: /* zoom */ Zoom => js.Array[Double] = null,
    dataToRows: (/* data */ Data, /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, /* zoom */ Zoom) => js.Array[Row] = null,
    inputScale: InputScale = null,
    valueRange: /* zoom */ Zoom => js.Array[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal(rowToTilePoint = js.Any.fromFunction3(rowToTilePoint))
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    if (alphaScale != null) __obj.updateDynamic("alphaScale")(js.Any.fromFunction1(alphaScale))
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(js.Any.fromFunction1(colorScale))
    if (countRange != null) __obj.updateDynamic("countRange")(js.Any.fromFunction1(countRange))
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction4(dataToRows))
    if (inputScale != null) __obj.updateDynamic("inputScale")(inputScale.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(js.Any.fromFunction1(valueRange))
    __obj.asInstanceOf[Options]
  }
}

