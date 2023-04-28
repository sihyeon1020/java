package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest3_insert2 {
	public static void main(String[] args) {
		// 1.몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1.몽고db 프로그램에 연결 성공");
		
		// 2.shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2.shop db 연결 성공");
		
		// 3.member 컬렉션에 연결
		MongoCollection<org.bson.Document> collection = database.getCollection("memo");
		System.out.println("3.memo 컬렉션에 연결 성공");
		
		Document doc = new Document();
		doc.append("name", "song2");
		doc.append("age", 501);
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		Document doc2 = new Document();
		doc2.append("name", "song3");
		doc2.append("age", 502);
		doc2.append("office", "seoul");
		doc2.append("phone", "011");
		
		Document doc3 = new Document();
		doc3.append("name", "song4");
		doc3.append("age", 503);
		doc3.append("office", "busan");
		doc3.append("phone", "011");
		
		List<Document> list = new ArrayList<Document>();
		list.add(doc);
		list.add(doc2);
		list.add(doc3);
		
		collection.insertMany(list);
		System.out.println("4.insertmany 성공");
	}
}
