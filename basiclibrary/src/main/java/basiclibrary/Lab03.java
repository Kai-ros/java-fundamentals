package basiclibrary;

import java.util.*;

public class Lab03 {

    public static String hashSet(int[][] averageTemperaturesArray) {

        // Create hash set.
        HashSet<Integer> temperatureHash = new HashSet<>();

        // Add elements to the hash set.
        for (int[] innerArrays : averageTemperaturesArray) {
            for (int temperatures : innerArrays) {
                temperatureHash.add(temperatures);
            }
        }

        // Create output string.
        StringBuilder outputMessage =new StringBuilder();

        // Account for empty data set.
        if (temperatureHash.isEmpty())
            return "0";

        // Find high and low for data set.
        int highTemp = Collections.max(temperatureHash);
        int lowTemp = Collections.min(temperatureHash);


        // Append necessary data to string.
        outputMessage.append("High: ").append(highTemp).append("\n");
        outputMessage.append("Low: ").append(lowTemp).append("\n");

        for ( int i = lowTemp; i < highTemp; i++) {
            if (!temperatureHash.contains(i)) outputMessage.append("Never saw temperature: ").append(i).append("\n");
        }
        return outputMessage.toString();
    }

    public static String tally(List<String> votesList) {

        int numberOfVotes = 0;
        String winner = null;
        StringBuilder outputMessage =new StringBuilder();

        // Account for empty data set.
        if (votesList.isEmpty())
            return "0";

        for ( String name : votesList) {
            // Count the incidence of the name in the List.
            int voteCount = Collections.frequency(votesList, name);

            if (numberOfVotes < voteCount) {
                numberOfVotes = voteCount;
                winner = name;
            }

        }
        outputMessage.append(winner).append(" received the most votes!");

        return outputMessage.toString();
    }

}


// Learning Resources:
// https://www.baeldung.com/java-hashset
// https://www.javatpoint.com/collections-in-java
// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
// https://www.javatpoint.com/StringBuilder-class