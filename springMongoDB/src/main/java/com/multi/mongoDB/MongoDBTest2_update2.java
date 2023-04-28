package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_update2 {
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
		
		//update할 조건은 json(document로 만들어주세요.)
		Document filter = new Document();
		filter.append("id", "friday");
		
		//update할 내용은 bson(json)를 만들어주세요.
		Bson set = Updates.set("name", "winwinwin"); //json으로 바꿀 부분을 따로따로 만들어줘야함 
		Bson set2 = Updates.set("tel", "win10");
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		
		Bson setts = Updates.combine(list); //bson으로 만들어주자
		
		collection.updateMany(filter, setts); //만든 bson 값 넣기
		System.out.println("4.member 컬렉션에 업데이트 성공");
	}
}
