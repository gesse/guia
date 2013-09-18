import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "Guia"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "jp.t2v" %% "play2.auth"      % "0.10.1",
    "jp.t2v" %% "play2.auth.test" % "0.10.1" % "test",
    jdbc,
    javaCore,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
       
  )
  

}
