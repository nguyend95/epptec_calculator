# epptec_calculator
Basic calculator.
Taking in infix mathematics expression, 
convert it to postfix annotation by Shunting-yard algorithm and finally evaluate it.

Inputs that cannot be evaluated:
1. -- will not convert to +
2. Negative numbers cannot be taken in, might be implemented in the future.

Setup executable jar file:
1. create class files - ```javac .\src\com\company\*.java(path to java files).```
2. create jar file with manifest - ```jar cvfm Calculator.jar .\META-INF\MANIFEST.MF .\src\com\company\jar\*.class```
3. run - ```java -jar .\Calculator.jar```