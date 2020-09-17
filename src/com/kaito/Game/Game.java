package com.kaito.Game;

import com.kaito.Level.Level;
import com.kaito.Map.MyMap;
import com.kaito.Menu.MainMenu;
import com.kaito.Menu.Menu;
import com.kaito.Player.PLayer;

import java.util.ArrayList;
import java.util.List;


public class Game {

    Menu menu;
    List<MyMap> myMaps;
    Integer tempLevel; //当前关卡等级
    Integer MaxLevel;   // 最大关卡等级
    Level level;
    Integer PlayerNumber=2;
    Integer voice = 50;
    Integer weight = 1024;
    Integer height = 768;
    List<PLayer> players;

    private static class SingletonGame{
        private static final Game INSTANCE = new Game();
    }
    public static final Game getGameInstance(){
        return SingletonGame.INSTANCE;
    }
    private Game(){
        menu = new MainMenu();
        myMaps = new ArrayList<>();
        players = new ArrayList<>();
    }

    public void run(){
        /** 开始游戏  **/

    }

    public void init(){
        menu.display();
        /** 进行选项选择，初始化游戏 **/
    }

    public void createMaps(){
        /** 根据配置创造地图 **/
    }

    public Integer getTempLevel() {
        return tempLevel;
    }

    public void setTempLevel(Integer tempLevel) {
        this.tempLevel = tempLevel;
    }

    public Integer getMaxLevel() {
        return MaxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        MaxLevel = maxLevel;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Integer getPlayerNumber() {
        return PlayerNumber;
    }

    public void setPlayerNumber(Integer playerNumber) {
        PlayerNumber = playerNumber;
    }
}
