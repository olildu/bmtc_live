package app.chalo.walletframework.quickpay.data.repository;

import app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource;
import app.chalo.walletframework.quickpay.data.mapper.QuickPayModelsMapperKt;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl", f = "QuickPayRepositoryImpl.kt", l = {60}, m = "getQuickPay", v = 1)
final class QuickPayRepositoryImpl$getQuickPay$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuickPayRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickPayRepositoryImpl$getQuickPay$1(QuickPayRepositoryImpl quickPayRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = quickPayRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuickPayRepositoryImpl$getQuickPay$1 quickPayRepositoryImpl$getQuickPay$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        QuickPayRepositoryImpl quickPayRepositoryImpl = this.this$0;
        quickPayRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            quickPayRepositoryImpl$getQuickPay$1 = this;
        } else {
            quickPayRepositoryImpl$getQuickPay$1 = new QuickPayRepositoryImpl$getQuickPay$1(quickPayRepositoryImpl, this);
        }
        Object objN = quickPayRepositoryImpl$getQuickPay$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayRepositoryImpl$getQuickPay$1.label;
        if (i2 == 0) {
            ResultKt.b(objN);
            QuickPayLocalDataSource quickPayLocalDataSource = quickPayRepositoryImpl.f10922a;
            quickPayRepositoryImpl$getQuickPay$1.label = 1;
            objN = quickPayLocalDataSource.n(null, null, quickPayRepositoryImpl$getQuickPay$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        QuickPayEntity quickPayEntity = (QuickPayEntity) objN;
        if (quickPayEntity != null) {
            return QuickPayModelsMapperKt.a(quickPayEntity);
        }
        return null;
    }
}
