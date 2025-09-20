rootProject.name = "fallow"

// codecs
include(":fallow-codec-common")
include(":fallow-codec-jackson")

// brokers
include(":fallow-broker-common")
include(":fallow-broker-nats")
include(":fallow-broker-redis")

// demo
include(":fallow-demo:fallow-demo-client")
include(":fallow-demo:fallow-demo-server")
include(":fallow-demo:fallow-demo-shared")