public class Main {
    public static void main(String[] args) {

        //задание №1
        int a = 1000;
        byte b = 127;
        short c = 100;
        long d = 10_000L;
        float e = 10.1f;
        double f = 200.5;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println();

        //задание №2
        float a2 = 27.12f;
        long b2 =  987_678_965_549L;
        float c2 = 2.786f;
        short d2 = 569;
        short e2 = -159;
        short f2 = 27_897;
        short g2 = 67;

        //задание №3
        int numberOfStudentsLP = 23;
        int numberOfStudentsAS = 27;
        int numberOfStudentsEA = 30;
        int numberOfSheets = 480;
        float numberOfSheetsStudent = (float) numberOfSheets /
                (numberOfStudentsLP + numberOfStudentsAS + numberOfStudentsEA);
        System.out.println("На каждого ученика рассчитано " + (int) numberOfSheetsStudent +
                " листов бумаги");
        System.out.println();

        //задание №4
        float productivityPer1Minute = 16f / 2;
        int productivityPer20Minute = (int) (productivityPer1Minute * 20);
        int productivityPer24Hour = (int) (productivityPer1Minute * 60 * 24);
        int productivityPer3Day = (int) (productivityPer24Hour * 3);
        int productivityPer1Month = (int) (productivityPer24Hour * 31);
        System.out.println("За 20 минут машина произвела " + productivityPer20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityPer24Hour + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityPer3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productivityPer1Month + " штук бутылок");
        System.out.println();

        //задание №5
        float quantityClass = 120f / (2 + 4);
        System.out.println("В школе, где " + (int)quantityClass + " классов, нужно " +
                (int)quantityClass * 2 + " банок белой краски и " + (int)quantityClass * 4 +
                " банок коричневой краски");
        System.out.println();

        //задание №6
        int weightOfBananas = 5 * 80;
        float weightOfMilk = (200f / 100) * 105;
        int weightOfIceCream = 2 * 100;
        int weightOfEggs = 4 * 70;
        int weightInGrams = weightOfBananas + (int) weightOfMilk + weightOfIceCream + weightOfEggs;
        float weightInKG = weightInGrams / 1000f;
        System.out.println("Спортивный завтрак весит " + weightInGrams + " грамм. В килограммах это " +
                weightInKG + " кг.");
        System.out.println();

        //задание №7
        float inDay250 = (7 * 1000) / 250f;
        float inDay500 = (7 * 1000) / 500f;
        float average = (inDay250 + inDay500) / 2;
        System.out.println("Если спортсмен будет терять в весе каждый день 250 грамм, то на похудение у него " +
                "уйдёт " + (int) inDay250 + " дней.");
        System.out.println("А если по 500 грамм в день, то на это у него уйдёт " + (int) inDay500 + " дней.");
        System.out.println("В среднем, чтобы похудеть на 7 кг понадобится " + (int) average + " день.");
        System.out.println();

        //задание №8
        int cashMasha = 67_760;
        int cashDenis = 83_690;
        int cashKristina = 76_230;
        int cashMashaNew = (int) (cashMasha * 1.1f);
        int cashDenisNew = (int) (cashDenis * 1.1f);
        int cashKristinaNew = (int) (cashKristina * 1.1f);
        int MashaInYear = (cashMashaNew - cashMasha) * 12;
        int DenisInYear = (cashDenisNew - cashDenis) * 12;
        int KristinaInYear = (cashKristinaNew - cashKristina) * 12;
        System.out.println("Маша теперь получает " + cashMashaNew + " рублей. Годовой доход вырос на " + MashaInYear + " рублей");
        System.out.println("Денис теперь получает " + cashDenisNew + " рублей. Годовой доход вырос на " + DenisInYear + " рублей");
        System.out.println("Кристина теперь получает " + cashKristinaNew + " рубля. Годовой доход вырос на " + KristinaInYear + " рублей");



    }
}