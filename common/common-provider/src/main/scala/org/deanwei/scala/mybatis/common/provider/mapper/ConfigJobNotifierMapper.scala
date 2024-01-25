package org.deanwei.scala.mybatis.common.provider.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Param
import org.deanwei.scala.mybatis.common.provider.entity.ConfigJobNotifierEntity
import org.deanwei.scala.mybatis.common.provider.view.ConfigJobView

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 9:50
 */
trait ConfigJobNotifierMapper extends BaseMapper[ConfigJobNotifierEntity] {
  def selectByIdView(@Param("id") id: Long) :ConfigJobView


  /**
   * 根据Id查询实体信息
   *
   * @param id 主键ID
   * @return
   */
  def selectById(@Param("id") id: Long): ConfigJobNotifierEntity


}
