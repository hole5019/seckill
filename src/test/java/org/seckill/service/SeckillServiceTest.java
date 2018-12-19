package org.seckill.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * Service层的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SeckillServiceTest {
    private Logger logger = LoggerFactory.getLogger(SeckillServiceTest.class);

    @Autowired
    private SeckillService seckillService;
    /**
     * 获取库存列表
     */
    @Test
    public void getSeckillList() {
        List<Seckill> seckillList = seckillService.getSeckillList();
        logger.info("list={}",seckillList);
    }

    @Test
    public void getById() {
        Long id = 1000L;
        Seckill seckill = seckillService.getById(id);
        logger.info("seckill={}",seckill);
    }

    @Test
    public void exportSeckillUrl() {
        Long id = 1000L;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("exposer={}",exposer);
    }

    @Test
    public void excuteSeckill() {
        Long id = 1000L;
        long tel = 18879699648L;
        String md5 = "78e34e0e04074625a40d064aa8589a20";
        SeckillExecution seckillExecution = seckillService.executeSeckill(id, tel, md5);
        logger.info("seckillExecution={}",seckillExecution);
    }

//    @Test
//    public void excuteSeckillProcedure() {
//        Long id = 1000L;
//        long tel = 18279699638L;
//        Exposer exposer = seckillService.exportSeckillUrl(id);
//        if(exposer.isExposed()) {
//            String md5 = exposer.getMd5();
//            SeckillExecution seckillExecution = seckillService.excuteSeckillProcedure(id, tel, md5);
//            System.out.println(seckillExecution.getState());
//        }
//    }

}