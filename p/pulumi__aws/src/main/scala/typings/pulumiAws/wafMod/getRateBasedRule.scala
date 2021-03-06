package typings.pulumiAws.wafMod

import typings.pulumiAws.getRateBasedRuleMod.GetRateBasedRuleArgs
import typings.pulumiAws.getRateBasedRuleMod.GetRateBasedRuleResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "getRateBasedRule")
@js.native
object getRateBasedRule extends js.Object {
  def apply(args: GetRateBasedRuleArgs): js.Promise[GetRateBasedRuleResult] with GetRateBasedRuleResult = js.native
  def apply(args: GetRateBasedRuleArgs, opts: InvokeOptions): js.Promise[GetRateBasedRuleResult] with GetRateBasedRuleResult = js.native
}

