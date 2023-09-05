<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>STS003_Data Driven CSV</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>53ab37dd-db12-432a-a701-5c5d924c8171</testSuiteGuid>
   <testCaseLink>
      <guid>80f353f1-2d2a-49d5-a5c2-937144e15224</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC001_Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d219c91c-fbca-4a1b-9548-15510397290b</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_CSV</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>d219c91c-fbca-4a1b-9548-15510397290b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>﻿city</value>
         <variableId>01c0a0bb-a8af-457f-b66f-74d47032aec5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d219c91c-fbca-4a1b-9548-15510397290b</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedResult</value>
         <variableId>cc6ecfbd-b42f-4825-87ea-dc3e1ab3ee81</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
