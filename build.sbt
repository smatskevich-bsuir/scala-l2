lazy val root = (project in file("."))
  .settings(
    name := "scala-l2",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"
  )