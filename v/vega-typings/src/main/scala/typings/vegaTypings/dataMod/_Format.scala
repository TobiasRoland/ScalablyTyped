package typings.vegaTypings.dataMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.csv
import typings.vegaTypings.vegaTypingsStrings.dsv
import typings.vegaTypings.vegaTypingsStrings.json
import typings.vegaTypings.vegaTypingsStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Format extends js.Object

object _Format {
  @scala.inline
  def FormatJSON(
    `type`: json,
    copy: js.UndefOr[Boolean] = js.undefined,
    parse: Parse = null,
    property: String | SignalRef = null
  ): _Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  @scala.inline
  def FormatSV(`type`: csv | tsv, header: js.Array[String] = null, parse: Parse = null): _Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  @scala.inline
  def FormatDSV(delimiter: String, `type`: dsv, header: js.Array[String] = null, parse: Parse = null): _Format = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Format]
  }
  @scala.inline
  def AnonParse(parse: Parse): _Format = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Format]
  }
}

