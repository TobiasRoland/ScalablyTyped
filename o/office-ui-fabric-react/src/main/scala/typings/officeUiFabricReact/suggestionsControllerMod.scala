package typings.officeUiFabricReact

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsController", JSImport.Namespace)
@js.native
object suggestionsControllerMod extends js.Object {
  @js.native
  class SuggestionsController[T] () extends js.Object {
    var _ensureSuggestionModel: js.Any = js.native
    var _isSuggestionModel: js.Any = js.native
    var currentIndex: Double = js.native
    var currentSuggestion: js.UndefOr[ISuggestionModel[T]] = js.native
    var suggestions: js.Array[ISuggestionModel[T]] = js.native
    def convertSuggestionsToSuggestionItems(suggestions: js.Array[ISuggestionModel[T] | T]): js.Array[ISuggestionModel[T]] = js.native
    def createGenericSuggestion(itemToConvert: T): Unit = js.native
    def createGenericSuggestion(itemToConvert: ISuggestionModel[T]): Unit = js.native
    def deselectAllSuggestions(): Unit = js.native
    def getCurrentItem(): ISuggestionModel[T] = js.native
    def getSuggestionAtIndex(index: Double): ISuggestionModel[T] = js.native
    def getSuggestions(): js.Array[ISuggestionModel[T]] = js.native
    def hasSelectedSuggestion(): Boolean = js.native
    /**
      * Increments the suggestion index and gets the next suggestion in the list.
      */
    def nextSuggestion(): Boolean = js.native
    /**
      * Decrements the suggestion index and gets the previous suggestion in the list.
      */
    def previousSuggestion(): Boolean = js.native
    def removeSuggestion(index: Double): Unit = js.native
    def setSelectedSuggestion(index: Double): Unit = js.native
    def updateSuggestions(newSuggestions: js.Array[T]): Unit = js.native
    def updateSuggestions(newSuggestions: js.Array[T], selectedIndex: Double): Unit = js.native
  }
  
}

