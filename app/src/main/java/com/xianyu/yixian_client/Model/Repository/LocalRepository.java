package com.xianyu.yixian_client.Model.Repository;

import com.xianyu.yixian_client.Model.Room.DataBase_Room;
import com.xianyu.yixian_client.Model.Room.Entity.User;
import java.util.List;
import io.reactivex.Single;


/**
 * @ProjectName: YiXian_Client
 * @Package: com.xianyu.yixian_client.Model.RemoteRepository
 * @ClassName: LocalRepository
 * @Description: java类作用描述
 * @Author: Jianxian
 * @CreateDate: 2020/12/19 23:01
 * @UpdateUser: Jianxian
 * @UpdateDate: 2020/12/19 23:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LocalRepository implements ILocalRepository{
    private DataBase_Room db;

    public LocalRepository(DataBase_Room db){
        this.db = db;
    }

    public void addUser(User arg) {
        db.userDao().insert(arg);
    }

    public Single<List<User>> queryUsers() {
        return db.userDao().queryUsers();
    }


}
