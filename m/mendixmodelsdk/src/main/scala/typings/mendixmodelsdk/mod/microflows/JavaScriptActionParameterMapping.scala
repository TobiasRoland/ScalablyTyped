package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.4.0: removed experimental
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.JavaScriptActionParameterMapping")
@js.native
class JavaScriptActionParameterMapping protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.JavaScriptActionParameterMapping {
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
@JSImport("mendixmodelsdk", "microflows.JavaScriptActionParameterMapping")
@js.native
object JavaScriptActionParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping = js.native
  /**
    * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
    * The new JavaScriptActionParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent JavaScriptActionCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionCallAction): typings.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping = js.native
}

