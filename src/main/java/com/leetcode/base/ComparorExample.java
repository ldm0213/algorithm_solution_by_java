package com.leetcode.base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author lidongmeng
 * Created on 2023-05-05
 *
 * https://www.baeldung.com/java-comparator-comparable
 */
public class ComparorExample {

    public static void main(String[] args) {
        testComparable();
        testComparator();
        testComparatorLambda();
    }

    public static void testComparable() {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        footballTeam.sort(null);
        System.out.println("After Sorting : " + footballTeam);
    }

    public static void testComparator() {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        footballTeam.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("After Sorting : " + footballTeam);
    }

    public static void testComparatorLambda() {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        footballTeam.sort(Comparator.comparingInt(Player::getAge).reversed());
        // important
        footballTeam.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println("After Sorting : " + footballTeam);
    }

    public static class Player implements Comparable<Player> {
        private int ranking;
        private String name;
        private int age;

        public Player(int ranking, String name, int age) {
            this.ranking = ranking;
            this.name = name;
            this.age = age;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Player o) {
            // -1表示小于,0表示等于,1表示大于
            return o.getAge() - this.getAge();
        }

        @Override
        public String toString() {
            return "ranking=" + ranking + "; name=" + name + "; age=" + age;
        }
    }
}
