package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridRow")
@js.native
class LayoutGridRow protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLayoutGridRow: IModel = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance(): Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`(): String = js.native
  def `class`(newValue: String): js.Any = js.native
  def columns(): IList[LayoutGridColumn] = js.native
  def conditionalVisibilitySettings(): js.Any = js.native
  def conditionalVisibilitySettings(newValue: ConditionalVisibilitySettings): js.Any = js.native
  @JSName("conditionalVisibilitySettings")
  def conditionalVisibilitySettings_Union(): ConditionalVisibilitySettings | Null = js.native
  def containerAsLayoutGrid(): LayoutGrid = js.native
  /**
    * In version 8.3.0: introduced
    */
  def horizontalAlignment(): LayoutGridAlignment = js.native
  def horizontalAlignment(newValue: LayoutGridAlignment): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  def spacingBetweenColumns(): Boolean = js.native
  def spacingBetweenColumns(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  def verticalAlignment(): LayoutGridAlignment = js.native
  def verticalAlignment(newValue: LayoutGridAlignment): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutGridRow")
@js.native
object LayoutGridRow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutGridRow = js.native
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * The new LayoutGridRow will be automatically stored in the 'rows' property
    * of the parent LayoutGrid element passed as argument.
    */
  def createIn(container: LayoutGrid): LayoutGridRow = js.native
}

