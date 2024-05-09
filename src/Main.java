import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int varInt = 2000483648;
        byte varByte = 10;
        short varShort = 32564;
        long varLong =  9876543210123L;
        float varFloat = 0.5f;
        double varDouble = -1.87823412;
        System.out.println("Значение переменной с типом int равно " + varInt);
        System.out.println("Значение переменной с типом byte равно " + varByte);
        System.out.println("Значение переменной с типом short равно " + varShort);
        System.out.println("Значение переменной с типом long равно " + varLong);
        System.out.println("Значение переменной с типом float равно " + varFloat);
        System.out.println("Значение переменной с типом double равно " + varDouble);
        //Task 2
        float varFloat2 = 27.12f;
        long varLong2 = 987678965549L;
        float varFloat3 = 2.786f;
        short varShort2 = 569;
        short varShort3 = -159;
        short varShort4 = 27897;
        byte varByte2 = 67;
        //Task 3
        short piecePaper = 480; //Закупили 480 листов бумаги
        byte classLudmilaPavlovna = 23;
        byte classAnnaSergeevna = 27;
        byte classEkaterinaAndreevna = 30;
        int oneStudentPaper = piecePaper / (classLudmilaPavlovna + classAnnaSergeevna + classEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги");
        //Task 4
        byte bottleTwoMinutes = 16;
        byte timeTwoBottles = 2;
        byte twentyMinutes = 20;
        short minutesOneDay = 60 * 24;
        int minutesThreeDays = minutesOneDay * 3;
        int minutesOneMonth = minutesOneDay * 30;
        short bottleOneMinute = (short) (bottleTwoMinutes / timeTwoBottles);
        int bottleTwentyMinutes = twentyMinutes * bottleOneMinute;
        int bottleOneDay = bottleOneMinute * minutesOneDay;
        int bottleThreeDays = bottleOneMinute * minutesThreeDays;
        int bottleOneMonth = bottleOneMinute * minutesOneMonth;
        System.out.println("За " + twentyMinutes + " минут машина произвела " + bottleTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleOneMonth + " штук бутылок");
        //Task 5
        byte needPotPaint = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int oneClassPots = oneClassWhite + oneClassBrown;
        int quantityClasses = needPotPaint / oneClassPots;
        int oneClassWhitePots = oneClassWhite * quantityClasses;
        int oneClassBrownPots = oneClassBrown * quantityClasses;
        System.out.println("В школе, где " + quantityClasses + " классов, нужно " + oneClassWhitePots + " банок белой краски и " + oneClassBrownPots + " банок коричневой краски");
        //Task 6
        byte quantityBananas = 5;
        byte quantityMilk = 2;
        byte quantityIceCream = 2;
        byte quantityEggs = 4;
        byte oneBananaWeight = 80;
        byte oneMilkWeight = 105;
        byte oneIceCreamWeight = 100;
        byte oneEggsWeight = 70;
        int recipeWeightGram = (oneBananaWeight * quantityBananas) + (oneMilkWeight * quantityMilk) + (oneIceCreamWeight * quantityIceCream) + (oneEggsWeight * quantityEggs);
        float recipeWeightKg = recipeWeightGram / 1000f; //Переводим в килограммы
        System.out.println("Вес завтрака спортсмена составил " + recipeWeightGram + " грамм, что равно " + recipeWeightKg + " килограмм.");
        //Task 7
        short oneDailyWheightLossGram = 250;
        short twoDailyWheightLossGram = 500;
        byte needWheightLossKg = 7;
        int needWheightLossGram = needWheightLossKg * 1000;
        int oneQantityDays = needWheightLossGram / oneDailyWheightLossGram;
        int twoQantityDays = needWheightLossGram / twoDailyWheightLossGram;
        System.out.println("Если спортсмен каждый день будет терять " + oneDailyWheightLossGram + " грамм, то он потеряет " + needWheightLossKg + " кг за " + oneQantityDays + " дней");
        System.out.println("Если спортсмен каждый день будет терять " + twoDailyWheightLossGram + " грамм, то он потеряет " + needWheightLossKg + " кг за " + twoQantityDays + " день");
        //Task 8
        int currentSolaryMasha = 67760;
        int currentSolaryDenis = 83690;
        int currentSolaryKristina = 76230;
        float oneYearSolaryUp = 0.1f;
        float yearSolaryUpMasha = (currentSolaryMasha * oneYearSolaryUp);
        float yearSolaryUpDenis = (currentSolaryDenis * oneYearSolaryUp);
        float yearSolaryUpKristina = (currentSolaryKristina * oneYearSolaryUp);
        float targetSokaryMasha = yearSolaryUpMasha + currentSolaryMasha ;
        float targetSokaryDenis = yearSolaryUpDenis + currentSolaryDenis;
        float targetSokaryKristina = yearSolaryUpKristina + currentSolaryKristina;
        System.out.println("Маша теперь получает " + (int)targetSokaryMasha + " рублей. Годовой доход вырос на " + (int)yearSolaryUpMasha + " рублей");
        System.out.println("Денис теперь получает " + (int)targetSokaryDenis + " рублей. Годовой доход вырос на " + (int)yearSolaryUpDenis + " рублей");
        System.out.println("Кристина теперь получает " + (int)targetSokaryKristina + " рублей. Годовой доход вырос на " + (int)yearSolaryUpKristina + " рублей");
    }
}