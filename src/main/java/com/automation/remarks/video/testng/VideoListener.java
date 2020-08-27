package com.automation.remarks.video.testng;
import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.automation.remarks.video.testng.VideoListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class VideoListener {
	

	@Test
	@Listeners(UniversalVideoListener.class)
	public class TestNgVideoTest {

	    @Video
	    public void shouldFailAndCreateRecordWithTestName() throws InterruptedException {
	        Thread.sleep(1000);
	        assert false;
	    }

	    @Video(name = "second_test")
	    public void videoShouldHaveNameSecondTest() throws InterruptedException{
	        Thread.sleep(1000);
	        assertTrue(false);
	    }
	}
}
