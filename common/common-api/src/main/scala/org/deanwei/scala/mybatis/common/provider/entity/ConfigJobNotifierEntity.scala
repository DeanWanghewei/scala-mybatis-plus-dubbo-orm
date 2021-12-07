package org.deanwei.scala.mybatis.common.provider.entity

import com.baomidou.mybatisplus.annotation.{IdType, TableField, TableId, TableName}

import java.util.Date
import scala.beans.BeanProperty

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 9:43
 */
@TableName("t_notifier_mapping")
class ConfigJobNotifierEntity extends java.io.Serializable{


  @TableId(`type` = IdType.AUTO)
  @BeanProperty
  @TableField("`id`") var id: Long = _
  /**
   * 作业配置id
   */
  @BeanProperty
  @TableField("`config_id`") var configId: Long = _
  /**
   * 通知人id
   */
  @BeanProperty
  @TableField("`notifier_id`") var notifierId: Long = _
  /**
   * 通知方式
   */
  @BeanProperty
  @TableField("`notify_ways`") var notifyWays: String = _
  /**
   * 创建时间
   */
  @BeanProperty
  @TableField("`create_time`") var createTime: Date = _
  /**
   * 修改时间
   */
  @BeanProperty
  @TableField("`update_time`") var updateTime: Date = _

}
