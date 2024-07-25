package Generic;

class Test<T> {
    T obj;
    // constructor
    Test(T object) {
        obj = object;
    }
    public T getObject() {
        return obj;
    }
}

class Generic {
    public static void main(String[] args)
    {
        // Integer
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        //String
        Test<String> sObj
                = new Test<String>("Thanh");
        System.out.println(sObj.getObject());
    }
}
