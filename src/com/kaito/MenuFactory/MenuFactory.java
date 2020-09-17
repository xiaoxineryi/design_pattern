package com.kaito.MenuFactory;

import com.kaito.Game.Game;
import com.kaito.Menu.*;
import com.sun.tools.javac.Main;

public class MenuFactory {
    static public Menu createMenu(Menu preMenu,MainMenu mainMenu,MenuKind menuKind){
        switch (menuKind){
            case MAIN_MENU:
                return new MainMenu();
            case HARD_MENU:
                return new HardMenu(preMenu,mainMenu);
            case PLAYER_CHOICE:
                return new PlayerMenu(preMenu,mainMenu);
            case STYLE_CHOICE:
                return new StyleMenu(preMenu,mainMenu);
            case HARD_CHOICE:
                return new HardChoiceMenu(preMenu,mainMenu);
            default:
                return null;
        }
    }
}
