package typings.firebaseFirestore

import typings.firebaseFirestore.specsSpecTestRunnerMod.SpecQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueriesResumeToken extends js.Object {
  var queries: js.Array[SpecQuery]
  var resumeToken: String
}

object AnonQueriesResumeToken {
  @scala.inline
  def apply(queries: js.Array[SpecQuery], resumeToken: String): AnonQueriesResumeToken = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueriesResumeToken]
  }
}

