package typings.mendixmodelsdk.allModelClassesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/header-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Header")
@js.native
class Header protected ()
  extends typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Header {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Header")
@js.native
object Header extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Header instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Header = js.native
  /**
    * Creates and returns a new Header instance in the SDK and on the server.
    * The new Header will be automatically stored in the 'header' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Header = js.native
}

