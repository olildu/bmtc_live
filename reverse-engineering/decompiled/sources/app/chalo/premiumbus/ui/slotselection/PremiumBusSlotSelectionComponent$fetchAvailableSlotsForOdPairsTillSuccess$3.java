package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import java.util.List;
import java.util.Map;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3", f = "PremiumBusSlotSelectionComponent.kt", l = {1649, 1659, 1670, 1683}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PBOriginDestinationAppModel> $odPairList;
    final /* synthetic */ PBODPairWithSlotSectionListUiModel $preferredSection;
    final /* synthetic */ Map<Long, PBODPairWithSlotSectionListUiModel> $sectionInfoMap;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, List list, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$preferredSection = pBODPairWithSlotSectionListUiModel;
        this.$odPairList = list;
        this.$sectionInfoMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3(this.this$0, this.$preferredSection, this.$odPairList, this.$sectionInfoMap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[PHI: r0
      0x00e8: PHI (r0v16 java.lang.Object) = (r0v13 java.lang.Object), (r0v44 java.lang.Object) binds: [B:44:0x00e5, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
    
        if (r0 == r13) goto L57;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
