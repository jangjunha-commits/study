import java.io.IOException;

public class 예외처리 {
    static void handlingException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("호출된 메소드에서 예외가 처리됨!");
        }
    }
    /*
    static void handlingException() throws Exception {
        throw new Exception();
    }
    */
    public static void main(String[] args) {
        /*
        오류와 예외
        문법에 맞지 않게 작성하고 컴파일하면 문법오류
        시스템 동작 도중 사태 발생 실행중인 프로그램이 영향을 받는 것 오류와 예외
        오류 - 시스템 레벨에서 프로그램 심각한 문제를 야기하여 실행 종료
        예외 - 비정상적 종료 발생할수 있는 상황을 미리 예측하려 처리할수 있다
        예외 처리
        try {
          예외처리 원하는 코드
        } catch(e1) {
          e1예외 발생 실행 코드
        } catch(e2) {
          e2예외 발생 실행 코드
        }
        finally {
          예외 발생여부 상관없이 무조건 실행된 코드
        }
        Exception 클래스
        모든 에외의 조상크랠스가 되는 Exception클래스
        RuntimeException클래스 상속받는 자식크랠스들을 주로 치명적인 예외들로 구성됩니다
        자식클래스들은 치명적인 예외 상활을 발생시키므로 반드시 try/catch믄 사용하여 예외를 처리
        예외가 발생할 가능성이 있는 구문은 예외처리하지 않았을때 컴파일시 오류 발생시킵니다
        PrintStream 클래스의 write()메소드 사용하여 byte타입 배열의 모든 요소 출력
        public class Exception01 {
           public static void main(String[] args) {
              byte[] list = {'a','b','c'};
              System.out.write(list);
           }
        }
        IOException에 대한 예외를 처리하지 않으므로 컴파일시 오류 발생합니다
        try/catch 문을 사용하여 IOException 대한 예외처리까지 해주어야만 컴파일할수 있다
         */
        /*
        byte[] list = {'a','b','c'};
        try {
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        /*
        IOException 발생하면, 자바는 첫번째 catch블록부터 순서대로 해당 예외 처리할수 있다
        IOException은 Exception의 자식 클래스, 첫번째 catch블록에서도 IOException을 처리할수 있다
        catch블록의 순서를 위의 예제처럼 작성하면, 두번째 catch블록은 영영히 실행되지 못할 것입니다
        try {
          System.out.write(list);
        }catch (Exception e) {
          e.printStackTrace();
        }catch (IOException e) {
          e.printStackTrace();
        }
        클래스 자식 클래스에 해당하는 예외가 발생하면 두번째 catch블록에서 처리될것입니다
        catch블록을 먼저 명시하고 범위가 더 넓은 예외를 처리하는 catch블록은 나중에 명시해야만 정상적으로 해당예외를 처리할수 있다
         */
        /*
        try {
            System.out.println(5 / 0);
        } catch(ArithmeticException e) {
            System.out.println("현재 발생한 예외 정보 : "+ e.getMessage());
        }
        */
        /*
        에외발생및 회피
        try-with-resoucrce문
        try(파일을 열거나 지원을 할당명령문){}
        static String readFile(String filePath) throws IOException {
           BufferenceReader br= new BufferedReader(new FileReader(filepath));
           try {
              return br.readLine();
           } finally {
             if (br!=null)
                br.close();
           }
           */
           /*
           에외 회피하기
           throws 키워드를 사용하여 해당메소드를 사용할수 있는 예외를 미리 명시할수 있습니다
           이렇게 하면 해당 메소드를 사용할때 발생할수 있는 예외를 사용자가 충분히 인지할수 있으며
           그에 대한 처리까지도 강제할수 있습니다
           더욱 안정성있는 프로그램을 손십게 작성할수 있도록 도와줄수 있다
           호출된 메소드에서 발생한 예외를 호출된 메소드에서 처리하는 예제
            */
        /*
        try {
            handlingException();
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리됨!");
        }
        */
       try {
           handlingException();
       } catch (Exception e) {
           System.out.println("main() 메소드에서 예외가 처리됨.");
       }
    }
}

