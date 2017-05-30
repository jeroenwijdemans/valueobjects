#!/usr/bin/env bash
echo 'deploy ... '
if [ "$TRAVIS_BRANCH" == 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_5a8251e4ea42_key -iv $encrypted_5a8251e4ea42_iv -in ./cd/codesigning.asc.enc -out ./cd/codesigning.asc -d
    gpg --fast-import ./cd/codesigning.asc
    ./gradlew uploadArchives -s
    echo "Finished uploading archives"
else
    echo "Nothing to deploy on branch ${TRAVIS_BRANCH}.."
fi
