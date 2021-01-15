package com.xianyu.yixian_client.Model.Room.Entity;

import java.sql.Date;

public class History {
    int kills = 0;
    boolean result = false;
    int time = 0;
    int battle = 0;

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getTime(){ return time;}

    public  int getBattle(){ return battle;}


    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public History(int kills, boolean result) {
        this.kills = kills;
        this.result = result;
    }
}
