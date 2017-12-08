chmod +x gradlew

./gradlew clean
./gradlew testReleaseUnitTest

./gradlew assembleRelease

#chemin='./artifacts'
#mkdir -p $chemin
#name="Comics_Release.apk"
#link=$chemin'/'$name
#mv ./app/build/outputs/apk/release/app-release-unsigned.apk $link

#if [[ "$TRAVIS_PULL_REQUEST" != "true" ]]
#then
#
#    echo "SUPER"
#
#   ./gradlew assembleRelease
#
#    chemin='./artifacts'
#    mkdir -p $chemin
#    name="Comics_Release.apk"
#    link=$chemin'/'$name
#    mv ./app/build/outputs/apk/release/app-release-unsigned.apk $link
#
#fi