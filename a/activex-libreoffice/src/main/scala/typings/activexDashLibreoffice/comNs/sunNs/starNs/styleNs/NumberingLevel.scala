package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These properties describe the numbering of a paragraph.
  *
  * NumberType determines the type of the numbering symbol. Depending on this setting, some of the following values will be ignored.
  */
trait NumberingLevel extends js.Object {
  /** This is the name of the font that is used for the bullet. */
  var BulletFontName: String
  /** The bullet symbol with this code in the assigned font is used. */
  var BulletId: Double
  /** This is the name of the character style that is used for the symbol(s). */
  var CharStyleName: String
  /** This is the URL of a graphic file to use as a symbol. */
  var GraphicURL: String
  /**
    * specifies the type of numbering.
    * @see NumberingType
    */
  var NumberingType: Double
  /** specifies the number of higher numbering levels that are included in the representation of the current number. */
  var ParentNumbering: Double
  /** This prefix is inserted in front of the numbering symbol(s). */
  var Prefix: String
  /** This specifies the start value for the numbering. */
  var StartWith: Double
  /** This suffix is inserted after the numbering symbol(s). */
  var Suffix: String
}

object NumberingLevel {
  @scala.inline
  def apply(
    BulletFontName: String,
    BulletId: Double,
    CharStyleName: String,
    GraphicURL: String,
    NumberingType: Double,
    ParentNumbering: Double,
    Prefix: String,
    StartWith: Double,
    Suffix: String
  ): NumberingLevel = {
    val __obj = js.Dynamic.literal(BulletFontName = BulletFontName, BulletId = BulletId, CharStyleName = CharStyleName, GraphicURL = GraphicURL, NumberingType = NumberingType, ParentNumbering = ParentNumbering, Prefix = Prefix, StartWith = StartWith, Suffix = Suffix)
  
    __obj.asInstanceOf[NumberingLevel]
  }
}

