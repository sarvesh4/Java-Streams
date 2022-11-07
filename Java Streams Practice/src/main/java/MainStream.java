import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {

        List<Account> list = getAccount();

        //List<Account> temp = new ArrayList<>();

        /*
        for(Account account : list)
        {
            if(account.getAccountVersions().equals(AccountVersion.OG))
            {temp.add(account);}

        }
        temp.forEach(System.out::println);*/

        //Declarative Approach

        //Filter
        List<Account> temp = list.stream().filter(e>e.getAccountVersions().equals(AccountVersion.OG)).collect(Collectors.toList());
        //temp.forEach(System.out::println);

        //Sort
        //list.forEach(System.out::println);

        List<Account> sorted = list.stream().sorted(Comparator.comparing(Account::getTypes).thenComparing(Account::getAccountVersions).reversed()).collect(Collectors.toList());
        sorted.forEach(System.out::println);

        //AllMatch

        boolean allMatch = list.stream().allMatch(e->e.getTypes() > 25);
        System.out.println(allMatch);

        boolean anyMatch = list.stream().anyMatch(e->e.getTypes() > 35);
        System.out.println(anyMatch);

        boolean noneMatch = list.stream().noneMatch(e->e.getAccountName().equals("Bruno"));
        System.out.println("None Match");
        System.out.println(noneMatch);

        //Max
        Optional<Account> max = list.stream().max(Comparator.comparing(Account::getTypes));
        System.out.println(max);

        list.stream().min(Comparator.comparing(Account::getTypes)).ifPresent(System.out::println);

        //Group
        Map<AccountVersion,List<Account>> groupbyAV =list.stream().collect(Collectors.groupingBy());
        groupbyAV.forEach((accountVersion, accounts) -> {
            System.out.println(accountVersion);
            accounts.forEach(System.out::println);
        });

        Optional<String> oldName = list.stream().filter(e->e.getAccountVersions().equals(AccountVersion.VERSION2)).max(Comparator.comparing(Account::getAccountVersions))
                .map(Account::getAccountName);
        oldName.ifPresent(name -> System.out.println(name));

        Executors executors = executors.

        ExecutorService executorService = new ExecutorService() {
            @Override
            public void shutdown() {
                executorService.
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
        }


    }

    private static List<Account> getAccount() {
        return List.of(
                new Account("Antonio", 20, AccountVersion.VERSION1),
                new Account("Ronaldo", 38, AccountVersion.OG),
                new Account("Bruno", 28, AccountVersion.VERSION2),
                new Account("Pogba", 25, AccountVersion.VERSION1),
                new Account("Modric", 35, AccountVersion.OG),
                new Account("Degea", 30, AccountVersion.VERSION1),
                new Account("Lukaka", 18, AccountVersion.VERSION2),
                new Account("Halaand", 18, AccountVersion.VERSION1)
        );
    }
}
