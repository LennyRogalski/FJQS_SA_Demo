package com.example.demo.object;

import java.sql.Date;

/**
 * Created by wojcikj on 30.08.2017.
 */
public class rdProblemeBoards {



    private String ProblemID;
    private Date CreateDate;
    private String Title;
    private String ProblemDescription;
    private String Solution;
    private Date DateStart;
    private String Remark;
    private String Priority;
    private String Status;
    private String BearbeiterID;
    private String ActualUser;
    private String ProblemCreator;
    private String Identnumber;
    private String Product;
    private String Container;
    private String Keywords;
    private String ProblemCreatorContainer;
    private String TestItem;
    private String Reproducible;
    private String RootCause;
    private String InvolvedContainer;
    private String ProblemReproduced;
    private String HWChangeNecessary;
    private String End3rdLevel;
    private String Systemboard;
    private String Variant;
    private String AssemblyVersion;

    rdProblemeBoards()
    {

    }


    public rdProblemeBoards(String problemID, Date createDate, String title, String problemDescription, String solution, Date dateStart, String remark, String priority, String status,
                            String bearbeiterID, String actualUser, String problemCreator, String identnumber, String product, String container, String keywords,
                            String problemCreatorContainer, String testItem, String reproducible, String rootCause, String involvedContainer, String problemReproduced,
                            String HWChangeNecessary, String end3rdLevel, String systemboard, String variant, String assemblyVersion) {
        ProblemID = problemID;
        CreateDate = createDate;
        Title = title;
        ProblemDescription = problemDescription;
        Solution = solution;
        DateStart = dateStart;
        Remark = remark;
        Priority = priority;
        Status = status;
        BearbeiterID = bearbeiterID;
        ActualUser = actualUser;
        ProblemCreator = problemCreator;
        Identnumber = identnumber;
        Product = product;
        Container = container;
        Keywords = keywords;
        ProblemCreatorContainer = problemCreatorContainer;
        TestItem = testItem;
        Reproducible = reproducible;
        RootCause = rootCause;
        InvolvedContainer = involvedContainer;
        ProblemReproduced = problemReproduced;
        this.HWChangeNecessary = HWChangeNecessary;
        End3rdLevel = end3rdLevel;
        Systemboard = systemboard;
        Variant = variant;
        AssemblyVersion = assemblyVersion;
    }

    public String getProblemID() {
        return ProblemID;
    }

    public void setProblemID(String problemID) {
        ProblemID = problemID;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        ProblemDescription = problemDescription;
    }

    public String getSolution() {
        return Solution;
    }

    public void setSolution(String solution) {
        Solution = solution;
    }

    public Date getDateStart() {
        return DateStart;
    }

    public void setDateStart(Date dateStart) {
        DateStart = dateStart;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getBearbeiterID() {
        return BearbeiterID;
    }

    public void setBearbeiterID(String bearbeiterID) {
        BearbeiterID = bearbeiterID;
    }

    public String getActualUser() {
        return ActualUser;
    }

    public void setActualUser(String actualUser) {
        ActualUser = actualUser;
    }

    public String getProblemCreator() {
        return ProblemCreator;
    }

    public void setProblemCreator(String problemCreator) {
        ProblemCreator = problemCreator;
    }

    public String getIdentnumber() {
        return Identnumber;
    }

    public void setIdentnumber(String identnumber) {
        Identnumber = identnumber;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getContainer() {
        return Container;
    }

    public void setContainer(String container) {
        Container = container;
    }

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public String getProblemCreatorContainer() {
        return ProblemCreatorContainer;
    }

    public void setProblemCreatorContainer(String problemCreatorContainer) {
        ProblemCreatorContainer = problemCreatorContainer;
    }

    public String getTestItem() {
        return TestItem;
    }

    public void setTestItem(String testItem) {
        TestItem = testItem;
    }

    public String getReproducible() {
        return Reproducible;
    }

    public void setReproducible(String reproducible) {
        Reproducible = reproducible;
    }

    public String getRootCause() {
        return RootCause;
    }

    public void setRootCause(String rootCause) {
        RootCause = rootCause;
    }

    public String getInvolvedContainer() {
        return InvolvedContainer;
    }

    public void setInvolvedContainer(String involvedContainer) {
        InvolvedContainer = involvedContainer;
    }

    public String getProblemReproduced() {
        return ProblemReproduced;
    }

    public void setProblemReproduced(String problemReproduced) {
        ProblemReproduced = problemReproduced;
    }

    public String getHWChangeNecessary() {
        return HWChangeNecessary;
    }

    public void setHWChangeNecessary(String HWChangeNecessary) {
        this.HWChangeNecessary = HWChangeNecessary;
    }

    public String getEnd3rdLevel() {
        return End3rdLevel;
    }

    public void setEnd3rdLevel(String end3rdLevel) {
        End3rdLevel = end3rdLevel;
    }

    public String getSystemboard() {
        return Systemboard;
    }

    public void setSystemboard(String systemboard) {
        Systemboard = systemboard;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String variant) {
        Variant = variant;
    }

    public String getAssemblyVersion() {
        return AssemblyVersion;
    }

    public void setAssemblyVersion(String assemblyVersion) {
        AssemblyVersion = assemblyVersion;
    }
}
