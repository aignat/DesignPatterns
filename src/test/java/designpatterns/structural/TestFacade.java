package designpatterns.structural;

import designpatterns.structural.facade.ScheduleServer;
import designpatterns.structural.facade.ScheduleServerFacade;
import org.junit.Test;

public class TestFacade {

	@Test
	public void testBefore() {
		ScheduleServer scheduleServer = new ScheduleServer();

		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();

		System.out.println("Start working......");
		System.out.println("After work done.........");

		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
	}

	@Test
	public void testAfter() {
		
		ScheduleServer scheduleServer = new ScheduleServer();
		ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);
		facadeServer.startServer();
		
		System.out.println("Start working......");
		System.out.println("After work done.........");
		
		facadeServer.stopServer();
	}

}
