package app.chalo.home.data.model.app;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType;", "", "RequestLocationPermission", "RequestGpsTurnOn", "Unknown", "Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType$RequestGpsTurnOn;", "Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType$RequestLocationPermission;", "Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LocationTurnOnTooltipType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType$RequestGpsTurnOn;", "Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestGpsTurnOn extends LocationTurnOnTooltipType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestGpsTurnOn f2945a = new RequestGpsTurnOn();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestGpsTurnOn);
        }

        public final int hashCode() {
            return 1710531068;
        }

        public final String toString() {
            return "RequestGpsTurnOn";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType$RequestLocationPermission;", "Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestLocationPermission extends LocationTurnOnTooltipType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestLocationPermission f2946a = new RequestLocationPermission();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestLocationPermission);
        }

        public final int hashCode() {
            return -578471250;
        }

        public final String toString() {
            return "RequestLocationPermission";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType$Unknown;", "Lapp/chalo/home/data/model/app/LocationTurnOnTooltipType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends LocationTurnOnTooltipType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f2947a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 416197477;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
