package typings.heredatalens.H.datalens.RasterLayer

import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and rendering options for RasterLayer.
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with RasterLayer.defaultDataToRows.
  * This behavior can be changed by defining the dataToRows callback.
  * To collect the rows for a tile including buffer, the rows must be translated to RasterLayer.TilePoint.
  * This translation must be specified with the rowToTilePoint callback. The final rendering on the tile canvas must be defined in renderTile.
  */
trait Options extends js.Object {
  /**
    * The buffer is a value (in pixels) that defines an extra area around each tile to capture data points from.
    * This is done to avoid drawing edges between tiles. For example, if data points represented with circles with a maximum radius of 10 pixels, then the buffer must be 10 pixels.
    */
  var buffer: js.UndefOr[js.Function1[/* zoom */ Zoom, Double]] = js.undefined
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
    * Defines how tile data is represented on a canvas. Input points for each tile are collected with respect to the buffer.
    * For progressive rendering this callback may be called more than once for the tile.
    */
  var renderTile: js.UndefOr[
    js.Function3[
      /* points */ js.Array[TilePoint], 
      /* canvas */ HTMLCanvasElement, 
      /* zoom */ Zoom, 
      Unit
    ]
  ] = js.undefined
  /** Defines how the row is translated to the RasterLayer.TilePoint. This callback is called for each row that is returned from dataToRows. */
  var rowToTilePoint: js.UndefOr[js.Function3[/* row */ Row, /* x */ X, /* y */ Y, TilePoint]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: /* zoom */ Zoom => Double = null,
    dataToRows: (/* data */ Data, /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, /* zoom */ Zoom) => js.Array[Row] = null,
    renderTile: (/* points */ js.Array[TilePoint], /* canvas */ HTMLCanvasElement, /* zoom */ Zoom) => Unit = null,
    rowToTilePoint: (/* row */ Row, /* x */ X, /* y */ Y) => TilePoint = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(js.Any.fromFunction1(buffer))
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction4(dataToRows))
    if (renderTile != null) __obj.updateDynamic("renderTile")(js.Any.fromFunction3(renderTile))
    if (rowToTilePoint != null) __obj.updateDynamic("rowToTilePoint")(js.Any.fromFunction3(rowToTilePoint))
    __obj.asInstanceOf[Options]
  }
}

