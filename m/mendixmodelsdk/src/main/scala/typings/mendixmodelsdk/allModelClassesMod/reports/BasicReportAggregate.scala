package typings.mendixmodelsdk.allModelClassesMod.reports

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate")
@js.native
class BasicReportAggregate protected ()
  extends typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.BasicReportAggregate")
@js.native
object BasicReportAggregate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.reportsMod.reports.BasicReport): typings.mendixmodelsdk.reportsMod.reports.BasicReportAggregate = js.native
}

