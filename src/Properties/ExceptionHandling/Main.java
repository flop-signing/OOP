//package Properties.ExceptionHandling;
//
//import Properties.AbstractExample.Parent;
//
//public class Main {
//    public static void main(String[] args) {
//        int a=5;
//        int b=0;
//        int c;
//        }catch (MyCustomException e){
//            System.out.println(e.getMessage());
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("This will always execute.No matter what happens.");
//        }
//    }
//
//    static int Divide(int a,int b) throws ArithmeticException
//    {
//        if(b==0)
//        {
//            throw new ArithmeticException("Please Don't Divide By Zero.");
//        }
//        return a/b;
//    }
//}
