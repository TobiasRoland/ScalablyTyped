package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The GraphqlApi ARN.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * A TagMap object.
    */
  var tags: TagMap = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: ResourceArn, tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

