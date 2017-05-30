#!/usr/bin/env bash

export VERSION=$(./gradlew -q version)
echo "Building version: ${VERSION}"
./gradlew check
./gradlew test
