/**
 * Project Name:DesignPatternCode File Name:Espresso.java Package Name:decorator.sinbak Date:2017年7月18日下午4:24:18 Copyright (c) 2017,
 * chenzhou1025@126.com All Rights Reserved.
 */
package decorator.starbuzz;

/** 
 * Description: 
 *
 * Date:2017年7月18日下午4:24:18 
 * Copyright (c) 2017, yuanqi@beyondsoft.com All Rights Reserved.
 * 
 * @author yuanqi 
 * @version  
 * @since JDK 1.7
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
