package app.cash.sqldelight;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.cash.sqldelight.db.QueryResult;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.SuspendingTransacterImpl", f = "Transacter.kt", l = {TypedValues.CycleType.TYPE_ALPHA, WalletConstants.ERROR_CODE_UNKNOWN, 418, 418, 418}, m = "transactionWithWrapper")
final class SuspendingTransacterImpl$transactionWithWrapper$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuspendingTransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingTransacterImpl$transactionWithWrapper$1(SuspendingTransacterImpl suspendingTransacterImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = suspendingTransacterImpl;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuspendingTransacterImpl$transactionWithWrapper$1<R> suspendingTransacterImpl$transactionWithWrapper$1;
        SuspendingTransacterImpl suspendingTransacterImpl;
        boolean z;
        Function2 function2;
        Transacter.Transaction transaction;
        Transacter.Transaction transaction2;
        Transacter.Transaction transaction3;
        SuspendingTransacterImpl suspendingTransacterImpl2;
        Transacter.Transaction transaction4;
        QueryResult queryResultC;
        Throwable th;
        Object obj2;
        SuspendingTransacterImpl suspendingTransacterImpl3;
        Transacter.Transaction transaction5;
        QueryResult queryResultC2;
        Transacter.Transaction transaction6;
        Object obj3;
        SuspendingTransacterImpl suspendingTransacterImpl4;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SuspendingTransacterImpl suspendingTransacterImpl5 = this.this$0;
        suspendingTransacterImpl5.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            suspendingTransacterImpl$transactionWithWrapper$1 = this;
        } else {
            suspendingTransacterImpl$transactionWithWrapper$1 = new SuspendingTransacterImpl$transactionWithWrapper$1<>(suspendingTransacterImpl5, this);
        }
        Object objA = suspendingTransacterImpl$transactionWithWrapper$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = suspendingTransacterImpl$transactionWithWrapper$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            QueryResult queryResultN0 = suspendingTransacterImpl5.f697a.N0();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl5;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = null;
            suspendingTransacterImpl$transactionWithWrapper$1.Z$0 = false;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 1;
            objA = queryResultN0.a(suspendingTransacterImpl$transactionWithWrapper$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            suspendingTransacterImpl = suspendingTransacterImpl5;
            z = false;
            function2 = null;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    transaction4 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                    transaction3 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                    suspendingTransacterImpl2 = (SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                    try {
                        ResultKt.b(objA);
                        try {
                            transaction3.f = true;
                            queryResultC2 = transaction3.c();
                            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl2;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = transaction3;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = transaction4;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$3 = objA;
                            suspendingTransacterImpl$transactionWithWrapper$1.label = 3;
                            if (((QueryResult.Value) queryResultC2).b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            transaction6 = transaction4;
                            obj3 = objA;
                            suspendingTransacterImpl4 = suspendingTransacterImpl2;
                        } catch (Throwable th2) {
                            transaction5 = transaction3;
                            transaction2 = transaction4;
                            th = th2;
                            transaction = transaction5;
                            suspendingTransacterImpl = suspendingTransacterImpl2;
                            queryResultC = transaction.c();
                            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = transaction;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = transaction2;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$3 = th;
                            suspendingTransacterImpl$transactionWithWrapper$1.L$4 = objA;
                            suspendingTransacterImpl$transactionWithWrapper$1.label = 4;
                            if (((QueryResult.Value) queryResultC).b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            th = th;
                            obj2 = objA;
                            suspendingTransacterImpl3 = suspendingTransacterImpl;
                            return suspendingTransacterImpl3.U(transaction, transaction2, th, obj2);
                        }
                    } catch (Throwable th3) {
                        transaction5 = transaction3;
                        transaction2 = transaction4;
                        th = th3;
                        objA = null;
                        transaction = transaction5;
                        suspendingTransacterImpl = suspendingTransacterImpl2;
                        queryResultC = transaction.c();
                        suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl;
                        suspendingTransacterImpl$transactionWithWrapper$1.L$1 = transaction;
                        suspendingTransacterImpl$transactionWithWrapper$1.L$2 = transaction2;
                        suspendingTransacterImpl$transactionWithWrapper$1.L$3 = th;
                        suspendingTransacterImpl$transactionWithWrapper$1.L$4 = objA;
                        suspendingTransacterImpl$transactionWithWrapper$1.label = 4;
                        if (((QueryResult.Value) queryResultC).b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        th = th;
                        obj2 = objA;
                        suspendingTransacterImpl3 = suspendingTransacterImpl;
                        return suspendingTransacterImpl3.U(transaction, transaction2, th, obj2);
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            obj2 = suspendingTransacterImpl$transactionWithWrapper$1.L$4;
                            th = (Throwable) suspendingTransacterImpl$transactionWithWrapper$1.L$3;
                            transaction2 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                            transaction = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                            suspendingTransacterImpl3 = (SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                            ResultKt.b(objA);
                            return suspendingTransacterImpl3.U(transaction, transaction2, th, obj2);
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj4 = suspendingTransacterImpl$transactionWithWrapper$1.L$3;
                        Transacter.Transaction transaction7 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                        Transacter.Transaction transaction8 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                        SuspendingTransacterImpl suspendingTransacterImpl6 = (SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                        ResultKt.b(objA);
                        return suspendingTransacterImpl6.U(transaction8, transaction7, null, obj4);
                    }
                    obj3 = suspendingTransacterImpl$transactionWithWrapper$1.L$3;
                    transaction6 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$2;
                    transaction3 = (Transacter.Transaction) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
                    suspendingTransacterImpl4 = (SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
                    ResultKt.b(objA);
                }
                return suspendingTransacterImpl4.U(transaction3, transaction6, null, obj3);
            }
            z = suspendingTransacterImpl$transactionWithWrapper$1.Z$0;
            function2 = (Function2) suspendingTransacterImpl$transactionWithWrapper$1.L$1;
            suspendingTransacterImpl = (SuspendingTransacterImpl) suspendingTransacterImpl$transactionWithWrapper$1.L$0;
            ResultKt.b(objA);
        }
        Transacter.Transaction transaction9 = (Transacter.Transaction) objA;
        Transacter.Transaction transactionD = transaction9.d();
        if (transactionD != null && z) {
            throw new IllegalStateException("Already in a transaction");
        }
        try {
            SuspendingTransactionWrapper suspendingTransactionWrapper = new SuspendingTransactionWrapper();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = transaction9;
            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = transactionD;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 2;
            Object objInvoke = function2.invoke(suspendingTransactionWrapper, suspendingTransacterImpl$transactionWithWrapper$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            transaction3 = transaction9;
            suspendingTransacterImpl2 = suspendingTransacterImpl;
            objA = objInvoke;
            transaction4 = transactionD;
            transaction3.f = true;
            queryResultC2 = transaction3.c();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl2;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = transaction3;
            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = transaction4;
            suspendingTransacterImpl$transactionWithWrapper$1.L$3 = objA;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 3;
            if (((QueryResult.Value) queryResultC2).b == coroutineSingletons) {
                return coroutineSingletons;
            }
            transaction6 = transaction4;
            obj3 = objA;
            suspendingTransacterImpl4 = suspendingTransacterImpl2;
            return suspendingTransacterImpl4.U(transaction3, transaction6, null, obj3);
        } catch (Throwable th4) {
            th = th4;
            transaction = transaction9;
            objA = null;
            transaction2 = transactionD;
            queryResultC = transaction.c();
            suspendingTransacterImpl$transactionWithWrapper$1.L$0 = suspendingTransacterImpl;
            suspendingTransacterImpl$transactionWithWrapper$1.L$1 = transaction;
            suspendingTransacterImpl$transactionWithWrapper$1.L$2 = transaction2;
            suspendingTransacterImpl$transactionWithWrapper$1.L$3 = th;
            suspendingTransacterImpl$transactionWithWrapper$1.L$4 = objA;
            suspendingTransacterImpl$transactionWithWrapper$1.label = 4;
            if (((QueryResult.Value) queryResultC).b == coroutineSingletons) {
                return coroutineSingletons;
            }
            th = th;
            obj2 = objA;
            suspendingTransacterImpl3 = suspendingTransacterImpl;
            return suspendingTransacterImpl3.U(transaction, transaction2, th, obj2);
        }
    }
}
