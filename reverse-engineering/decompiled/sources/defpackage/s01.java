package defpackage;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderRange;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.focus.FocusState;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.livetracking.routedetails.domain.RouteDetailsOptionsMenu;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsStopsListUIStateFactory;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.ChaloCardOperationType;
import app.chalo.ridehailing.feedback.RideFeedbackViewIntents;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import app.chalo.sos.SosScreenIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s01 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19259a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ s01(Function1 function1, int i) {
        this.f19259a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19259a;
        Unit unit = Unit.f17538a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                UniversalSearchRecentSearchItem.Route routeItem = (UniversalSearchRecentSearchItem.Route) obj;
                Intrinsics.i(routeItem, "routeItem");
                function1.invoke(new UniversalPickerIntent.RouteRecentItemClickIntent(routeItem));
                return unit;
            case 1:
                UniversalSearchRecentSearchItem.Stop stopItem = (UniversalSearchRecentSearchItem.Stop) obj;
                Intrinsics.i(stopItem, "stopItem");
                function1.invoke(new UniversalPickerIntent.StopRecentItemClickIntent(stopItem));
                return unit;
            case 2:
                UniversalSearchRecentSearchItem.Trip tripItem = (UniversalSearchRecentSearchItem.Trip) obj;
                Intrinsics.i(tripItem, "tripItem");
                function1.invoke(new UniversalPickerIntent.RecentTripItemClickIntent(tripItem));
                return unit;
            case 3:
                String searchBarTitle = (String) obj;
                Intrinsics.i(searchBarTitle, "searchBarTitle");
                function1.invoke(new RegularBusViewIntent.ChaloSearchBarClickedIntent(searchBarTitle));
                return unit;
            case 4:
                CrashlyticsLog it = (CrashlyticsLog) obj;
                Intrinsics.i(it, "it");
                function1.invoke(new RegularBusViewIntent.OnCrashLoggingRequired(it));
                return unit;
            case 5:
                CrashlyticsLog it2 = (CrashlyticsLog) obj;
                Intrinsics.i(it2, "it");
                function1.invoke(new RegularBusViewIntent.OnCrashLoggingRequired(it2));
                return unit;
            case 6:
                NearbyStopAndTripsUiModel it3 = (NearbyStopAndTripsUiModel) obj;
                Intrinsics.i(it3, "it");
                function1.invoke(new RegularBusViewIntent.StopClickedIntent(it3));
                return unit;
            case 7:
                UserFeedbackRatingData it4 = (UserFeedbackRatingData) obj;
                Intrinsics.i(it4, "it");
                function1.invoke(new RideFeedbackViewIntents.OnUserFeedbackRatingClick(it4));
                return unit;
            case 8:
                String entered = (String) obj;
                Intrinsics.i(entered, "entered");
                function1.invoke(entered);
                return unit;
            case 9:
                UserFeedbackReasonData reasonData = (UserFeedbackReasonData) obj;
                Intrinsics.i(reasonData, "reasonData");
                function1.invoke(new RideFeedbackViewIntents.OnFeedbackRatingReasonClick(reasonData));
                return unit;
            case 10:
                String subtagId = (String) obj;
                Intrinsics.i(subtagId, "subtagId");
                function1.invoke(new RideFeedbackViewIntents.OnFeedbackSubtagClick(subtagId));
                return unit;
            case 11:
                String text = (String) obj;
                Intrinsics.i(text, "text");
                function1.invoke(new RideFeedbackViewIntents.OnFeedbackOtherReasonDescriptionChange(text));
                return unit;
            case 12:
                RouteDetailsOptionsMenu it5 = (RouteDetailsOptionsMenu) obj;
                float f = RouteDetailsStopsListUIStateFactory.c;
                Intrinsics.i(it5, "it");
                function1.invoke(new RouteDetailsIntent.OnOptionsMenuItemClickedIntent(it5));
                return unit;
            case 13:
                String it6 = (String) obj;
                Intrinsics.i(it6, "it");
                function1.invoke(new RouteDetailsIntent.StopSearchQueryUpdate(it6));
                return unit;
            case 14:
                String it7 = (String) obj;
                Intrinsics.i(it7, "it");
                function1.invoke(new RouteDetailsIntent.StopSearchQueryUpdate(it7));
                return unit;
            case 15:
                MapCameraUpdate it8 = (MapCameraUpdate) obj;
                Intrinsics.i(it8, "it");
                function1.invoke(new RouteDetailsIntent.OnMapCameraUpdateLoaded(it8));
                return unit;
            case 16:
                return SearchBarDefaults.InputField$lambda$38$lambda$37(function1, (FocusState) obj);
            case 17:
                return SearchBarDefaults.InputField$lambda$25$lambda$24(function1, (FocusState) obj);
            case 18:
                String favTitle = (String) obj;
                Intrinsics.i(favTitle, "favTitle");
                function1.invoke(favTitle);
                return unit;
            case 19:
                ChaloCardOperationType it9 = (ChaloCardOperationType) obj;
                Intrinsics.i(it9, "it");
                function1.invoke(new ChaloCardInfoIntent.CardOperationClicked(it9));
                return unit;
            case 20:
                return SliderKt.RangeSlider$lambda$18$lambda$17(function1, (SliderRange) obj);
            case 21:
                return SnapshotKt.takeNewSnapshot$lambda$0(function1, (SnapshotIdSet) obj);
            case 22:
                String entered2 = (String) obj;
                Intrinsics.i(entered2, "entered");
                function1.invoke(new SosScreenIntent.SosMessageEnteredIntent(entered2));
                return unit;
            case 23:
                return SuspendAnimationKt.callWithFrameNanos$lambda$0(function1, ((Long) obj).longValue());
            case 24:
                return SwipeToDismissBoxState.Companion.Saver$lambda$3(function1, (SwipeToDismissBoxValue) obj);
            case 25:
                TripPlannerTabType it10 = (TripPlannerTabType) obj;
                Intrinsics.i(it10, "it");
                function1.invoke(new TripPlannerResultIntent.QuickFilterTabClickedIntent(it10));
                return unit;
            case 26:
                TripPlannerTabType it11 = (TripPlannerTabType) obj;
                Intrinsics.i(it11, "it");
                function1.invoke(new TripPlannerResultIntent.QuickFilterTabClickedIntent(it11));
                return unit;
            case 27:
                String it12 = (String) obj;
                Intrinsics.i(it12, "it");
                function1.invoke(new TripPlannerResultIntent.ItineraryClickedIntent(it12));
                return unit;
            case 28:
                function1.invoke(new TripPlannerResultIntent.UpdateSelectedDateIntent((Long) obj));
                return unit;
            default:
                function1.invoke(new TripPlannerResultIntent.SearchStopUpdateFieldClickedIntent(((Boolean) obj).booleanValue()));
                return unit;
        }
    }
}
