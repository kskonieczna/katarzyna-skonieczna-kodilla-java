/*package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application_13_2 {

    public static void main(String[] args) {

        // new version:

        RentRequestRetriver_13_2 rentRequestRetriver = new RentRequestRetriver_13_2();
        RentRequest_13_2 rentRequest = rentRequestRetriver.retrieve();

        RentalProcessor_13_2 rentalProcessor = new RentalProcessor_13_2(
                new MailService_13_2(), new CarRentalService_13_2(), new CarRentalRepository_13_2());
        rentalProcessor.process(rentRequest);

        /* old version:

        User user = new User("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        CarRentalService_13_2 carRentalService = new CarRentalService_13_2();
        boolean isRented = carRentalService.rent(user, rentFrom, rentTo);

        MailService_13_2 mailService = new MailService_13_2();
        CarRentalRepository_13_2 carRentalRepository = new CarRentalRepository_13_2();

        if (isRented) {
            mailService.sendEmail(user);
            carRentalRepository.createCarRental(user, rentFrom, rentTo);
        } else {
            System.out.println("Car rent has been rejected!");
        }


    }
}*/