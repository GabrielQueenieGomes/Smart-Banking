package com.test.run2;

public class PageObjectModel {
private String appLink = ("https://www.demoblaze.com/");
private String productName = ("//*[@class='card-block']//h4");
private String productPrice = ("//*[@class='card-block']//h5");

public String getAppLink() {
	return appLink;
}
public String getProductName() {
	return productName;
}
public String getProductPrice() {
	return productPrice;
}

}
