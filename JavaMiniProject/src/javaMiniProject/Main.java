package javaMiniProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import start.Start;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account acc = new Account();
		Start str = new Start();
		MainChoice mc = new MainChoice();

		acc.account();

		str.start();
		
		mc.searchClue();

		

	}

}