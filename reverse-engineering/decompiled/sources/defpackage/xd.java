package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.recent.model.app.RecentsType;
import app.chalo.ridehailing.feedback.RatingReaction;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import app.chalo.stoptripdetails.ui.StopTripDetailsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20009a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xd(Function1 function1, int i) {
        this.f20009a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20009a) {
            case 0:
                ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                num.intValue();
                this.b.invoke(num);
                return Unit.f17538a;
            case 1:
                RatingReaction rating = (RatingReaction) obj;
                Intrinsics.i(rating, "rating");
                this.b.invoke(new HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetDataChangedIntent(rating, (Integer) obj2));
                return Unit.f17538a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                ImageResourceSectionAppModel image = (ImageResourceSectionAppModel) obj2;
                Intrinsics.i(image, "image");
                this.b.invoke(new HomeScreenViewIntent.HomePageItemClickedIntent(null, image.g, HomePageFeature.IMAGE_RESOURCE, iIntValue, image.c, image.f, 1));
                return Unit.f17538a;
            case 3:
                return LazyGridIntervalContent.item$lambda$1$0(this.b, (LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
            case 4:
                Composer composer = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350822139, iIntValue2, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreen.<anonymous> (NearbyStopsMapScreen.kt:138)");
                    }
                    Function1 function1 = this.b;
                    boolean zChanged = composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new qm0(function1, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    NearbyStopsMapScreenKt.f((Function0) objRememberedValue, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 5:
                StopTripDetailsUiModel stopTripDetailsUiModel = (StopTripDetailsUiModel) obj;
                Intrinsics.i(stopTripDetailsUiModel, "stopTripDetailsUiModel");
                Intrinsics.i((String) obj2, "<unused var>");
                this.b.invoke(new NearbyStopsMapIntent.RouteClickedIntent(stopTripDetailsUiModel));
                return Unit.f17538a;
            case 6:
                String tripId = (String) obj;
                String cityId = (String) obj2;
                Intrinsics.i(tripId, "tripId");
                Intrinsics.i(cityId, "cityId");
                this.b.invoke(new UniversalPickerIntent.RemoveRecentTripIntent(tripId, cityId));
                return Unit.f17538a;
            case 7:
                String favTitle = (String) obj;
                UniversalSearchRecentSearchItem.Place placeItem = (UniversalSearchRecentSearchItem.Place) obj2;
                Intrinsics.i(favTitle, "favTitle");
                Intrinsics.i(placeItem, "placeItem");
                this.b.invoke(new UniversalPickerIntent.SavePlaceToFavoriteIntent(favTitle, placeItem));
                return Unit.f17538a;
            case 8:
                String placeId = (String) obj;
                String cityId2 = (String) obj2;
                Intrinsics.i(placeId, "placeId");
                Intrinsics.i(cityId2, "cityId");
                this.b.invoke(new UniversalPickerIntent.RemoveRecentPlaceIntent(placeId, cityId2));
                return Unit.f17538a;
            case 9:
                String routeId = (String) obj;
                String cityId3 = (String) obj2;
                Intrinsics.i(routeId, "routeId");
                Intrinsics.i(cityId3, "cityId");
                this.b.invoke(new UniversalPickerIntent.RemoveFromRouteRecentDataStoreIntent(routeId, cityId3));
                return Unit.f17538a;
            case 10:
                String favTitle2 = (String) obj;
                UniversalSearchRecentSearchItem.Stop stopItem = (UniversalSearchRecentSearchItem.Stop) obj2;
                Intrinsics.i(favTitle2, "favTitle");
                Intrinsics.i(stopItem, "stopItem");
                this.b.invoke(new UniversalPickerIntent.SaveStopToFavoriteIntent(favTitle2, stopItem));
                return Unit.f17538a;
            case 11:
                String stopId = (String) obj;
                String cityId4 = (String) obj2;
                Intrinsics.i(stopId, "stopId");
                Intrinsics.i(cityId4, "cityId");
                this.b.invoke(new UniversalPickerIntent.RemoveFromStopRecentDataStoreIntent(stopId, cityId4));
                return Unit.f17538a;
            case 12:
                int iIntValue3 = ((Integer) obj).intValue();
                RecentsType recentItem = (RecentsType) obj2;
                Intrinsics.i(recentItem, "recentItem");
                this.b.invoke(new RegularBusViewIntent.RecentSearchItemClicked(recentItem, iIntValue3));
                return Unit.f17538a;
            case 13:
                int iIntValue4 = ((Integer) obj).intValue();
                ImageResourceSectionAppModel image2 = (ImageResourceSectionAppModel) obj2;
                Intrinsics.i(image2, "image");
                this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(RegularBusPageFeature.IMAGE_RESOURCE, null, image2.g, iIntValue4, image2.c, image2.f, null, 66));
                return Unit.f17538a;
            case 14:
                StopTripDetailsUiModel summary = (StopTripDetailsUiModel) obj;
                String stopId2 = (String) obj2;
                Intrinsics.i(summary, "summary");
                Intrinsics.i(stopId2, "stopId");
                this.b.invoke(new RegularBusViewIntent.RouteClickedIntent(summary, stopId2));
                return Unit.f17538a;
            case 15:
                String stopId3 = (String) obj;
                String searchQuery = (String) obj2;
                Intrinsics.i(stopId3, "stopId");
                Intrinsics.i(searchQuery, "searchQuery");
                this.b.invoke(new RouteDetailsIntent.UserDestinationStopSelectedIntent(stopId3, searchQuery));
                return Unit.f17538a;
            case 16:
                String stopId4 = (String) obj;
                String searchQuery2 = (String) obj2;
                Intrinsics.i(stopId4, "stopId");
                Intrinsics.i(searchQuery2, "searchQuery");
                this.b.invoke(new RouteDetailsIntent.SearchStopSelectedToViewEtasIntent(stopId4, searchQuery2));
                return Unit.f17538a;
            case 17:
                String routeId2 = (String) obj;
                String triggerStopId = (String) obj2;
                Intrinsics.i(routeId2, "routeId");
                Intrinsics.i(triggerStopId, "triggerStopId");
                this.b.invoke(new StopTripDetailsIntent.RouteDetailItemClickedIntentStop(routeId2, triggerStopId));
                return Unit.f17538a;
            case 18:
                ((Integer) obj).intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                this.b.invoke(num2);
                return Unit.f17538a;
            case 19:
                return Updater.init_impl$lambda$0(this.b, obj, (Unit) obj2);
            default:
                return Updater.reconcile_impl$lambda$0(this.b, obj, (Unit) obj2);
        }
    }
}
