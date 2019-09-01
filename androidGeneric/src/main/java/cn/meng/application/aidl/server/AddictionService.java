package cn.meng.application.aidl.server;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

import cn.meng.application.IAdd;


public class AddictionService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }


    private final IAdd.Stub mBinder = new IAdd.Stub() {
        @Override
        public int addNumbers(int number1, int number2) throws RemoteException {
            return number1 + number2;
        }

        @Override
        public void placeCall(String number) throws RemoteException {

        }
    };





}
