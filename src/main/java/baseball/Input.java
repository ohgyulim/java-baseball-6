package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public String readInput() {
        String userInput = Console.readLine();
        return userInput;
    }

    public int readUserChoice() {
        return Integer.parseInt(Console.readLine());
    }
}
