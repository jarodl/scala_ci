import sbt._
import com.twitter.sbt._


class Scala_ciProject(info: ProjectInfo) extends StandardProject(info) {
  val specs = "org.scala-tools.testing" % "specs" % "1.6.2.1"
  val vscaladoc = "org.scala-tools" % "vscaladoc" % "1.1-md-3"
  val configgy = "net.lag" % "configgy" % "1.5.4"
  val xrayspecs = "com.twitter" % "xrayspecs" % "1.0.7"  //--auto--
}
