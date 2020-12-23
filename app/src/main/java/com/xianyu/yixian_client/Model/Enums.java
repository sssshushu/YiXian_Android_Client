package com.xianyu.yixian_client.Model;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.xianyu.yixian_client.Model.Room.Convert.User_Active_Convert;

/**
 * @ProjectName: YiXian
 * @Package: com.xianyu.yixian.Model
 * @ClassName: Enums
 * @Description: java类作用描述
 * @Author: Jianxian
 * @CreateDate: 2020/11/23 19:37
 * @UpdateUser: Jianxian
 * @UpdateDate: 2020/11/23 19:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

public class Enums {
    public enum Room_Type { Solo,Team, Battle_Royale};
    public enum Room {  Wait, Raise, Action, Result };
    public enum Power { Human, Monster, Neutral};//所属势力
    public enum Player_Active { Round,Immediate,Map };
    public enum User_Active { Leisure, Ready, Queue, Gaming };
    public enum Race { Human };//种族：人类
    public enum Msg_Client_Type { Information, Game };
    public enum Msg_Server_Type { Information, Game };
}
