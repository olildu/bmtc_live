package app.cash.sqldelight.db;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult;", "T", "", "Value", "AsyncValue", "Companion", "Lapp/cash/sqldelight/db/QueryResult$AsyncValue;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface QueryResult<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f706a = Companion.f707a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0088\u0001\u0003\u0092\u0001\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¨\u0006\u0007"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult$AsyncValue;", "T", "Lapp/cash/sqldelight/db/QueryResult;", "getter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    public static final class AsyncValue<T> implements QueryResult<T> {
        public final SuspendLambda b;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
        @Override // app.cash.sqldelight.db.QueryResult
        public final Object a(ContinuationImpl continuationImpl) {
            return this.b.invoke(continuationImpl);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AsyncValue) {
                return this.b.equals(((AsyncValue) obj).b);
            }
            return false;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        /* JADX INFO: renamed from: getValue */
        public final Object getB() {
            throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AsyncValue(getter=" + this.b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult$Companion;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f707a = new Companion();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087@\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0088\u0001\u0003\u0092\u0001\u00028\u0001¨\u0006\u0004"}, d2 = {"Lapp/cash/sqldelight/db/QueryResult$Value;", "T", "Lapp/cash/sqldelight/db/QueryResult;", "value", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    public static final class Value<T> implements QueryResult<T> {
        public final Object b;

        @Override // app.cash.sqldelight.db.QueryResult
        public final Object a(ContinuationImpl continuationImpl) {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Value) {
                return Intrinsics.d(this.b, ((Value) obj).b);
            }
            return false;
        }

        @Override // app.cash.sqldelight.db.QueryResult
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final Object getB() {
            return this.b;
        }

        public final int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "Value(value=" + this.b + ')';
        }
    }

    Object a(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: getValue */
    Object getB();
}
