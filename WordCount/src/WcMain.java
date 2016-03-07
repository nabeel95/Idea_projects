import java.io.File;
import java.util.ArrayList;

class WcMain {
    public static void main(String[] args) throws Exception {
        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> commands = new ArrayList<>();
        ArrayList<String> wrongFiles = new ArrayList<>();
        for (String arg : args) {
            File f = new File(arg);
            if (f.exists()) {
                files.add(arg);
            } else if (arg.charAt(0) == "-".charAt(0)) {
                commands.add(arg);
            } else {
                wrongFiles.add(arg);
            }
        }
        if (commands.size() == 0) {
            PrintWithoutCommands res = new PrintWithoutCommands(files);
            res.printResult();
        } else {
            PrintAccordingCommand res = new PrintAccordingCommand(files, commands);
            res.printResult();
        }
        if (wrongFiles.size() > 0) {
            for (String wrongFile : wrongFiles) {
                System.out.println("\t" + wrongFile + " is not a file;");
            }
        }

    }
}
