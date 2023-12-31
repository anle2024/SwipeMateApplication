package Config;

public class ServerConfig {

  /**
   * Swiper's id range
   */
  public static final int SWIPER_RANGE = 50000;

  /**
   * Swipee's id range
   */
  public static final int SWIPEE_RANGE = SWIPER_RANGE;

  /**
   * Length of a randomly generated comment
   */
  public static final int COMMENT_LENGTH = 256;

  /**
   * Number of connections opened towards the message queue host
   */
  public static final int NUM_CONNECTIONS = 300;

  /**
   * RabbitMQ Host
   *
   */
  public static final String QUEUE_HOST = "localhost";

  /**
   * RabbitMQ Port
   */
  public static final int QUEUE_PORT = 5672;

  /**
   * Virtual Host Name
   */
  public static final String VHOST_NAME = "anle";

  /**
   * Username for vhost authentication
   */
  public static final String USER_NAME = "guest";

  /**
   * Password for vhost authentication
   */
  public static final String PASSWORD = "guest";

  /**
   * Queue1 Name
   */
  public static final String QUEUE_1_NAME = "SwipeData1";

  public static final boolean MESSAGE_PERSISTENT = true;

  /**
   * Private constructor since no instance of this class is needed
   */
  private ServerConfig() {
  }
}
