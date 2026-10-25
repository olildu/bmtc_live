package app.chalo.livetracking.universalsearch.ui;

import app.chalo.constants.Source;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001\u001f!\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "", "ViewCreatedIntent", "HomeNavigationButtonPressIntent", "ClearSearchTextFieldIntent", "SeeMoreOrSeeLessItemClickIntent", "PlaceRecentItemClickIntent", "RouteRecentItemClickIntent", "StopRecentItemClickIntent", "RecentTripItemClickIntent", "UniversalSearchStopItemClickIntent", "UniversalSearchPlaceItemClickIntent", "UniversalSearchRouteItemClick", "SearchBarTextChangeIntent", "RemoveFromStopRecentDataStoreIntent", "RemoveRecentPlaceIntent", "RemoveFromRouteRecentDataStoreIntent", "RemoveRecentTripIntent", "FavoritePlaceItemClicked", "FavoriteStopItemClicked", "RemoveFavoritePlaceItem", "RemoveFavoriteStopItem", "EditStopFavoriteIntent", "SaveStopToFavoriteIntent", "SavePlaceToFavoriteIntent", "EditPlaceFavoriteIntent", "ChaloBusCardClicked", "OnCurrentLocationItemClicked", "UseCurrentLocationClickedIntent", "OnGpsEnabled", "OnGpsPermissionDenied", "OnViewChaloCitiesClickIntent", "PermissionRationaleDialogInteraction", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$ChaloBusCardClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$ClearSearchTextFieldIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$EditPlaceFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$EditStopFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$FavoritePlaceItemClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$FavoriteStopItemClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$HomeNavigationButtonPressIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnCurrentLocationItemClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnGpsEnabled;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnGpsPermissionDenied;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnViewChaloCitiesClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$PlaceRecentItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RecentTripItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFavoritePlaceItem;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFavoriteStopItem;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFromRouteRecentDataStoreIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFromStopRecentDataStoreIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveRecentPlaceIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveRecentTripIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RouteRecentItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SavePlaceToFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SaveStopToFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SearchBarTextChangeIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SeeMoreOrSeeLessItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$StopRecentItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UniversalSearchPlaceItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UniversalSearchRouteItemClick;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UniversalSearchStopItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UseCurrentLocationClickedIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$ViewCreatedIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UniversalPickerIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$ChaloBusCardClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloBusCardClicked extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloBusCardClicked f5052a = new ChaloBusCardClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$ClearSearchTextFieldIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearSearchTextFieldIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearSearchTextFieldIntent f5053a = new ClearSearchTextFieldIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$EditPlaceFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditPlaceFavoriteIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5054a;
        public final UniversalSearchRecentSearchItem.Place b;

        public EditPlaceFavoriteIntent(String favTitle, UniversalSearchRecentSearchItem.Place place) {
            Intrinsics.i(favTitle, "favTitle");
            this.f5054a = favTitle;
            this.b = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditPlaceFavoriteIntent)) {
                return false;
            }
            EditPlaceFavoriteIntent editPlaceFavoriteIntent = (EditPlaceFavoriteIntent) obj;
            return Intrinsics.d(this.f5054a, editPlaceFavoriteIntent.f5054a) && Intrinsics.d(this.b, editPlaceFavoriteIntent.b);
        }

        public final int hashCode() {
            return this.b.c.hashCode() + (this.f5054a.hashCode() * 31);
        }

        public final String toString() {
            return "EditPlaceFavoriteIntent(favTitle=" + this.f5054a + ", placeItem=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$EditStopFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditStopFavoriteIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5055a;
        public final UniversalSearchRecentSearchItem.Stop b;

        public EditStopFavoriteIntent(String favTitle, UniversalSearchRecentSearchItem.Stop stop) {
            Intrinsics.i(favTitle, "favTitle");
            this.f5055a = favTitle;
            this.b = stop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditStopFavoriteIntent)) {
                return false;
            }
            EditStopFavoriteIntent editStopFavoriteIntent = (EditStopFavoriteIntent) obj;
            return Intrinsics.d(this.f5055a, editStopFavoriteIntent.f5055a) && Intrinsics.d(this.b, editStopFavoriteIntent.b);
        }

        public final int hashCode() {
            return this.b.c.hashCode() + (this.f5055a.hashCode() * 31);
        }

        public final String toString() {
            return "EditStopFavoriteIntent(favTitle=" + this.f5055a + ", stopItem=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$FavoritePlaceItemClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoritePlaceItemClicked extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchRecentSearchItem.Place f5056a;

        public FavoritePlaceItemClicked(UniversalSearchRecentSearchItem.Place place) {
            this.f5056a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoritePlaceItemClicked) && Intrinsics.d(this.f5056a, ((FavoritePlaceItemClicked) obj).f5056a);
        }

        public final int hashCode() {
            return this.f5056a.c.hashCode();
        }

        public final String toString() {
            return "FavoritePlaceItemClicked(favoritePlaceItem=" + this.f5056a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$FavoriteStopItemClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteStopItemClicked extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchRecentSearchItem.Stop f5057a;

        public FavoriteStopItemClicked(UniversalSearchRecentSearchItem.Stop stop) {
            this.f5057a = stop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FavoriteStopItemClicked) && Intrinsics.d(this.f5057a, ((FavoriteStopItemClicked) obj).f5057a);
        }

        public final int hashCode() {
            return this.f5057a.c.hashCode();
        }

        public final String toString() {
            return "FavoriteStopItemClicked(favoriteStopItem=" + this.f5057a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$HomeNavigationButtonPressIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HomeNavigationButtonPressIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HomeNavigationButtonPressIntent f5058a = new HomeNavigationButtonPressIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnCurrentLocationItemClicked;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCurrentLocationItemClicked extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnCurrentLocationItemClicked f5059a = new OnCurrentLocationItemClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnGpsEnabled;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnGpsEnabled extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnGpsEnabled f5060a = new OnGpsEnabled();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnGpsPermissionDenied;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnGpsPermissionDenied extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnGpsPermissionDenied f5061a = new OnGpsPermissionDenied();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$OnViewChaloCitiesClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnViewChaloCitiesClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnViewChaloCitiesClickIntent f5062a = new OnViewChaloCitiesClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$PermissionRationaleDialogInteraction;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PermissionRationaleDialogInteraction extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5063a;

        public PermissionRationaleDialogInteraction(boolean z) {
            this.f5063a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionRationaleDialogInteraction) && this.f5063a == ((PermissionRationaleDialogInteraction) obj).f5063a;
        }

        public final int hashCode() {
            return this.f5063a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PermissionRationaleDialogInteraction(shouldNavigateToSettings=", ")", this.f5063a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$PlaceRecentItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlaceRecentItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchRecentSearchItem.Place f5064a;

        public PlaceRecentItemClickIntent(UniversalSearchRecentSearchItem.Place placeItem) {
            Intrinsics.i(placeItem, "placeItem");
            this.f5064a = placeItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaceRecentItemClickIntent) && Intrinsics.d(this.f5064a, ((PlaceRecentItemClickIntent) obj).f5064a);
        }

        public final int hashCode() {
            return this.f5064a.c.hashCode();
        }

        public final String toString() {
            return "PlaceRecentItemClickIntent(placeItem=" + this.f5064a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RecentTripItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentTripItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchRecentSearchItem.Trip f5065a;

        public RecentTripItemClickIntent(UniversalSearchRecentSearchItem.Trip tripItem) {
            Intrinsics.i(tripItem, "tripItem");
            this.f5065a = tripItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentTripItemClickIntent) && Intrinsics.d(this.f5065a, ((RecentTripItemClickIntent) obj).f5065a);
        }

        public final int hashCode() {
            return this.f5065a.c.hashCode();
        }

        public final String toString() {
            return "RecentTripItemClickIntent(tripItem=" + this.f5065a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFavoritePlaceItem;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveFavoritePlaceItem extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5066a;
        public final String b;

        public RemoveFavoritePlaceItem(String placeId, String cityId) {
            Intrinsics.i(placeId, "placeId");
            Intrinsics.i(cityId, "cityId");
            this.f5066a = placeId;
            this.b = cityId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveFavoritePlaceItem)) {
                return false;
            }
            RemoveFavoritePlaceItem removeFavoritePlaceItem = (RemoveFavoritePlaceItem) obj;
            return Intrinsics.d(this.f5066a, removeFavoritePlaceItem.f5066a) && Intrinsics.d(this.b, removeFavoritePlaceItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5066a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RemoveFavoritePlaceItem(placeId=", this.f5066a, ", cityId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFavoriteStopItem;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveFavoriteStopItem extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5067a;
        public final String b;

        public RemoveFavoriteStopItem(String stopId, String cityId) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(cityId, "cityId");
            this.f5067a = stopId;
            this.b = cityId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveFavoriteStopItem)) {
                return false;
            }
            RemoveFavoriteStopItem removeFavoriteStopItem = (RemoveFavoriteStopItem) obj;
            return Intrinsics.d(this.f5067a, removeFavoriteStopItem.f5067a) && Intrinsics.d(this.b, removeFavoriteStopItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5067a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RemoveFavoriteStopItem(stopId=", this.f5067a, ", cityId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFromRouteRecentDataStoreIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveFromRouteRecentDataStoreIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5068a;
        public final String b;

        public RemoveFromRouteRecentDataStoreIntent(String routeId, String cityId) {
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(cityId, "cityId");
            this.f5068a = routeId;
            this.b = cityId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveFromRouteRecentDataStoreIntent)) {
                return false;
            }
            RemoveFromRouteRecentDataStoreIntent removeFromRouteRecentDataStoreIntent = (RemoveFromRouteRecentDataStoreIntent) obj;
            return Intrinsics.d(this.f5068a, removeFromRouteRecentDataStoreIntent.f5068a) && Intrinsics.d(this.b, removeFromRouteRecentDataStoreIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5068a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RemoveFromRouteRecentDataStoreIntent(routeId=", this.f5068a, ", cityId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveFromStopRecentDataStoreIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveFromStopRecentDataStoreIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5069a;
        public final String b;

        public RemoveFromStopRecentDataStoreIntent(String stopId, String cityId) {
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(cityId, "cityId");
            this.f5069a = stopId;
            this.b = cityId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveFromStopRecentDataStoreIntent)) {
                return false;
            }
            RemoveFromStopRecentDataStoreIntent removeFromStopRecentDataStoreIntent = (RemoveFromStopRecentDataStoreIntent) obj;
            return Intrinsics.d(this.f5069a, removeFromStopRecentDataStoreIntent.f5069a) && Intrinsics.d(this.b, removeFromStopRecentDataStoreIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5069a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RemoveFromStopRecentDataStoreIntent(stopId=", this.f5069a, ", cityId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveRecentPlaceIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveRecentPlaceIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5070a;
        public final String b;

        public RemoveRecentPlaceIntent(String placeId, String cityId) {
            Intrinsics.i(placeId, "placeId");
            Intrinsics.i(cityId, "cityId");
            this.f5070a = placeId;
            this.b = cityId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveRecentPlaceIntent)) {
                return false;
            }
            RemoveRecentPlaceIntent removeRecentPlaceIntent = (RemoveRecentPlaceIntent) obj;
            return Intrinsics.d(this.f5070a, removeRecentPlaceIntent.f5070a) && Intrinsics.d(this.b, removeRecentPlaceIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5070a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RemoveRecentPlaceIntent(placeId=", this.f5070a, ", cityId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RemoveRecentTripIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoveRecentTripIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5071a;
        public final String b;

        public RemoveRecentTripIntent(String tripId, String cityId) {
            Intrinsics.i(tripId, "tripId");
            Intrinsics.i(cityId, "cityId");
            this.f5071a = tripId;
            this.b = cityId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveRecentTripIntent)) {
                return false;
            }
            RemoveRecentTripIntent removeRecentTripIntent = (RemoveRecentTripIntent) obj;
            return Intrinsics.d(this.f5071a, removeRecentTripIntent.f5071a) && Intrinsics.d(this.b, removeRecentTripIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5071a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("RemoveRecentTripIntent(tripId=", this.f5071a, ", cityId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$RouteRecentItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteRecentItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchRecentSearchItem.Route f5072a;

        public RouteRecentItemClickIntent(UniversalSearchRecentSearchItem.Route routeItem) {
            Intrinsics.i(routeItem, "routeItem");
            this.f5072a = routeItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteRecentItemClickIntent) && Intrinsics.d(this.f5072a, ((RouteRecentItemClickIntent) obj).f5072a);
        }

        public final int hashCode() {
            return this.f5072a.c.hashCode();
        }

        public final String toString() {
            return "RouteRecentItemClickIntent(routeItem=" + this.f5072a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SavePlaceToFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SavePlaceToFavoriteIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5073a;
        public final UniversalSearchRecentSearchItem.Place b;

        public SavePlaceToFavoriteIntent(String favTitle, UniversalSearchRecentSearchItem.Place placeItem) {
            Intrinsics.i(favTitle, "favTitle");
            Intrinsics.i(placeItem, "placeItem");
            this.f5073a = favTitle;
            this.b = placeItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavePlaceToFavoriteIntent)) {
                return false;
            }
            SavePlaceToFavoriteIntent savePlaceToFavoriteIntent = (SavePlaceToFavoriteIntent) obj;
            return Intrinsics.d(this.f5073a, savePlaceToFavoriteIntent.f5073a) && Intrinsics.d(this.b, savePlaceToFavoriteIntent.b);
        }

        public final int hashCode() {
            return this.b.c.hashCode() + (this.f5073a.hashCode() * 31);
        }

        public final String toString() {
            return "SavePlaceToFavoriteIntent(favTitle=" + this.f5073a + ", placeItem=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SaveStopToFavoriteIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveStopToFavoriteIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5074a;
        public final UniversalSearchRecentSearchItem.Stop b;

        public SaveStopToFavoriteIntent(String favTitle, UniversalSearchRecentSearchItem.Stop stopItem) {
            Intrinsics.i(favTitle, "favTitle");
            Intrinsics.i(stopItem, "stopItem");
            this.f5074a = favTitle;
            this.b = stopItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveStopToFavoriteIntent)) {
                return false;
            }
            SaveStopToFavoriteIntent saveStopToFavoriteIntent = (SaveStopToFavoriteIntent) obj;
            return Intrinsics.d(this.f5074a, saveStopToFavoriteIntent.f5074a) && Intrinsics.d(this.b, saveStopToFavoriteIntent.b);
        }

        public final int hashCode() {
            return this.b.c.hashCode() + (this.f5074a.hashCode() * 31);
        }

        public final String toString() {
            return "SaveStopToFavoriteIntent(favTitle=" + this.f5074a + ", stopItem=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SearchBarTextChangeIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBarTextChangeIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5075a;

        public SearchBarTextChangeIntent(String query) {
            Intrinsics.i(query, "query");
            this.f5075a = query;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchBarTextChangeIntent) && Intrinsics.d(this.f5075a, ((SearchBarTextChangeIntent) obj).f5075a);
        }

        public final int hashCode() {
            return this.f5075a.hashCode();
        }

        public final String toString() {
            return vo1.B("SearchBarTextChangeIntent(query=", this.f5075a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$SeeMoreOrSeeLessItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SeeMoreOrSeeLessItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeMoreOrSeeLessItemClickIntent f5076a = new SeeMoreOrSeeLessItemClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$StopRecentItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopRecentItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchRecentSearchItem.Stop f5077a;

        public StopRecentItemClickIntent(UniversalSearchRecentSearchItem.Stop stopItem) {
            Intrinsics.i(stopItem, "stopItem");
            this.f5077a = stopItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopRecentItemClickIntent) && Intrinsics.d(this.f5077a, ((StopRecentItemClickIntent) obj).f5077a);
        }

        public final int hashCode() {
            return this.f5077a.c.hashCode();
        }

        public final String toString() {
            return "StopRecentItemClickIntent(stopItem=" + this.f5077a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UniversalSearchPlaceItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UniversalSearchPlaceItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchPlacesAndStopsInfoModel f5078a;
        public final int b;

        public UniversalSearchPlaceItemClickIntent(UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel, int i) {
            this.f5078a = universalSearchPlacesAndStopsInfoModel;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalSearchPlaceItemClickIntent)) {
                return false;
            }
            UniversalSearchPlaceItemClickIntent universalSearchPlaceItemClickIntent = (UniversalSearchPlaceItemClickIntent) obj;
            return Intrinsics.d(this.f5078a, universalSearchPlaceItemClickIntent.f5078a) && this.b == universalSearchPlaceItemClickIntent.b;
        }

        public final int hashCode() {
            return (this.f5078a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "UniversalSearchPlaceItemClickIntent(searchPlaceItem=" + this.f5078a + ", position=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UniversalSearchRouteItemClick;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UniversalSearchRouteItemClick extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5079a;
        public final int b;

        public UniversalSearchRouteItemClick(String routeId, int i) {
            Intrinsics.i(routeId, "routeId");
            this.f5079a = routeId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalSearchRouteItemClick)) {
                return false;
            }
            UniversalSearchRouteItemClick universalSearchRouteItemClick = (UniversalSearchRouteItemClick) obj;
            return Intrinsics.d(this.f5079a, universalSearchRouteItemClick.f5079a) && this.b == universalSearchRouteItemClick.b;
        }

        public final int hashCode() {
            return (this.f5079a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "UniversalSearchRouteItemClick(routeId=", this.f5079a, ", position=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UniversalSearchStopItemClickIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UniversalSearchStopItemClickIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchPlacesAndStopsInfoModel f5080a;
        public final int b;

        public UniversalSearchStopItemClickIntent(UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel, int i) {
            this.f5080a = universalSearchPlacesAndStopsInfoModel;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalSearchStopItemClickIntent)) {
                return false;
            }
            UniversalSearchStopItemClickIntent universalSearchStopItemClickIntent = (UniversalSearchStopItemClickIntent) obj;
            return Intrinsics.d(this.f5080a, universalSearchStopItemClickIntent.f5080a) && this.b == universalSearchStopItemClickIntent.b;
        }

        public final int hashCode() {
            return (this.f5080a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "UniversalSearchStopItemClickIntent(searchStopItem=" + this.f5080a + ", position=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$UseCurrentLocationClickedIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UseCurrentLocationClickedIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UseCurrentLocationClickedIntent f5081a = new UseCurrentLocationClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent$ViewCreatedIntent;", "Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntent extends UniversalPickerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchOptions f5082a;
        public final UniversalSearchFlowSource b;
        public final String c;
        public final DestinationAfterUniversalSearch d;
        public final Source e;
        public final String f;
        public final String g;
        public final String h;
        public final UniversalPickerHeaderIcon i;
        public final ChaloTransitMode j;

        public ViewCreatedIntent(UniversalSearchOptions universalSearchOptions, UniversalSearchFlowSource source, String searchBarTitle, DestinationAfterUniversalSearch destinationAfterUniversalSearch, Source screenSource, String str, String str2, String str3, UniversalPickerHeaderIcon universalPickerHeaderIcon, ChaloTransitMode transitMode) {
            Intrinsics.i(source, "source");
            Intrinsics.i(searchBarTitle, "searchBarTitle");
            Intrinsics.i(destinationAfterUniversalSearch, "destinationAfterUniversalSearch");
            Intrinsics.i(screenSource, "screenSource");
            Intrinsics.i(transitMode, "transitMode");
            this.f5082a = universalSearchOptions;
            this.b = source;
            this.c = searchBarTitle;
            this.d = destinationAfterUniversalSearch;
            this.e = screenSource;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = universalPickerHeaderIcon;
            this.j = transitMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewCreatedIntent)) {
                return false;
            }
            ViewCreatedIntent viewCreatedIntent = (ViewCreatedIntent) obj;
            return Intrinsics.d(this.f5082a, viewCreatedIntent.f5082a) && this.b == viewCreatedIntent.b && Intrinsics.d(this.c, viewCreatedIntent.c) && this.d == viewCreatedIntent.d && this.e == viewCreatedIntent.e && Intrinsics.d(this.f, viewCreatedIntent.f) && Intrinsics.d(this.g, viewCreatedIntent.g) && Intrinsics.d(this.h, viewCreatedIntent.h) && this.i == viewCreatedIntent.i && this.j == viewCreatedIntent.j;
        }

        public final int hashCode() {
            int iF = nf1.f(this.e, (this.d.hashCode() + nf1.e((this.b.hashCode() + (this.f5082a.f10141a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31);
            String str = this.f;
            int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.h;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            UniversalPickerHeaderIcon universalPickerHeaderIcon = this.i;
            return this.j.hashCode() + ((iHashCode3 + (universalPickerHeaderIcon != null ? universalPickerHeaderIcon.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewCreatedIntent(searchedOptions=");
            sb.append(this.f5082a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", searchBarTitle=");
            sb.append(this.c);
            sb.append(", destinationAfterUniversalSearch=");
            sb.append(this.d);
            sb.append(", screenSource=");
            sb.append(this.e);
            sb.append(", searchType=");
            sb.append(this.f);
            sb.append(", headerTitle=");
            cb0.t(sb, this.g, ", headerStepIndicator=", this.h, ", headerIcon=");
            sb.append(this.i);
            sb.append(", transitMode=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }
}
