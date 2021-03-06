package typings.babelTemplate

import typings.babelTemplate.mod.PublicReplacements
import typings.babelTemplate.mod.TemplateBuilder
import typings.babelTemplate.mod.TemplateBuilderOptions
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.Statement
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAst extends js.Object {
  @JSName("ast")
  var ast_Original: FnArgs = js.native
  @JSName("expression")
  var expression_Original: TemplateBuilder[Expression] = js.native
  @JSName("program")
  var program_Original: TemplateBuilder[Program_] = js.native
  @JSName("smart")
  var smart_Original: TemplateBuilder[Statement | js.Array[Statement]] = js.native
  @JSName("statement")
  var statement_Original: TemplateBuilder[Statement] = js.native
  @JSName("statements")
  var statements_Original: TemplateBuilder[js.Array[Statement]] = js.native
  def ast(tpl: String): Statement | js.Array[Statement] = js.native
  def ast(tpl: String, opts: TemplateBuilderOptions): Statement | js.Array[Statement] = js.native
  def ast(tpl: TemplateStringsArray, args: js.Any*): Statement | js.Array[Statement] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def expression(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Expression] = js.native
  def expression(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Expression] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def expression(opts: TemplateBuilderOptions): TemplateBuilder[Expression] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def expression(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Expression] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def program(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Program_] = js.native
  def program(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Program_] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def program(opts: TemplateBuilderOptions): TemplateBuilder[Program_] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def program(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Program_] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def smart(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  def smart(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def smart(opts: TemplateBuilderOptions): TemplateBuilder[Statement | js.Array[Statement]] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def smart(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def statement(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement] = js.native
  def statement(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def statement(opts: TemplateBuilderOptions): TemplateBuilder[Statement] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def statement(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement] = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def statements(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], js.Array[Statement]] = js.native
  def statements(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], js.Array[Statement]] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def statements(opts: TemplateBuilderOptions): TemplateBuilder[js.Array[Statement]] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def statements(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], js.Array[Statement]] = js.native
}

