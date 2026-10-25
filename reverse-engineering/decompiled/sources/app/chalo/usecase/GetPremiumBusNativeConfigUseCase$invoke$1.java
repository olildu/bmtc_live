package app.chalo.usecase;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.GetPremiumBusNativeConfigUseCase", f = "GetPremiumBusNativeConfigUseCase.kt", l = {21, 24, 26}, m = "invoke", v = 1)
final class GetPremiumBusNativeConfigUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetPremiumBusNativeConfigUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPremiumBusNativeConfigUseCase$invoke$1(GetPremiumBusNativeConfigUseCase getPremiumBusNativeConfigUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getPremiumBusNativeConfigUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
