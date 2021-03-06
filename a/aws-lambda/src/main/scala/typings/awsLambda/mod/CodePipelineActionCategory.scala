package typings.awsLambda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.awsLambdaStrings.Approval
  - typings.awsLambda.awsLambdaStrings.Build
  - typings.awsLambda.awsLambdaStrings.Deploy
  - typings.awsLambda.awsLambdaStrings.Invoke
  - typings.awsLambda.awsLambdaStrings.Source
  - typings.awsLambda.awsLambdaStrings.Test
*/
trait CodePipelineActionCategory extends js.Object

object CodePipelineActionCategory {
  @scala.inline
  def Approval: typings.awsLambda.awsLambdaStrings.Approval = this.cast("Approval")
  @scala.inline
  def Build: typings.awsLambda.awsLambdaStrings.Build = this.cast("Build")
  @scala.inline
  def Deploy: typings.awsLambda.awsLambdaStrings.Deploy = this.cast("Deploy")
  @scala.inline
  def Invoke: typings.awsLambda.awsLambdaStrings.Invoke = this.cast("Invoke")
  @scala.inline
  def Source: typings.awsLambda.awsLambdaStrings.Source = this.cast("Source")
  @scala.inline
  def Test: typings.awsLambda.awsLambdaStrings.Test = this.cast("Test")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

