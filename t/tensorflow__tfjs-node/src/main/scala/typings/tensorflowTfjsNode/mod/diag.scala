package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "diag")
@js.native
object diag
  extends TopLevel[
      js.Function1[
        /* x */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

