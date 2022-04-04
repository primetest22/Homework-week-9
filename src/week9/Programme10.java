package week9;

import java.util.Scanner;

public class Programme10 {

    public static void findTheLines(){
        //single dimension array
        String[] stationsName = { "Liverpool Street","Moor gate", "Old Street","Waterloo", "BakerStreet", "Regent's Park",
                "Oxford Circus", "Piccadilly Circus", "St Paul's", "Bond Street","Baker Street",
                "edge ware road","Ald gate", "Edge ware Road", "Paddington","London's Bridge", "Liverpool Street",
                "Bond Street", "Westminster","covet garden", "Leicester Square", "Green Park"};

        String[][] lines = new String[12][stationsName.length];

        lines[0][0] = "Metropolitan";
        lines[0][1] = "Ald gate";
        lines[0][2] = "Liverpool Street";
        lines[0][3] = "Moor gate";

        lines[1][0] = "Northern";
        lines[1][1] = "London Bridge";
        lines[1][2] = "Moor gate";
        lines[1][3] = "Old street";

        lines[2][0] = "Waterloo & City";
        lines[2][1] = "Bank";
        lines[1][2] = "Waterloo";

        lines[3][0] = "Baker loo";
        lines[3][1] = "Baker Street";
        lines[3][2] = "Oxford Circus";
        lines[3][3] = "Piccadilly Circus";

        lines[4][0] = "Central";
        lines[4][1] = "Bank ";
        lines[4][2] = "St Paul";
        lines[4][3] = "Bond Street";

        lines[5][0] = "Circle";
        lines[5][1] = "Edge ware Road";
        lines[5][2] = "Baker Street ";

        lines[6][0] = "DLR";
        lines[6][1] = "Bank";

        lines[7][0] = "District";
        lines[7][1] = "Edge ware Road";
        lines[7][2] = "Paddington";
        lines[7][3] = "Bays water";

        lines[8][0] = "Hammersmith & City";
        lines[8][1] = "Ald gate East";
        lines[8][2] = "Liverpool Street";
        lines[8][3] = "Moor gate";

        lines[9][0] = "Jubilee";
        lines[9][1] = "Baker Street";
        lines[9][2] = "Bond Street";
        lines[9][3] = "Westminster";
        lines[9][4] = "Waterloo";

        lines[10][0] = "Piccadilly";
        lines[10][1] = "Piccadilly Circus";
        lines[10][2] = "Leicester Square";
        lines[10][3] = "Covet Garden";

        lines[11][0] = "Victoria";
        lines[11][1] = "Oxford Circus";
        lines[11][2] = "Green Park";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tube station name of zone 1: ");
        String stop = sc.nextLine();
        String stationName = " ";

        for (String station : stationsName) {
            if (stop.equalsIgnoreCase(station)) {
                stationName = station;
            }
        }
        if (stop.equalsIgnoreCase(stationName)) {
            System.out.println(stop + " is at zone 1. ");
            System.out.println("Lines passing through this : " + stop);

            for (String[] line : lines) {
                for (int i = 1; i < lines.length; i++) {
                    String match = line[i];

                    if (stop.equalsIgnoreCase(match)) {
                        System.out.println(line[0]);
                    }
                }
            }
        } else {
            System.out.println("Station is not in the Zone 1.");
        }

    }

    public static void main(String[] args) {

        findTheLines();

        }

    }

