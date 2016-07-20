name := "sparkhacking"

version := "1.0"

scalaVersion := "2.11.8"

val scalatestV = "3.0.0-RC4"

libraryDependencies += "org.scalactic" %% "scalactic" % scalatestV

libraryDependencies += "org.scalatest" %% "scalatest" % scalatestV % "test"

resolvers += "Spark 2.0.0 RC5" at "https://repository.apache.org/content/repositories/orgapachespark-1195"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0"
libraryDependencies += "org.apache.spark" %% "spark-yarn" % "2.0.0"

publishMavenStyle := true


//spName := s"${organization.value}/${name.value}"

//sparkVersion := "2.0.0"

//sparkComponents := Seq("core", "sql")