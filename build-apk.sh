chmod +x gradlew

./gradlew clean
./gradlew testReleaseUnitTest

if [[ "$TRAVIS_PULL_REQUEST" == "true" ]]
then
    ./gradlew clean
    ./gradlew assembleReleaseUnitTest

    chemin='./artifacts'
    mkdir -p $chemin
    name="Comics_Release.apk"
    link=$chemin'/'$name
    mv app/build/outputs/apk/app-debug.apk $link

fi