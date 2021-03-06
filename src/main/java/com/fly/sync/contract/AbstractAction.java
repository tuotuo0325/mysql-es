package com.fly.sync.contract;

import java.io.Serializable;

public interface AbstractAction extends Serializable {

    void execute(DbFactory dbFactory);
    String getGroup();
}
