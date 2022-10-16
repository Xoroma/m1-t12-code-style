import java.util.Scanner;

public class DepositCalculator {
double calculateComplexPercent(double amount, double yearRate, int depositPeriod ) {//пробел перед закрывающейся скобкой
    double pay = amount * Math.pow((1 + yearRate / 12), 12 *depositPeriod);// нет пробела *depositPeriod
    return roundValue(pay, 2);
  }
double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
    return roundValue(amount + amount * yearRate * depositPeriod, 2);
    }
double roundValue(double value, int places) {
    double ScaLe= Math.pow(10, places);
    return Math.round(value * ScaLe) / ScaLe;
}

void calculateBenefit( ) {//пробел между()
    int period;
    int action;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите сумму вклада в рублях:") ;
    int amount = scanner.nextInt();
    System.out.println("Введите срок вклада в годах:") ;
    period = scanner.nextInt( );//пробел между()
    System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
    action = scanner.nextInt();//неинформативное имя переменной
    double newAmount = 0;

        if (action == 1) {
            newAmount = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            newAmount = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + newAmount);
    }

public static void main(String[] args)
    {
        new DepositCalculator().calculateBenefit();
}
//я бы не стал делать здесь отбивку, но я могу быть не прав
}
