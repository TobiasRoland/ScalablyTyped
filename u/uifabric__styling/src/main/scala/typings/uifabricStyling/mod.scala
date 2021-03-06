package typings.uifabricStyling

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typings.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.IConcatenatedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IProcessedStyleSet
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import typings.uifabricStyling.colorClassNamesMod.IColorClassNames
import typings.uifabricStyling.getGlobalClassNamesMod.GlobalClassNames
import typings.uifabricStyling.ianimationstylesMod.IAnimationStyles
import typings.uifabricStyling.ianimationstylesMod.IAnimationVariables
import typings.uifabricStyling.iconsMod.IIconRecord
import typings.uifabricStyling.iconsMod.IIconSubset
import typings.uifabricStyling.ieffectsMod.IEffects
import typings.uifabricStyling.ifontstylesMod.IFontStyles
import typings.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typings.uifabricStyling.ipaletteMod.IPalette
import typings.uifabricStyling.ithemeMod.IPartialTheme
import typings.uifabricStyling.ithemeMod.ISchemeNames
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricStyling.uifabricStylingBooleans.`false`
import typings.uifabricStyling.uifabricStylingNumbers.`0`
import typings.uifabricStyling.uifabricStylingNumbers.`1024`
import typings.uifabricStyling.uifabricStylingNumbers.`1366`
import typings.uifabricStyling.uifabricStylingNumbers.`1920`
import typings.uifabricStyling.uifabricStylingNumbers.`1`
import typings.uifabricStyling.uifabricStylingNumbers.`2`
import typings.uifabricStyling.uifabricStylingNumbers.`320`
import typings.uifabricStyling.uifabricStylingNumbers.`480`
import typings.uifabricStyling.uifabricStylingNumbers.`640`
import typings.uifabricStyling.uifabricStylingNumbers.`768`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.`@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis`
import typings.uifabricStyling.uifabricStylingStrings.absolute
import typings.uifabricStyling.uifabricStylingStrings.border
import typings.uifabricStyling.uifabricStylingStrings.borderBottom
import typings.uifabricStyling.uifabricStylingStrings.horizontal
import typings.uifabricStyling.uifabricStylingStrings.relative
import typings.uifabricStyling.uifabricStylingStrings.theme
import typings.uifabricStyling.uifabricStylingStrings.vertical
import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Stylesheet ()
    extends typings.uifabricStyling.mergeStylesMod.Stylesheet {
    def this(config: IStyleSheetConfig) = this()
  }
  
  val AnimationStyles: IAnimationStyles = js.native
  val AnimationVariables: IAnimationVariables = js.native
  val ColorClassNames: IColorClassNames = js.native
  val DefaultEffects: IEffects = js.native
  val DefaultFontStyles: IFontStyles = js.native
  val DefaultPalette: IPalette = js.native
  val HighContrastSelector: `@media screen and Leftparenthesis-ms-high-contrastColon activeRightparenthesis` = js.native
  val HighContrastSelectorBlack: `@media screen and Leftparenthesis-ms-high-contrastColon white-on-blackRightparenthesis` = js.native
  val HighContrastSelectorWhite: `@media screen and Leftparenthesis-ms-high-contrastColon black-on-whiteRightparenthesis` = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: `640` = js.native
  val ScreenWidthMinMedium: `480` = js.native
  val ScreenWidthMinSmall: `320` = js.native
  val ScreenWidthMinUhfMobile: `768` = js.native
  val ScreenWidthMinXLarge: `1024` = js.native
  val ScreenWidthMinXXLarge: `1366` = js.native
  val ScreenWidthMinXXXLarge: `1920` = js.native
  val ThemeSettingName: theme = js.native
  val hiddenContentStyle: IRawStyle = js.native
  val noWrap: IRawStyle = js.native
  val normalize: IRawStyle = js.native
  def buildClassMap[T /* <: js.Object */](styles: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? string}
    */ typings.uifabricStyling.uifabricStylingStrings.buildClassMap with js.Any = js.native
  def concatStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](): IConcatenatedStyleSet[TStyleSet] = js.native
  def concatStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: TStyleSet): IConcatenatedStyleSet[TStyleSet] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def concatStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  def concatStyleSetsWithProps[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styleProps: TStyleProps, allStyles: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Partial[TStyleSet] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false(styleSets: (js.UndefOr[IStyleSet[_] | `false` | Null])*): IConcatenatedStyleSet[_] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: `false`): IConcatenatedStyleSet[TStyleSet] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: TStyleSet2,
    styleSet3: `false`,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: TStyleSet1,
    styleSet2: `false`,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](
    styleSet1: `false`,
    styleSet2: TStyleSet2,
    styleSet3: TStyleSet3,
    styleSet4: TStyleSet3 | TStyleSet4
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet3 | TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](
    styleSet1: TStyleSet1 | `false`,
    styleSet2: TStyleSet2 | `false`,
    styleSet3: TStyleSet3 | `false`,
    styleSet4: TStyleSet4 | `false`,
    styleSet5: TStyleSet5 | `false`
  ): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */, TStyleSet6 /* <: IStyleSet[TStyleSet6] */](
    styleSet1: js.UndefOr[TStyleSet1 | `false` | Null],
    styleSet2: js.UndefOr[TStyleSet2 | `false` | Null],
    styleSet3: js.UndefOr[TStyleSet3 | `false` | Null],
    styleSet4: js.UndefOr[TStyleSet4 | `false` | Null],
    styleSet5: js.UndefOr[TStyleSet5 | `false` | Null],
    styleSet6: js.UndefOr[TStyleSet6 | `false` | Null]
  ): IConcatenatedStyleSet[
    TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5 with TStyleSet6
  ] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  @JSName("concatStyleSets")
  def concatStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4TStyleSet5_IStyleSetTStyleSet5[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */, TStyleSet5 /* <: IStyleSet[TStyleSet5] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IConcatenatedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4 with TStyleSet5] = js.native
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  def createTheme(theme: IPartialTheme): ITheme = js.native
  def createTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def focusClear(): IRawStyle = js.native
  def fontFace(font: IFontFace): Unit = js.native
  def getFadedOverflowStyle(theme: ITheme): IRawStyle = js.native
  def getFadedOverflowStyle(theme: ITheme, color: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: String, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: String, height: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: Double, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(theme: ITheme, color: String, direction: horizontal, width: Double, height: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: String, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: String, height: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: Double): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: Double, height: String): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(theme: ITheme, color: String, direction: vertical, width: Double, height: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = js.native
  def getFocusStyle(theme: ITheme): IRawStyle = js.native
  def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_absolute(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_relative(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): Partial[GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): Partial[GlobalClassNames[T]] = js.native
  def getIcon(): js.UndefOr[IIconRecord] = js.native
  def getIcon(name: String): js.UndefOr[IIconRecord] = js.native
  def getIconClassName(name: String): String = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: String): IRawStyle = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: String, borderType: border): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: String, borderType: border, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: Double, borderType: border): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: Double, borderType: border, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: String, borderType: borderBottom): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: String, borderType: borderBottom, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: Double, borderType: borderBottom): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: Double, borderType: borderBottom, borderPosition: Double): IRawStyle = js.native
  def getPlaceholderStyles(styles: IStyle): IStyle = js.native
  def getScreenSelector(min: Double, max: Double): String = js.native
  def getTheme(): ITheme = js.native
  def getTheme(depComments: Boolean): ITheme = js.native
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
  def keyframes(timeline: StringDictionary[js.Object]): String = js.native
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def mergeStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](): IProcessedStyleSet[TStyleSet] = js.native
  def mergeStyleSets[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: TStyleSet): IProcessedStyleSet[TStyleSet] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  def mergeStyleSets[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false(styleSets: (js.UndefOr[IStyleSet[_] | `false` | Null])*): IProcessedStyleSet[_] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet /* <: IStyleSet[TStyleSet] */](styleSet: `false`): IProcessedStyleSet[TStyleSet] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: js.UndefOr[scala.Nothing], styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: Null, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: TStyleSet4): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`, styleSet4: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */](styleSet1: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: TStyleSet1, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: TStyleSet2, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: TStyleSet3): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyleSets")
  def mergeStyleSets_false_TStyleSet1_IStyleSetTStyleSet1TStyleSet2_IStyleSetTStyleSet2TStyleSet3_IStyleSetTStyleSet3TStyleSet4_IStyleSetTStyleSet4[TStyleSet1 /* <: IStyleSet[TStyleSet1] */, TStyleSet2 /* <: IStyleSet[TStyleSet2] */, TStyleSet3 /* <: IStyleSet[TStyleSet3] */, TStyleSet4 /* <: IStyleSet[TStyleSet4] */](styleSet1: `false`, styleSet2: `false`, styleSet3: `false`): IProcessedStyleSet[TStyleSet1 with TStyleSet2 with TStyleSet3 with TStyleSet4] = js.native
  @JSName("mergeStyles")
  def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = js.native
  def registerDefaultFontFaces(baseUrl: String): Unit = js.native
  def registerIconAlias(iconName: String, mappedToName: String): Unit = js.native
  def registerIcons(iconSubset: IIconSubset): Unit = js.native
  def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  def setIconOptions(options: PartialIIconOptions): Unit = js.native
  def unregisterIcons(iconNames: js.Array[String]): Unit = js.native
  @js.native
  object AnimationClassNames extends js.Object {
    var fadeIn100: js.UndefOr[String] = js.native
    var fadeIn200: js.UndefOr[String] = js.native
    var fadeIn400: js.UndefOr[String] = js.native
    var fadeIn500: js.UndefOr[String] = js.native
    var fadeOut100: js.UndefOr[String] = js.native
    var fadeOut200: js.UndefOr[String] = js.native
    var fadeOut400: js.UndefOr[String] = js.native
    var fadeOut500: js.UndefOr[String] = js.native
    var rotate90deg: js.UndefOr[String] = js.native
    var rotateN90deg: js.UndefOr[String] = js.native
    var scaleDownIn100: js.UndefOr[String] = js.native
    var scaleDownOut98: js.UndefOr[String] = js.native
    var scaleUpIn100: js.UndefOr[String] = js.native
    var scaleUpOut103: js.UndefOr[String] = js.native
    var slideDownIn10: js.UndefOr[String] = js.native
    var slideDownIn20: js.UndefOr[String] = js.native
    var slideDownOut10: js.UndefOr[String] = js.native
    var slideDownOut20: js.UndefOr[String] = js.native
    var slideLeftIn10: js.UndefOr[String] = js.native
    var slideLeftIn20: js.UndefOr[String] = js.native
    var slideLeftIn40: js.UndefOr[String] = js.native
    var slideLeftIn400: js.UndefOr[String] = js.native
    var slideLeftOut10: js.UndefOr[String] = js.native
    var slideLeftOut20: js.UndefOr[String] = js.native
    var slideLeftOut40: js.UndefOr[String] = js.native
    var slideLeftOut400: js.UndefOr[String] = js.native
    var slideRightIn10: js.UndefOr[String] = js.native
    var slideRightIn20: js.UndefOr[String] = js.native
    var slideRightIn40: js.UndefOr[String] = js.native
    var slideRightIn400: js.UndefOr[String] = js.native
    var slideRightOut10: js.UndefOr[String] = js.native
    var slideRightOut20: js.UndefOr[String] = js.native
    var slideRightOut40: js.UndefOr[String] = js.native
    var slideRightOut400: js.UndefOr[String] = js.native
    var slideUpIn10: js.UndefOr[String] = js.native
    var slideUpIn20: js.UndefOr[String] = js.native
    var slideUpOut10: js.UndefOr[String] = js.native
    var slideUpOut20: js.UndefOr[String] = js.native
  }
  
  @js.native
  object FontClassNames extends js.Object {
    var large: js.UndefOr[String] = js.native
    var medium: js.UndefOr[String] = js.native
    var mediumPlus: js.UndefOr[String] = js.native
    var mega: js.UndefOr[String] = js.native
    var small: js.UndefOr[String] = js.native
    var smallPlus: js.UndefOr[String] = js.native
    var superLarge: js.UndefOr[String] = js.native
    var tiny: js.UndefOr[String] = js.native
    var xLarge: js.UndefOr[String] = js.native
    var xLargePlus: js.UndefOr[String] = js.native
    var xSmall: js.UndefOr[String] = js.native
    var xxLarge: js.UndefOr[String] = js.native
    var xxLargePlus: js.UndefOr[String] = js.native
  }
  
  @js.native
  object FontSizes extends js.Object {
    val icon: String = js.native
    val large: String = js.native
    val medium: String = js.native
    val mediumPlus: String = js.native
    val mega: String = js.native
    val mini: String = js.native
    val small: String = js.native
    val smallPlus: String = js.native
    val superLarge: String = js.native
    val xLarge: String = js.native
    val xLargePlus: String = js.native
    val xSmall: String = js.native
    val xxLarge: String = js.native
    val xxLargePlus: String = js.native
  }
  
  @js.native
  object FontWeights extends js.Object {
    val bold: IFontWeight = js.native
    val light: IFontWeight = js.native
    val regular: IFontWeight = js.native
    val semibold: IFontWeight = js.native
    val semilight: IFontWeight = js.native
  }
  
  @js.native
  object IconFontSizes extends js.Object {
    val large: String = js.native
    val medium: String = js.native
    val small: String = js.native
    val xSmall: String = js.native
  }
  
  @js.native
  object InjectionMode extends js.Object {
    /**
      * Appends rules using appendChild.
      */
    var appendChild: `2` = js.native
    /**
      * Inserts rules using the insertRule api.
      */
    var insertNode: `1` = js.native
    /**
      * Avoids style injection, use getRules() to read the styles.
      */
    var none: `0` = js.native
  }
  
  @js.native
  object PulsingBeaconAnimationStyles extends js.Object {
    var continuousPulseAnimationDouble: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var continuousPulseAnimationSingle: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
  }
  
  /* static members */
  @js.native
  object Stylesheet extends js.Object {
    /**
      * Gets the singleton instance.
      */
    def getInstance(): typings.uifabricMergeStyles.stylesheetMod.Stylesheet = js.native
  }
  
  @js.native
  object ZIndexes extends js.Object {
    val Coachmark: Double = js.native
    val FocusStyle: Double = js.native
    val KeytipLayer: Double = js.native
    val Layer: Double = js.native
    val Nav: Double = js.native
    /**
      * @deprecated ScrollablePane
      */
    val ScrollablePane: Double = js.native
  }
  
}

