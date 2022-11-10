//package multithreading;
//
//public class SynchronizedStatic {
//  static  int i;
//
//
//
//    public static void main(String[] args) throws InterruptedException {
//        SynchronizedStatic obj = new SynchronizedStatic();
//
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 1000; i++) {
//                    increase();
//                }
//
//            }
//
//            private void increase() {
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 1000; i++) {
//                    obj.increase();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//        System.out.println(obj.i);
//
//        private static void increase() {
//            synchronized (SynchronizedStatic) {
//                i++;
//            }
//        }
//
//
//    }
//}
