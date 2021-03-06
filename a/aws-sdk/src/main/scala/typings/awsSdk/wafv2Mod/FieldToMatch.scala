package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldToMatch extends js.Object {
  /**
    * Inspect all query arguments. 
    */
  var AllQueryArguments: js.UndefOr[typings.awsSdk.wafv2Mod.AllQueryArguments] = js.native
  /**
    * Inspect the request body, which immediately follows the request headers. This is the part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form.  Note that only the first 8 KB (8192 bytes) of the request body are forwarded to AWS WAF for inspection. If you don't need to inspect more than 8 KB, you can guarantee that you don't allow additional bytes in by combining a statement that inspects the body of the web request, such as ByteMatchStatement or RegexPatternSetReferenceStatement, with a SizeConstraintStatement that enforces an 8 KB size limit on the body of the request. AWS WAF doesn't support inspecting the entire contents of web requests whose bodies exceed the 8 KB limit.
    */
  var Body: js.UndefOr[typings.awsSdk.wafv2Mod.Body] = js.native
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform. 
    */
  var Method: js.UndefOr[typings.awsSdk.wafv2Mod.Method] = js.native
  /**
    * Inspect the query string. This is the part of a URL that appears after a ? character, if any.
    */
  var QueryString: js.UndefOr[typings.awsSdk.wafv2Mod.QueryString] = js.native
  /**
    * Inspect a single header. Provide the name of the header to inspect, for example, User-Agent or Referer. This setting isn't case sensitive.
    */
  var SingleHeader: js.UndefOr[typings.awsSdk.wafv2Mod.SingleHeader] = js.native
  /**
    * Inspect a single query argument. Provide the name of the query argument to inspect, such as UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive. 
    */
  var SingleQueryArgument: js.UndefOr[typings.awsSdk.wafv2Mod.SingleQueryArgument] = js.native
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
    */
  var UriPath: js.UndefOr[typings.awsSdk.wafv2Mod.UriPath] = js.native
}

object FieldToMatch {
  @scala.inline
  def apply(
    AllQueryArguments: AllQueryArguments = null,
    Body: Body = null,
    Method: Method = null,
    QueryString: QueryString = null,
    SingleHeader: SingleHeader = null,
    SingleQueryArgument: SingleQueryArgument = null,
    UriPath: UriPath = null
  ): FieldToMatch = {
    val __obj = js.Dynamic.literal()
    if (AllQueryArguments != null) __obj.updateDynamic("AllQueryArguments")(AllQueryArguments.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Method != null) __obj.updateDynamic("Method")(Method.asInstanceOf[js.Any])
    if (QueryString != null) __obj.updateDynamic("QueryString")(QueryString.asInstanceOf[js.Any])
    if (SingleHeader != null) __obj.updateDynamic("SingleHeader")(SingleHeader.asInstanceOf[js.Any])
    if (SingleQueryArgument != null) __obj.updateDynamic("SingleQueryArgument")(SingleQueryArgument.asInstanceOf[js.Any])
    if (UriPath != null) __obj.updateDynamic("UriPath")(UriPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldToMatch]
  }
}

