# Hive_UDF
使用方法：
（1）把java程序打包成jar包
（2）hive -e"
add jar hdfs://testFuntion-1.0-SNAPSHOT2.jar;
create temporary function test as 'com.gh.App';
select test(concat_ws(',',room_area)) from test limit 20
"
