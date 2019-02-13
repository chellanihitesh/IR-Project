<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>API_investor presentations</name>
   <tag></tag>
   <elementGuidId>ec5a6d0a-32fa-45c5-9c8f-2f5212692587</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:type</name>
      <type>Main</type>
      <value>OAuth 1.0</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_key</name>
      <type>Main</type>
      <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IjlYdGR5V0ZsQ2VSNDFsWkRTUnQyeW9PVElEOCIsImtpZCI6IjlYdGR5V0ZsQ2VSNDFsWkRTUnQyeW9PVElEOCJ9.eyJqdGkiOiJkYTVjYTQ0NzFmMWM0YzkwYmE5Y2U2Y2U3MTk3YTBjNSIsImNsaWVudF9pZCI6IjgzMjZjYWFjYjJlMjRmNzFiNGNlNTY4ZDk0MzJhY2E2Iiwic2NvcGUiOiJvcGVuaWQiLCJzdWIiOiJzdmNwc3NvaXJhcHAiLCJhdXRoX3RpbWUiOjE1NTAwMzUyNDAsImlkcCI6IlNlY3VyZUF1dGgxMzEiLCJhbXIiOlsicGFzc3dvcmQiLCJjbGllbnQiXSwiaXNzIjoiU2VjdXJlQXV0aDA3Vk0uYW13YXRlci5jb20iLCJhdWQiOiJTZWN1cmVBdXRoMDdWTS5hbXdhdGVyLmNvbSIsImV4cCI6MTU1MDA3MTI0MCwibmJmIjoxNTUwMDM1MjQwfQ.jdrEKSHLKaaSFzJsED5q8K6o_HXCTKqbV4hDoqv6O0d-7EIVcNXgAQefluxk4sUzlOIGAM60hF8WSWYok5Xj3Jn7EMpM0cwPp2WvBmrMcu42FIGxyuL36s8sSJ0hIWfvtJh2bfhw0LfJj9bf4KyVSaHJNXix-XQvvSci276BA75uobfYhSVeD9kger60MdGHX8MdDsgATyY1unJcsyiljyZpslf0OUFWbkJSMy5VBNpvnCBJuIYhiKk-FJzmyaXPt_etN0xEOQ9R3Gl6JIjw1LC6ZCBkPOrnCoH02wiuu1E0BnGAvZ49Tk-sbkxMfSEXEVpTmLo6LY7UaYqnna4y9A</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_secret</name>
      <type>Main</type>
      <value></value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_signature_method</name>
      <type>Main</type>
      <value>HMAC-SHA1</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.amwater.com/api/ir-service-proxy/cp-content-ms/o/webcontent-service/contents/contentsByStructureName/Investor%20Presentations?siteCode=IR</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
