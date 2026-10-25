package defpackage;

import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenBottomSheetType;
import app.chalo.metro.ui.regular.StopBasedMetroLandingScreenDataState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19094a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ q60(LinkedHashMap linkedHashMap, int i) {
        this.f19094a = i;
        this.b = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19094a) {
            case 0:
                GroupTicketLegSelectionDataState it = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return GroupTicketLegSelectionDataState.a(it, null, false, null, null, null, this.b, 0, null, 223);
            case 1:
                GroupTicketLegSelectionDataState it2 = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return GroupTicketLegSelectionDataState.a(it2, null, false, null, null, this.b, null, 0, null, 239);
            case 2:
                MyTicketsDataState it3 = (MyTicketsDataState) obj;
                Intrinsics.i(it3, "it");
                return MyTicketsDataState.a(it3, null, null, null, false, false, null, null, null, null, false, this.b, false, null, false, false, null, false, null, null, null, false, 33550335);
            case 3:
                StopBasedMetroLandingScreenDataState it4 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedMetroLandingScreenDataState.a(it4, null, false, null, null, null, null, null, null, null, null, null, this.b, null, 6143);
            case 4:
                StopBasedMetroLandingScreenDataState it5 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it5, "it");
                return StopBasedMetroLandingScreenDataState.a(it5, null, false, null, null, null, null, null, null, null, null, StopBasedMetroLandingScreenBottomSheetType.PassengerSelection, this.b, null, 5119);
            case 5:
                StopBasedMetroLandingScreenDataState it6 = (StopBasedMetroLandingScreenDataState) obj;
                Intrinsics.i(it6, "it");
                return StopBasedMetroLandingScreenDataState.a(it6, null, false, null, null, null, null, null, null, null, null, null, this.b, null, 6143);
            default:
                SuperPassPurchaseSharedState it7 = (SuperPassPurchaseSharedState) obj;
                Set set = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it7, "it");
                return SuperPassPurchaseSharedState.a(it7, null, null, null, null, null, null, 0L, false, null, this.b, 229375);
        }
    }
}
