package app.chalo.routeselection.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "", "ViewCreatedIntentBasedRoute", "FromStopBasedRouteSearchClickIntent", "ToStopBasedRouteSearchClickIntent", "ProceedButtonClickIntentBasedRoute", "OnIntentResultSuccessBasedRoute", "OnRouteClickIntentBasedRoute", "ClickRecentTripItemIntentBasedRoute", "HideBottomSheetIntentBasedRoute", "DismissSnackBar", "BackPressedIntent", "RouteSearchQueryChangeIntent", "ClearRouteSearchQueryIntent", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$BackPressedIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ClearRouteSearchQueryIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ClickRecentTripItemIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$DismissSnackBar;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$FromStopBasedRouteSearchClickIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$HideBottomSheetIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$OnIntentResultSuccessBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$OnRouteClickIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ProceedButtonClickIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$RouteSearchQueryChangeIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ToStopBasedRouteSearchClickIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ViewCreatedIntentBasedRoute;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopBasedRouteSearchIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$BackPressedIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackPressedIntent extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressedIntent f9192a = new BackPressedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ClearRouteSearchQueryIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearRouteSearchQueryIntent extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearRouteSearchQueryIntent f9193a = new ClearRouteSearchQueryIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ClickRecentTripItemIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClickRecentTripItemIntentBasedRoute extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentStopBasedTripAppModel f9194a;

        public ClickRecentTripItemIntentBasedRoute(RecentStopBasedTripAppModel recentStopBasedTripAppModel) {
            this.f9194a = recentStopBasedTripAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickRecentTripItemIntentBasedRoute) && Intrinsics.d(this.f9194a, ((ClickRecentTripItemIntentBasedRoute) obj).f9194a);
        }

        public final int hashCode() {
            return this.f9194a.hashCode();
        }

        public final String toString() {
            return "ClickRecentTripItemIntentBasedRoute(recentTrip=" + this.f9194a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$DismissSnackBar;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissSnackBar extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissSnackBar f9195a = new DismissSnackBar();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$FromStopBasedRouteSearchClickIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FromStopBasedRouteSearchClickIntent extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FromStopBasedRouteSearchClickIntent f9196a = new FromStopBasedRouteSearchClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$HideBottomSheetIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HideBottomSheetIntentBasedRoute extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HideBottomSheetIntentBasedRoute f9197a = new HideBottomSheetIntentBasedRoute();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$OnIntentResultSuccessBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnIntentResultSuccessBasedRoute extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f9198a;

        public OnIntentResultSuccessBasedRoute(StopAppModel stop) {
            Intrinsics.i(stop, "stop");
            this.f9198a = stop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnIntentResultSuccessBasedRoute) && Intrinsics.d(this.f9198a, ((OnIntentResultSuccessBasedRoute) obj).f9198a);
        }

        public final int hashCode() {
            return this.f9198a.hashCode();
        }

        public final String toString() {
            return "OnIntentResultSuccessBasedRoute(stop=" + this.f9198a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$OnRouteClickIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRouteClickIntentBasedRoute extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OriginDestinationAppModel f9199a;

        public OnRouteClickIntentBasedRoute(OriginDestinationAppModel originDestinationAppModel) {
            this.f9199a = originDestinationAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRouteClickIntentBasedRoute) && Intrinsics.d(this.f9199a, ((OnRouteClickIntentBasedRoute) obj).f9199a);
        }

        public final int hashCode() {
            return this.f9199a.hashCode();
        }

        public final String toString() {
            return "OnRouteClickIntentBasedRoute(route=" + this.f9199a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ProceedButtonClickIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedButtonClickIntentBasedRoute extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedButtonClickIntentBasedRoute f9200a = new ProceedButtonClickIntentBasedRoute();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$RouteSearchQueryChangeIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSearchQueryChangeIntent extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9201a;

        public RouteSearchQueryChangeIntent(String query) {
            Intrinsics.i(query, "query");
            this.f9201a = query;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteSearchQueryChangeIntent) && Intrinsics.d(this.f9201a, ((RouteSearchQueryChangeIntent) obj).f9201a);
        }

        public final int hashCode() {
            return this.f9201a.hashCode();
        }

        public final String toString() {
            return vo1.B("RouteSearchQueryChangeIntent(query=", this.f9201a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ToStopBasedRouteSearchClickIntent;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ToStopBasedRouteSearchClickIntent extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToStopBasedRouteSearchClickIntent f9202a = new ToStopBasedRouteSearchClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent$ViewCreatedIntentBasedRoute;", "Lapp/chalo/routeselection/ui/StopBasedRouteSearchIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntentBasedRoute extends StopBasedRouteSearchIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopBasedRouteSelectionFlowType f9203a;

        static {
            StopBasedRouteSelectionFlowType.Companion companion = StopBasedRouteSelectionFlowType.INSTANCE;
        }

        public ViewCreatedIntentBasedRoute(StopBasedRouteSelectionFlowType flowType) {
            Intrinsics.i(flowType, "flowType");
            this.f9203a = flowType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewCreatedIntentBasedRoute) && Intrinsics.d(this.f9203a, ((ViewCreatedIntentBasedRoute) obj).f9203a);
        }

        public final int hashCode() {
            return this.f9203a.hashCode();
        }

        public final String toString() {
            return "ViewCreatedIntentBasedRoute(flowType=" + this.f9203a + ")";
        }
    }
}
