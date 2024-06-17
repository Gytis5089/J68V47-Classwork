package Project;

import java.util.Scanner;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class User {
    public String name;

    public int games;
    public int wins;
    public double percentage;

    public int gameswith1;
    public int winswith1;

    public int gameswith2;
    public int winswith2;

    public User() {
        this.name = "";
        this.games = 0;
        this.wins = 0;
        this.percentage = 0;
        this.gameswith1 = 0;
        this.winswith1 = 0;
        this.gameswith2 = 0;
        this.winswith2 = 0;
    }
}

public class Main {
    static void displayIndividuals(User[] users) {
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPlayer " + (i+1) + " - " + users[i].name + "\n" + users[i].games + " Games\n" + users[i].wins + " Wins\n" + Math.round(users[i].percentage) + "%");
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        JSONParser parser = new JSONParser();

        try {
            System.out.println("User 1:");
            String name1 = input.nextLine();
            User user1 = new User();
            user1.name = name1;

            System.out.println("User 2:");
            String name2 = input.nextLine();
            User user2 = new User();
            user2.name = name2;

            System.out.println("User 3:");
            String name3 = input.nextLine();
            User user3 = new User();
            user3.name = name3;





            Object obj = parser.parse(new FileReader("src/Project/db.json"));
            JSONObject data = (JSONObject) obj;

            String player1name = user1.name;
            String player2name = user2.name;
            String player3name = user3.name;

            JSONArray player1games = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player1name)) {
                        player1games.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player1wins = new JSONArray();
            for (Object el : player1games) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player1wins.add(game);
                }
            }

            JSONArray player1gameswith2 = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player1name) && foo.toString().contains(player2name)) {
                        player1gameswith2.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player1winswith2 = new JSONArray();
            for (Object el : player1gameswith2) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player1winswith2.add(game);
                }
            }

            JSONArray player1gameswith3 = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player1name) && foo.toString().contains(player3name)) {
                        player1gameswith3.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player1winswith3 = new JSONArray();
            for (Object el : player1gameswith3) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player1winswith3.add(game);
                }
            }

            JSONArray player2games = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player2name)) {
                        player2games.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player2wins = new JSONArray();
            for (Object el : player2games) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player2wins.add(game);
                }
            }

            JSONArray player2gameswith1 = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player2name) && foo.toString().contains(player1name)) {
                        player2gameswith1.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player2winswith1 = new JSONArray();
            for (Object el : player2gameswith1) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player2winswith1.add(game);
                }
            }

            JSONArray player2gameswith3 = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player2name) && foo.toString().contains(player3name)) {
                        player2gameswith3.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player2winswith3 = new JSONArray();
            for (Object el : player2gameswith3) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player2winswith3.add(game);
                }
            }

            JSONArray player3games = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player3name)) {
                        player3games.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player3wins = new JSONArray();
            for (Object el : player3games) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player3wins.add(game);
                }
            }

            JSONArray player3gameswith1 = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player3name) && foo.toString().contains(player1name)) {
                        player3gameswith1.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player3winswith1 = new JSONArray();
            for (Object el : player3gameswith1) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player3winswith1.add(game);
                }
            }

            JSONArray player3gameswith2 = new JSONArray();
            for (Object el : data.keySet()) {
                JSONArray games = (JSONArray) data.get(el);
                for (Object foo : games) {
                    if (foo.toString().contains(player3name) && foo.toString().contains(player2name)) {
                        player3gameswith2.add(new JSONArray() {{
                            add(games.indexOf(foo));
                            add(foo);
                        }});
                    }
                }
            }

            JSONArray player3winswith2 = new JSONArray();
            for (Object el : player3gameswith2) {
                JSONArray game = (JSONArray) el;
                if (game.get(0).equals(0)) {
                    player3winswith2.add(game);
                }
            }

            user1.games = player1games.size();
            user1.wins = player1wins.size();
            user1.percentage = (double) player1wins.size() / player1games.size() * 100;
            user1.gameswith1 = player1gameswith2.size();
            user1.winswith1 = player1winswith2.size();
            user1.gameswith2 = player1gameswith3.size();
            user1.winswith2 = player1winswith3.size();

            user2.games = player2games.size();
            user2.wins = player2wins.size();
            user2.percentage = (double) player2wins.size() / player2games.size() * 100;
            user2.gameswith1 = player2gameswith3.size();
            user2.winswith1 = player2winswith3.size();
            user2.gameswith2 = player2gameswith1.size();
            user2.winswith2 = player2winswith1.size();

            user3.games = player3games.size();
            user3.wins = player3wins.size();
            user3.percentage = (double) player3wins.size() / player3games.size() * 100;
            user3.gameswith1 = player3gameswith1.size();
            user3.winswith1 = player3winswith1.size();
            user3.gameswith2 = player3gameswith2.size();
            user3.winswith2 = player3winswith2.size();

            int teampercentage = (int) Math.round((user1.percentage + user2.percentage + user3.percentage) / 3);

            System.out.println("Custom Team Statistics:\nTeam Win Probability " + teampercentage + "%\n(Retrieved from raw percentages, not the rounded/displayed ones, so may look off when doing the math yourself)");
            if (user1.gameswith1 > 0) {
                //user1 x user2
                System.out.println("\n" + user1.name + " & " + user2.name + " have some chemistry\nThey have played a total of " + user1.gameswith1 + " Game(s) together,\n" + user1.winswith1 + " of which they won");
            }
            if (user1.gameswith2 > 0) {
                //user1 x user3
                System.out.println("\n" + user1.name + " & " + user3.name + " have some chemistry\nThey have played a total of " + user1.gameswith2 + " Game(s) together,\n" + user1.winswith2 + " of which they won");
            }
            if (user2.gameswith1 > 0) {
                //user2 x user3
                System.out.println("\n" + user2.name + " & " + user3.name + " have some chemistry\nThey have played a total of " + user2.gameswith1 + " Game(s) together,\n" + user2.winswith1 + " of which they won");
            }

            User[] users = {user1, user2, user3};

            displayIndividuals(users);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}