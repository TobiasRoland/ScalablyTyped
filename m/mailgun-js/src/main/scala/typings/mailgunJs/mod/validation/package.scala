package typings.mailgunJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validation {
  type ValidationCallback = js.Function2[
    /* error */ typings.mailgunJs.mod.Error, 
    /* body */ typings.mailgunJs.mod.validation.ValidateResponse, 
    scala.Unit
  ]
}
