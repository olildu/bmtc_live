package app.chalo.features.chalotime.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase", f = "ValidateChaloTimeCacheUseCase.kt", l = {104}, m = "isCacheExpiryDurationExceeded", v = 1)
final class ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ValidateChaloTimeCacheUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1(ValidateChaloTimeCacheUseCase validateChaloTimeCacheUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = validateChaloTimeCacheUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0L, 0L, this);
    }
}
