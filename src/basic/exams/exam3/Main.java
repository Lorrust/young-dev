package basic.exams.exam3;

import java.util.ArrayList;
import java.util.List;

import basic.exams.exam3.heroes.*;
import basic.exams.exam3.enemies.*;

public class Main {

	public static void main(String[] args) {

		List<Character> heroes = new ArrayList<>();
		heroes.add(new Mage());
		heroes.add(new Barbarian());
		heroes.add(new Paladin());

		for (Character hero : heroes) {
			List<Character> enemies = new ArrayList<>();
			enemies.add(new Bat());
			enemies.add(new Zombie());
			enemies.add(new Bear());
			enemies.add(new Vampire());
			enemies.add(new Arok());

			for (Character enemy : enemies) {
				try {
					hero.battle(enemy);
				} catch (CharacterDefeatedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
