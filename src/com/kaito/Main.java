package com.kaito;

import com.kaito.Game.Game;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getGameInstance();
        game.init();
    }
}
