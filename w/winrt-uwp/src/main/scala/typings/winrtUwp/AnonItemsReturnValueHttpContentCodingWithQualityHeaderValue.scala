package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueHttpContentCodingWithQualityHeaderValue extends js.Object {
  /** An array of HttpContentCodingWithQualityHeaderValue items that start at startIndex in the HttpContentCodingWithQualityHeaderValueCollection . */ var items: HttpContentCodingWithQualityHeaderValue
  /** The number of HttpContentCodingWithQualityHeaderValue items retrieved. */ var returnValue: Double
}

object AnonItemsReturnValueHttpContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(items: HttpContentCodingWithQualityHeaderValue, returnValue: Double): AnonItemsReturnValueHttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueHttpContentCodingWithQualityHeaderValue]
  }
}

