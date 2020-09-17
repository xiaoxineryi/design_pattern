package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.Level.Level;
import com.kaito.MenuFactory.MenuFactory;
import com.kaito.MenuFactory.MenuKind;

import java.util.Scanner;

public class HardMenu extends SubMenu {
    public HardMenu(Menu preMenu,MainMenu mainMenu){
        super(MenuKind.HARD_MENU,preMenu,mainMenu);
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("欢迎进入难度选择界面");
        System.out.println("1.选择难度");
        System.out.println("2.返回上级界面");
        System.out.println("3.返回主菜单");
        String in = scanner.next();
        choose(in);
    }

    @Override
    void choose(String s) {
        switch (s){
            case "1":
                Menu m = MenuFactory.createMenu(this,mainMenu,MenuKind.HARD_CHOICE);
                m.display();
                return ;
            case "2":
                preMenu.display();
                return ;
            case "3":
                mainMenu.display();
                return ;
        }
    }

}
