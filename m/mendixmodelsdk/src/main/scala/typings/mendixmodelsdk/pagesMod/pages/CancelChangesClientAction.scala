package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelChangesClientAction")
@js.native
class CancelChangesClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCancelChangesClientAction: IModel = js.native
  def closePage(): Boolean = js.native
  def closePage(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CancelChangesClientAction")
@js.native
object CancelChangesClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInListViewUnderClickAction(container: ListView): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): CancelChangesClientAction = js.native
  /**
    * Creates and returns a new CancelChangesClientAction instance in the SDK and on the server.
    * The new CancelChangesClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): CancelChangesClientAction = js.native
}

