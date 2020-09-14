package com.kaito.Menu;

import com.kaito.Game.Game;
import com.kaito.MenuFactory.MenuKind;

import java.util.Scanner;

public class MainMenu  extends Menu{
    public MainMenu(Game game){
        super(game,MenuKind.MAIN_MENU);
        this.mainMenu = this;
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("欢迎进入主菜单");
        System.out.println("1.进入难度选择界面");
        System.out.println("2.进入人物选择界面");
        System.out.println("3.进入风格选择界面");
        System.out.println("4.退出");

        String choice = scanner.next();
        choose(choice);
    }

    @Override
    void choose(String s) {
        Menu menu = null;
        switch (s){
            case "1":
                menu = getChoiceMenu(MenuKind.HARD_MENU);
                break;
            case "2":
                menu = getChoiceMenu(MenuKind.PLAYER_CHOICE);
                break;
            case "3":
                menu = getChoiceMenu(MenuKind.STYLE_CHOICE);
                break;
            case "4":
                return ;
        }
        menu.display();
    }
}
