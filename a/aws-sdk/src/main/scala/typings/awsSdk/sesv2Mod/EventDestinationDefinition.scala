package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationDefinition extends js.Object {
  /**
    * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to monitor and gain insights on your email sending metrics.
    */
  var CloudWatchDestination: js.UndefOr[typings.awsSdk.sesv2Mod.CloudWatchDestination] = js.native
  /**
    * If true, the event destination is enabled. When the event destination is enabled, the specified event types are sent to the destinations in this EventDestinationDefinition. If false, the event destination is disabled. When the event destination is disabled, events aren't sent to the specified destinations.
    */
  var Enabled: js.UndefOr[typings.awsSdk.sesv2Mod.Enabled] = js.native
  /**
    * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.sesv2Mod.KinesisFirehoseDestination] = js.native
  /**
    * An array that specifies which events the Amazon SES API v2 should send to the destinations in this EventDestinationDefinition.
    */
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  /**
    * An object that defines an Amazon Pinpoint project destination for email events. You can send email event data to a Amazon Pinpoint project to view metrics using the Transactional Messaging dashboards that are built in to Amazon Pinpoint. For more information, see Transactional Messaging Charts in the Amazon Pinpoint User Guide.
    */
  var PinpointDestination: js.UndefOr[typings.awsSdk.sesv2Mod.PinpointDestination] = js.native
  /**
    * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification when certain email events occur.
    */
  var SnsDestination: js.UndefOr[typings.awsSdk.sesv2Mod.SnsDestination] = js.native
}

object EventDestinationDefinition {
  @scala.inline
  def apply(
    CloudWatchDestination: CloudWatchDestination = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    KinesisFirehoseDestination: KinesisFirehoseDestination = null,
    MatchingEventTypes: EventTypes = null,
    PinpointDestination: PinpointDestination = null,
    SnsDestination: SnsDestination = null
  ): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchDestination != null) __obj.updateDynamic("CloudWatchDestination")(CloudWatchDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (KinesisFirehoseDestination != null) __obj.updateDynamic("KinesisFirehoseDestination")(KinesisFirehoseDestination.asInstanceOf[js.Any])
    if (MatchingEventTypes != null) __obj.updateDynamic("MatchingEventTypes")(MatchingEventTypes.asInstanceOf[js.Any])
    if (PinpointDestination != null) __obj.updateDynamic("PinpointDestination")(PinpointDestination.asInstanceOf[js.Any])
    if (SnsDestination != null) __obj.updateDynamic("SnsDestination")(SnsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationDefinition]
  }
}

