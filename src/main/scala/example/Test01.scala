package example

import eu.timepit.refined._
import eu.timepit.refined.numeric._
import scala.scalajs.js.annotation.JSExportTopLevel

object Test01 {
  @JSExportTopLevel("example.Test01.main")
  def main(args: Array[String]): Unit = {
    val x01 = refineMV[Positive](1)
    val x02 = refineMT[Negative](-2)
    val x03 = refineMV[Positive](3L)
    val x04 = refineMT[Negative](-4L)
    val x05 = refineMV[Greater[W.`5.0F`.T]](5.5F)
    val x06 = refineMT[Less[W.`-6.0`.T]](-6.5)
  }
}
