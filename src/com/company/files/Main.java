package com.company.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {

//        FileReader fileReader = new FileReader("/Users/arslan/Desktop/First/src/com/company/files/text.txt"); // абсолютный
//        FileReader fileReader = new FileReader("src/com/company/files/text.txt");// относительный


//        //Закрывать потоки с помощью try - catch - finally
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader("src/com/company/files/text.txt");
//            int character = fileReader.read();
//            while(character != -1) {
//                System.out.print((char)character);
//                character = fileReader.read();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fileReader != null) {
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // Закрывать потоки с помощью try catch with resources
//        try (FileReader fileReader = new FileReader("src/com/company/files/text.txt")) {
//            int character = fileReader.read();
//            while (character != -1) {
//                System.out.print((char) character);
//                character = fileReader.read();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(
//                FileWriter fileWriter = new FileWriter("src/com/company/files/text2.txt", true);
//                ) {
//            String myString = "Hello, Elisey!";
//            fileWriter.write(myString);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(
//                FileReader fileReader = new FileReader("src/com/company/files/text.txt");
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//                ) {
//
//            String line = bufferedReader.readLine();
//            while(line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(
//                FileWriter fileWriter = new FileWriter("src/com/company/files/text.txt", true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                ) {
//
//            String sampleText = "\nGJLhabkjsngakls.jf naslk.jans klfj.,asn flka.js nfks,mfn ";
//            bufferedWriter.write(sampleText);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
