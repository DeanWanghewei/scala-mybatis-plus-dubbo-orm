package org.deanwei.scala.mybatis.common.consumer.controller

import org.deanwei.scala.mybatis.common.consumer.model.RequestBeanModel
import org.deanwei.scala.mybatis.common.provider.entity.ConfigJobNotifierEntity
import org.deanwei.scala.mybatis.common.provider.service.ConfigJobNotifierService
import org.deanwei.scala.mybatis.common.provider.view.ConfigJobView
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PostMapping, RequestMapping, ResponseBody}

import javax.annotation.Resource

@Controller
@RequestMapping(Array("/consumer"))
class ConsumerController {

  @Resource
  val beanService: ConfigJobNotifierService = null

  @PostMapping(Array("/selectAll"))
  @ResponseBody def selectAll(): ConfigJobNotifierEntity = {
    beanService.selectById(1L)
  }

  @PostMapping(Array("/selectView"))
  @ResponseBody def selectView(): ConfigJobView = {
    beanService.selectByIdView(1L)
  }


  @PostMapping(Array("/select-request"))
  @ResponseBody def select(requestBeanModel: RequestBeanModel): RequestBeanModel = {
    requestBeanModel
  }

}
