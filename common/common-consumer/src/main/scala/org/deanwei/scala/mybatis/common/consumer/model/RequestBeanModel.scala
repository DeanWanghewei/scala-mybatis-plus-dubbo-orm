package org.deanwei.scala.mybatis.common.consumer.model

import scala.beans.BeanProperty

/**
 * @description:
 * @author: deanwanghewei@gmail.com
 * @date: 2022年07月06日 15:17
 */
class RequestBeanModel extends Serializable {
  @BeanProperty
  var code: String = _

  var hashcode: String = _
}
