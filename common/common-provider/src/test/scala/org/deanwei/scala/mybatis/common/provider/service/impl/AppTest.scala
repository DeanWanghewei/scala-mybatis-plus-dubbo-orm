package org.deanwei.scala.mybatis.common.provider.service.impl

import org.deanwei.scala.mybatis.common.provider.ProviderApp
import org.junit.runner.RunWith
import org.junit.{After, Before}
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 13:35
 */
@RunWith(classOf[SpringRunner])
@SpringBootTest(classes = Array(classOf[ProviderApp]))
class AppTest {
  @Before
  def before(): Unit = {
    println("\nspring boot test start >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n")
  }

  @After
  def after(): Unit = {
    println("\nspring boot test end >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n")
  }

}
