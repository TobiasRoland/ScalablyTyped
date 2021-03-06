package typings.pdf2image

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OutputFormat = (js.Function7[
    /* pageNum */ scala.Double, 
    /* pageIndex */ scala.Double, 
    /* totalPagesProcessed */ scala.Double, 
    /* totalPDFPages */ scala.Double, 
    /* name */ java.lang.String, 
    /* path */ java.lang.String, 
    /* vm */ typings.pdf2image.TypeofimportedVm, 
    java.lang.String
  ]) | java.lang.String
}
