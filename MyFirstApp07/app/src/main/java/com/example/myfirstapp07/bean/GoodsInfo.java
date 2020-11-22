package com.example.myfirstapp07.bean;

import com.example.myfirstapp07.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone 12", "HUAWEI P40 Pro", "小米10 至尊纪念版", "OPPO Find X2", "vivo X50", "魅族17 Pro", "Redmi 10X", "Redmi K30",
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 (A2404) 128GB 蓝色 支持移动联通电信5G",
            "华为 HUAWEI P40 Pro  8GB+256GB晨曦金全网通5G手机",
            "小米10 至尊纪念版 双模5G 骁龙865 120HZ高刷新率 120W快充 12GB+256GB",
            "OPPO Find X2 120Hz超感屏 3K分辨率  8GB+128GB夜海 双模5G手机",
            "vivo X50 5G手机 8+128GB 超感光夜摄 后置4800W像素  双模5G全网通手机",
            "魅族17 Pro 8GB+128GB  骁龙865 旗舰5G手机 27W无线充 6400W后置主摄 90Hz屏幕",
            "Redmi 10X 4G Helio G85游戏芯 4800万超清四摄 5020mAh大电量  128GB大存储 4GB+128GB",
            "Redmi K30 王一博同款 120Hz流速屏 前置挖孔双摄  4500mAh超长续航 27W快充 6GB+128GB  小米 红米"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6799, 6488, 5999, 4499, 3298, 4299,999,1399};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.huawei_s, R.drawable.xiaomi_s,
            R.drawable.oppo_s, R.drawable.vivo_s, R.drawable.meizu_s,
            R.drawable.redim_s, R.drawable.redims_s};
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.huawei, R.drawable.xiaomi,
            R.drawable.oppo, R.drawable.vivo, R.drawable.meizu, R.drawable.redim, R.drawable.redims
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
