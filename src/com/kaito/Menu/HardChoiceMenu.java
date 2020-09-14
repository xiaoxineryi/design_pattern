package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.Level.Level;
import com.kaito.MenuFactory.MenuKind;

import java.util.Scanner;

public class HardChoiceMenu extends SubMenu {

    public HardChoiceMenu(Game game,  Menu preMenu, MainMenu mainMenu) {
        super(game, MenuKind.HARD_CHOICE, preMenu, mainMenu);
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("请选择游戏难度");
        System.out.println("1.简单");
        System.out.println("2.中等");
        System.out.println("3.困难");
        System.out.println("4.返回上级界面");
        System.out.println("5.返回主菜单");
        String choice = scanner.next();
        choose(choice);

    }
    private void setHard(String hard) {
        switch (hard){
            case "1":
                game.setLevel(Level.EASY);
                break;
            case "2":
                game.setLevel(Level.MIDDLE);
                break;
            case "3":
                game.setLevel(Level.HARD);
                break;
        }
    }
    @Override
    void choose(String s) {
        switch (s){
            case "4":
                preMenu.display();
                return;
            case "5":
                mainMenu.display();
                return;
            default:
                setHard(s);
                mainMenu.display();

        }
    }
}
