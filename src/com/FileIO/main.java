package com.FileIO;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
//        遍历系统盘
//        File[] files =  File.listRoots();
//        System.out.println(Arrays.toString(files));


//        遍历E盘
//        File file = new File("E:\\");
//        String[] arr = file.list();
//        for (String s:arr){
//            System.out.println(s);
//        }


//        打印e盘的所有pdf文件
//        File file = new File("E:\\");
//        File[] files = file.listFiles();
//        for (File f:files){
//            if (f.isFile()&&f.getName().endsWith(".pdf")){
//                System.out.println(f);
//            }
//        }


//        扫描全盘的pdf文件
//        FindPDF();
//    }
//    private static void FindPDF(){
//        获取本地所有盘符
//        File[] files = File.listRoots();
//        for (File file : files){
//            FindPDF(file);
//        }
//    }
//    private static void FindPDF(File f){
//        进入文件夹，遍历里面的所有文件和文件夹
//        File[] files = f.listFiles();
//        if (files!=null){
//              如果是文件则执行业务逻辑，如果不是就递归
//            for (File file : files){
//                String fileName = file.getName();
//                if (fileName.endsWith(".txt")){
//                    System.out.println(file);
//                }else {
//                    FindPDF(file);
//                }
//            }
//        }


//        文件拷贝
//        long t1=  System.currentTimeMillis();
//        File file1 = new File("E:\\简历.pdf");
//        File file2 = new File("E:\\简历2223.pdf");
//        FileInputStream fis = new FileInputStream(file1);
//        FileOutputStream fos = new FileOutputStream(file2);
//        int x;
//        byte[] bytes = new byte[1024*1024*5];//每次读取5M字节的数据
//        while ((x=fis.read(bytes))!=-1){
//            fos.write(bytes,0,x);//读到多少写多少
//        }
//        fos.close();
//        fis.close();
//        long t2=  System.currentTimeMillis();
//        System.out.println(t2-t1);

//        FileReader读取文本文件
//        File file = new File("E:\\a.txt");
//        FileReader fileReader = new FileReader(file);
//        int ch;
//        while ((ch=fileReader.read())!=-1){
//            System.out.print((char) ch);
//        }


//                FileReader读取文本文件(read带参)
//        File file = new File("E:\\a.txt");
//        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[2];
//        int len;
//        while ((len=fileReader.read(chars))!=-1){
//            System.out.print(new String(chars,0,len));
//        }
        File file = new File("E:\\a.txt");

    }
}
