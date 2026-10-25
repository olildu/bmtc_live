package defpackage;

import app.chalo.compose.SearchFieldSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ml1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18408a;
    public final /* synthetic */ TripPlannerResultsComponent b;

    public /* synthetic */ ml1(TripPlannerResultsComponent tripPlannerResultsComponent, int i) {
        this.f18408a = i;
        this.b = tripPlannerResultsComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18408a;
        TripPlannerResultsComponent tripPlannerResultsComponent = this.b;
        switch (i) {
            case 0:
                TripPlannerResultsState it = (TripPlannerResultsState) obj;
                List list = TripPlannerResultsComponent.Z;
                Intrinsics.i(it, "it");
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = tripPlannerResultsComponent.M;
                String str = universalSearchDescriptiveLocationAppModel != null ? universalSearchDescriptiveLocationAppModel.b : null;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = tripPlannerResultsComponent.N;
                return TripPlannerResultsState.a(it, str, universalSearchDescriptiveLocationAppModel2 != null ? universalSearchDescriptiveLocationAppModel2.b : null, null, null, false, SearchFieldSectionType.WITHOUT_PROCEED_BTN, false, null, null, null, null, null, null, null, false, null, false, false, false, false, 1048540);
            case 1:
                TripPlannerResultsState it2 = (TripPlannerResultsState) obj;
                List list2 = TripPlannerResultsComponent.Z;
                Intrinsics.i(it2, "it");
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel3 = tripPlannerResultsComponent.M;
                String str2 = universalSearchDescriptiveLocationAppModel3 != null ? universalSearchDescriptiveLocationAppModel3.b : null;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel4 = tripPlannerResultsComponent.N;
                return TripPlannerResultsState.a(it2, str2, universalSearchDescriptiveLocationAppModel4 != null ? universalSearchDescriptiveLocationAppModel4.b : null, null, null, false, null, false, null, null, null, null, null, null, null, false, null, false, false, false, false, 1048572);
            case 2:
                TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) obj;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel5 = tripPlannerResultsComponent.M;
                return TripPlannerResultsState.a(tripPlannerResultsState, universalSearchDescriptiveLocationAppModel5 != null ? universalSearchDescriptiveLocationAppModel5.b : null, null, null, null, false, tripPlannerResultsComponent.S0() ? SearchFieldSectionType.WITHOUT_PROCEED_BTN : SearchFieldSectionType.WITH_PROCEED_BTN, tripPlannerResultsComponent.S0(), null, null, null, null, null, null, null, false, null, false, false, false, false, 1048478);
            case 3:
                TripPlannerResultsState tripPlannerResultsState2 = (TripPlannerResultsState) obj;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel6 = tripPlannerResultsComponent.M;
                String str3 = universalSearchDescriptiveLocationAppModel6 != null ? universalSearchDescriptiveLocationAppModel6.b : null;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel7 = tripPlannerResultsComponent.N;
                return TripPlannerResultsState.a(tripPlannerResultsState2, str3, universalSearchDescriptiveLocationAppModel7 != null ? universalSearchDescriptiveLocationAppModel7.b : null, null, null, false, tripPlannerResultsComponent.S0() ? SearchFieldSectionType.WITHOUT_PROCEED_BTN : SearchFieldSectionType.WITH_PROCEED_BTN, tripPlannerResultsComponent.S0(), null, null, null, null, null, null, null, false, null, false, false, false, false, 1048476);
            default:
                TripPlannerResultIntent it3 = (TripPlannerResultIntent) obj;
                Intrinsics.i(it3, "it");
                tripPlannerResultsComponent.T0(it3);
                return Unit.f17538a;
        }
    }
}
