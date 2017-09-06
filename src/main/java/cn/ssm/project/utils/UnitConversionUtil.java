package cn.ssm.project.utils;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
public class UnitConversionUtil{

    public static Double unitConversion(Double num, String before, String after) {
        if (num == 0 || num == null) {
            return 0.0;
        } else if ("cm".equalsIgnoreCase(before) && "in".equalsIgnoreCase(after)) {
            return num / 2.54;
        } else if ("lb".equalsIgnoreCase(before) && "oz".equalsIgnoreCase(after)) {
            return num * 453.59237 / 28.3495231;
        } else if ("g".equalsIgnoreCase(before) && "lb".equalsIgnoreCase(after)) {
            return num / 453.59237;
        } else {
            return num;
        }
    }
}
