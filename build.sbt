
val sparkVersion = "4.1.0-SNAPSHOT"  // Change version based on your setup

// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.1")

// enablePlugins(AssemblyPlugin) // Enable JAR assembly plugin

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

lazy val root = (project in file("."))
  .settings(
    name := "SparkTests",
    version := "0.1",
    // scalaVersion := "2.11.9",
    scalaVersion := "2.13.16",  // Use the right Scala version for Spark 3.5.1
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion % "compile",
      "org.apache.spark" %% "spark-sql" % sparkVersion % "compile",
      //"org.apache.spark" %% "spark-mllib" % sparkVersion % "compile",
      "org.scala-lang" % "scala-reflect" % scalaVersion.value % "compile"
    )
  )

// Assembly settings for creating a fat JAR
/*
assemblyMergeStrategy in assembly := {

  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}
*/

