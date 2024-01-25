package org.deanwei.scala.mybatis.common.provider.service

import com.baomidou.mybatisplus.extension.service.IService
import org.deanwei.scala.mybatis.common.provider.entity.ConfigJobNotifierEntity
import org.deanwei.scala.mybatis.common.provider.view.ConfigJobView

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 11:53
 */
trait ConfigJobNotifierService extends IService[ConfigJobNotifierEntity] {

  /**
   * 根据Id查询实体信息
   *
   * @param id 主键ID
   * @return 返回的实体信息
   */
  def selectById(id: Long): ConfigJobNotifierEntity

  def selectByIdView(id:Long):ConfigJobView

}
