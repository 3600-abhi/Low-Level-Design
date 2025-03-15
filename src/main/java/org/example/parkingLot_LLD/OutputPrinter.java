package org.example.parkingLot_LLD;

public class OutputPrinter {

    public void printWithNewLine(final String message) {
        System.out.println(message);
    }

    public void welcome() {
        printWithNewLine("Welcome to Jamog-Parking Lot");
    }

    public void end() {
        printWithNewLine("Thanks for using Jamog-Parking Lot Service");
    }

    public void notFound() {
        printWithNewLine("Not found");
    }

    public void statusHeader() {
        printWithNewLine("Slot No     Registration No     Color");
    }

    public void parkingLotFull() {
        printWithNewLine("Sorry, Parking lot is full");
    }

    public void parkingLotEmpty() {
        printWithNewLine("Parking lot is empty");
    }

    public void invalidFile() {
        printWithNewLine("Invalid file provided");
    }
}
