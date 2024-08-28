package org.example;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("携帯電話番号を入力してください: ");
    String phoneNumber = scanner.next();

    Pattern pattern = Pattern.compile("0[789]0-\\d{4}-\\d{4}");

    Matcher matcher = pattern.matcher(phoneNumber);

    if (matcher.matches()) {
      System.out.println(phoneNumber + " は有効な携帯電話番号です。");
    } else {
      System.out.println(phoneNumber + " は無効な携帯電話番号です。");
    }
  }
}
