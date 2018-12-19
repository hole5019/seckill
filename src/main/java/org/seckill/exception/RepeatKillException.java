package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * Created by helei on 2018-12-19.
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message){
        super(message);
    }

    public RepeatKillException(String message, Throwable cause){
        super(message,cause);
    }
}
