package typings.activexOffice

import typings.activexOffice.Office.CommandBarButton
import typings.activexOffice.Office.CommandBarComboBox
import typings.activexOffice.Office.CommandBars
import typings.activexOffice.Office.CustomTaskPane
import typings.activexOffice.Office.CustomXMLPart
import typings.activexOffice.Office.CustomXMLParts
import typings.activexOffice.Office.EventHelperTypes.CommandBarButtonInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CommandBarButtonInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CommandBarComboBoxInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CommandBarComboBoxInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CommandBarsInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CommandBarsInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CustomTaskPaneInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CustomTaskPaneInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartsInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartsInvokeParameter
import typings.activexOffice.Office.MsoEnvelope
import typings.activexOffice.activexOfficeStrings.AddRef
import typings.activexOffice.activexOfficeStrings.CancelDefault
import typings.activexOffice.activexOfficeStrings.Change
import typings.activexOffice.activexOfficeStrings.Click
import typings.activexOffice.activexOfficeStrings.Ctrl
import typings.activexOffice.activexOfficeStrings.CustomTaskPaneInst
import typings.activexOffice.activexOfficeStrings.DockPositionStateChange
import typings.activexOffice.activexOfficeStrings.EnvelopeHide
import typings.activexOffice.activexOfficeStrings.EnvelopeShow
import typings.activexOffice.activexOfficeStrings.GetIDsOfNames
import typings.activexOffice.activexOfficeStrings.GetTypeInfo
import typings.activexOffice.activexOfficeStrings.GetTypeInfoCount
import typings.activexOffice.activexOfficeStrings.InUndoRedo
import typings.activexOffice.activexOfficeStrings.Invoke
import typings.activexOffice.activexOfficeStrings.List
import typings.activexOffice.activexOfficeStrings.NewNode
import typings.activexOffice.activexOfficeStrings.NewPart
import typings.activexOffice.activexOfficeStrings.NodeAfterDelete
import typings.activexOffice.activexOfficeStrings.NodeAfterInsert
import typings.activexOffice.activexOfficeStrings.NodeAfterReplace
import typings.activexOffice.activexOfficeStrings.OldNextSibling
import typings.activexOffice.activexOfficeStrings.OldNode
import typings.activexOffice.activexOfficeStrings.OldParentNode
import typings.activexOffice.activexOfficeStrings.OldPart
import typings.activexOffice.activexOfficeStrings.OnUpdate
import typings.activexOffice.activexOfficeStrings.Part
import typings.activexOffice.activexOfficeStrings.PartAfterAdd
import typings.activexOffice.activexOfficeStrings.PartAfterLoad
import typings.activexOffice.activexOfficeStrings.PartBeforeDelete
import typings.activexOffice.activexOfficeStrings.QueryInterface
import typings.activexOffice.activexOfficeStrings.Release
import typings.activexOffice.activexOfficeStrings.VisibleStateChange
import typings.activexOffice.activexOfficeStrings.accName
import typings.activexOffice.activexOfficeStrings.accValue
import typings.activexOffice.activexOfficeStrings.cNames
import typings.activexOffice.activexOfficeStrings.itinfo
import typings.activexOffice.activexOfficeStrings.lcid
import typings.activexOffice.activexOfficeStrings.pctinfo
import typings.activexOffice.activexOfficeStrings.pptinfo
import typings.activexOffice.activexOfficeStrings.ppvObj
import typings.activexOffice.activexOfficeStrings.rgdispid
import typings.activexOffice.activexOfficeStrings.rgszNames
import typings.activexOffice.activexOfficeStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarButton,
    event: Click,
    argNames: js.Tuple2[Ctrl, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonCancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: Change,
    argNames: js.Array[Ctrl],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonCtrl, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: DockPositionStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonCustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: VisibleStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ AnonCustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterDelete,
    argNames: js.Tuple4[OldNode, OldParentNode, OldNextSibling, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonInUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterInsert,
    argNames: js.Tuple2[NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonInUndoRedoNewNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterReplace,
    argNames: js.Tuple3[OldNode, NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonInUndoRedoNewNodeOldNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterAdd,
    argNames: js.Array[NewPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonNewPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterLoad,
    argNames: js.Array[Part],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartBeforeDelete,
    argNames: js.Array[OldPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonOldPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarButton,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarComboBox,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBars,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomTaskPane,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLPart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLParts,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeHide(
    obj: MsoEnvelope,
    event: EnvelopeHide,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeShow(
    obj: MsoEnvelope,
    event: EnvelopeShow,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarButton,
    event: Invoke,
    argNames: CommandBarButtonInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CommandBarButtonInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarComboBox,
    event: Invoke,
    argNames: CommandBarComboBoxInvokeArgNames,
    handler: js.ThisFunction1[
      /* this */ CommandBarComboBox, 
      /* parameter */ CommandBarComboBoxInvokeParameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBars,
    event: Invoke,
    argNames: CommandBarsInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CommandBarsInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomTaskPane,
    event: Invoke,
    argNames: CustomTaskPaneInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CustomTaskPaneInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLPart,
    event: Invoke,
    argNames: CustomXMLPartInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CustomXMLPartInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLParts,
    event: Invoke,
    argNames: CustomXMLPartsInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CustomXMLPartsInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnUpdate(
    obj: CommandBars,
    event: OnUpdate,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarButton,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarComboBox,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBars,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomTaskPane,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLPart,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLParts,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: CommandBarComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarButton, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarComboBox, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarButton, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarComboBox, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
}

