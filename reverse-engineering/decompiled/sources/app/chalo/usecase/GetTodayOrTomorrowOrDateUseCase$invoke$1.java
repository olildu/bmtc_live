package app.chalo.usecase;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.GetTodayOrTomorrowOrDateUseCase", f = "GetTodayOrTomorrowOrDateUseCase.kt", l = {26, 43, 43, 47, 47}, m = "invoke", v = 1)
final class GetTodayOrTomorrowOrDateUseCase$invoke$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetTodayOrTomorrowOrDateUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTodayOrTomorrowOrDateUseCase$invoke$1(GetTodayOrTomorrowOrDateUseCase getTodayOrTomorrowOrDateUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getTodayOrTomorrowOrDateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, this);
    }
}
