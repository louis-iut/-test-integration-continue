chmod +x gradlew

./gradlew clean
./gradlew testReleaseUnitTest

if [[ "$TRAVIS_PULL_REQUEST" == "true" ]]
then

    echo "SUPER"

    ./gradlew assembleRelease

    chemin='./artifacts'
    mkdir -p $chemin
    name="Comics_Release.apk"
    link=$chemin'/'$name
    mv /Users/louis/Developer/workspace-tmp/app/build/outputs/apk/release/app-release-unsigned.apk $link

fi