package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.recharts.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CartesianGridProps extends js.Object {
  var chartHeight: js.UndefOr[Double] = js.undefined
  var chartWidth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var horizontal: js.UndefOr[
    js.Object | ReactElement | (ContentRenderer[LineProps with CartesianGridProps]) | Boolean
  ] = js.undefined
  var horizontalCoordinatesGenerator: js.UndefOr[CoordinatesGenerator] = js.undefined
  var horizontalFill: js.UndefOr[js.Array[String]] = js.undefined
  var horizontalPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var offset: js.UndefOr[js.Object] = js.undefined
  var vertical: js.UndefOr[
    js.Object | ReactElement | (ContentRenderer[LineProps with CartesianGridProps]) | Boolean
  ] = js.undefined
  var verticalCoordinatesGenerator: js.UndefOr[CoordinatesGenerator] = js.undefined
  var verticalFill: js.UndefOr[js.Array[String]] = js.undefined
  var verticalPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
}

object CartesianGridProps {
  @scala.inline
  def apply(
    chartHeight: Int | Double = null,
    chartWidth: Int | Double = null,
    height: Int | Double = null,
    horizontal: js.Object | ReactElement | (ContentRenderer[LineProps with CartesianGridProps]) | Boolean = null,
    horizontalCoordinatesGenerator: /* arg */ AnonHeight => js.Array[Double] = null,
    horizontalFill: js.Array[String] = null,
    horizontalPoints: js.Array[Double] = null,
    offset: js.Object = null,
    vertical: js.Object | ReactElement | (ContentRenderer[LineProps with CartesianGridProps]) | Boolean = null,
    verticalCoordinatesGenerator: /* arg */ AnonHeight => js.Array[Double] = null,
    verticalFill: js.Array[String] = null,
    verticalPoints: js.Array[Double] = null,
    width: Int | Double = null,
    xAxis: js.Object = null,
    y: Int | Double = null,
    yAxis: js.Object = null
  ): CartesianGridProps = {
    val __obj = js.Dynamic.literal()
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalCoordinatesGenerator != null) __obj.updateDynamic("horizontalCoordinatesGenerator")(js.Any.fromFunction1(horizontalCoordinatesGenerator))
    if (horizontalFill != null) __obj.updateDynamic("horizontalFill")(horizontalFill.asInstanceOf[js.Any])
    if (horizontalPoints != null) __obj.updateDynamic("horizontalPoints")(horizontalPoints.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (verticalCoordinatesGenerator != null) __obj.updateDynamic("verticalCoordinatesGenerator")(js.Any.fromFunction1(verticalCoordinatesGenerator))
    if (verticalFill != null) __obj.updateDynamic("verticalFill")(verticalFill.asInstanceOf[js.Any])
    if (verticalPoints != null) __obj.updateDynamic("verticalPoints")(verticalPoints.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianGridProps]
  }
}

