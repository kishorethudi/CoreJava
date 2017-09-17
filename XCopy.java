class XCopy {
	int orig;
	//int arg=42;
	
	public int getArg(){
		return orig;
	}
		public void setArg(int arg){
			orig= arg*2;
			//return orig;
		}
	
	/*public int go(int arg){
		 orig= arg*2;
		//System.out.println(orig);
		return orig;*/
	}
	class XCopyTestDrive{
	public static void main (String [] args){
		XCopy x= new XCopy();
		x.setArg(42);
		int y= x.getArg();
		
		System.out.println(x.getArg()+" "+y);
	}
	
	}
