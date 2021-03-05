package ex03.pyrmont.startup;

import ex03.pyrmont.connector.http.HttpConnector;

/**
 * 引导类，用于启动服务器
 */
public final class Bootstrap {
  public static void main(String[] args) {
    HttpConnector connector = new HttpConnector();
    connector.start();
  }
}