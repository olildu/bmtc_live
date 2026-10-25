package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import defpackage.vu0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$fetchODPairsForGivenStopsAndProceed$2", f = "PremiumBusSlotSelectionComponent.kt", l = {1235}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$fetchODPairsForGivenStopsAndProceed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PBODPairWithSlotSectionListUiModel $preferredSection;
    final /* synthetic */ Map<Long, PBODPairWithSlotSectionListUiModel> $sectionInfoMap;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$fetchODPairsForGivenStopsAndProceed$2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$preferredSection = pBODPairWithSlotSectionListUiModel;
        this.$sectionInfoMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$fetchODPairsForGivenStopsAndProceed$2(this.this$0, this.$preferredSection, this.$sectionInfoMap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$fetchODPairsForGivenStopsAndProceed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
            this.label = 1;
            obj = PremiumBusSlotSelectionComponent.J0(premiumBusSlotSelectionComponent, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent2 = this.this$0;
            PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = this.$preferredSection;
            Map<Long, PBODPairWithSlotSectionListUiModel> map = this.$sectionInfoMap;
            premiumBusSlotSelectionComponent2.E0(new vu0(16));
            StateFlow stateFlow = premiumBusSlotSelectionComponent2.f;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).q;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).r;
            if (pBStopPlaceSelectedAppModel == null || pBStopPlaceSelectedAppModel2 == null) {
                premiumBusSlotSelectionComponent2.E0(new vu0(17));
            } else {
                premiumBusSlotSelectionComponent2.N = BuildersKt.d(premiumBusSlotSelectionComponent2.j, null, null, new PremiumBusSlotSelectionComponent$fetchAvailableSlotsForOdPairsTillSuccess$3(premiumBusSlotSelectionComponent2, pBODPairWithSlotSectionListUiModel, list, map, null), 3);
            }
        }
        return Unit.f17538a;
    }
}
