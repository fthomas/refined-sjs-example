package example

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric.{Greater, Interval}

import scala.scalajs.js.annotation.JSExportTopLevel
import shapeless.tag.@@

@JSExportTopLevel("example.Test03")
object Test03 {
  val x01 = refineMT[Greater[W.`10000`.T]](20000)
  val x02: Int @@ Greater[W.`1000`.T] = x01
  val x03 = refineMV[Greater[W.`10000`.T]](20000)
  val x04: Int Refined Greater[W.`1000`.T] = x03
}
