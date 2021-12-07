package org.deanwei.scala.mybatis.common.consumer

import com.google.gson.Gson
import org.deanwei.scala.mybatis.common.provider.service.ConfigJobNotifierService
import org.junit.Test

import javax.annotation.Resource

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 14:43
 */
class ConsumerAppTest extends AppTest {
  @Resource
  val beanService: ConfigJobNotifierService = null

  @Test
  def dubboConsumerTest(): Unit = {
    val entity = beanService.selectById(1L)
    print(new Gson().toJson(entity))
  }
}
