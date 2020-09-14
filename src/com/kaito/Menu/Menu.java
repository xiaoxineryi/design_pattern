package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.MenuFactory.MenuFactory;
import com.kaito.MenuFactory.MenuKind;

import java.util.ArrayList;
import java.util.List;

/**
 *  菜单的设计，应该需要有返回主菜单和上级菜单，因此，不能每次都new新的菜单
 *  而是每个菜单都需要保存自己名下的不同类型的子菜单，从而维护一个对于一局游戏来说的一个菜单树
 */
abstract public class Menu {
    Game game;
    MainMenu mainMenu;
    MenuKind menuKind;
    List<Menu> subMenus = new ArrayList<>();
    public Menu(Game game,MenuKind menuKind) {
        this.game = game;
        this.menuKind = menuKind;
    }

    public abstract void display();

    abstract void choose(String s);

    protected Menu getChoiceMenu(MenuKind menuKind){
        // 如果要访问的目录在自己的list中，直接返回，否则就新建一个保存到list中
        for (Menu menu:subMenus) {
            if(menu.menuKind==menuKind){
                return menu;
            }
        }
        Menu m = MenuFactory.createMenu(game,this,mainMenu,menuKind);
        subMenus.add(m);
        return m;
    }
}
