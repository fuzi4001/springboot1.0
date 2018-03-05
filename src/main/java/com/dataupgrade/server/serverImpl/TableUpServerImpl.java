package com.dataupgrade.server.serverImpl;

import com.dataupgrade.mapper.dao.TableUpMapper;
import com.dataupgrade.mapper.daoFull.TableUpFullMapper;
import com.dataupgrade.server.TableUpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableUpServerImpl implements TableUpServer {

    private static final Logger logger = LoggerFactory.getLogger(TableUpServer.class);

    @Autowired
    private TableUpMapper myDemoMapper;
    @Autowired
    private TableUpFullMapper myDemoFullMapper;

    @Override
    public String insertTableUp(List<String> tableSqlList) {

        if (null == tableSqlList || tableSqlList.isEmpty()) {
            logger.error("tableSqlList == null");
            return null;
        }
        //数据源1
        int prosperity = 0;
        int failure = 0;
        for (String sql : tableSqlList) {
            try {
                myDemoMapper.insertTable(sql);
                logger.error("性能库 -- 修改字段【 成功 】   ：{} ", sql);
                prosperity++;
            } catch (Exception e) {
                logger.error("性能库 -- 修改字段【 失败 】   ：{} ", sql);
                failure++;
            }
        }

        //数据源2
        int prosperityFull = 0;
        int failureFull = 0;
        for (String sql : tableSqlList) {
            try {
                myDemoFullMapper.insertTable(sql);
                logger.error("full -- 修改字段【 成功 】   ：{} ", sql);
                prosperityFull++;
            } catch (Exception e) {
                logger.error("full -- 修改字段【 失败 】   ：{} ", sql);
                failureFull++;
            }
        }
        return "【共写入" + tableSqlList.size() + "条数据】，【性能库成功】" + prosperity + "条数据，【性能库失败】" + failure + "条数据，【full库成功】" + prosperityFull + "条数据，【full库失败】" + failureFull + "条数据";
    }


}
