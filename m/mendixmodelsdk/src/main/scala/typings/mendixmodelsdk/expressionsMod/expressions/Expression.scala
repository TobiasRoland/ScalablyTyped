package typings.mendixmodelsdk.expressionsMod.expressions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.BasicCodeActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.BasicJavaActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling
import typings.mendixmodelsdk.microflowsMod.microflows.ChangeListAction
import typings.mendixmodelsdk.microflowsMod.microflows.ChangeVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.CustomRange
import typings.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.EndEvent
import typings.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition
import typings.mendixmodelsdk.microflowsMod.microflows.FormDataPart
import typings.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction
import typings.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.HttpHeaderEntry
import typings.mendixmodelsdk.microflowsMod.microflows.InspectAttribute
import typings.mendixmodelsdk.microflowsMod.microflows.LogMessageAction
import typings.mendixmodelsdk.microflowsMod.microflows.MemberChange
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.NanoflowCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.ProxyConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.RestCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.TemplateArgument
import typings.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.restMod.rest.ConsumedODataService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-expressions relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
abstract class Expression protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExpression: IModel = js.native
  def containerAsAppServiceCallParameterMapping(): AppServiceCallParameterMapping = js.native
  def containerAsBasicCodeActionParameterValue(): BasicCodeActionParameterValue = js.native
  def containerAsBasicJavaActionParameterValue(): BasicJavaActionParameterValue = js.native
  def containerAsBinaryExpression(): BinaryExpression = js.native
  def containerAsBinaryRequestHandling(): BinaryRequestHandling = js.native
  def containerAsChangeListAction(): ChangeListAction = js.native
  def containerAsChangeVariableAction(): ChangeVariableAction = js.native
  def containerAsConditionalSettings(): ConditionalSettings = js.native
  def containerAsConsumedODataService(): ConsumedODataService = js.native
  def containerAsCreateVariableAction(): CreateVariableAction = js.native
  def containerAsCustomRange(): CustomRange = js.native
  def containerAsDocumentTemplateParameterMapping(): DocumentTemplateParameterMapping = js.native
  def containerAsEndEvent(): EndEvent = js.native
  def containerAsExpressionSplitCondition(): ExpressionSplitCondition = js.native
  def containerAsFormDataPart(): FormDataPart = js.native
  def containerAsFunctionCallExpression(): FunctionCallExpression = js.native
  def containerAsGenerateDocumentAction(): GenerateDocumentAction = js.native
  def containerAsHttpConfiguration(): HttpConfiguration = js.native
  def containerAsHttpHeaderEntry(): HttpHeaderEntry = js.native
  def containerAsIfExpression(): IfExpression = js.native
  def containerAsInspectAttribute(): InspectAttribute = js.native
  def containerAsLogMessageAction(): LogMessageAction = js.native
  def containerAsMemberChange(): MemberChange = js.native
  def containerAsMicroflowCallParameterMapping(): MicroflowCallParameterMapping = js.native
  def containerAsNanoflowCallParameterMapping(): NanoflowCallParameterMapping = js.native
  def containerAsParenthesisExpression(): ParenthesisExpression = js.native
  def containerAsProxyConfiguration(): ProxyConfiguration = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsRuleCallParameterMapping(): RuleCallParameterMapping = js.native
  def containerAsTemplateArgument(): TemplateArgument = js.native
  def containerAsUnaryExpression(): UnaryExpression = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
  def containerAsWebServiceOperationParameterMapping(): WebServiceOperationParameterMapping = js.native
  def containerAsWidgetValidation(): WidgetValidation = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
object Expression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

