package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgeExpressionsResult extends Object {
  /**
    * A SQL expression and where clause that matches the generated `valueExpression` used to query for a histogram from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#AgeExpressionsResult)
    */
  var histogramQuery: js.Any
  /**
    * A SQL expression and where clause that matches the generated `valueExpression` used to query statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#AgeExpressionsResult)
    */
  var statisticsQuery: js.Any
  /**
    * The [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression used to calculate the age of a feature based on the difference between the end time and the start time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#AgeExpressionsResult)
    */
  var valueExpression: String
}

object AgeExpressionsResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    histogramQuery: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    statisticsQuery: js.Any,
    valueExpression: String
  ): AgeExpressionsResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), histogramQuery = histogramQuery.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statisticsQuery = statisticsQuery.asInstanceOf[js.Any], valueExpression = valueExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgeExpressionsResult]
  }
}

