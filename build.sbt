name := "LabCollections"

scalaSource in Compile := baseDirectory.value

scalaSource in Test := baseDirectory.value

scalaVersion := "2.11.5"

resolvers += "loyolachicagocode@bintray" at "http://dl.bintray.com/loyolachicagocode/maven"

libraryDependencies ++= Seq("edu.luc.cs" %% "introcs-scala-ui" % "0.1.11",
  "com.novocode" % "junit-interface" % "0.11",
  "org.scalatest" %% "scalatest" % "2.2.1"
)
