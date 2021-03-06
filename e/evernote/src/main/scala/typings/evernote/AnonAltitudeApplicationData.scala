package typings.evernote

import org.scalablytyped.runtime.StringDictionary
import typings.evernote.mod.Evernote.LazyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitudeApplicationData extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var applicationData: js.UndefOr[LazyMap] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var classifications: js.UndefOr[StringDictionary[String]] = js.undefined
  var contentClass: js.UndefOr[String] = js.undefined
  var creatorId: js.UndefOr[Double] = js.undefined
  var lastEditedBy: js.UndefOr[String] = js.undefined
  var lastEditorId: js.UndefOr[Double] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var placeName: js.UndefOr[String] = js.undefined
  var reminderDoneTime: js.UndefOr[Double] = js.undefined
  var reminderOrder: js.UndefOr[Double] = js.undefined
  var reminderTime: js.UndefOr[Double] = js.undefined
  var shareDate: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourceApplication: js.UndefOr[String] = js.undefined
  var sourceURL: js.UndefOr[String] = js.undefined
  var subjectDate: js.UndefOr[Double] = js.undefined
}

object AnonAltitudeApplicationData {
  @scala.inline
  def apply(
    altitude: Int | Double = null,
    applicationData: LazyMap = null,
    author: String = null,
    classifications: StringDictionary[String] = null,
    contentClass: String = null,
    creatorId: Int | Double = null,
    lastEditedBy: String = null,
    lastEditorId: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    placeName: String = null,
    reminderDoneTime: Int | Double = null,
    reminderOrder: Int | Double = null,
    reminderTime: Int | Double = null,
    shareDate: Int | Double = null,
    source: String = null,
    sourceApplication: String = null,
    sourceURL: String = null,
    subjectDate: Int | Double = null
  ): AnonAltitudeApplicationData = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (classifications != null) __obj.updateDynamic("classifications")(classifications.asInstanceOf[js.Any])
    if (contentClass != null) __obj.updateDynamic("contentClass")(contentClass.asInstanceOf[js.Any])
    if (creatorId != null) __obj.updateDynamic("creatorId")(creatorId.asInstanceOf[js.Any])
    if (lastEditedBy != null) __obj.updateDynamic("lastEditedBy")(lastEditedBy.asInstanceOf[js.Any])
    if (lastEditorId != null) __obj.updateDynamic("lastEditorId")(lastEditorId.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (placeName != null) __obj.updateDynamic("placeName")(placeName.asInstanceOf[js.Any])
    if (reminderDoneTime != null) __obj.updateDynamic("reminderDoneTime")(reminderDoneTime.asInstanceOf[js.Any])
    if (reminderOrder != null) __obj.updateDynamic("reminderOrder")(reminderOrder.asInstanceOf[js.Any])
    if (reminderTime != null) __obj.updateDynamic("reminderTime")(reminderTime.asInstanceOf[js.Any])
    if (shareDate != null) __obj.updateDynamic("shareDate")(shareDate.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceApplication != null) __obj.updateDynamic("sourceApplication")(sourceApplication.asInstanceOf[js.Any])
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL.asInstanceOf[js.Any])
    if (subjectDate != null) __obj.updateDynamic("subjectDate")(subjectDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitudeApplicationData]
  }
}

