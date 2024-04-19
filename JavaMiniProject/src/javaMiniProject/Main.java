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
		String id = acc.account();

		StartMain stM = new StartMain();

		stM.gameStart(id);

	}

}