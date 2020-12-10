package com.demon.mail;


import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MailApplication.class)
public class MailApplicationTests {

    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private VelocityEngine velocityEngine;
    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2934123238@qq.com");
        message.setTo("2934123238@qq.com");
        message.setSubject("主题，简单邮件");
        message.setText("测试邮件内容");
        mailSender.send(message);
    }
    @Test
    public void sendAttachmentsMail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setFrom("2934123238@qq.com");
        helper.setTo("2934123238@qq.com");
        helper.setSubject("主题：带附件");
        helper.setText("有附件的邮件");

        FileSystemResource file = new FileSystemResource(new File("E:"+File.separator+"tiger.jpg"));
        helper.addAttachment("附件-1.jpg",file);
        helper.addAttachment("附件-2.jpg",file);
        mailSender.send(mimeMessage);

    }

    /**
     * 发送带静态资源的邮件
     * 抛出Execption异常，只能抛MesagingException 会导致图片显示不出来
     * @throws MessagingException
     */
    @Test
    public void sendInlineMail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("2934123238@qq.com");
        helper.setTo("2934123238@qq.com");
        helper.setSubject("主题：嵌入静态资源");
        helper.setText("<html><body><img src=\"cid:tiger\" ></body></html>", true);

        FileSystemResource file = new FileSystemResource(new File("E:"+File.separator+"tiger.jpg"));
        helper.addInline("tiger", file);
        mailSender.send(mimeMessage);
    }

    /**
     * 需要1.3.2.RELEASE springboot版本
     * @throws MessagingException
     */
    @Test
    public void sendTemplateMail() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        helper.setFrom("2934123238@qq.com");
        helper.setTo("2934123238@qq.com");
        helper.setSubject("主题：模板邮件");
        Map<String,Object> model = new HashMap<>();
        model.put("username","demon");
        String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "template.vm", "UTF-8", model);
        helper.setText(text,true);
        mailSender.send(mimeMessage);

    }


}
