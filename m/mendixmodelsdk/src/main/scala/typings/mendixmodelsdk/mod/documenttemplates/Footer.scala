package typings.mendixmodelsdk.mod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/footer-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Footer")
@js.native
class Footer protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.documenttemplates.Footer {
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
@JSImport("mendixmodelsdk", "documenttemplates.Footer")
@js.native
object Footer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Footer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Footer = js.native
  /**
    * Creates and returns a new Footer instance in the SDK and on the server.
    * The new Footer will be automatically stored in the 'footer' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Footer = js.native
}

