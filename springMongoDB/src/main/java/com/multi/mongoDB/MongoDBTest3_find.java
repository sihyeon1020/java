package com.multi.mongoDB;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest3_find {
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
	
		FindIterable<Document> list = collection.find(); //컬렉션에서 찾아 list에 넣어라( 데이터베이스>컬렉션>도큐멘트 )
		ArrayList<MemoVO> result = new ArrayList<MemoVO>(); //list를 모아줄 컨테이너 역할
		for (Document document : list) { //list에서 document를 찾는 동안
			MemoVO bag = new MemoVO(); //가방에 넣어라, document에서의 값을
			bag.setName(document.getString("name"));
			bag.setAge(document.getInteger("age"));
			bag.setOffice(document.getString("office"));
			bag.setPhone(document.getString("phone"));
			result.add(bag); //꺼낸 결과들을 result에 넣어라
		}
		System.out.println(result);
	}
}
