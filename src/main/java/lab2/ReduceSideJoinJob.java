package lab2;

public class ReduceSideJoinJob {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: ReduceSideJoinJob <input path Flights> <input path Airports> <output path>");
            System.exit(-1);
        }
    }
}
