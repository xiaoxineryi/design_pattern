package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.MenuFactory.MenuKind;

// 子菜单，多了一个之前的菜单选择
abstract public class SubMenu extends Menu {
    Menu preMenu;
    public SubMenu(Game game, MenuKind menuKind,Menu preMenu,MainMenu mainMenu) {
        super(game,menuKind);
        this.preMenu = preMenu;
        this.mainMenu = mainMenu;
    }
}
