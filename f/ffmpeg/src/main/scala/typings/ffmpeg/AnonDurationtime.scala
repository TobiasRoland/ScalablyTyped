package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationtime extends js.Object {
  var duration_time: String | Double
  var every_n_frames: Double
  var every_n_percentage: Double
  var every_n_seconds: Double
  var file_name: js.UndefOr[String] = js.undefined
  var frame_rate: Double
  var keep_aspect_ration: Boolean
  var keep_pixel_aspect_ratio: Boolean
  var number: Double
  var padding_color: String
  var size: String
  var start_time: String | Double
}

object AnonDurationtime {
  @scala.inline
  def apply(
    duration_time: String | Double,
    every_n_frames: Double,
    every_n_percentage: Double,
    every_n_seconds: Double,
    frame_rate: Double,
    keep_aspect_ration: Boolean,
    keep_pixel_aspect_ratio: Boolean,
    number: Double,
    padding_color: String,
    size: String,
    start_time: String | Double,
    file_name: String = null
  ): AnonDurationtime = {
    val __obj = js.Dynamic.literal(duration_time = duration_time.asInstanceOf[js.Any], every_n_frames = every_n_frames.asInstanceOf[js.Any], every_n_percentage = every_n_percentage.asInstanceOf[js.Any], every_n_seconds = every_n_seconds.asInstanceOf[js.Any], frame_rate = frame_rate.asInstanceOf[js.Any], keep_aspect_ration = keep_aspect_ration.asInstanceOf[js.Any], keep_pixel_aspect_ratio = keep_pixel_aspect_ratio.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], padding_color = padding_color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    if (file_name != null) __obj.updateDynamic("file_name")(file_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationtime]
  }
}

