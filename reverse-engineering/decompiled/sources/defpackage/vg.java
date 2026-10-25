package defpackage;

import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19834a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PBStopPlaceSelectedAppModel c;

    public /* synthetic */ vg(boolean z, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, int i) {
        this.f19834a = i;
        this.b = z;
        this.c = pBStopPlaceSelectedAppModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19834a) {
            case 0:
                ChaloBusViewState it = (ChaloBusViewState) obj;
                Intrinsics.i(it, "it");
                PBStopSelectionScreenBottomSheetType newRouteSuggestion = it.d;
                if (newRouteSuggestion instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) {
                    boolean z = this.b;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.c;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = z ? pBStopPlaceSelectedAppModel : ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) newRouteSuggestion).f7957a;
                    if (z) {
                        pBStopPlaceSelectedAppModel = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) newRouteSuggestion).b;
                    }
                    newRouteSuggestion = new PBStopSelectionScreenBottomSheetType.NewRouteSuggestion(pBStopPlaceSelectedAppModel2, pBStopPlaceSelectedAppModel);
                }
                return ChaloBusViewState.a(it, null, false, 0, newRouteSuggestion, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435447);
            case 1:
                PbPassPurchaseLandingScreenDataState it2 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it2, "it");
                PBStopSelectionScreenBottomSheetType newRouteSuggestion2 = it2.e;
                if (newRouteSuggestion2 instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) {
                    boolean z2 = this.b;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = this.c;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = z2 ? pBStopPlaceSelectedAppModel3 : ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) newRouteSuggestion2).f7957a;
                    if (z2) {
                        pBStopPlaceSelectedAppModel3 = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) newRouteSuggestion2).b;
                    }
                    newRouteSuggestion2 = new PBStopSelectionScreenBottomSheetType.NewRouteSuggestion(pBStopPlaceSelectedAppModel4, pBStopPlaceSelectedAppModel3);
                }
                return PbPassPurchaseLandingScreenDataState.a(it2, null, false, false, false, newRouteSuggestion2, null, null, null, false, false, 4063);
            default:
                PremiumBusStopSelectionViewState it3 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it3, "it");
                PBStopSelectionScreenBottomSheetType newRouteSuggestion3 = it3.f;
                if (newRouteSuggestion3 instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) {
                    boolean z3 = this.b;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = this.c;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel6 = z3 ? pBStopPlaceSelectedAppModel5 : ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) newRouteSuggestion3).f7957a;
                    if (z3) {
                        pBStopPlaceSelectedAppModel5 = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) newRouteSuggestion3).b;
                    }
                    newRouteSuggestion3 = new PBStopSelectionScreenBottomSheetType.NewRouteSuggestion(pBStopPlaceSelectedAppModel6, pBStopPlaceSelectedAppModel5);
                }
                return PremiumBusStopSelectionViewState.a(it3, null, false, false, null, null, newRouteSuggestion3, null, false, null, false, false, null, null, 131039);
        }
    }
}
