//public class TrainTime {

/*
完成一個火車時刻(TrainTime)的class
裡面需要定義

private:
火車編號 (trainCode)
發車站 (origin)
終點站 (dest)
開車時間 (departure)
到達時間 (arrival)
票價 (fare)

public:
有初始值的建構子

set某變數的函數, e.g, setFare(int fare);
get某變數的函數, e.g, int getFare();

撰寫 TrainTime.toString()
用途為把全部變數合成一行字串回傳
*/

//}

public class TrainTime {
	private int trainCode; //火車編號
	private String origin; //發車站
	private String dest; //終點站
	private String departure; //開車時間
	private String arrival; //到達時間
	int fare; //票價
	
//	trainTimes[i] = new TrainTime(); 這行會呼叫他↓↓
	public TrainTime(){ //初始值的建構子
		this.trainCode = 0000;
		this.origin = "init";
		this.dest = "init";
		this.departure = "23:59";
		this.arrival = "23:59";
		this.fare = 0;
	}
	
	
//	trainTimes[i] = new TrainTime(randNumber(),randTrainStation(),randTrainStation(),randTime(),randTime(),randNumber()); 這行會呼叫他↓↓
	public TrainTime(int trainCode, String origin, String Dest, String departure, String arrival, int fare) { //使用我們賦予值的建構子
		this.trainCode = trainCode;
		this.origin = origin;
		this.dest = Dest;
		this.departure = departure;
		this.arrival = arrival;
		this.fare = fare;
	}
	
//	trainTime.toString() 這行會呼叫他↓↓
	public String toString(){ 
		return String.format("%9s %15s %15s %9s %9s %4s",trainCode,origin,dest,departure,arrival,fare);
	}
	
	//下面這個我只是用 "自動生成" 做出來的 我有放到共筆上喔
	public int getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(int trainCode) {
		this.trainCode = trainCode;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
}

