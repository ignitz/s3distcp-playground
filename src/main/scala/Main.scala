import com.amazon.external.elasticmapreduce.s3distcp._

// public class Main
// {
// private static final Log log = LogFactory.getLog(S3DistCp.class);

//   public static void main(String[] args) throws Exception {
// log.info("Running with args: " + args);

// System.exit(ToolRunner.run(new S3DistCp(), args));
//   }
// }

object Main extends App {
  override def main(args: Array[String]): Unit = {
    println("Hello, World!")
    new S3DistCp()
  }
}