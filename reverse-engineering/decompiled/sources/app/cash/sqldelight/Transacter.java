package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/cash/sqldelight/Transacter;", "Lapp/cash/sqldelight/TransacterBase;", "Transaction", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Transacter extends TransacterBase {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/Transacter$Transaction;", "Lapp/cash/sqldelight/TransactionCallbacks;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Transaction implements TransactionCallbacks {
        public boolean f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f700a = Thread.currentThread().getId();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final LinkedHashSet d = new LinkedHashSet();
        public final LinkedHashSet e = new LinkedHashSet();
        public boolean g = true;

        public final void a() {
            if (this.f700a != Thread.currentThread().getId()) {
                throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
            }
        }

        public abstract QueryResult.Value b(boolean z);

        public final QueryResult c() {
            a();
            return b(this.f && this.g);
        }

        public abstract Transaction d();
    }
}
