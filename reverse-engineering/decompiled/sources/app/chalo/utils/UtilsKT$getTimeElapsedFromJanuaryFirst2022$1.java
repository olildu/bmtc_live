package app.chalo.utils;

import app.chalo.contract.BasicInfoContract;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.utils.UtilsKT", f = "UtilsKT.kt", l = {160}, m = "getTimeElapsedFromJanuaryFirst2022", v = 1)
final class UtilsKT$getTimeElapsedFromJanuaryFirst2022$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UtilsKT this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKT$getTimeElapsedFromJanuaryFirst2022$1(UtilsKT utilsKT, Continuation continuation) {
        super(continuation);
        this.this$0 = utilsKT;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UtilsKT$getTimeElapsedFromJanuaryFirst2022$1 utilsKT$getTimeElapsedFromJanuaryFirst2022$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        UtilsKT utilsKT = this.this$0;
        UtilsKT utilsKT2 = UtilsKT.f10442a;
        utilsKT.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            utilsKT$getTimeElapsedFromJanuaryFirst2022$1 = this;
        } else {
            utilsKT$getTimeElapsedFromJanuaryFirst2022$1 = new UtilsKT$getTimeElapsedFromJanuaryFirst2022$1(utilsKT, this);
        }
        Object objC = utilsKT$getTimeElapsedFromJanuaryFirst2022$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = utilsKT$getTimeElapsedFromJanuaryFirst2022$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            BasicInfoContract basicInfoContract = (BasicInfoContract) UtilsKT.c.getValue();
            utilsKT$getTimeElapsedFromJanuaryFirst2022$1.label = 1;
            objC = basicInfoContract.c(utilsKT$getTimeElapsedFromJanuaryFirst2022$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        long jLongValue = ((Number) objC).longValue();
        long j = jLongValue / 1000;
        return new Pair(new Long((jLongValue - 1640995200000L) / 60000), new Long(j - ((j / 60) * 60)));
    }
}
