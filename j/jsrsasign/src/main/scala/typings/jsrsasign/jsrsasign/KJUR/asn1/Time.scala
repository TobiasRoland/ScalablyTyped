package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.AnonGen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': '130508235959Z'})
  * @example
  * var t1 = new KJUR.asn1.x509.Time{'str': '130508235959Z'} // UTCTime by default
  * var t2 = new KJUR.asn1.x509.Time{'type': 'gen',  'str': '20130508235959Z'} // GeneralizedTime
  */
@JSGlobal("jsrsasign.KJUR.asn1.Time")
@js.native
class Time () extends ASN1Object {
  def this(params: StringParam with AnonGen) = this()
  def setTimeParams(timeParams: String): Unit = js.native
  def setTimeParams(timeParams: DateParam): Unit = js.native
  def setTimeParams(timeParams: HexParam): Unit = js.native
  def setTimeParams(timeParams: StringParam): Unit = js.native
}

