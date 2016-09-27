package example

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric.Greater
import scala.scalajs.js.annotation.JSExport
import shapeless.tag.@@

@JSExport
object Test03 {
  val x01 = refineMT[Greater[10000]](20000)
  val x02: Int @@ Greater[1000] = x01
  val x03 = refineMV[Greater[10000]](20000)
  val x04: Int Refined Greater[1000] = x03
}
