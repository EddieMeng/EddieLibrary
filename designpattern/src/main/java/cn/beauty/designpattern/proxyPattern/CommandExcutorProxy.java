package cn.beauty.designpattern.proxyPattern;

import java.util.logging.Handler;

/**
 * Created by Simon Meng on 2017/11/28.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class CommandExcutorProxy implements CommandExecutor{
    private boolean mIsAdmin;
    private CommandExecutor mExecutor;
    private static final String ADMIN_NAME = "admin";
    private static final String ADMIN_PASSWORD = "123456";

    public CommandExcutorProxy(String user, String pwd) {
        if (user.equals(ADMIN_NAME) && pwd.equals(ADMIN_PASSWORD)) {
            mIsAdmin = true;
        }
        mExecutor = new CommandExecutorImpl();
    }


    @Override
    public void runCommand(String cmd) throws Exception {
        if (mIsAdmin) {
            mExecutor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users");
            } else {
                mExecutor.runCommand(cmd);
            }
        }
    }


}
