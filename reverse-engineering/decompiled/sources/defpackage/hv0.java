package defpackage;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.domain.ODPairWithSlotsListAppModel;
import app.chalo.premiumbus.domain.ODPairsAndRespectiveSlotsBetweenStops;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PassPurchaseNudgeType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15864a = 0;
    public final /* synthetic */ PBODPairWithSlotSectionListUiModel b;
    public final /* synthetic */ ODPairWithSlotsListAppModel c;
    public final /* synthetic */ ChaloUseCaseResult d;
    public final /* synthetic */ PassPurchaseNudgeType e;

    public /* synthetic */ hv0(PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel, PassPurchaseNudgeType passPurchaseNudgeType, ChaloUseCaseResult chaloUseCaseResult) {
        this.b = pBODPairWithSlotSectionListUiModel;
        this.c = oDPairWithSlotsListAppModel;
        this.e = passPurchaseNudgeType;
        this.d = chaloUseCaseResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) obj;
        switch (this.f15864a) {
            case 0:
                Map map = premiumBusSlotSelectionDataState.g;
                LinkedHashMap linkedHashMapU = map != null ? MapsKt.u(map) : new LinkedHashMap();
                long j = this.b.f7820a;
                PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(j));
                PassPurchaseNudgeType passPurchaseNudgeType = this.e;
                if (pBODPairWithSlotSectionListUiModel != null) {
                    Long lValueOf = Long.valueOf(j);
                    ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops = (ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) this.d).f10419a;
                    linkedHashMapU.put(lValueOf, PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, oDPairsAndRespectiveSlotsBetweenStops, null, passPurchaseNudgeType instanceof PassPurchaseNudgeType.PassPurchaseNudgeCard, oDPairsAndRespectiveSlotsBetweenStops.c, 0, oDPairsAndRespectiveSlotsBetweenStops.e, false, 11195));
                }
                ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel = this.c;
                PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions = null;
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModelA = oDPairWithSlotsListAppModel != null ? oDPairWithSlotsListAppModel.a() : null;
                if (passPurchaseNudgeType instanceof PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) {
                    PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet passPurchaseOptionsBottomSheet = (PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) passPurchaseNudgeType;
                    availablePurchaseOptions = new PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions(passPurchaseOptionsBottomSheet.f7833a, passPurchaseOptionsBottomSheet.b);
                } else if (!Intrinsics.d(passPurchaseNudgeType, PassPurchaseNudgeType.PassPurchaseNudgeCard.f7832a) && passPurchaseNudgeType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, false, null, null, availablePurchaseOptions, linkedHashMapU, Long.valueOf(j), pBAvailableSlotsTripAppModelA, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, passPurchaseNudgeType, false, null, null, null, null, null, -33554925);
            default:
                Map map2 = premiumBusSlotSelectionDataState.g;
                LinkedHashMap linkedHashMapU2 = map2 != null ? MapsKt.u(map2) : new LinkedHashMap();
                long j2 = this.b.f7820a;
                PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2 = (PBODPairWithSlotSectionListUiModel) linkedHashMapU2.get(Long.valueOf(j2));
                ChaloUseCaseResult chaloUseCaseResult = this.d;
                PassPurchaseNudgeType passPurchaseNudgeType2 = this.e;
                if (pBODPairWithSlotSectionListUiModel2 != null) {
                    Long lValueOf2 = Long.valueOf(j2);
                    ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops2 = (ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    linkedHashMapU2.put(lValueOf2, PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel2, oDPairsAndRespectiveSlotsBetweenStops2, null, passPurchaseNudgeType2 instanceof PassPurchaseNudgeType.PassPurchaseNudgeCard, oDPairsAndRespectiveSlotsBetweenStops2.c, 0, oDPairsAndRespectiveSlotsBetweenStops2.e, false, 11195));
                }
                ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel2 = this.c;
                PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions2 = null;
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModelA2 = oDPairWithSlotsListAppModel2 != null ? oDPairWithSlotsListAppModel2.a() : null;
                int i = ((ODPairsAndRespectiveSlotsBetweenStops) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f;
                if (passPurchaseNudgeType2 instanceof PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) {
                    PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet passPurchaseOptionsBottomSheet2 = (PassPurchaseNudgeType.PassPurchaseOptionsBottomSheet) passPurchaseNudgeType2;
                    availablePurchaseOptions2 = new PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions(passPurchaseOptionsBottomSheet2.f7833a, passPurchaseOptionsBottomSheet2.b);
                } else if (!Intrinsics.d(passPurchaseNudgeType2, PassPurchaseNudgeType.PassPurchaseNudgeCard.f7832a) && passPurchaseNudgeType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, false, null, null, availablePurchaseOptions2, linkedHashMapU2, Long.valueOf(j2), pBAvailableSlotsTripAppModelA2, 0, null, null, null, false, null, null, null, null, false, null, null, null, i, passPurchaseNudgeType2, false, null, null, null, null, null, -50332141);
        }
    }

    public /* synthetic */ hv0(PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel, ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel, ChaloUseCaseResult chaloUseCaseResult, PassPurchaseNudgeType passPurchaseNudgeType) {
        this.b = pBODPairWithSlotSectionListUiModel;
        this.c = oDPairWithSlotsListAppModel;
        this.d = chaloUseCaseResult;
        this.e = passPurchaseNudgeType;
    }
}
