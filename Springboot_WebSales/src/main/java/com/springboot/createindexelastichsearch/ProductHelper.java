package com.springboot.createindexelastichsearch;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

public class ProductHelper {

	private static ProductHelper instance;

	private ProductHelper() {
	}

	DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

	public static ProductHelper getInstance() {

		// Chỉ lock khi instance chưa được khởi tạo
		synchronized (ProductHelper.class) {
			if (Objects.isNull(instance)) {
				// Khởi tạo instance chỉ khi instance này được request lần đầu
				instance = new ProductHelper();
			}
		}
		return instance;
	}

	public List<ProductBO> productsAll() {

		java.util.Date date = new java.util.Date();
		List<ProductBO> list = new ArrayList<ProductBO>();
		list.add(new ProductBO(1, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(2, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(3, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(4, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(5, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(6, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(7, "long", "1002.jpg", "1000", "4", date));
		list.add(new ProductBO(8, "long", "1002.jpg", "1000", "4", date));
		
		list.add(new ProductBO(1111, "long", "1002.jpg", "1000", "1", date));
		list.add(new ProductBO(2111, "long", "1002.jpg", "1000", "1", date));
		list.add(new ProductBO(3111, "long", "1002.jpg", "1000", "1", date));
		list.add(new ProductBO(4111, "long", "1002.jpg", "1000", "1", date));
		list.add(new ProductBO(5111, "long", "1002.jpg", "1000", "1", date));
		list.add(new ProductBO(6111, "long", "1002.jpg", "1000", "1", date));
		
		
		list.add(new ProductBO(111, "long", "1002.jpg", "1000", "2", date));
		list.add(new ProductBO(211, "long", "1002.jpg", "1000", "2", date));
		list.add(new ProductBO(311, "long", "1002.jpg", "1000", "2", date));
		list.add(new ProductBO(411, "long", "1002.jpg", "1000", "2", date));
		list.add(new ProductBO(511, "long", "1002.jpg", "1000", "2", date));
		list.add(new ProductBO(611, "long", "1002.jpg", "1000", "2", date));
		
		
		list.add(new ProductBO(11, "long", "1002.jpg", "1000", "3", date));
		list.add(new ProductBO(21, "long", "1002.jpg", "1000", "3", date));
		list.add(new ProductBO(31, "long", "1002.jpg", "1000", "3", date));
		list.add(new ProductBO(41, "long", "1002.jpg", "1000", "3", date));
		list.add(new ProductBO(51, "long", "1002.jpg", "1000", "3", date));
		list.add(new ProductBO(61, "long", "1002.jpg", "1000", "3", date));
		return list;
	}

	public void createIndex(RestHighLevelClient client) {
		List<ProductBO> listProduct = new ArrayList<ProductBO>();
		listProduct = ProductHelper.getInstance().productsAll();
		int count = 0;
		for (ProductBO pro : listProduct) {
			IndexRequest indexRequest = new IndexRequest("product_manage").id(String.valueOf(count)).source("id",
					pro.getId(), "name", pro.getName(), "image", pro.getImage(), "unitPrice", pro.getUnitPrice(),
					"categoryid", pro.getCategoryid(), "productDate", this.formatDate.format(pro.getProductDate()));
			count++;
			try {
				client.index(indexRequest, RequestOptions.DEFAULT);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) throws IOException {
		RestHighLevelClient client = new RestHighLevelClient(
				RestClient.builder(new HttpHost("localhost", 9200, "http"), new HttpHost("127.0.0.1", 9201, "http")));
		ProductHelper.getInstance().createIndex(client);
	}
}
