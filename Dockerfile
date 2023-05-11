FROM eclipse-temurin:17.0.7_7-jdk-jammy

RUN apt-get update && \
  apt-get install -y zip unzip && \
  rm -rf /var/lib/apt/lists/*

SHELL ["/bin/bash", "-c"]

RUN curl -s "https://get.sdkman.io" | bash && \
  source "/root/.sdkman/bin/sdkman-init.sh" && \
  sdk install maven

WORKDIR /plugin
