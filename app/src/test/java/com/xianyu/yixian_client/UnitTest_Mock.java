package com.xianyu.yixian_client;


import android.content.Context;
import android.os.Debug;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.room.Room;

import com.xianyu.yixian_client.Model.Log.Log.Tag;
import com.xianyu.yixian_client.Model.RPC.RPCRequestProxy;
import com.xianyu.yixian_client.Model.RPC.Request.IUser;
import com.xianyu.yixian_client.Model.Room.Dao.UserDao;
import com.xianyu.yixian_client.Model.Room.DataBase_Room;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

import javax.inject.Inject;
import javax.xml.validation.Schema;

import io.reactivex.Scheduler;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class UnitTest_Mock {
    @Mock
    Context mockContext;
    @Mock
    AppCompatActivity activity;
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Before
    public void Create_Database(){

    }
    @Test
    public void Database(){

        List mockedList = mock(List.class);


        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
    public class User implements IUser{
        @Override
        public String hello(String msg) {
            return "null";
        }

        @Override
        public String add(int d) {
            return null;
        }
    }
    @Test
    public void proxy(){
        RPCRequestProxy proxy = new RPCRequestProxy();
        Class<?>[] d =  User.class.getInterfaces();
        IUser user = (IUser) Proxy.newProxyInstance(User.class.getClassLoader(), d, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
        System.out.println(user.hello("asd"));
    }


    @After
    public void closeDb() throws IOException {

    }
}