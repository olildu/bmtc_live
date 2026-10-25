package app.chalo.premiumbus.ui.slotselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2", f = "PremiumBusSlotSelectionComponent.kt", l = {1330, 1355}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PBODPairWithSlotSectionListUiModel $section;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$section = pBODPairWithSlotSectionListUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2 premiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2 = new PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2(this.this$0, this.$section, continuation);
        premiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2.L$0 = obj;
        return premiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        if (r2 == r13) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairs$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
