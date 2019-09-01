package cn.meng.application.aidl.client;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import cn.meng.application.IAdd;

public class ClientDemo {
    private IAdd mIAdd;
    private Context mContext;

    public void start(Context context) {
        mContext = context;
        initConnection();
    }

    private void initConnection() {
        Looper.loop();
        if (mIAdd == null) {
            Intent intent = new Intent(IAdd.class.getName());
            intent.setAction("service.calc");
            intent.setPackage("cn.meng.application.aidl.server");
            mContext.bindService(intent, mServiceConnection, Service.BIND_AUTO_CREATE);
        }
    }


    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.i("ClientDemo", "onServiceConnected");
            mIAdd = IAdd.Stub.asInterface(service);
            try {
                int result = mIAdd.addNumbers(10, 17);
                Log.i("result", result + "");
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.i("ClientDemo", "onServiceDeisconnected");
            mIAdd = null;
        }
    };






}
