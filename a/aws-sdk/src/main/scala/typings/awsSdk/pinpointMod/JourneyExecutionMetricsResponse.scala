package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyExecutionMetricsResponse extends js.Object {
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the journey that the metric applies to.
    */
  var JourneyId: string = js.native
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint last evaluated the journey and updated the data for the metric.
    */
  var LastEvaluatedTime: string = js.native
  /**
    * A JSON object that contains the results of the query. For information about the structure and contents of the results, see the Amazon Pinpoint Developer Guide.
    */
  var Metrics: MapOfString = js.native
}

object JourneyExecutionMetricsResponse {
  @scala.inline
  def apply(ApplicationId: string, JourneyId: string, LastEvaluatedTime: string, Metrics: MapOfString): JourneyExecutionMetricsResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], LastEvaluatedTime = LastEvaluatedTime.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JourneyExecutionMetricsResponse]
  }
}

