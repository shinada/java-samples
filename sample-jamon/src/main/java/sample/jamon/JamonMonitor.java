// Copyright(c) 2005 Isetan Co.,Ltd. and ATL Systems, Incorporated.
//
//
package sample.jamon;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;


public class JamonMonitor {

    public void monitor(int count) {
        Monitor mon = null;
        LoadClass load = new LoadClass();

        for (int i = 0; i <= count; i++) {
            // MonitorFactoryからStartを呼び出し
            mon = MonitorFactory.start("myFirstMonitor");
            load.load();
            // MonitorからStopを呼び出し
            mon.stop();
        }

        System.out.println(mon); // toString() method called
    }
}
