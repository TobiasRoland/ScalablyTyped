package typings.createEmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSBaseObject = typings.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  type CSSPseudoObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject}
    */ typings.createEmotion.createEmotionStrings.CSSPseudoObject with js.Any
  type ClassNameArg = js.UndefOr[
    scala.Null | scala.Boolean | java.lang.String | (org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Null | scala.Boolean | java.lang.String]]) | typings.createEmotion.mod.ArrayClassNameArg
  ]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.std.TemplateStringsArray
    - typings.createEmotion.mod.CSSObject
    - typings.createEmotion.mod.ArrayInterpolation
    - typings.createEmotion.mod.ClassInterpolation
  */
  type Interpolation = js.UndefOr[
    typings.createEmotion.mod._Interpolation | scala.Null | scala.Boolean | java.lang.String | scala.Double | typings.std.TemplateStringsArray
  ]
  type StylisPlugins = scala.Null | (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[js.Function1[/* repeated */ js.Any, js.Any]])
}
