package tech.kikutaro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logbackのサンプルコード
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //動作確認用
        System.out.println( "Hello World!" );

        //ログ出力
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.error("エラーだよ");

        //logback.xmlのasynchronousSendingがtrueの場合はスリープを入れる
        //Thread.sleep(10000);
    }
}
