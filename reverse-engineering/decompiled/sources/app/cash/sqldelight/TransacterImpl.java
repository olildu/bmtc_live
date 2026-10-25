package app.cash.sqldelight;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/cash/sqldelight/TransacterImpl;", "Lapp/cash/sqldelight/BaseTransacterImpl;", "Lapp/cash/sqldelight/Transacter;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TransacterImpl extends BaseTransacterImpl implements Transacter {
    public final void V(Function1 function1) throws Throwable {
        Object objInvoke;
        Transacter.Transaction transaction = (Transacter.Transaction) this.f697a.N0().getB();
        Transacter.Transaction transactionD = transaction.d();
        Throwable th = null;
        try {
            objInvoke = function1.invoke(new TransactionWrapper());
            try {
                transaction.f = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            objInvoke = null;
        }
        transaction.c();
        U(transaction, transactionD, th, objInvoke);
    }
}
