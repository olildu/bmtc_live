package defpackage;

import app.chalo.geoquery.data.exceptions.GeoQueryFetchFailedException;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerResult;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.livetracking.stoptripplannerresult.StopBasedTripPlannerResultsBottomSheetType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultErrorType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsectionType;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerStopEditTarget;
import app.chalo.livetracking.tripplanner.domain.ItineraryEtaInfo;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewDataState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadDataState;
import app.chalo.stoptripdetails.data.exceptions.LocationSummaryFetchFailedException;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import app.chalo.stoptripdetails.ui.TripScheduleScreenType;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.userprofile.Gender;
import app.chalo.utils.StopTripDetailsUtils;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mb1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18385a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 5;
        switch (this.f18385a) {
            case 0:
                StopBasedTripPlannerSearchDataState it = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it, "it");
                return StopBasedTripPlannerSearchDataState.a(it, null, null, null, null, null, false, null, null, null, null, 1983);
            case 1:
                StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it2, "it");
                return StopBasedTripPlannerSearchDataState.a(it2, null, null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1919);
            case 2:
                StopBasedTripPlannerSearchDataState it3 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it3, "it");
                return StopBasedTripPlannerSearchDataState.a(it3, null, null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1662);
            case 3:
                StopBasedTripPlannerSearchDataState it4 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it4, "it");
                return StopBasedTripPlannerSearchDataState.a(it4, null, null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1405);
            case 4:
                StopBasedTripPlannerSearchDataState it5 = (StopBasedTripPlannerSearchDataState) obj;
                Intrinsics.i(it5, "it");
                return StopBasedTripPlannerSearchDataState.a(it5, null, null, null, null, null, false, StopBasedTripPlannerSearchBottomSheetType.None.f4487a, null, null, null, 1919);
            case 5:
                String it6 = (String) obj;
                Intrinsics.i(it6, "it");
                return StringsKt.u0(it6).toString();
            case 6:
                StopTripDetailsViewState it7 = (StopTripDetailsViewState) obj;
                Intrinsics.i(it7, "it");
                return StopTripDetailsViewState.a(it7, null, null, null, null, TripScheduleScreenType.LOADING, null, 47);
            case 7:
                return StopTripDetailsViewState.a((StopTripDetailsViewState) obj, null, null, null, null, TripScheduleScreenType.ERROR, null, 47);
            case 8:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new GeoQueryFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new LocationSummaryFetchFailedException(genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 10:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new LocationSummaryFetchFailedException(genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 11:
                NearbyTripsDataManagerResult it8 = (NearbyTripsDataManagerResult) obj;
                Intrinsics.i(it8, "it");
                if (it8.b.a() != null) {
                    return 1;
                }
                switch (StopTripDetailsUtils.WhenMappings.f10440a[it8.f3121a.c.ordinal()]) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Integer.valueOf(i);
            case 12:
                NearbyTripsDataManagerResult it9 = (NearbyTripsDataManagerResult) obj;
                Intrinsics.i(it9, "it");
                ItineraryEtaInfo itineraryEtaInfoA = it9.b.a();
                return itineraryEtaInfoA != null ? Long.valueOf(itineraryEtaInfoA.f4698a) : Integer.valueOf(it9.f3121a.d);
            case 13:
                ((Boolean) obj).getClass();
                return Unit.f17538a;
            case 14:
                StopTripPlannerResultsDataState it10 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it10, "it");
                return StopTripPlannerResultsDataState.a(it10, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, StopTripPlannerStopEditTarget.NONE, false, null, false, null, 503807);
            case 15:
                StopTripPlannerResultsDataState it11 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it11, "it");
                return StopTripPlannerResultsDataState.a(it11, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 520191);
            case 16:
                StopTripPlannerResultsDataState it12 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it12, "it");
                return StopTripPlannerResultsDataState.a(it12, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 520191);
            case 17:
                StopTripPlannerResultsDataState it13 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it13, "it");
                return StopTripPlannerResultsDataState.a(it13, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 520191);
            case 18:
                StopTripPlannerResultsDataState it14 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it14, "it");
                return StopTripPlannerResultsDataState.a(it14, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487423);
            case 19:
                StopTripPlannerResultsDataState it15 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it15, "it");
                return StopTripPlannerResultsDataState.a(it15, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 487423);
            case 20:
                StopTripPlannerResultsDataState it16 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it16, "it");
                return StopTripPlannerResultsDataState.a(it16, null, null, null, null, null, null, null, null, null, null, null, true, null, false, null, false, null, 483327);
            case 21:
                return StopTripPlannerResultsDataState.a((StopTripPlannerResultsDataState) obj, null, null, null, null, null, null, null, null, null, null, StopBasedTripPlannerResultsBottomSheetType.None.f4528a, false, null, false, null, false, null, 520191);
            case 22:
                return StopTripPlannerResultsDataState.a((StopTripPlannerResultsDataState) obj, null, null, null, null, null, null, null, StopTripPlannerResultsectionType.LOADING, null, null, null, false, null, false, null, false, null, 524159);
            case 23:
                return StopTripPlannerResultsDataState.a((StopTripPlannerResultsDataState) obj, null, null, null, null, null, null, null, StopTripPlannerResultsectionType.ERROR, StopTripPlannerResultErrorType.API_FAILURE, null, null, false, null, false, null, false, null, 523903);
            case 24:
                StyledTextDataUIState it17 = (StyledTextDataUIState) obj;
                Intrinsics.i(it17, "it");
                return it17.f10086a;
            case 25:
                return SuperPassProofOverviewDataState.a((SuperPassProofOverviewDataState) obj, false, false, false, null, false, null, null, null, null, true, false, false, false, false, null, 32255);
            case 26:
                return SuperPassProofOverviewDataState.a((SuperPassProofOverviewDataState) obj, false, false, false, null, false, null, null, null, null, true, false, false, false, false, null, 32255);
            case 27:
                SuperPassPurchaseSharedState it18 = (SuperPassPurchaseSharedState) obj;
                Set set = SuperPassPurchaseSharedViewModel.G;
                Intrinsics.i(it18, "it");
                SuperPassUserDetails superPassUserDetails = it18.h;
                return SuperPassPurchaseSharedState.a(it18, null, null, null, new SuperPassUserDetails(superPassUserDetails.f9580a, superPassUserDetails.b, "", Gender.NULL, "", "", "", -1L), null, null, 0L, false, null, null, 262015);
            case 28:
                return SuperPassUserProofUploadDataState.a((SuperPassUserProofUploadDataState) obj, null, true, false, 5);
            default:
                return SuperPassUserProofUploadDataState.a((SuperPassUserProofUploadDataState) obj, null, true, false, 5);
        }
    }
}
