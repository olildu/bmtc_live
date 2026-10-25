package app.chalo.premiumbus.ui.stopdetails;

import app.chalo.location.LatLng;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "", "InitializationIntent", "OnDirectionClicked", "OnRetryClicked", "MapInteractionIntent", "OnStopTabSelected", "OnBackPressed", "OnImageClicked", "OnImageDialogDismissed", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnBackPressed;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnDirectionClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnImageClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnImageDialogDismissed;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnRetryClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnStopTabSelected;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusStopDetailsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopDetailsNavAppModel f7943a;

        public InitializationIntent(PBStopDetailsNavAppModel pBStopDetailsNavAppModel) {
            this.f7943a = pBStopDetailsNavAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f7943a, ((InitializationIntent) obj).f7943a);
        }

        public final int hashCode() {
            return this.f7943a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(navAppModel=" + this.f7943a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "OnMapReady", "OnMapMarkerClicked", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent$OnMapMarkerClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent$OnMapReady;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MapInteractionIntent extends PremiumBusStopDetailsIntent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent$OnMapMarkerClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnMapMarkerClicked extends MapInteractionIntent {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OnMapMarkerClicked);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OnMapMarkerClicked(stopId=null)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent$OnMapReady;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$MapInteractionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OnMapReady extends MapInteractionIntent {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OnMapReady);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OnMapReady(routeId=null, pickupStopId=null, dropStopId=null)";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnBackPressed;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressed extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f7944a = new OnBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnDirectionClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnDirectionClicked extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7945a;
        public final LatLng b;

        public OnDirectionClicked(LatLng location, String str) {
            Intrinsics.i(location, "location");
            this.f7945a = str;
            this.b = location;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDirectionClicked)) {
                return false;
            }
            OnDirectionClicked onDirectionClicked = (OnDirectionClicked) obj;
            return Intrinsics.d(this.f7945a, onDirectionClicked.f7945a) && Intrinsics.d(this.b, onDirectionClicked.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7945a.hashCode() * 31);
        }

        public final String toString() {
            return "OnDirectionClicked(stopName=" + this.f7945a + ", location=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnImageClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnImageClicked extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7946a;
        public final PBStopDetailsMainScreenStopSectionType b;

        public OnImageClicked(int i, PBStopDetailsMainScreenStopSectionType pBStopDetailsMainScreenStopSectionType) {
            this.f7946a = i;
            this.b = pBStopDetailsMainScreenStopSectionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnImageClicked)) {
                return false;
            }
            OnImageClicked onImageClicked = (OnImageClicked) obj;
            return this.f7946a == onImageClicked.f7946a && this.b == onImageClicked.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7946a * 31);
        }

        public final String toString() {
            return "OnImageClicked(index=" + this.f7946a + ", stopType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnImageDialogDismissed;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnImageDialogDismissed extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnImageDialogDismissed f7947a = new OnImageDialogDismissed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnRetryClicked;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryClicked extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRetryClicked f7948a = new OnRetryClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent$OnStopTabSelected;", "Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStopTabSelected extends PremiumBusStopDetailsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7949a;

        public OnStopTabSelected(String str) {
            this.f7949a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStopTabSelected) && Intrinsics.d(this.f7949a, ((OnStopTabSelected) obj).f7949a);
        }

        public final int hashCode() {
            return this.f7949a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnStopTabSelected(stopId=", this.f7949a, ")");
        }
    }
}
