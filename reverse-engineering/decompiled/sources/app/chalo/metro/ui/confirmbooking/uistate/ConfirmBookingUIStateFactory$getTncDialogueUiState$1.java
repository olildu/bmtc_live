package app.chalo.metro.ui.confirmbooking.uistate;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.confirmbooking.uistate.ConfirmBookingUIStateFactory", f = "ConfirmBookingUIStateFactory.kt", l = {274, 300}, m = "getTncDialogueUiState", v = 1)
final class ConfirmBookingUIStateFactory$getTncDialogueUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfirmBookingUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmBookingUIStateFactory$getTncDialogueUiState$1(ConfirmBookingUIStateFactory confirmBookingUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = confirmBookingUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
