package Proyekt;

import Proyekt.Enums.ProductCategoryTypeEnum;
import Proyekt.Service.CustomerService;
import Proyekt.Service.OwnerService;
import Proyekt.Service.ServiceImpl.CustomServiceImpl;
import Proyekt.Service.ServiceImpl.OwnerServiceImpl;

import javax.swing.tree.FixedHeightLayoutCache;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    static ExecutorService executorService = new ExecutorService() {
        @Override
        public void shutdown() {

        }

        @Override
        public List<Runnable> shutdownNow() {
            return null;
        }

        @Override
        public boolean isShutdown() {
            return false;
        }

        @Override
        public boolean isTerminated() {
            return false;
        }

        @Override
        public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return false;
        }

        @Override
        public <T> Future<T> submit(Callable<T> task) {
            return null;
        }

        @Override
        public <T> Future<T> submit(Runnable task, T result) {
            return null;
        }

        @Override
        public Future<?> submit(Runnable task) {
            return null;
        }

        @Override
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
            return null;
        }

        @Override
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
            return null;
        }

        @Override
        public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
            return null;
        }

        @Override
        public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }

        @Override
        public void execute(Runnable command) {

        }
    };

        static Scanner scrStr = new Scanner(System.in);
        static Scanner scrInt = new Scanner(System.in);
        static CustomerService customerService = new CustomServiceImpl();
        static OwnerService ownerService = new OwnerServiceImpl();

        public static void main(String[] args) {
            System.out.println("""
                    WELCOME TO E - commerce APP
                    """);

            showManu();
            int begin = scrInt.nextInt();
            if (begin == 0) {
                return;
            } else if (begin == 1) {
                System.out.print("Enter login:");
                String login = scrStr.nextLine();
                System.out.print("Enter password:");
                String password = scrStr.nextLine();
                if (ownerService.login(login, password)) {
                    showOwnerManu();
                    int index = scrInt.nextInt();
                    if (index == 0) {
                        return;
                    }
                    switch (index) {
                        case 1 -> {
                            ownerService.showCategory();
                        }
                        case 2 -> {
                            ownerService.editCategory();
                        }
                        case 3 -> {
                            System.out.println("Choose category:");
                            ProductCategoryTypeEnum.showEnums();
                            int index1 = scrInt.nextInt();
                            System.out.print("Enter product name:");
                            String productName = scrStr.nextLine();
                            System.out.print("Enter amount:");
                            int amount = scrInt.nextInt();
                            ownerService.addProduct(productName, amount, ProductCategoryTypeEnum.setTypeByIndex(index1));
                            System.out.println("Product added successfuly!");
                        }
                        case 4 -> {
                            ownerService.showProducts();
                            System.out.println("Choose one which to want delete:");
                            int index3 = scrInt.nextInt();
                            ownerService.deleteProduct(index3);
                            System.out.println("Deleted successfuly!");
                        }
                        case 5 -> {
                            ownerService.showProducts();
                            System.out.println("Choose one wich to want edit:");
                            int index4 = scrInt.nextInt();
                            ownerService.editProduct(index4);
                            System.out.println("Choose category:");
                            ProductCategoryTypeEnum.showEnums();
                            int index1 = scrInt.nextInt();
                            System.out.print("Enter new product name:");
                            String productName = scrStr.nextLine();
                            System.out.print("Enter new amount:");
                            int amount = scrInt.nextInt();
                            ownerService.addProduct(productName, amount, ProductCategoryTypeEnum.setTypeByIndex(index1));
                            System.out.println("Product edided successfuly!");
                        }
                    }
                }
            }
        }

        public static void showManu() {
            System.out.println("""
                    1. Login
                    2. Register
                    0. Exit
                    """);
        }

        public static void showOwnerManu() {
            System.out.println("""
                    1. Show Category
                    2. Edit Category
                    3. Add product
                    4. Delete product
                    5. Edit product
                    0. Exit
                    """);
        }
    }