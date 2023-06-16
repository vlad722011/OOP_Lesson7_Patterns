package calculator;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{

    @Override
    public void writeLog(String str) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime + " : " + str);
    }
}
