package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.constants.Source;
import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import defpackage.gf;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "", "InitializationIntent", "TabSelectedIntent", "RetryIntent", "ResetFilterIntent", "FilterSelectedIntent", "ExpandCorridorIntent", "OnViewRouteClickIntent", "OpenRouteSuggestionSheetIntent", "DismissRouteSuggestionSheetIntent", "RouteSuggestionCancelIntent", "RouteSuggestionPickupClickIntent", "RouteSuggestionDropClickIntent", "RouteSuggestionReachByClickIntent", "RouteSuggestionPickupSelectedIntent", "RouteSuggestionDropSelectedIntent", "RouteSuggestionReachBySelectedIntent", "RouteSuggestionTimePickerDismissedIntent", "RouteSuggestionSubmitIntent", "RouteSuggestionSuccessOkayIntent", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$DismissRouteSuggestionSheetIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$ExpandCorridorIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$FilterSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$InitializationIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$OnViewRouteClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$OpenRouteSuggestionSheetIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$ResetFilterIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RetryIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionCancelIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionDropClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionDropSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionPickupClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionPickupSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionReachByClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionReachBySelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionSubmitIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionSuccessOkayIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionTimePickerDismissedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$TabSelectedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusRouteInfoViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$DismissRouteSuggestionSheetIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissRouteSuggestionSheetIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissRouteSuggestionSheetIntent f3337a = new DismissRouteSuggestionSheetIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissRouteSuggestionSheetIntent);
        }

        public final int hashCode() {
            return -1351269374;
        }

        public final String toString() {
            return "DismissRouteSuggestionSheetIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$ExpandCorridorIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpandCorridorIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3338a;

        public ExpandCorridorIntent(String corridorId) {
            Intrinsics.i(corridorId, "corridorId");
            this.f3338a = corridorId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExpandCorridorIntent) && Intrinsics.d(this.f3338a, ((ExpandCorridorIntent) obj).f3338a);
        }

        public final int hashCode() {
            return this.f3338a.hashCode();
        }

        public final String toString() {
            return vo1.B("ExpandCorridorIntent(corridorId=", this.f3338a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$FilterSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FilterSelectedIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3339a;

        public FilterSelectedIntent(String filter) {
            Intrinsics.i(filter, "filter");
            this.f3339a = filter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterSelectedIntent) && Intrinsics.d(this.f3339a, ((FilterSelectedIntent) obj).f3339a);
        }

        public final int hashCode() {
            return this.f3339a.hashCode();
        }

        public final String toString() {
            return vo1.B("FilterSelectedIntent(filter=", this.f3339a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$InitializationIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f3340a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f3340a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f3340a == ((InitializationIntent) obj).f3340a;
        }

        public final int hashCode() {
            return this.f3340a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f3340a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$OnViewRouteClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnViewRouteClickIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3341a;

        public OnViewRouteClickIntent(String routeId) {
            Intrinsics.i(routeId, "routeId");
            this.f3341a = routeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnViewRouteClickIntent) && Intrinsics.d(this.f3341a, ((OnViewRouteClickIntent) obj).f3341a);
        }

        public final int hashCode() {
            return this.f3341a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnViewRouteClickIntent(routeId=", this.f3341a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$OpenRouteSuggestionSheetIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenRouteSuggestionSheetIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenRouteSuggestionSheetIntent f3342a = new OpenRouteSuggestionSheetIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenRouteSuggestionSheetIntent);
        }

        public final int hashCode() {
            return 941530926;
        }

        public final String toString() {
            return "OpenRouteSuggestionSheetIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$ResetFilterIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResetFilterIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResetFilterIntent f3343a = new ResetFilterIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetFilterIntent);
        }

        public final int hashCode() {
            return -1271864435;
        }

        public final String toString() {
            return "ResetFilterIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RetryIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryIntent f3344a = new RetryIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryIntent);
        }

        public final int hashCode() {
            return 1644641102;
        }

        public final String toString() {
            return "RetryIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionCancelIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionCancelIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionCancelIntent f3345a = new RouteSuggestionCancelIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionCancelIntent);
        }

        public final int hashCode() {
            return 822433645;
        }

        public final String toString() {
            return "RouteSuggestionCancelIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionDropClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionDropClickIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionDropClickIntent f3346a = new RouteSuggestionDropClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionDropClickIntent);
        }

        public final int hashCode() {
            return -2007365954;
        }

        public final String toString() {
            return "RouteSuggestionDropClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionDropSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionDropSelectedIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f3347a;

        static {
            PBStopPlaceSelectedAppModel.Companion companion = PBStopPlaceSelectedAppModel.INSTANCE;
        }

        public RouteSuggestionDropSelectedIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel) {
            this.f3347a = pBStopPlaceSelectedAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteSuggestionDropSelectedIntent) && Intrinsics.d(this.f3347a, ((RouteSuggestionDropSelectedIntent) obj).f3347a);
        }

        public final int hashCode() {
            return this.f3347a.hashCode();
        }

        public final String toString() {
            return "RouteSuggestionDropSelectedIntent(result=" + this.f3347a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionPickupClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionPickupClickIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionPickupClickIntent f3348a = new RouteSuggestionPickupClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionPickupClickIntent);
        }

        public final int hashCode() {
            return -1041282351;
        }

        public final String toString() {
            return "RouteSuggestionPickupClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionPickupSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionPickupSelectedIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f3349a;

        static {
            PBStopPlaceSelectedAppModel.Companion companion = PBStopPlaceSelectedAppModel.INSTANCE;
        }

        public RouteSuggestionPickupSelectedIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel) {
            this.f3349a = pBStopPlaceSelectedAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteSuggestionPickupSelectedIntent) && Intrinsics.d(this.f3349a, ((RouteSuggestionPickupSelectedIntent) obj).f3349a);
        }

        public final int hashCode() {
            return this.f3349a.hashCode();
        }

        public final String toString() {
            return "RouteSuggestionPickupSelectedIntent(result=" + this.f3349a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionReachByClickIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionReachByClickIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionReachByClickIntent f3350a = new RouteSuggestionReachByClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionReachByClickIntent);
        }

        public final int hashCode() {
            return -2112790735;
        }

        public final String toString() {
            return "RouteSuggestionReachByClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionReachBySelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionReachBySelectedIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3351a;
        public final int b;
        public final String c;

        public RouteSuggestionReachBySelectedIntent(int i, int i2, String amOrPM) {
            Intrinsics.i(amOrPM, "amOrPM");
            this.f3351a = i;
            this.b = i2;
            this.c = amOrPM;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteSuggestionReachBySelectedIntent)) {
                return false;
            }
            RouteSuggestionReachBySelectedIntent routeSuggestionReachBySelectedIntent = (RouteSuggestionReachBySelectedIntent) obj;
            return this.f3351a == routeSuggestionReachBySelectedIntent.f3351a && this.b == routeSuggestionReachBySelectedIntent.b && Intrinsics.d(this.c, routeSuggestionReachBySelectedIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f3351a * 31) + this.b) * 31);
        }

        public final String toString() {
            return vo1.p(uf0.s(this.f3351a, this.b, "RouteSuggestionReachBySelectedIntent(hour=", ", minute=", ", amOrPM="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionSubmitIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionSubmitIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionSubmitIntent f3352a = new RouteSuggestionSubmitIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionSubmitIntent);
        }

        public final int hashCode() {
            return -336643445;
        }

        public final String toString() {
            return "RouteSuggestionSubmitIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionSuccessOkayIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionSuccessOkayIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionSuccessOkayIntent f3353a = new RouteSuggestionSuccessOkayIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionSuccessOkayIntent);
        }

        public final int hashCode() {
            return -492373028;
        }

        public final String toString() {
            return "RouteSuggestionSuccessOkayIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$RouteSuggestionTimePickerDismissedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteSuggestionTimePickerDismissedIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteSuggestionTimePickerDismissedIntent f3354a = new RouteSuggestionTimePickerDismissedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteSuggestionTimePickerDismissedIntent);
        }

        public final int hashCode() {
            return 1877110035;
        }

        public final String toString() {
            return "RouteSuggestionTimePickerDismissedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent$TabSelectedIntent;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabSelectedIntent extends ChaloBusRouteInfoViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduleBlockKey f3355a;

        public TabSelectedIntent(ScheduleBlockKey scheduleBlockKey) {
            Intrinsics.i(scheduleBlockKey, "scheduleBlockKey");
            this.f3355a = scheduleBlockKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabSelectedIntent) && Intrinsics.d(this.f3355a, ((TabSelectedIntent) obj).f3355a);
        }

        public final int hashCode() {
            return this.f3355a.hashCode();
        }

        public final String toString() {
            return "TabSelectedIntent(scheduleBlockKey=" + this.f3355a + ")";
        }
    }
}
