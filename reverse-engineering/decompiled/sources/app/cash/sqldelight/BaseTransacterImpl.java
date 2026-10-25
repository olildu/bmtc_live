package app.cash.sqldelight;

import app.cash.sqldelight.db.SqlDriver;
import defpackage.b3;
import defpackage.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/BaseTransacterImpl;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseTransacterImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SqlDriver f697a;

    public BaseTransacterImpl(SqlDriver driver) {
        Intrinsics.i(driver, "driver");
        this.f697a = driver;
    }

    public static String S(int i) {
        if (i == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder((i * 2) + 1);
        sb.append("(?");
        int i2 = i - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(",?");
        }
        return b3.c(')', "toString(...)", sb);
    }

    public final void T(int i, Function1 function1) {
        SqlDriver sqlDriver = this.f697a;
        Transacter.Transaction transactionN = sqlDriver.N();
        if (transactionN != null) {
            if (transactionN.d.add(Integer.valueOf(i))) {
                function1.invoke(new g(transactionN, 12));
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            function1.invoke(new g(linkedHashSet, 13));
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            sqlDriver.c1((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final Object U(Transacter.Transaction transaction, Transacter.Transaction transaction2, Throwable th, Object obj) throws Throwable {
        Intrinsics.i(transaction, "transaction");
        LinkedHashSet linkedHashSet = transaction.d;
        ArrayList arrayList = transaction.c;
        ArrayList arrayList2 = transaction.b;
        LinkedHashSet linkedHashSet2 = transaction.e;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        z = false;
        if (transaction2 != null) {
            if (transaction.f && transaction.g) {
                z = true;
            }
            transaction2.g = z;
            transaction2.b.addAll(arrayList2);
            transaction2.c.addAll(arrayList);
            transaction2.d.addAll(linkedHashSet);
            transaction2.e.addAll(linkedHashSet2);
        } else if (transaction.f && transaction.g) {
            if (!linkedHashSet2.isEmpty()) {
                String[] strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                this.f697a.c1((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            linkedHashSet2.clear();
            linkedHashSet.clear();
            int size = arrayList2.size();
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((Function0) obj2).invoke();
            }
            arrayList2.clear();
        } else {
            try {
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    ((Function0) obj3).invoke();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                if (th == null) {
                    throw th2;
                }
                throw new Throwable("Exception while rolling back from an exception.\nOriginal exception: " + th + "\nwith cause " + th.getCause() + "\n\nRollback exception: " + th2, th2);
            }
        }
        if (transaction2 == null && (th instanceof RollbackException)) {
            return ((RollbackException) th).getValue();
        }
        if (th == null) {
            return obj;
        }
        throw th;
    }
}
