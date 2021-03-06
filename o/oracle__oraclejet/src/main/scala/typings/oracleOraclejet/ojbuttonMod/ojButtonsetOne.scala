package typings.oracleOraclejet.ojbuttonMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.chroming
import typings.oracleOraclejet.oracleOraclejetStrings.chromingChanged
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typings.oracleOraclejet.oracleOraclejetStrings.display
import typings.oracleOraclejet.oracleOraclejetStrings.displayChanged
import typings.oracleOraclejet.oracleOraclejetStrings.focusManagement
import typings.oracleOraclejet.oracleOraclejetStrings.focusManagementChanged
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.icons
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojButtonsetOne extends ojButtonset[ojButtonsetOneSettableProperties] {
  var chroming: full | half | outlined = js.native
  var disabled: Boolean = js.native
  var display: all | icons = js.native
  var focusManagement: oneTabstop | none = js.native
  var onChromingChanged: (js.Function1[/* event */ JetElementCustomEvent[full | half | outlined], _]) | Null = js.native
  var onDisabledChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
  var onDisplayChanged: (js.Function1[/* event */ JetElementCustomEvent[all | icons], _]) | Null = js.native
  var onFocusManagementChanged: (js.Function1[/* event */ JetElementCustomEvent[oneTabstop | none], _]) | Null = js.native
  var onValueChanged: (js.Function1[
    /* event */ JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOne['value'] */ js.Any
    ], 
    _
  ]) | Null = js.native
  var value: js.Any = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOne['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOne['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_chroming(property: chroming): full | half | outlined = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_focusManagement(property: focusManagement): oneTabstop | none = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojbutton.ojButtonsetOne['value'] */ js.Any = js.native
  def setProperties(properties: ojButtonsetOneSettablePropertiesLenient): Unit = js.native
  def setProperty(property: chroming, value: full): Unit = js.native
  def setProperty(property: chroming, value: half): Unit = js.native
  def setProperty(property: chroming, value: outlined): Unit = js.native
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: focusManagement, value: none): Unit = js.native
  def setProperty(property: focusManagement, value: oneTabstop): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Any): Unit = js.native
}

