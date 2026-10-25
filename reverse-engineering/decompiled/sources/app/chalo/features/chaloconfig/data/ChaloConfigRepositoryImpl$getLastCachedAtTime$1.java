package app.chalo.features.chaloconfig.data;

import app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSource;
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
@DebugMetadata(c = "app.chalo.features.chaloconfig.data.ChaloConfigRepositoryImpl", f = "ChaloConfigRepositoryImpl.kt", l = {21}, m = "getLastCachedAtTime", v = 1)
final class ChaloConfigRepositoryImpl$getLastCachedAtTime$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloConfigRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloConfigRepositoryImpl$getLastCachedAtTime$1(ChaloConfigRepositoryImpl chaloConfigRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = chaloConfigRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloConfigRepositoryImpl$getLastCachedAtTime$1 chaloConfigRepositoryImpl$getLastCachedAtTime$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ChaloConfigRepositoryImpl chaloConfigRepositoryImpl = this.this$0;
        chaloConfigRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            chaloConfigRepositoryImpl$getLastCachedAtTime$1 = this;
        } else {
            chaloConfigRepositoryImpl$getLastCachedAtTime$1 = new ChaloConfigRepositoryImpl$getLastCachedAtTime$1(chaloConfigRepositoryImpl, this);
        }
        Object objC = chaloConfigRepositoryImpl$getLastCachedAtTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigRepositoryImpl$getLastCachedAtTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            ChaloConfigLocalDataSource chaloConfigLocalDataSource = chaloConfigRepositoryImpl.f2631a;
            chaloConfigRepositoryImpl$getLastCachedAtTime$1.label = 1;
            objC = chaloConfigLocalDataSource.c("keyLastCachedAtTime", chaloConfigRepositoryImpl$getLastCachedAtTime$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        String str = (String) objC;
        if (str != null) {
            return StringsKt.t0(str);
        }
        return null;
    }
}
