package typings.oracleOraclejet

import typings.oracleOraclejet.ojchartMod.ojChart.PieCenterContext
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.billion
import typings.oracleOraclejet.oracleOraclejetStrings.million
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typings.oracleOraclejet.oracleOraclejetStrings.thousand
import typings.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuto extends js.Object {
  var converter: js.Object
  var label: String
  var labelStyle: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
  def renderer(context: PieCenterContext): AnonInsert | AnonPreventDefault
}

object AnonAuto {
  @scala.inline
  def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => AnonInsert | AnonPreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): AnonAuto = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuto]
  }
}

