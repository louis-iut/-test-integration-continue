
chmod +x gradlew

./gradlew clean
./gradlew assembleDebugUnitTest

if [[ "$TRAVIS_PULL_REQUEST" != "true" ]]

./gradlew build

chemin='/artifacts'
name="Comics_Release.apk"
link = $chemin'/'$name
mv app/build/outputs/apk/app-debug.apk $link
fi