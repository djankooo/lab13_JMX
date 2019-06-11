package jmx;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXLauncher {

    public static void main(String[] args) throws Exception {

        ObjectName objectName = null;
        try {
            objectName = new ObjectName("jmx:type=basic,name=remote");
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        }
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        Remote remoteObject = new Remote();


        try {
            server.registerMBean(remoteObject, objectName);
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) { }
    }

}
