/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstprojectsr;

/**
 *
 * @author IT Pal
 */
class Student {
    private int Roll;
    protected String Name;
    public void GetData();   
}
Result extends Student
{
    private float Mark;
    protected void GetMark();
    public void Display();
}
class Result
{
    protected String Name;
    public void GetData();
    private float Mark;
    protected void GetMark();
    public void Display();
}
