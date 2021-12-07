package org.deanwei.scala.mybatis.common.consumer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration
import org.springframework.context.annotation.ImportResource

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 14:27
 */
@ImportResource(Array("classpath:dubbo/dubbo-common-consumer.xml"))
@SpringBootApplication(exclude = Array(classOf[DataSourceAutoConfiguration], classOf[HibernateJpaAutoConfiguration]))
class ConsumerApp

object ConsumerApp extends App {
  SpringApplication.run(classOf[ConsumerApp], args: _*)
}
