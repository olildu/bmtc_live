package app.chalo.premiumbus.ui.slotselection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent", f = "PremiumBusSlotSelectionComponent.kt", l = {3366, 3369, 3376}, m = "buildPassRideLeftString", v = 1)
final class PremiumBusSlotSelectionComponent$buildPassRideLeftString$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$buildPassRideLeftString$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = premiumBusSlotSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PremiumBusSlotSelectionComponent.H0(this.this$0, 0, 0, this);
    }
}
