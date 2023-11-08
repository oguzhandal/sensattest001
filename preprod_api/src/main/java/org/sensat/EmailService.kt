package org.sensat

import java.io.File
import java.io.IOException
import java.util.*
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.MimeMessage
import javax.mail.internet.MimeMultipart

class EmailService {

    private val email = "mert.gundogan@d-teknoloji.com.tr"
    private val password = "sncbmwfbhdcpxyhh"
    private val toEmalist =
        "mert.gundogan@d-teknoloji.com.tr, muhammed.yildirim@ext.d-teknoloji.com.tr, ExtFazliG@ext.d-teknoloji.com.tr"
    private val ccEmailList = "hanifi.tayfur@d-teknoloji.com.tr, burhan.ertunc@d-teknoloji.com.tr"
    private val reportPath = "preprod_api/./build/SenSatPreProdApiTests.html"
    private val prop = Properties()

    fun sendEmail() {
        prop["mail.smtp.host"] = "smtp.office365.com"
        prop["mail.smtp.port"] = "587"
        prop["mail.smtp.auth"] = "true"
        prop["mail.smtp.starttls.enable"] = "true"

        val session = Session.getInstance(prop, object : Authenticator() {
            override fun getPasswordAuthentication(): PasswordAuthentication {
                return PasswordAuthentication(email, password)
            }
        })

        val currentDateTime = Date()

        try {
            val message: Message = MimeMessage(session)
            val messageBodyPart: BodyPart = MimeBodyPart()
            val multipart: Multipart = MimeMultipart()
            val attachmentPart = MimeBodyPart()

            message.setFrom(InternetAddress(email))
            message.subject = "Sensat Preprod API Test Report"
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmalist))
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccEmailList))

            messageBodyPart.setText(
                """
                    Sensat Preprod API Test raporu ektedir. Lütfen raporu inceleyiniz.
                    
                    
                    İyi çalışmalar dileriz.
                    Sensat Tester Team
                    
                 
                    
                    $currentDateTime
                    Bu mail otomatik olarak gönderilmiştir. Lütfen bu maili yanıtlamayınız.
                    """.trimIndent()
            )

            attachmentPart.attachFile(File(reportPath))
            attachmentPart.fileName = "Preprod_API_Test_Report.html"

            multipart.addBodyPart(messageBodyPart)
            multipart.addBodyPart(attachmentPart)

            message.setContent(multipart)

            Transport.send(message)
            println("Done")
        } catch (e: MessagingException) {
            println("Error while sending email")
            e.printStackTrace()
        } catch (e: IOException) {
            println("Error while sending email")
            e.printStackTrace()
        }

    }

}
