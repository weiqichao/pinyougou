package com.pinyougou.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.manager.dao.ManagerMapper;
import com.pinyougou.manager.pojo.TbBrand;
import com.pinyougou.manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
                       .::::.
                     .::::::::.
                    :::::::::::  FUCK YOU
                ..:::::::::::'
              '::::::::::::'
                .::::::::::
           '::::::::::::::..
                ..::::::::::::.
              ``::::::::::::::::
               ::::``:::::::::'        .:::.
              ::::'   ':::::'       .::::::::.
            .::::'      ::::     .:::::::'::::.
           .:::'       :::::  .:::::::::' ':::::.
          .::'        :::::.:::::::::'      ':::::.
         .::'         ::::::::::::::'         ``::::.
     ...:::           ::::::::::::'              ``::.
    ```` ':.          ':::::::::'                  ::::..
                       '.:::::'                    ':'````..
*/
@Service(interfaceClass = ManagerService.class)
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public List<TbBrand> findAll() {
        List<TbBrand> TbBrandall = managerMapper.findAll();
        return TbBrandall;
    }
}
