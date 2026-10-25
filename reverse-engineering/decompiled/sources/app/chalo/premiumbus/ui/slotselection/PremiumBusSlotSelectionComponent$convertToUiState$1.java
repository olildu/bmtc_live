package app.chalo.premiumbus.ui.slotselection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent", f = "PremiumBusSlotSelectionComponent.kt", l = {245, 249, 265, 277, 281, 289, 308, 325, 342}, m = "convertToUiState", v = 1)
final class PremiumBusSlotSelectionComponent$convertToUiState$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$convertToUiState$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = premiumBusSlotSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p0(null, this);
    }
}
