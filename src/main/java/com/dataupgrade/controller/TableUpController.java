package com.dataupgrade.controller;

import com.dataupgrade.server.TableUpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@RestController
public class TableUpController {

    private static final Logger logger = LoggerFactory.getLogger(TableUpController.class);

    @Autowired
    private TableUpServer tableUpServer;

    /**
     * 手动运行 http://localhost:8080/dataupgrade/insertTableUp
     * 补全数据库字段
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/insertTableUp", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    String insertTableUp(String name) {
        List<String> tableSqlList = getTableSqlLisr();
        String result = tableUpServer.insertTableUp(tableSqlList);
        logger.error(result);
        return "result====" + result;
    }


    /**
     * 启动执行
     * 补全数据库字段
     */
    @PostConstruct
    void insertTableUp() {
        List<String> tableSqlList = getTableSqlLisr();
        String result = tableUpServer.insertTableUp(tableSqlList);
        logger.error(result);
    }


    /**
     * 添加数据库需补全表字段
     * @return
     */
    private List<String>  getTableSqlLisr(){
        List<String> tableSqlList = new LinkedList<>();
        tableSqlList.add("alter table sf_ipt_audit_result_order add event_no varchar(64) DEFAULT NULL comment '就诊流水号',add patient_id varchar(64) DEFAULT '' comment '患者号(院内病人唯一ID)',add UNIQUE KEY `zone_event_patient_id` (`zone_id`,`event_no`,`patient_id`) USING BTREE;");
        tableSqlList.add("alter table sf_ipt_bacterial_report_item add event_no varchar(64) DEFAULT NULL comment '就诊流水号',add patient_id varchar(64) DEFAULT '' comment '患者号(院内病人唯一ID)',add UNIQUE KEY `zone_event_patient_id` (`zone_id`,`event_no`,`patient_id`) USING BTREE;");
        tableSqlList.add("alter table sf_ipt_drug_sensitive_item add event_no varchar(64) DEFAULT NULL comment '就诊流水号',add patient_id varchar(64) DEFAULT '' comment '患者号(院内病人唯一ID)',add UNIQUE KEY `zone_event_patient_id` (`zone_id`,`event_no`,`patient_id`) USING BTREE;");
        tableSqlList.add("alter table sf_ipt_patient_engine_order add event_no varchar(64) DEFAULT NULL comment '就诊流水号',add patient_id varchar(64) DEFAULT '' comment '患者号(院内病人唯一ID)',add UNIQUE KEY `zone_event_patient_id` (`zone_id`,`event_no`,`patient_id`) USING BTREE;");
        tableSqlList.add("alter table sf_ipt_herb_medical_order_item add event_no varchar(64) DEFAULT NULL comment '就诊流水号',add patient_id varchar(64) DEFAULT '' comment '患者号(院内病人唯一ID)',add UNIQUE KEY `zone_event_patient_id` (`zone_id`,`event_no`,`patient_id`) USING BTREE;");
        tableSqlList.add("alter table sf_ipt_audit_result_item add event_no varchar(64) DEFAULT NULL comment '就诊流水号',add patient_id varchar(64) DEFAULT '' comment '患者号(院内病人唯一ID)',add UNIQUE KEY `zone_event_patient_id` (`zone_id`,`event_no`,`patient_id`) USING BTREE;");
        tableSqlList.add("alter table sf_ipt_vital_sign_related add key_date date DEFAULT NULL comment '业务年月日';");
        return tableSqlList ;
    }

}
