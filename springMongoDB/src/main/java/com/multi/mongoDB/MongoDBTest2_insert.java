package com.multi.mongoDB;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_insert {
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
		
		Document doc = new Document();
		doc.append("id", "apple");
		doc.append("pw", "apple");
		doc.append("name", "apple");
		doc.append("tel", "apple");
		
		collection.insertOne(doc);
		System.out.println("4.insert one 성공");
	}
}
