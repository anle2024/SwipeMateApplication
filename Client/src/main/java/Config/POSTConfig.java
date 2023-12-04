package Config;

public final class POSTConfig {

  /**
   * The BaseURL to send request to server
   */

  public static final String LOCAL_BASE_URL = "http://localhost:8080/SwipeMateServer";

  public static final String URL = LOCAL_BASE_URL;

  /**
   * How many request the client should send to server
   */
  public static final int REQUEST_NUM = 500000;

  /**
   * Number of threads the client will use
   */
  public static final int NUM_THREADS = 250;

  /**
   * Max total connection
   */
  public static final int MAX_TOTAL_CONN = 400;

  /**
   * Maximum number of connection per route
   */
  public static final int MAX_PER_ROUTE = 100;

  private POSTConfig() {
  }
}
