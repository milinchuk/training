package factory.method;

import java.sql.*;

/**
 * Created by click on 11/28/2016.
 */
public class ConcreteConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("connect");
    }

    @Override
    public void execute(Object o) {
        System.out.println("execute "  + o.toString());
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
