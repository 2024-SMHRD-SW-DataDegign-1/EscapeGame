package javaMiniProject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import lockDoor.Intro;
import start.Start;
import start.StartMain;

public class Main {

	public static void main(String[] args) {
		
		

		Account acc = new Account();
		StartMain stM = new StartMain();
		
		String id = acc.account();
		
		stM.gameStart(id);



	}

}