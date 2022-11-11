cd jpf-shadow
ant clean
ant
cd ..
java -cp "jpf-shadow/build/*:jpf-core/build/*:jpf-symbc/build/*:jpf-symbc/lib/*" gov.nasa.jpf.shadow.RunnerShadow_JPF