package app.chalo.productbooking.common.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productbooking.common.domain.FetchAvailableSlotsForPreBookingUseCase", f = "FetchAvailableSlotsForPreBookingUseCase.kt", l = {35, 37, 52, 60, 84}, m = "invoke", v = 1)
final class FetchAvailableSlotsForPreBookingUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchAvailableSlotsForPreBookingUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchAvailableSlotsForPreBookingUseCase$invoke$1(FetchAvailableSlotsForPreBookingUseCase fetchAvailableSlotsForPreBookingUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fetchAvailableSlotsForPreBookingUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, 0L, 0L, 0L, this);
    }
}
