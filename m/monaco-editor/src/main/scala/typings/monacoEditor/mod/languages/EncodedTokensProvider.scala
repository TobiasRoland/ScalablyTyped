package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedTokensProvider extends js.Object {
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenizeEncoded(line: String, state: IState): IEncodedLineTokens
}

object EncodedTokensProvider {
  @scala.inline
  def apply(getInitialState: () => IState, tokenizeEncoded: (String, IState) => IEncodedLineTokens): EncodedTokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), tokenizeEncoded = js.Any.fromFunction2(tokenizeEncoded))
  
    __obj.asInstanceOf[EncodedTokensProvider]
  }
}

