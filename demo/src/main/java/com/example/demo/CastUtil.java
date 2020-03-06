package com.example.demo;

/**
 * 转型操作工具类
 * @author wanglu
 */
public final class CastUtil {

    /**
     * 转为 String 型
     *
     * @param obj
     * @return
     */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为 String 型 (提供默认值)
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }


//    /**
//     * 转为double 型
//     * @param obj
//     * @return
//     */
//    public static double castDouble(Object obj){
//        return CastUtil.castDouble(obj, 0);
//    }


//    /**
//     * 转为double 型 (提供默认值)
//     * @param obj
//     * @param defaultValue
//     * @return
//     */
//    public static double castDouble(Object obj, double defaultValue) {
//        double doubleValue = defaultValue;
//        if(obj != null){
//            String strValue = castString(obj);
//            if(StringUtil.isNotEmpty(strValue)){
//                try {
//                    doubleValue = Double.parseDouble(strValue);
//                }catch (NumberFormatException e){
//                    doubleValue = defaultValue;
//                }
//            }
//        }
//        return doubleValue;
//    }


//    /**
//     * 转为int 型
//     * @param obj
//     * @return
//     */
//    public static int castInt(Object obj) {
//        return castInt(obj,0);
//    }

//    /**
//     * 转为int 型 (提供默认值)
//     * @param obj
//     * @param defaultValue
//     * @return
//     */
//    public static int castInt(Object obj, int defaultValue) {
//        int intValue = defaultValue;
//        if(obj != null){
//            String strValue = castString(obj);
//            if(StringUtil.isNotEmpty(strValue)){
//                try {
//                    intValue = Integer.parseInt(strValue);
//                }catch (NumberFormatException e){
//                    intValue = defaultValue;
//                }
//            }
//        }
//        return intValue;
//    }


//    /**
//     * 转为long 型
//     * @param obj
//     * @return
//     */
//    public static long castLong(Object obj) {
//        return castLong(obj,0);
//    }

//    /**
//     * 转为long 型 (提供默认值)
//     * @param obj
//     * @param defaultValue
//     * @return
//     */
//    public static long castLong(Object obj, long defaultValue) {
//        long longValue = defaultValue;
//        if(obj != null){
//            String strValue = castString(obj);
//            if(StringUtil.isNotEmpty(strValue)){
//                try {
//                    longValue = Long.parseLong(strValue);
//                }catch (NumberFormatException e){
//                    longValue = defaultValue;
//                }
//            }
//        }
//        return longValue;
//    }



    /**
     * 转为Boolean 型
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj){
        return castBoolean(obj,false);
    }

    /**
     * 转为Boolean 型 (提供默认值)
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castBoolean(Object obj, boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(obj != null){
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }





}
