package app.chalo.utils.timeutil;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.utils.timeutil.TimeUtilsContractImpl", f = "TimeUtilsContractImpl.kt", l = {475, 481, 481, 484, 484, 489, 489, 490}, m = "getHoursAndMinutesStringFromMillis", v = 1)
final class TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimeUtilsContractImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeUtilsContractImpl$getHoursAndMinutesStringFromMillis$1(TimeUtilsContractImpl timeUtilsContractImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = timeUtilsContractImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, this);
    }
}
