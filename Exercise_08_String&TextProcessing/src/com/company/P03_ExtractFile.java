package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String fileInfo = path.substring(path.lastIndexOf("\\") + 1);
        Pattern pattern = Pattern.compile("(.*)\\.(.*)");
        Matcher matcher = pattern.matcher(fileInfo);
        matcher.find();

        System.out.println("File name: " + matcher.group(1));
        System.out.println("File extension: " + matcher.group(2));

//        Second way with List....................................
//        List<String> fileInfo = Arrays.asList(path.substring(path.lastIndexOf("\\") + 1).split("\\."));
//
//        String fileName = String.join(".", fileInfo.subList(0, fileInfo.size() - 1));
//        String fileExtension = fileInfo.get(fileInfo.size() - 1);
//        System.out.println(fileName);
//        System.out.println(fileExtension);

    }
}
