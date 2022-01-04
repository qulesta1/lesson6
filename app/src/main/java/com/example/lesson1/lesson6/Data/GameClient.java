package com.example.lesson1.lesson6.Data;

import java.util.ArrayList;
import java.util.List;

public class GameClient {
    public static ArrayList<GameModel> gamelist = new ArrayList<>();
    public static ArrayList<GameModel> getGameList () {
    gamelist.add(new GameModel("One","Сколько лет Владимиру Путину?",
            "89","100","66","69","69"));
    gamelist.add(new GameModel("Two","Сколько мне лет?",
            "14","13","16","17","17"));
    gamelist.add(new GameModel("Three","Где я учусь?",
            "В школе","Дома","На улице","В Гиктек","В Гиктек"));
    gamelist.add(new GameModel("Four","Кого я люблю?",
            "Маму","Папу","Сестру","Никого","Никого"));
    gamelist.add(new GameModel("Five","Кого любит Эндрю Гарфилд?",
            "Никого","Тома","Зендая","Эмджей","Эмджей"));
    return gamelist;
    }
}
