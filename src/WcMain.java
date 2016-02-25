import java.io.File;
import java.util.ArrayList;
class WcMain  {
	public static void main(String[] args) throws Exception {
		ArrayList<String> files = new ArrayList<String>();
		ArrayList<String> commands = new ArrayList<String>();
		String result="";
		for(int i=0;i<args.length;i++){
			File f = new File(args[i]);
			if(f.exists()){
				files.add(args[i]);
			}else{
				commands.add(args[i]);
			}
		}
		if(commands.size()==0){
			PrintWithoutCommands res = new PrintWithoutCommands(files);
			res.printResult();
		}else {
			PrintAccordingCommand res = new PrintAccordingCommand(files,commands);
			res.printResult();
		}	
	}
}
