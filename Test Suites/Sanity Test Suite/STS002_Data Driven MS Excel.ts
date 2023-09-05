<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>STS002_Data Driven MS Excel</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>06b868de-8562-4ee9-b98a-21aff47b1e49</testSuiteGuid>
   <testCaseLink>
      <guid>8b07098b-6e2e-484f-8e02-b8b8d4f92475</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC001_Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>9193de6d-1642-4e2b-9869-0a37605f2be2</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_Excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>9193de6d-1642-4e2b-9869-0a37605f2be2</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>01c0a0bb-a8af-457f-b66f-74d47032aec5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9193de6d-1642-4e2b-9869-0a37605f2be2</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedResult</value>
         <variableId>cc6ecfbd-b42f-4825-87ea-dc3e1ab3ee81</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
