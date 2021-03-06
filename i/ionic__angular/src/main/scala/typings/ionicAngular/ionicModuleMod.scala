package typings.ionicAngular

import typings.angularCore.mod.ModuleWithProviders
import typings.ionicCore.utilsConfigMod.IonicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/ionic-module", JSImport.Namespace)
@js.native
object ionicModuleMod extends js.Object {
  @js.native
  class IonicModule () extends js.Object
  
  /* static members */
  @js.native
  object IonicModule extends js.Object {
    def forRoot(): ModuleWithProviders[_] = js.native
    def forRoot(config: IonicConfig): ModuleWithProviders[_] = js.native
  }
  
}

