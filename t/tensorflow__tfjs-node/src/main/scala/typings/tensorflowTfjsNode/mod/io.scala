package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.File
import typings.std.RequestInit
import typings.tensorflowTfjsCore.AnonData
import typings.tensorflowTfjsCore.routerRegistryMod.IORouter
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typings.tensorflowTfjsCore.typesMod.SaveResult
import typings.tensorflowTfjsCore.typesMod.TrainingConfig
import typings.tensorflowTfjsCore.typesMod.WeightGroup
import typings.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typings.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import typings.tensorflowTfjsNode.FnFilePathPrefix
import typings.tensorflowTfjsNode.FnGroup
import typings.tensorflowTfjsNode.FnLoadOptions
import typings.tensorflowTfjsNode.FnModelArtifacts
import typings.tensorflowTfjsNode.fileSystemMod.NodeFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "io")
@js.native
object io extends js.Object {
  @JSName("browserFiles")
  var browserFiles_Original: js.Function1[/* files */ js.Array[File], IOHandler] = js.native
  @JSName("browserHTTPRequest")
  var browserHTTPRequest_Original: FnLoadOptions = js.native
  @JSName("concatenateArrayBuffers")
  var concatenateArrayBuffers_Original: js.Function1[/* buffers */ js.Array[ArrayBuffer], ArrayBuffer] = js.native
  @JSName("copyModel")
  var copyModel_Original: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSName("decodeWeights")
  var decodeWeights_Original: js.Function2[/* buffer */ ArrayBuffer, /* specs */ js.Array[WeightsManifestEntry], NamedTensorMap] = js.native
  @JSName("encodeWeights")
  var encodeWeights_Original: FnGroup = js.native
  @JSName("fileSystem")
  var fileSystem_Original: js.Function1[/* path */ String | js.Array[String], NodeFileSystem] = js.native
  @JSName("fromMemory")
  var fromMemory_Original: FnModelArtifacts = js.native
  @JSName("getModelArtifactsInfoForJSON")
  var getModelArtifactsInfoForJSON_Original: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo] = js.native
  @JSName("http")
  var http_Original: FnLoadOptions = js.native
  @JSName("isHTTPScheme")
  var isHTTPScheme_Original: js.Function1[/* url */ String, Boolean] = js.native
  @JSName("listModels")
  var listModels_Original: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]] = js.native
  @JSName("loadWeights")
  var loadWeights_Original: FnFilePathPrefix = js.native
  @JSName("moveModel")
  var moveModel_Original: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSName("nodeHTTPRequest")
  var nodeHTTPRequest_Original: js.Function3[
    /* path */ String, 
    /* requestInit */ js.UndefOr[RequestInit], 
    /* weightPathPrefix */ js.UndefOr[String], 
    IOHandler
  ] = js.native
  @JSName("removeModel")
  var removeModel_Original: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSName("weightsLoaderFactory")
  var weightsLoaderFactory_Original: js.Function1[
    /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]], 
    js.Function3[
      /* manifest */ WeightsManifestConfig, 
      /* filePathPrefix */ js.UndefOr[String], 
      /* weightNames */ js.UndefOr[js.Array[String]], 
      js.Promise[NamedTensorMap]
    ]
  ] = js.native
  @JSName("withSaveHandler")
  var withSaveHandler_Original: js.Function1[
    /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
    IOHandler
  ] = js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
  def browserHTTPRequest(path: String): IOHandler = js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def concatenateArrayBuffers(buffers: js.Array[ArrayBuffer]): ArrayBuffer = js.native
  /**
    * Copy a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Copying within a storage medium, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Copying between two storage mediums, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Copy the model, from Local Storage to IndexedDB.
    * await tf.io.copyModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove both models.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of copying.
    * @param destURL Destination URL of copying.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if copying fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def copyModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  def decodeWeights(buffer: ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[AnonData] = js.native
  def fileSystem(path: String): NodeFileSystem = js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry], weightData: ArrayBuffer): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: String, onProgress: js.Function): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String], onProgress: js.Function): js.Array[IOHandler] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def http(path: String): IOHandler = js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def isHTTPScheme(url: String): Boolean = js.native
  /**
    * List all models stored in registered storage mediums.
    *
    * For a web browser environment, the registered mediums are Local Storage and
    * IndexedDB.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @returns A `Promise` of a dictionary mapping URLs of existing models to
    * their model artifacts info. URLs include medium-specific schemes, e.g.,
    *   'indexeddb://my/model/1'. Model artifacts info include type of the
    * model's topology, byte sizes of the topology, weights, etc.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  /**
    * Move a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Moving within a storage medium, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Moving between two storage mediums, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Move the model, from Local Storage to IndexedDB.
    * await tf.io.moveModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove the moved model.
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of moving.
    * @param destURL Destination URL of moving.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if moving fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def moveModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  def nodeHTTPRequest(path: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
  /**
    * Remove a model specified by URL from a reigstered storage medium.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @param url A URL to a stored model, with a scheme prefix, e.g.,
    *   'localstorage://my-model-1', 'indexeddb://my/model/2'.
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    */
  /**
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  def removeModel(url: String): js.Promise[ModelArtifactsInfo] = js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = js.native
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
}

