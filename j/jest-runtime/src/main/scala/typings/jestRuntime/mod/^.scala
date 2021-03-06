package typings.jestRuntime.mod

import typings.jestEnvironment.mod.JestEnvironment
import typings.jestHasteMap.mod.ModuleMap
import typings.jestRuntime.AnonConsole
import typings.jestRuntime.jestRuntimeStrings.cache
import typings.jestRuntime.jestRuntimeStrings.config
import typings.jestRuntime.jestRuntimeStrings.debug
import typings.jestRuntime.jestRuntimeStrings.version
import typings.jestRuntime.jestRuntimeStrings.watchman
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Record
import typings.yargs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
class ^ protected () extends Runtime {
  def this(config: ProjectConfig, environment: JestEnvironment, resolver: typings.jestResolve.mod.^) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: CacheFS
  ) = this()
  def this(
    config: ProjectConfig,
    environment: JestEnvironment,
    resolver: typings.jestResolve.mod.^,
    cacheFS: CacheFS,
    coverageOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any
  ) = this()
}

@JSImport("jest-runtime", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ScriptTransformer: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScriptTransformer */ js.Any = js.native
  def createContext(config: ProjectConfig, options: AnonConsole): js.Promise[typings.jestRuntime.typesMod.Context] = js.native
  def createHasteMap(config: ProjectConfig): typings.jestHasteMap.mod.^ = js.native
  def createHasteMap(config: ProjectConfig, options: HasteMapOptions): typings.jestHasteMap.mod.^ = js.native
  def createResolver(config: ProjectConfig, moduleMap: ModuleMap): typings.jestResolve.mod.^ = js.native
  def getCLIOptions(): Record[cache | config | debug | version | watchman, Options] = js.native
  def runCLI(): Unit = js.native
  def runCLI(args: Argv): Unit = js.native
  def runCLI(args: Argv, info: js.Array[String]): Unit = js.native
  def shouldInstrument(
    filename: Path,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShouldInstrumentOptions */ js.Any,
    config: ProjectConfig
  ): Boolean = js.native
}

