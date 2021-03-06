package typings.node

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.Collator
import typings.std.Intl.CollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocalesOptionsSupportedLocalesOfArray
  extends Instantiable0[Collator]
     with Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      Collator
    ]
     with Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* options */ CollatorOptions, 
      Collator
    ] {
  def apply(): Collator = js.native
  def apply(locales: java.lang.String): Collator = js.native
  def apply(locales: java.lang.String, options: CollatorOptions): Collator = js.native
  def apply(locales: js.Array[java.lang.String]): Collator = js.native
  def apply(locales: js.Array[java.lang.String], options: CollatorOptions): Collator = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = js.native
}

