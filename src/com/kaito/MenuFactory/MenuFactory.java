package com.kaito.MenuFactory;

import com.kaito.Game.Game;
import com.kaito.Menu.*;
import com.sun.tools.javac.Main;

public class MenuFactory {
    static public Menu createMenu(Game game,Menu preMenu,MainMenu mainMenu,MenuKind menuKind){
        switch (menuKind){
            case MAIN_MENU:
                return new MainMenu(game);
            case HARD_MENU:
                return new HardMenu(game,preMenu,mainMenu);
            case PLAYER_CHOICE:
                return new PlayerMenu(game,preMenu,mainMenu);
            case STYLE_CHOICE:
                return new StyleMenu(game,preMenu,mainMenu);
            case HARD_CHOICE:
                return new HardChoiceMenu(game,preMenu,mainMenu);
            default:
                return null;
        }
    }
}
