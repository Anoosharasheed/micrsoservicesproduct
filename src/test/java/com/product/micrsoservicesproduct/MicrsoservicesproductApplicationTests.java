package com.product.micrsoservicesproduct;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class MicrsoservicesproductApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testId(){
		Product cut = new Product();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}

	@Test
	void testCardName(){
		Product cut = new Product();
		String name = "Title";
		cut.setProdName(name);
		assertEquals(name, cut.getProdName());
	}
	@Test
	void testCardImage(){
		Product cut = new Product();
		String Image = "Title";
		cut.setProdImg(Image);
		assertEquals(Image, cut.getProdImg());
	}
	@Test
	void testproductQuantity(){
		Product cut = new Product();
		Long prodQuantity = 345L;
		cut.setProdQuantity(prodQuantity);
		assertEquals(prodQuantity, cut.getProdQuantity());
	}
	@Test
	void testproductPrice(){
		Product cut = new Product();
		Long prodPrice = 345L;
		cut.setProdPrice(prodPrice);
		assertEquals(prodPrice, cut.getProdPrice());
	}
	@Test
	void testTotalPrice(){
		Product cut = new Product();
		Long prodTotalPrice = 345L;
		cut.setProdTotalPrice(prodTotalPrice);
		assertEquals(prodTotalPrice, cut.getProdTotalPrice());
	}



}
