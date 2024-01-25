package org.deanwei.scala.mybatis.common.provider.view

import com.baomidou.mybatisplus.annotation.TableField
import org.deanwei.scala.mybatis.common.provider.entity.ConfigJobNotifierEntity

import scala.beans.BeanProperty

class ConfigJobView extends ConfigJobNotifierEntity{
  @TableField("`user_name`")
  @BeanProperty var userName :String= _
}
