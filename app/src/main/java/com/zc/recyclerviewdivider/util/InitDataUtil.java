package com.zc.recyclerviewdivider.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zc on 2018/9/4.
 */

public class InitDataUtil {

    public static List<Integer> getFData(){
        List<Integer> mData = new ArrayList<>();
        for (int i = 0;i<29;i++){
            mData.add(i);
        }
        return mData;
    }

}
