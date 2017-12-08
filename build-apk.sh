chmod +x gradlew

./gradlew clean
./gradlew testReleaseUnitTest

#if [[ "$TRAVIS_PULL_REQUEST" == "true" ]]
#then

  ./gradlew assembleRelease

  date=`date +%Y-%m-%d`
  chemin='./app/build/outputs/apk/release/'
  oldApk=$chemin'app-release-unsigned.apk'
  newApk=$chemin'release_'$date

  echo "TEST"$newApk

  mv $oldApk $newApk

#fi