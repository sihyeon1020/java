package com.multi.mongoDB;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_insert2 {
	public static void main(String[] args) {
		// 1.몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1.몽고db 프로그램에 연결 성공");

		// 2.shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2.shop db 연결 성공");

		// 3.member 컬렉션에 연결
		MongoCollection<org.bson.Document> collection = database.getCollection("member");
		System.out.println("3.member 컬렉션에 연결 성공");

		//java코드에서 자동import
		//ctrl + shift + o
		
		Document doc = new Document();
		Scanner sc = new Scanner(System.in);
		// 자바프로그램 <--연결설정(강물, 스트림)----- 콘솔
		System.out.print("id입력>>");
		String id = sc.next();
		System.out.print("pw입력>>");
		String pw = sc.next();
		System.out.print("name입력>>");
		String name = sc.next();
		System.out.print("tel입력>>");
		String tel = sc.next();
		sc.close();

		doc.append("id", id);
		doc.append("pw", pw);
		doc.append("name", name);
		doc.append("tel", tel);

		collection.insertOne(doc);
		System.out.println("4.insert one 성공");
	}
}
