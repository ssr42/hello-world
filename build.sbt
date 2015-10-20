name := "hello"

version := "1.0"

scalaVersion := "2.11.6"

val gitTag = SettingKey[String]("current tag from git describe")

//gitTag in ThisBuild := Process("git describe --abbrev=0 --always").lines.head
gitTag in ThisBuild := Process("git rev-parse --abbrev-ref HEAD").lines.head

// package the fat-jar with the same name always, lsp-subsystem-0.1-deploy.jar
assemblyJarName in assembly := "hello-" + gitTag.value + ".jar"


