package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.domain.SlotSelectionSectionInfoManager;
import defpackage.dv0;
import defpackage.et0;
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
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handleSectionItemClickedIntent$1", f = "PremiumBusSlotSelectionComponent.kt", l = {792, 826}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handleSectionItemClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSlotSelectionIntent.SectionItemClickedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handleSectionItemClickedIntent$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.SectionItemClickedIntent sectionItemClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$intent = sectionItemClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handleSectionItemClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$handleSectionItemClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2;
        PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent;
        Job job;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        Job job2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            SlotSelectionSectionInfoManager slotSelectionSectionInfoManager = this.this$0.x;
            long j = this.$intent.f7883a;
            this.label = 1;
            if (slotSelectionSectionInfoManager.a(j, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pBODPairWithSlotSectionListUiModel2 = (PBODPairWithSlotSectionListUiModel) this.L$0;
            ResultKt.b(obj);
        }
        if (((List) obj).isEmpty()) {
            return unit;
        }
        pBODPairWithSlotSectionListUiModel = pBODPairWithSlotSectionListUiModel2;
        premiumBusSlotSelectionComponent = this.this$0;
        StateFlow stateFlow = premiumBusSlotSelectionComponent.f;
        job = premiumBusSlotSelectionComponent.M;
        if (job != null && ((AbstractCoroutine) job).isActive() && (job2 = premiumBusSlotSelectionComponent.M) != null) {
            ((JobSupport) job2).cancel(null);
        }
        pBStopPlaceSelectedAppModel = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).q;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = ((PremiumBusSlotSelectionDataState) stateFlow.getValue()).r;
        if (pBStopPlaceSelectedAppModel != null || pBStopPlaceSelectedAppModel2 == null) {
            premiumBusSlotSelectionComponent.E0(new vu0(25));
            return unit;
        }
        premiumBusSlotSelectionComponent.M = BuildersKt.d(premiumBusSlotSelectionComponent.j, null, null, new PremiumBusSlotSelectionComponent$fetchAvailableSlotsForODPairsManual$2(premiumBusSlotSelectionComponent, pBODPairWithSlotSectionListUiModel, null), 3);
        return unit;
        this.this$0.E0(new et0(this.$intent, 24));
        Map map = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).g;
        pBODPairWithSlotSectionListUiModel = map != null ? (PBODPairWithSlotSectionListUiModel) map.get(new Long(this.$intent.f7883a)) : null;
        if (pBODPairWithSlotSectionListUiModel == null) {
            this.this$0.E0(new dv0(11));
            return unit;
        }
        if (((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).v.isEmpty()) {
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent2 = this.this$0;
            this.L$0 = pBODPairWithSlotSectionListUiModel;
            this.label = 2;
            Object objJ0 = PremiumBusSlotSelectionComponent.J0(premiumBusSlotSelectionComponent2, this);
            if (objJ0 != coroutineSingletons) {
                pBODPairWithSlotSectionListUiModel2 = pBODPairWithSlotSectionListUiModel;
                obj = objJ0;
                if (((List) obj).isEmpty()) {
                    return unit;
                }
                pBODPairWithSlotSectionListUiModel = pBODPairWithSlotSectionListUiModel2;
            }
            return coroutineSingletons;
        }
        premiumBusSlotSelectionComponent = this.this$0;
        StateFlow stateFlow2 = premiumBusSlotSelectionComponent.f;
        job = premiumBusSlotSelectionComponent.M;
        if (job != null) {
            ((JobSupport) job2).cancel(null);
        }
        pBStopPlaceSelectedAppModel = ((PremiumBusSlotSelectionDataState) stateFlow2.getValue()).q;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = ((PremiumBusSlotSelectionDataState) stateFlow2.getValue()).r;
        if (pBStopPlaceSelectedAppModel != null) {
        }
        premiumBusSlotSelectionComponent.E0(new vu0(25));
        return unit;
    }
}
