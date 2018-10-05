resolvers += Resolver.typesafeRepo("snapshots")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.13")

// Asset pipeline plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.3")

// Build Version Plugins
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")

// Assembly Plugin for smoke-tests
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

// Provides `sbt dependencyUpdates` to check for new versions
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")

// Runs scalafmt when compiling
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
