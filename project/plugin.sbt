// Eclipse
// https://github.com/typesafehub/sbteclipse
// run "sbt eclipse"
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
addSbtPlugin("com.blackducksoftware.integration" % "hub-sbt-plugin" % "1.0.0")

hubCodeLocationName := OverrideCodeLocationName
hubProjectName := OverrideMavenProjectName
hubVersionName := OverrideMavenProjectVersion
hubUrl := http://imp-hub05.dc1.lan:8080/
hubUsername := sysadmin
hubPassword := blackduck
hubTimeout := 120
createFlatDependencyList := false
createHubBdio := true
deployHubBdio := false
checkPolicies := false
createHubReport := false
hubScanTimeout := 300
