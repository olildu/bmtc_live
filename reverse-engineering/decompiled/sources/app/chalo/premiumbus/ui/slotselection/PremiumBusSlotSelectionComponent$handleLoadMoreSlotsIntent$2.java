package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2", f = "PremiumBusSlotSelectionComponent.kt", l = {2868, 2878, 2904, 2919}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ PremiumBusSlotSelectionDataState $currentState;
    final /* synthetic */ List<PBOriginDestinationAppModel> $odPairList;
    final /* synthetic */ long $selectedSectionId;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, long j, List list, int i, PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$selectedSectionId = j;
        this.$odPairList = list;
        this.$currentPage = i;
        this.$currentState = premiumBusSlotSelectionDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2(this.this$0, this.$selectedSectionId, this.$odPairList, this.$currentPage, this.$currentState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r15 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleLoadMoreSlotsIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
