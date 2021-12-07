package org.deanwei.scala.mybatis.common.provider.service.impl

import com.google.gson.Gson
import org.deanwei.scala.mybatis.common.provider.service.ConfigJobNotifierService
import org.junit.Test

import javax.annotation.Resource

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 13:41
 */
class ConfigJobNotifierServiceImplTest extends AppTest {

  @Resource
  val beanService: ConfigJobNotifierService = null

  @Test
  def findAllTest(): Unit = {
    val entities = beanService.list()
    print(new Gson().toJson(entities))
  }

  @Test
  def mapperXmlTest(): Unit = {
    val entity = beanService.selectById(1L)
    print(new Gson().toJson(entity))
  }

}
