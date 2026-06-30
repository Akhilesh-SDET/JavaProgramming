package interviewBasedJavaProgramming;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pratice.MyListener;
import Pratice.RetryAnalyzer;

import org.testng.Assert;

@Listeners(MyListener.class)
public class General007_DataProvider {

	@Test(dataProvider = "dataProvider1")
	public void loginTest(String s1,String s2) {
		System.out.println(s1+"--------------------"+s2);
		Assert.assertNotEquals(s1,s2);
	}

	
	@DataProvider(name="dataProvider1")
	public Object[][] getData(){
		
		return new Object[][] {
			{"Name","Akhilesh"},
			{"designation","QA"},
			{"id","101"}
		};
	}
//	
//-----------------------------------------------------------------------------------------------	
//	@Test(dataProvider ="secondData",retryAnalyzer = RetryAnalyzer.class )
//	public void logoutTest(String s1,String s2) {
//		System.out.println(s1+"---------------------------------"+s2);
//		//Assert.assertEquals(s1, s2);
//		
//	}
//	
//	@DataProvider(name="secondData")
//	public Object[][] logoutData(){
//		return new Object[][] {
//			{"name","Akhilesh"}
//		};
//	}
	
}
