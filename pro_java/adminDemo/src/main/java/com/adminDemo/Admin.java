package com.adminDemo;

public class Admin {

	
	 private int pid;
	    private String packageName;
	    private String eventPackageName;
	    private String price;
	    private String accessPW;
		public Admin(int pid, String packageName, String eventPackageName, String price, String accessPW) {
			super();
			this.pid = pid;
			this.packageName = packageName;
			this.eventPackageName = eventPackageName;
			this.price = price;
			this.accessPW = accessPW;
		}
		public int getPid() {
			return pid;
		}
	
		public String getPackageName() {
			return packageName;
		}
	
		public String getEventPackageName() {
			return eventPackageName;
		}
	
		public String getPrice() {
			return price;
		}
		
		public String getAccessPW() {
			return accessPW;
		}
		
	  
}
