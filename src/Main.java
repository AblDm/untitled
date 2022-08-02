public class Main {
    public static void main(String[] args) {
        int periodFlight =79;
        int yearsOnPeriodView = 2102;
        int periodView = yearsOnPeriodView -periodFlight;
        for (int yearFlight = 0; yearFlight< periodView; yearFlight++) {
            // Каждый год проверяем, является ли он лётным и принадлежащим периоду просмотра
            if (yearFlight % 79 == 0 ) {
                if ( (yearFlight + periodFlight) < 2102 && 1822 < (yearFlight + periodFlight) ){
                    // Выводим сообщение

                    System.out.println("лётный год " + (yearFlight + periodFlight));
                }
            }

        };
    }
}