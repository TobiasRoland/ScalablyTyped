package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-view relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataView")
@js.native
class DataView protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataView: IModel = js.native
  /**
    * In version 6.7.0: deleted
    */
  def closeOnSaveOrCancel(): Boolean = js.native
  def closeOnSaveOrCancel(newValue: Boolean): js.Any = js.native
  def controlBar(): js.Any = js.native
  def controlBar(newValue: DataViewControlBar): js.Any = js.native
  /**
    * In version 6.7.0: deleted
    * In version 6.5.0: added optional
    */
  @JSName("controlBar")
  def controlBar_Union(): DataViewControlBar | Null = js.native
  def editable(): Boolean = js.native
  def editable(newValue: Boolean): js.Any = js.native
  def footerWidget(): js.Any = js.native
  def footerWidget(newValue: Widget): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    * In version 6.7.0: introduced
    */
  @JSName("footerWidget")
  def footerWidget_Union(): Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  def footerWidgets(): IList[Widget] = js.native
  def labelWidth(): Double = js.native
  def labelWidth(newValue: Double): js.Any = js.native
  def noEntityMessage(): Text = js.native
  def noEntityMessage(newValue: Text): js.Any = js.native
  /**
    * In version 6.9.0: introduced
    */
  def readOnlyStyle(): DataViewReadOnlyStyle = js.native
  def readOnlyStyle(newValue: DataViewReadOnlyStyle): js.Any = js.native
  /**
    * In version 6.7.0: deleted
    */
  def showControlBar(): Boolean = js.native
  def showControlBar(newValue: Boolean): js.Any = js.native
  /**
    * In version 6.7.0: introduced
    */
  def showFooter(): Boolean = js.native
  def showFooter(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def useSchema(): Boolean = js.native
  def useSchema(newValue: Boolean): js.Any = js.native
  def widget(): js.Any = js.native
  def widget(newValue: Widget): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  @JSName("widget")
  def widget_Union(): Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataView")
@js.native
object DataView extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): DataView = js.native
}

