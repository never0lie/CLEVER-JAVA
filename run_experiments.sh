cd CLEVER-JAVA
ant clean
ant
cd ..
java -cp "jpf-shadow/build/*:jpf-core/build/*:jpf-symbc/build/*:jpf-symbc/lib/*:CLEVER-JAVA/build/CLEVER-JAVA.jar" org.softwaretesting.Main