package com.zhanghan.app;



public class IosHelper {
	public static final String TABLE_NAME = "t_mapdata";
	public static class Columns {
		public static final String ID = "_id";
		public static final String LOCALMAP_ID = "id";
		public static final String EAST = "east";
		public static final String NORTH = "north";
		public static final String NAME = "name";
		public static final String ADDRESS= "address";
		public static final String PHONE = "phone";
		public static final String CITY = "city";
		public static final String TOWNSHIP = "township";
		public static final String NUM = "num";
		public static final String CONTENT = "content";
		public static final String DATE_ADDED="date_added";
		public static final String EAST_NEW = "east_new";
		public static final String NORTH_NEW = "north_new";
		public static final String DATA_TYPE = "data_type";
		public static final String COM_TYPE = "com_type";
		public static final String NAME_PYZM ="name_pyzm";
		public static final String ADDRESS_PYZM="address_pyzm";
		public static final String ITEM_DESCRIPTION="item_description";
	}

	public static String getCreateSQL() {
		String createString = TABLE_NAME + "( " + Columns.ID
				+ " INTEGER PRIMARY KEY, " 
				+ Columns.LOCALMAP_ID+ " INT, " 
				+ Columns.NAME + " TEXT, " 
				+ Columns.ADDRESS + " TEXT, "
				+ Columns.PHONE + " TEXT, " 
				+ Columns.CITY + " TEXT, " 
				+ Columns.TOWNSHIP + " TEXT, " 
				+ Columns.NUM + " TEXT, " 
				+ Columns.CONTENT + " TEXT, " 
				+ Columns.DATE_ADDED + " TEXT, " 
				+ Columns.EAST + " TEXT, " 
				+ Columns.EAST_NEW + " TEXT, " 
				+ Columns.NORTH + " TEXT, " 
				+ Columns.NORTH_NEW + " TEXT, " 
				+ Columns.NAME_PYZM + " TEXT, " 
				+ Columns.ADDRESS_PYZM + " TEXT, " 
				+ Columns.DATA_TYPE + " TEXT, " 
				+ Columns.COM_TYPE+" TEXT, "
				+ Columns.ITEM_DESCRIPTION + " TEXT );";

		return "CREATE TABLE " + createString;
	}

	
	
	
	
	public static void main(String[] a){
		
//		String s = "issynch,_id,accuracy,bearing,elevation,latitude,longitude,offset_lat,offset_lon,sensor,speed,time,trackid,trackuuid";
//		String ss[] = s.split(",");
//		for(String ts :ss){
//			
//			System.out.println("[trackPoints "+ts+"],");
//			
//		}
//		for(String ts :ss){
//			
//			System.out.print("?,");
//			
//		}
		IosHelper ios = new IosHelper();
		//ios.generateTrack();
		//ios.generateTrackPoints();
	
		System.out.println(ios.getCreateSQL());
		
		ios.genUpdate();
	}
	
	
	
	public void generateTrack(){
		String s = "name,issynch,description,icon,mapid,tableid,_id,avgmovingspeed,avgspeed,category,elevationgain,maxelevation,maxgrade,maxlat,maxlon,maxspeed,minelevation,mingrade,minlat,minlon,numpoints,startid,starttime,stopid,stoptime,totaldistance,totalmovingtime,totaltime";
		String ss[] = s.split(",");
		for(String ts :ss){
			
			//System.out.println("[track "+ts+"],");
			//System.out.println("track."+ts+"=[ret objectForKey:@\""+ts+"\"];");
			System.out.println("currentTrack."+ts+"=;");
			
		}
		for(String ts :ss){
			
			System.out.print("?,");
			
		}
		
		
	}
	
	
	public  void genUpdate(){
		String s="_id,address,address_pyzm,city,com_type,content,data_type,date_added,east,east_new,item_description,name,name_pyzm,north,north_new,num,phone,township"; 
		String ss[] = s.split(",");
		for(String ts :ss){
			
			//System.out.println("[track "+ts+"],");
			//System.out.println("trackpoints."+ts+"=[ret objectForKey:@\""+ts+"\"];");
			//System.out.print("?,");
			//System.out.print(ts+"=?,");
			System.out.println("mapdata."+ts);
		}
		
	}
	
	public void generateTrackPoints(){
		String s = "issynch,_id,accuracy,bearing,elevation,latitude,longitude,offset_lat,offset_lon,sensor,speed,time,trackid,trackuuid";
		String ss[] = s.split(",");
		for(String ts :ss){
			
			//System.out.println("[track "+ts+"],");
			System.out.println("trackpoints."+ts+"=[ret objectForKey:@\""+ts+"\"];");
			
		}
		for(String ts :ss){
			
			System.out.print("?,");
			
		}
		
		
	}
	
}
