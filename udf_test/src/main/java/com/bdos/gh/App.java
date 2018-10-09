package com.bdos.gh;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

/**
 * Hello world!
 */
public class App extends UDF {


     public String evaluate(String data) {

          String returnData = "";

          if (data == null) {
               returnData = "null";
          }

          String [] split = data.split(",");

          for (int i = 0; i < split.length; i++) {

               if (Pattern.matches(".*qqq;;;.*qqq;;;.*", split[i])) {
                    returnData += split[i] + "\n";
               }
          }

          return returnData;

     }

     public static void main(String[] args) {
          App app = new App();
//          String[] arr = new String[8];
//          arr[0] = "cognitive_channels@@@@户外";
//          arr[1] = "张家港云樾兰庭qqq;;;cognitive_channels@@@@网络";
//          arr[2] = "沪苏区域qqq;;;张家港云樾兰庭qqq;;;cognitive_channels@@@@网络";
//          arr[3] = "cognitive_channels@@@@网络";
//          arr[4] = "沪苏区域qqq;;;cognitive_channels@@@@户外";
//          arr[5] = "沪苏区域qqq;;;cognitive_channels@@@@网络";
//          arr[6] = "沪苏区域qqq;;;张家港碧桂园翡翠湾qqq;;;cognitive_channels@@@@户外";
//          arr[7] = "张家港碧桂园翡翠湾qqq;;;cognitive_channels@@@@户外";

          String data = "邵阳碧桂园宝庆府qqq;;;cognitive_channels@@@@街头派单,湖南区域qqq;;;邵阳碧桂园宝庆府qqq;;;cognitive_channels@@@@街头派单,湖南区域qqq;;;cognitive_channels@@@@街头派单,cognitive_channels@@@@街头派单";

          String result = app.evaluate(data);
          System.out.println(result);
     }
}
