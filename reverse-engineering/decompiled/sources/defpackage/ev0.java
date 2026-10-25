package defpackage;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.domain.ODPairWithSlotsListAppModel;
import app.chalo.premiumbus.domain.ODPairsAndRespectiveSlotsBetweenStops;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ev0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15591a;
    public final /* synthetic */ PremiumBusSlotSelectionComponent b;

    public /* synthetic */ ev0(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, int i) {
        this.f15591a = i;
        this.b = premiumBusSlotSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set setEntrySet;
        Map.Entry entry;
        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel;
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops;
        List list;
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel;
        List list2;
        switch (this.f15591a) {
            case 0:
                PremiumBusSlotSelectionDataState it = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it, "it");
                Map map = ((PremiumBusSlotSelectionDataState) this.b.f.getValue()).g;
                return PremiumBusSlotSelectionDataState.a(it, false, false, false, null, null, null, null, null, (map == null || (setEntrySet = map.entrySet()) == null || (entry = (Map.Entry) CollectionsKt.G(setEntrySet)) == null || (pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) entry.getValue()) == null || (oDPairsAndRespectiveSlotsBetweenStops = pBODPairWithSlotSectionListUiModel.c) == null || (list = oDPairsAndRespectiveSlotsBetweenStops.f7216a) == null || (oDPairWithSlotsListAppModel = (ODPairWithSlotsListAppModel) CollectionsKt.H(list)) == null || (pBAvailableSlotsInfoAppModel = oDPairWithSlotsListAppModel.c) == null || (list2 = pBAvailableSlotsInfoAppModel.c) == null) ? null : (PBAvailableSlotsTripAppModel) CollectionsKt.H(list2), 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -289);
            case 1:
                PremiumBusSlotSelectionIntent intent = (PremiumBusSlotSelectionIntent) obj;
                Intrinsics.i(intent, "intent");
                this.b.h1(intent);
                return Unit.f17538a;
            case 2:
                PremiumBusSlotSelectionIntent intent2 = (PremiumBusSlotSelectionIntent) obj;
                Intrinsics.i(intent2, "intent");
                this.b.h1(intent2);
                return Unit.f17538a;
            case 3:
                PremiumBusSlotSelectionIntent it2 = (PremiumBusSlotSelectionIntent) obj;
                Intrinsics.i(it2, "it");
                this.b.h1(it2);
                return Unit.f17538a;
            default:
                PremiumBusSlotSelectionIntent it3 = (PremiumBusSlotSelectionIntent) obj;
                Intrinsics.i(it3, "it");
                this.b.h1(it3);
                return Unit.f17538a;
        }
    }
}
