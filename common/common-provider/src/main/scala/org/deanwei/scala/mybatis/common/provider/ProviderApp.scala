package org.deanwei.scala.mybatis.common.provider

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ImportResource

/**
 * @description: some desc
 * @author: weiyixiao
 * @email: wanghewei@kemai.cn
 * @date: 2021-12-7 9:53
 */
@ImportResource(value = Array("dubbo/dubbo-common-provider.xml"))
@MapperScan(Array("org.deanwei.scala.mybatis.common.provider.mapper"))
@SpringBootApplication
class ProviderApp

object ProviderApp extends App {
  SpringApplication.run(classOf[ProviderApp], args: _*)
}
