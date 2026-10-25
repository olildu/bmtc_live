package defpackage;

import app.chalo.premiumbus.domain.ODPairAndSlotsFetchFailedReasons;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionErrorScreenType;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.StringResourcesBase;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15679a;
    public final /* synthetic */ ChaloUseCaseResult.Failure b;
    public final /* synthetic */ PBODPairWithSlotSectionListUiModel c;

    public /* synthetic */ fv0(PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, ChaloUseCaseResult.Failure failure) {
        this.f15679a = 2;
        this.c = pBODPairWithSlotSectionListUiModel;
        this.b = failure;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMapU;
        PremiumBusSlotSelectionDataState it = (PremiumBusSlotSelectionDataState) obj;
        switch (this.f15679a) {
            case 0:
                Intrinsics.i(it, "it");
                return PremiumBusSlotSelectionDataState.a(it, false, false, false, SlotSelectionErrorScreenType.NO_ROUTE_AVAILABLE, new StringResourcesBase.GenericErrorMsgWithErrorCode(((ODPairAndSlotsFetchFailedReasons) this.b.f10418a).a()), null, null, Long.valueOf(this.c.f7820a), null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -160);
            case 1:
                Intrinsics.i(it, "it");
                return PremiumBusSlotSelectionDataState.a(it, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, new StringResourcesBase.GenericErrorMsgWithErrorCode(((ODPairAndSlotsFetchFailedReasons) this.b.f10418a).a()), null, null, Long.valueOf(this.c.f7820a), null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -160);
            default:
                long j = this.c.f7820a;
                Map map = it.g;
                if (map != null) {
                    linkedHashMapU = MapsKt.u(map);
                    PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(j));
                    if (pBODPairWithSlotSectionListUiModel != null) {
                        linkedHashMapU.put(Long.valueOf(j), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, null, null, false, 0, 0, true, false, 11263));
                    }
                } else {
                    linkedHashMapU = null;
                }
                return PremiumBusSlotSelectionDataState.a(it, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, new StringResourcesBase.GenericErrorMsgWithErrorCode(((ODPairAndSlotsFetchFailedReasons) this.b.f10418a).a()), null, linkedHashMapU, Long.valueOf(j), null, 0, null, null, null, false, null, null, null, null, false, null, null, null, it.w, null, false, null, null, null, null, null, -16777440);
        }
    }

    public /* synthetic */ fv0(ChaloUseCaseResult.Failure failure, PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, int i) {
        this.f15679a = i;
        this.b = failure;
        this.c = pBODPairWithSlotSectionListUiModel;
    }
}
