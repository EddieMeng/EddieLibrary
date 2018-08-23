package cn.beauty.designpattern.proxyPattern;

/**
 * Created by Simon Meng on 2017/11/28.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}
