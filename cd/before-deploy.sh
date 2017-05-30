#!/usr/bin/env bash
echo 'before deploy ... '
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    ls ./cd/codesigning.asc
    openssl aes-256-cbc -K $encrypted_d86ec38aeb7c_key -iv $encrypted_d86ec38aeb7c_iv -in ./cd/codesigning.asc.enc -out ./cd/codesigning.asc -d
    ls ./cd/codesigning.asc
    gpg --fast-import ./cd/codesigning.asc
    ls ./cd/codesigning.asc
fi