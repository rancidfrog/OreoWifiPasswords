package com.pithsoftware.wifipasswords.recycler;

import com.pithsoftware.wifipasswords.pojo.WifiEntry;

import java.util.ArrayList;

public interface WifiListLoadedListener {

    public void onWifiListLoaded(ArrayList<WifiEntry> listWifi, int numOfEntries, boolean resetDB);

}
