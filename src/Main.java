public class Main {
    public static void main(String[] args) {
        //Задание 1;
        byte a = 1;
        short b = 240;
        int c = 145000;
        long d = 143431413414124L;
        float e = 0.12f;
        double f = 0.14;
        char g = '!';
        //Задание 2;
        float fighterOne = 78.2f;
        float fighterTwo = 82.7f;
        float totalWeight = fighterOne + fighterTwo;
        System.out.println("Общий вес бойцов - " + totalWeight + " кг");
        float diffWeight = fighterTwo - fighterOne;
        System.out.println("Разница в весе - " + diffWeight  + " кг");
        //Задание 3;
        int gPerKilos = 1000;
        byte bananas = 5;
        short bananaWeight = 80;
        int bananaTotal = bananas * bananaWeight;
        short milkMl = 200;
        float milkDensity = 1.05f;
        float milkTotal = milkDensity * milkMl;
        byte icecream = 2;
        byte iceWeight = 100;
        int iceTotal = icecream * iceWeight;
        byte eggs = 4;
        byte eggWeight = 70;
        int eggsTotal = eggs * eggWeight;
        float breakfastTotal = (bananaTotal + milkTotal + iceTotal + eggsTotal) / gPerKilos;
        System.out.println("Общий вес завтрака - " + breakfastTotal  + " кг");
        //Задание 4;
        int gToK = 1000;
        byte weightToLose = 7;
        int minLoss = 250;
        int maxLoss = 500;
        int fastLoss = ((weightToLose * 1000) / maxLoss) + ((weightToLose * 1000) % minLoss);
        System.out.println("Минимальное кол-во дней для похудения - " + fastLoss);
        int slowLoss = ((weightToLose * 1000) / minLoss) + ((weightToLose * 1000) % minLoss);
        System.out.println("Максимальное кол-во дней для похудения - " + slowLoss);
        int medianLoss = (maxLoss + minLoss) / 2;
        int mediiumLoss = ((weightToLose * 1000) / medianLoss) + (weightToLose * 1000) % minLoss;
        System.out.println("Среднее кол-во дней для похудения - " + mediiumLoss);
        //Задание 5;
        int coefSalary = 10;
        int percent = 100;
        int monthInYear = 12;
        int salaryMary = 67760;
        int bonusMary = (salaryMary * coefSalary)/percent;
        salaryMary = salaryMary + bonusMary;
        int yearMaryBonus = bonusMary * monthInYear;
        System.out.println("Маша теперь получает " + salaryMary + " рублей. Годовой доход вырос на " + yearMaryBonus + " рублей");
        int salaryDen = 83690;
        int bonusDen = (salaryDen * coefSalary)/percent;
        salaryDen = salaryDen + bonusDen;
        int yearDenBonus = bonusDen * monthInYear;
        System.out.println("Денис теперь получает " + salaryDen + " рублей. Годовой доход вырос на " + yearDenBonus + " рублей");
        int salaryKris = 76230;
        int bonusKris = (salaryKris * coefSalary)/percent;
        salaryKris = salaryKris + bonusKris;
        int yearKrisBonus = bonusKris * monthInYear;
        System.out.println("Кристина теперь получает " + salaryKris + " рублей. Годовой доход вырос на " + yearKrisBonus + " рублей");


    }
}