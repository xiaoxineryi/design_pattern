package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.MenuFactory.MenuKind;

import java.util.Scanner;

public class PlayerMenu extends SubMenu {

    public PlayerMenu(Game game,Menu preMenu, MainMenu mainMenu) {
        super(game, MenuKind.PLAYER_CHOICE, preMenu, mainMenu);
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("欢迎进入角色选择菜单");
        System.out.println("1.选择用户数目");
        System.out.println("2.选择用户类型");
        System.out.println("3.返回上级页面");
        System.out.println("4.返回主页面");
        String choice = scanner.next();
        choose(choice);
    }

    @Override
    void choose(String s) {
        switch (s){
            case "1":
            case "2":
            case "3":
                preMenu.display();
                break;
            case "4":
                mainMenu.display();

        }
    }
}
