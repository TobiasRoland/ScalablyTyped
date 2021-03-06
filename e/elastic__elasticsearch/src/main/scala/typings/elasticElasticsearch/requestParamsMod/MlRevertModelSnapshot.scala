package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlRevertModelSnapshot[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var delete_intervening_results: js.UndefOr[Boolean] = js.undefined
  var job_id: String
  var snapshot_id: String
}

object MlRevertModelSnapshot {
  @scala.inline
  def apply[T](
    job_id: String,
    snapshot_id: String,
    body: T = null,
    delete_intervening_results: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): MlRevertModelSnapshot[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], snapshot_id = snapshot_id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(delete_intervening_results)) __obj.updateDynamic("delete_intervening_results")(delete_intervening_results.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlRevertModelSnapshot[T]]
  }
}

