package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.AnonAccessibleDependencyInfo
import typings.oracleOraclejet.AnonAutoBaseline
import typings.oracleOraclejet.AnonAutoHidden
import typings.oracleOraclejet.AnonBaselineDate
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefault
import typings.oracleOraclejet.AnonConverter
import typings.oracleOraclejet.AnonHeightNumber
import typings.oracleOraclejet.AnonLabel
import typings.oracleOraclejet.AnonMove
import typings.oracleOraclejet.AnonOffsetY
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.ojganttMod.ojGantt.ReferenceObject
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var axisPosition: bottom | top
  var dependencyData: js.UndefOr[DataProvider[K1, D1]] = js.undefined
  var dnd: AnonMove
  var end: String
  var gridlines: AnonAutoHidden
  var majorAxis: AnonConverter
  var minorAxis: AnonConverter
  var referenceObjects: js.Array[ReferenceObject]
  var rowAxis: AnonLabel[K2, D2]
  var rowDefaults: AnonHeightNumber
  var scrollPosition: AnonOffsetY
  var selection: js.Array[K2]
  var selectionMode: single | multiple | none
  var start: String
  var taskData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  var taskDefaults: AnonAutoBaseline
  var tooltip: AnonContextRendererAnonInsertAnonPreventDefault[K2, D2]
  @JSName("translations")
  var translations_ojGanttSettableProperties: AnonAccessibleDependencyInfo
  var valueFormats: AnonBaselineDate
  var viewportEnd: String
  var viewportStart: String
}

object ojGanttSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    axisPosition: bottom | top,
    dnd: AnonMove,
    end: String,
    gridlines: AnonAutoHidden,
    majorAxis: AnonConverter,
    minorAxis: AnonConverter,
    referenceObjects: js.Array[ReferenceObject],
    rowAxis: AnonLabel[K2, D2],
    rowDefaults: AnonHeightNumber,
    scrollPosition: AnonOffsetY,
    selection: js.Array[K2],
    selectionMode: single | multiple | none,
    start: String,
    taskDefaults: AnonAutoBaseline,
    tooltip: AnonContextRendererAnonInsertAnonPreventDefault[K2, D2],
    trackResize: on | off,
    translations: AnonAccessibleDependencyInfo,
    valueFormats: AnonBaselineDate,
    viewportEnd: String,
    viewportStart: String,
    dependencyData: DataProvider[K1, D1] = null,
    taskData: DataProvider[K2, D2] = null
  ): ojGanttSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], axisPosition = axisPosition.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], gridlines = gridlines.asInstanceOf[js.Any], majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rowAxis = rowAxis.asInstanceOf[js.Any], rowDefaults = rowDefaults.asInstanceOf[js.Any], scrollPosition = scrollPosition.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskDefaults = taskDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valueFormats = valueFormats.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    if (dependencyData != null) __obj.updateDynamic("dependencyData")(dependencyData.asInstanceOf[js.Any])
    if (taskData != null) __obj.updateDynamic("taskData")(taskData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttSettableProperties[K1, K2, D1, D2]]
  }
}

