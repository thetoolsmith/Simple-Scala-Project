// Eclipse
// https://github.com/typesafehub/sbteclipse
// run "sbt eclipse"
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")
addSbtPlugin("com.blackducksoftware.integration" % "hub-sbt-plugin" % "1.0.0")

hubIgnoreFailure := true
hubCodeLocationName := OverrideCodeLocationName
hubProjectName := OverrideMavenProjectName
hubVersionName := OverrideMavenProjectVersion
hubUrl := http://imp-hub05.dc1.lan:8080/
hubUsername := sysadmin
hubPassword := blackduck
hubTimeout := 120
hubProxyHost := ProxyHost
hubProxyPort := 3128
#hubNoProxyHosts := .*google.*
#hubProxyUsername := proxyUser
#hubProxyPassword := proxypassword
createFlatDependencyList := false
createHubBdio := true
deployHubBdio := false
checkPolicies := false
createHubReport := false
outputDirectory := ./blackduck/output
hubScanTimeout := 300
includedScopes := compile,runtime
excludedModules := subModule
