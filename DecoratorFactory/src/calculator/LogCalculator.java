package calculator;

public class LogCalculator implements Calculable {
    private Calculable calculable;
    private Logger logger;
    LogCalculator logCalculator;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Первый аргумент калькулятора: " + calculable.getResult());
    }

    @Override
    public Calculable sum(int arg) {
        logger.writeLog("Суммирование с аргументом: " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.writeLog("Умножение с аргументом: " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        int result = calculable.getResult();
        logger.writeLog("Результат вычисления: " + result);
        return result;
    }
}
