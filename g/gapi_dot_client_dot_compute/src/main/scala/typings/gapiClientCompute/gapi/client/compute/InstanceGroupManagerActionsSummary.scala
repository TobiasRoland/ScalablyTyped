package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupManagerActionsSummary extends js.Object {
  /**
    * [Output Only] The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from
    * the managed instance group without deleting it.
    */
  var abandoning: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails
    * to create any of these instances, it tries again until it creates the instance successfully.
    *
    * If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
    */
  var creating: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If
    * the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted. */
  var deleting: js.UndefOr[Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are running and have no scheduled actions. */
  var none: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated.
    * Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
    */
  var recreating: js.UndefOr[Double] = js.undefined
  /**
    * [Output Only] The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a
    * recreate action. For example, setting or removing target pools for the instance.
    */
  var refreshing: js.UndefOr[Double] = js.undefined
  /** [Output Only] The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted. */
  var restarting: js.UndefOr[Double] = js.undefined
}

object InstanceGroupManagerActionsSummary {
  @scala.inline
  def apply(
    abandoning: Int | Double = null,
    creating: Int | Double = null,
    creatingWithoutRetries: Int | Double = null,
    deleting: Int | Double = null,
    none: Int | Double = null,
    recreating: Int | Double = null,
    refreshing: Int | Double = null,
    restarting: Int | Double = null
  ): InstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    if (abandoning != null) __obj.updateDynamic("abandoning")(abandoning.asInstanceOf[js.Any])
    if (creating != null) __obj.updateDynamic("creating")(creating.asInstanceOf[js.Any])
    if (creatingWithoutRetries != null) __obj.updateDynamic("creatingWithoutRetries")(creatingWithoutRetries.asInstanceOf[js.Any])
    if (deleting != null) __obj.updateDynamic("deleting")(deleting.asInstanceOf[js.Any])
    if (none != null) __obj.updateDynamic("none")(none.asInstanceOf[js.Any])
    if (recreating != null) __obj.updateDynamic("recreating")(recreating.asInstanceOf[js.Any])
    if (refreshing != null) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (restarting != null) __obj.updateDynamic("restarting")(restarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupManagerActionsSummary]
  }
}

