package typings.pulumiAws.ruleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cfg.RuleScope
import typings.pulumiAws.inputMod.cfg.RuleSource
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleState extends js.Object {
  /**
    * The ARN of the config rule
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the rule
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A string in JSON format that is passed to the AWS Config rule Lambda function.
    */
  val inputParameters: js.UndefOr[Input[String]] = js.native
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
    */
  val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the config rule
    */
  val ruleId: js.UndefOr[Input[String]] = js.native
  /**
    * Scope defines which resources can trigger an evaluation for the rule as documented below.
    */
  val scope: js.UndefOr[Input[RuleScope]] = js.native
  /**
    * Source specifies the rule owner, the rule identifier, and the notifications that cause
    * the function to evaluate your AWS resources as documented below.
    */
  val source: js.UndefOr[Input[RuleSource]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    inputParameters: Input[String] = null,
    maximumExecutionFrequency: Input[String] = null,
    name: Input[String] = null,
    ruleId: Input[String] = null,
    scope: Input[RuleScope] = null,
    source: Input[RuleSource] = null,
    tags: Input[StringDictionary[_]] = null
  ): RuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputParameters != null) __obj.updateDynamic("inputParameters")(inputParameters.asInstanceOf[js.Any])
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleState]
  }
}

