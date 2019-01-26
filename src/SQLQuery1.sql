select * from HumanResources.EmployeePayHistory;

select count(*) from Person.Contact where Title = 'Mr.';

select max(contactID) as maxContactID from Person.Contact;
select min(contactID) as minContactID from Person.Contact;

select max(ModifiedDate) as minMaxDate from Person.Contact; 

select * from Sales.SalesOrderHeader;

select MAX(DATEDIFF(day,OrderDate, ShipDate)) as noOfDays from Sales.SalesOrderHeader; --order by noOfDays desc;

select * from Sales.SpecialOffer where MaxQty is not null;

select count(*) from sales.SpecialOffer;
select count(MaxQty) from sales.SpecialOffer;

select * from Sales.SpecialOffer where MaxQty is not null;

select sum(MaxQty) from Sales.SpecialOffer;
select avg(MaxQty) from Sales.SpecialOffer;

select avg(ISNULL(MaxQty,0)) from Sales.SpecialOffer;

select * from Sales.SpecialOffer

select * from sales.SalesOrderHeader

select count(*) from sales.SalesOrderHeader

select CustomerID, count(*) as CntOrders
from Sales.SalesOrderHeader
group by CustomerID
order by CntOrders desc

select * from Sales.SalesOrderDetail;

select SalesOrderID, sum(OrderQty) as SumOfOrderQty
from Sales.SalesOrderDetail
group by SalesOrderID
order by SumOfOrderQty desc

select customerID, max(orderDate )
from Sales.SalesOrderHeader 
group by CustomerID
order by CustomerID

select customerID, count(*) as cntOrders
from Sales.SalesOrderHeader 
group by CustomerID having count(*) >=20
order by cntOrders 

set language Polish

select month(orderDate) as OrderMonth, Datename(MONTH,orderDate), count(*) as CntOrders
from Sales.SalesOrderHeader
group by month(orderDate), Datename(MONTH,orderDate)
order by OrderMonth

select count(*) from Sales.SalesOrderHeader

select * from sales.SalesOrderHeader

select sum(TotalDue) as sum
from Sales.SalesOrderHeader
 where year(OrderDate) = 2001 and CustomerID = 442

 group by OrderDate having