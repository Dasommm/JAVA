package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class testTime {

	public static void main(String[] args) {
		
		//현재 시간 잡아서 조회할 시간 리턴해주기
		System.out.println("조회할시간"+timeCal());
		
		//현재 날짜 format에 맞게 리턴해주기
		System.out.println("현재날짜"+dateCal());
	}
	
	private static String timeCal() {
		
	Calendar cal = Calendar.getInstance();
	
	// date, time, nx, ny => 20200227 1700 60 120 형식
	
	SimpleDateFormat timeFmt = new SimpleDateFormat("HH");		
	//현재시간 구하기
	String nowTime = timeFmt.format(cal.getTime());
	
	System.out.println("현재시간"+nowTime);

	
	//동네예보
	//- Base_time : 0200, 0500, 0800, 1100, 1400, 1700, 2000, 2300 (1일 8회)
	// base_time의 4시간 후의 날씨를 알려준다
	// 1700시가 입력된다면 2100의 상태를 알려줌
	// 나는 현재의 상태를 알고싶다. 
	// if 현재 17시인 경우, 14시의 값이 들어가면 18시의 예보를 보여준다.
	// 19시인 경우에 14시의 값이 들어가서 18시의 예보를 보여준다. 이거는 에러
	// base time의 간격은 3시간. 
	String timeRes = null;
	
	switch(nowTime) {
	case  "00": case "01": case "02":
		timeRes= "23";
		break;
	case "03": case "04": case "05":
		timeRes= "02";
		break;
	case "06": case "07": case "08":
		timeRes= "05";
		break;
	case "09": case "10": case "11":
		timeRes= "08";
		break;
	case "12": case "13": case "14":
		timeRes= "11";
		break;
	case "15": case "16": case "17":
		timeRes= "14";
		break;
	case "18": case "19": case "20":
		timeRes= "17";
		break;
	case "21": case "22": case "23":
		timeRes= "20";
		break;
		
	}
	
	return timeRes;
	
	}
	
	private static String dateCal() {
		
		Calendar cal = Calendar.getInstance();
		
		// date, time, nx, ny => 20200227 1700 60 120 형식
		
		//yyyyMMdd형식으로 만들어 줌
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd",Locale.KOREA);
		SimpleDateFormat timeFmt = new SimpleDateFormat("HH");		


		//현재시간 구하기
		
		String now = null;
		int mTime = Integer.parseInt(timeFmt.format(cal.getTime()));	//현재 시간을 뽑는다
		
		if(mTime < 03) {
			int mDate = Integer.parseInt(fmt.format(cal.getTime()))-1;	//03보다 작으면 날짜를 하나 빼준다
			now = String.valueOf(mDate);
		}else {
			now = fmt.format(cal.getTime());			
		}
		
		return now;
		
	}
	
	
}


