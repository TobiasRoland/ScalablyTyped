package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.CustomSetting")
@js.native
class CustomSetting protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.settings.CustomSetting {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "settings.CustomSetting")
@js.native
object CustomSetting extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomSetting instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.settingsMod.settings.CustomSetting = js.native
  /**
    * Creates and returns a new CustomSetting instance in the SDK and on the server.
    * The new CustomSetting will be automatically stored in the 'customSettings' property
    * of the parent Configuration element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.settingsMod.settings.Configuration): typings.mendixmodelsdk.settingsMod.settings.CustomSetting = js.native
}

