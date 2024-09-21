package letsdev.demo;

import letsdev.common.log.LogLevel;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();

        // Simple data
        String name = "John";

        // ERROR
        demo.log(LogLevel.ERROR, "Hello, My name is {}", name);

        // WARN
        demo.log(LogLevel.WARN, "Hello, My name is {}", name);

        // INFO
        demo.log(LogLevel.INFO, "Hello, My name is {}", name);

        // DEBUG
        demo.log(LogLevel.DEBUG, "Hello, My name is {}", name);

        // TRACE
        demo.log(LogLevel.TRACE, "Hello, My name is {}", name);

        // OFF
        demo.log(LogLevel.OFF, "Hello, My name is {}", name);

        // ALL (same to trace)
        demo.log(LogLevel.ALL, "Hello, My name is {}", name);
    }
}
