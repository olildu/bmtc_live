package app.chalo.features.chaloconfig.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl", f = "ChaloConfigRepositoryImpl.kt", l = {132}, m = "getDouble", v = 1)
final class ChaloConfigRepositoryImpl$getDouble$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloConfigRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloConfigRepositoryImpl$getDouble$1(ChaloConfigRepositoryImpl chaloConfigRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = chaloConfigRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloConfigRepositoryImpl$getDouble$1 chaloConfigRepositoryImpl$getDouble$1;
        Double dM0;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ChaloConfigRepositoryImpl chaloConfigRepositoryImpl = this.this$0;
        chaloConfigRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            chaloConfigRepositoryImpl$getDouble$1 = this;
        } else {
            chaloConfigRepositoryImpl$getDouble$1 = new ChaloConfigRepositoryImpl$getDouble$1(chaloConfigRepositoryImpl, this);
        }
        Object obj2 = chaloConfigRepositoryImpl$getDouble$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getDouble$1.label;
        double dDoubleValue = 0.0d;
        if (i2 == 0) {
            ResultKt.b(obj2);
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            String str = (String) obj2;
            if (str != null && (dM0 = StringsKt.m0(str)) != null) {
                dDoubleValue = dM0.doubleValue();
            }
        }
        return new Double(dDoubleValue);
    }
}
