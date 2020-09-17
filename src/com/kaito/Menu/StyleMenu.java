package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.MenuFactory.MenuKind;

public class StyleMenu extends SubMenu {
    public StyleMenu(Menu preMenu, MainMenu mainMenu) {
        super(MenuKind.STYLE_CHOICE, preMenu, mainMenu);
    }

    @Override
    public void display() {
        System.out.println("欢迎来到风格选择菜单");
    }

    @Override
    void choose(String s) {

    }
}
