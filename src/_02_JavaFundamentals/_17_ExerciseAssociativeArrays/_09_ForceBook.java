package _02_JavaFundamentals._17_ExerciseAssociativeArrays;

import java.util.*;

public class _09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> teamsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Lumpawaroo".equals(input)) {

            if (input.contains(" | ")) {
                String team = input.split("\\|")[0];
                String player = input.split("\\|")[1];

                if (!teamsMap.containsKey(team)) {
                    teamsMap.put(team, new ArrayList<>());
                }

                boolean isExist = false;
                for (List<String> list : teamsMap.values()) {
                    if (list.contains(player))
                        isExist = true;
                    break;
                }
                if (!isExist) {
                    teamsMap.get(team).add(player);
                }

            } else if (input.contains(" -> ")) {
                String team = input.split(" -> ")[0];
                String player = input.split(" -> ")[1];

                teamsMap.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));

                if (!teamsMap.containsKey(team)) {
                    teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(teamsMap).add(player);
                } else {
                    teamsMap.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);
            }

            input = scanner.nextLine();
        }

        teamsMap.entrySet().stream().filter(teamEntry -> !teamEntry.getValue().isEmpty())
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
