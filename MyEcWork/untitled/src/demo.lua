



t3 = {name ="lintao" , age = 18 , gender = "Male" ,"星期一","星期二" }
for i, v in pairs(t3) do
    print(i ..":".. v)
end

if(tonumber("133") == 123) then
    print("相等")
else
    print("不相等")
end

print(t3[1])
print(t3[2])
print(t3[3])
print(t3.name)
print(t3.age)


num1 = nil
num2 = 123
res = num1 and num2
print(res,num1,num2)
res = num1 or num2
print(res)

a,b,c =  "asd" ,'asd', 123, 534
print(a,b,c)

if a == b then
    print(a==b)
elseif( a==c ) then
    print(a==c)
else
    print("not")
end
sum = 0;
count = 1;
while count<=10 do
    sum = sum + count ;
    count = count +1 ;
end
print(sum)

for i = 1, 10 do
    print(i.."aaa")
end

function add()
    a ,b = 10 ,11
    return a+b,a,b;
end
 res,a,b  = add();
print(res..a..b)

function forea(...)
    a = {...}
    for i, v in pairs(a) do
        print(v..":"..i)
    end
    return table
end
print(forea(a, b, "aff", "223"))

 str = "aa"
str = "b"
print(str)

a = {x = 3, y = 4,__index = 5}

a.__index = function(table, key)
    print("__index")
    return a[key],table
end

girl = {money = 200}
function girl.goToMarket(girl ,someMoney)
    girl.money = girl.money - someMoney
end
girl:goToMarket(1)
print(girl.money)

t1 = {}
t1[1] = 1
t1[3] = 3
a = 1
b = 1
t1.name1 = function ()
    return t1[1]+a+b
end
print(t1.name1())

for i, v in pairs(t1) do
    print(v)
end
print(t1.name1())

boy = {money = 200}
function boy:goToMarket(boy,someMoney)
    self.money = self.money - someMoney
    return self.money
end
print(boy:goToMarket(boy,2))