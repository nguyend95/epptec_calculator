package com.company;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://brilliant.org/wiki/shunting-yard-algorithm/
// Program zatim nefunguje pro zapornych cisel. -3 + 2, 3--2, ...
public class Main {
    public static void main(String[] args) throws IOException {
        List<String> mathExpressions = Stream.of("5+ 2",
                        "4+3*3",
                        "4*2+(3+41*1)",
                        "2*11+((2+1)*2+1)",
                        "2/11+((2+1)/2+1)",
                        "(2+1)-4")
                .collect(Collectors.toList());
	    Calculator calculator = new Calculator();

        mathExpressions.forEach(m -> {
            Reader inputString = new StringReader(m);
            BufferedReader reader = new BufferedReader(inputString);

            try {
                calculator.readInputAndModifyInfixToPostfix(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }

            calculator.calculate();
            calculator.printResult();
        });

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            calculator.readInputAndModifyInfixToPostfix(reader);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        calculator.checkInput();
//        calculator.calculate();
//        calculator.printResult();
    }
}
