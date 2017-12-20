使用说明：
1.在网上下载opencv的开源包，导入eclipse中
2.在face++官网注册账户并下载其开发包，导入eclipse中
3.将facetest中的所有"api_key"和"api_secret"替换为之前注册face++时得到的"api_key"和"api_secret"
4.该工程代码运行步骤为：
1.先通过多次运行facedetect.java文件（记得每次将File的地址改为要上传的照片的地址）将照片上传至face++，注意记录每次上传的得到的照片返回值中的token值以及该照片对应的人到find的二维数组中
2.通过运行faceset.java文件（记得修改"face_tokens"后的值为之前上传照片的值）将之前上传的照片组成一个图片集，记录返回的faceset_token值，并用其替换facesearch.java中的faceset_token值
3.运行camerabasic.java文件调用摄像头进行拍照，即可得到控制台的返回判断

其他：
在建立完图片集后，若想向图片集中再添加新的已上传图片，可以通过运行facesetadd.java（将"face_tokens"改为该图片的token值，将"faceset_token"改为该图片集的faceset_token值）来实现