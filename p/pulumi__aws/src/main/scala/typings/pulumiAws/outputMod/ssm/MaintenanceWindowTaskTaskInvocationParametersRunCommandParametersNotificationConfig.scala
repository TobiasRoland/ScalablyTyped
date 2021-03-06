package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig extends js.Object {
  /**
    * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var notificationArn: js.UndefOr[String] = js.native
  /**
    * The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
    */
  var notificationEvents: js.UndefOr[js.Array[String]] = js.native
  /**
    * When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
    */
  var notificationType: js.UndefOr[String] = js.native
}

object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig {
  @scala.inline
  def apply(
    notificationArn: String = null,
    notificationEvents: js.Array[String] = null,
    notificationType: String = null
  ): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (notificationArn != null) __obj.updateDynamic("notificationArn")(notificationArn.asInstanceOf[js.Any])
    if (notificationEvents != null) __obj.updateDynamic("notificationEvents")(notificationEvents.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig]
  }
}

