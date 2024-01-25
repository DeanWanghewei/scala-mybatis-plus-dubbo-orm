package org.deanwei.scala.mybatis.common.provider.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.deanwei.scala.mybatis.common.provider.entity.ConfigJobNotifierEntity
import org.deanwei.scala.mybatis.common.provider.mapper.ConfigJobNotifierMapper
import org.deanwei.scala.mybatis.common.provider.service.ConfigJobNotifierService
import org.deanwei.scala.mybatis.common.provider.view.ConfigJobView
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 11:55
 */
@Service("configJobNotifierService")
class ConfigJobNotifierServiceImpl extends ServiceImpl[ConfigJobNotifierMapper, ConfigJobNotifierEntity] with ConfigJobNotifierService {
  /**
   * 根据Id查询实体信息
   *
   * @param id 主键ID
   * @return 返回的实体信息
   */
  override def selectById(id: Long): ConfigJobNotifierEntity = {
    baseMapper.selectById(id)
  }

  override def selectByIdView(id: Long): ConfigJobView = {
    val entity = baseMapper.selectByIdView(id)
    val view = new ConfigJobView
    BeanUtils.copyProperties(entity,view)
    view
  }
}
