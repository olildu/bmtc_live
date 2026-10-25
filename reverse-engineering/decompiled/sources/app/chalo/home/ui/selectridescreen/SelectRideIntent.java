package app.chalo.home.ui.selectridescreen;

import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "", "InitializationIntent", "OnLocationChangeIntent", "ODCardContinueButtonClicked", "TimePickerContinueButtonClicked", "TimePickerCancelButtonClicked", "RetryClicked", "PlaceSelectionFieldResultIntent", "SwapOriginDestinationIntent", "SuccessFailureScreenPositiveButtonClicked", "SuccessFailureScreenNegativeButtonClicked", "OnTimeChangeIntent", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$InitializationIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$ODCardContinueButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$OnLocationChangeIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$OnTimeChangeIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$PlaceSelectionFieldResultIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$RetryClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$SuccessFailureScreenNegativeButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$SuccessFailureScreenPositiveButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$SwapOriginDestinationIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$TimePickerCancelButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$TimePickerContinueButtonClicked;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SelectRideIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$InitializationIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3704a;
        public final UserCommutePreferencePlaceLocationAppModel b;
        public final UserCommutePreferencePlaceLocationAppModel c;
        public final Long d;

        public InitializationIntent(String str, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2, Long l) {
            this.f3704a = str;
            this.b = userCommutePreferencePlaceLocationAppModel;
            this.c = userCommutePreferencePlaceLocationAppModel2;
            this.d = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f3704a, initializationIntent.f3704a) && Intrinsics.d(this.b, initializationIntent.b) && Intrinsics.d(this.c, initializationIntent.c) && Intrinsics.d(this.d, initializationIntent.d);
        }

        public final int hashCode() {
            String str = this.f3704a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = this.b;
            int iHashCode2 = (iHashCode + (userCommutePreferencePlaceLocationAppModel == null ? 0 : userCommutePreferencePlaceLocationAppModel.hashCode())) * 31;
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = this.c;
            int iHashCode3 = (iHashCode2 + (userCommutePreferencePlaceLocationAppModel2 == null ? 0 : userCommutePreferencePlaceLocationAppModel2.hashCode())) * 31;
            Long l = this.d;
            return iHashCode3 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            return "InitializationIntent(prefilledRideId=" + this.f3704a + ", from=" + this.b + ", to=" + this.c + ", time=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$ODCardContinueButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ODCardContinueButtonClicked extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ODCardContinueButtonClicked f3705a = new ODCardContinueButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ODCardContinueButtonClicked);
        }

        public final int hashCode() {
            return -1604287502;
        }

        public final String toString() {
            return "ODCardContinueButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$OnLocationChangeIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLocationChangeIntent extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationSelectionType f3706a;

        public OnLocationChangeIntent(LocationSelectionType locationSelectionType) {
            Intrinsics.i(locationSelectionType, "locationSelectionType");
            this.f3706a = locationSelectionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocationChangeIntent) && this.f3706a == ((OnLocationChangeIntent) obj).f3706a;
        }

        public final int hashCode() {
            return this.f3706a.hashCode();
        }

        public final String toString() {
            return "OnLocationChangeIntent(locationSelectionType=" + this.f3706a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$OnTimeChangeIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTimeChangeIntent extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3707a;
        public final int b;
        public final String c;

        public OnTimeChangeIntent(int i, int i2, String amOrPm) {
            Intrinsics.i(amOrPm, "amOrPm");
            this.f3707a = i;
            this.b = i2;
            this.c = amOrPm;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTimeChangeIntent)) {
                return false;
            }
            OnTimeChangeIntent onTimeChangeIntent = (OnTimeChangeIntent) obj;
            return this.f3707a == onTimeChangeIntent.f3707a && this.b == onTimeChangeIntent.b && Intrinsics.d(this.c, onTimeChangeIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f3707a * 31) + this.b) * 31);
        }

        public final String toString() {
            return vo1.p(uf0.s(this.f3707a, this.b, "OnTimeChangeIntent(hour=", ", minute=", ", amOrPm="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$PlaceSelectionFieldResultIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlaceSelectionFieldResultIntent extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationSelectionType f3708a;
        public final UserCommutePreferencePlaceLocationAppModel b;

        public PlaceSelectionFieldResultIntent(LocationSelectionType locationSelectionType, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel) {
            Intrinsics.i(locationSelectionType, "locationSelectionType");
            this.f3708a = locationSelectionType;
            this.b = userCommutePreferencePlaceLocationAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaceSelectionFieldResultIntent)) {
                return false;
            }
            PlaceSelectionFieldResultIntent placeSelectionFieldResultIntent = (PlaceSelectionFieldResultIntent) obj;
            return this.f3708a == placeSelectionFieldResultIntent.f3708a && Intrinsics.d(this.b, placeSelectionFieldResultIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3708a.hashCode() * 31);
        }

        public final String toString() {
            return "PlaceSelectionFieldResultIntent(locationSelectionType=" + this.f3708a + ", selectedPlace=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$RetryClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryClicked extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryClicked f3709a = new RetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClicked);
        }

        public final int hashCode() {
            return 1721781590;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$SuccessFailureScreenNegativeButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessFailureScreenNegativeButtonClicked extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuccessFailureScreenNegativeButtonClicked f3710a = new SuccessFailureScreenNegativeButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuccessFailureScreenNegativeButtonClicked);
        }

        public final int hashCode() {
            return -826237130;
        }

        public final String toString() {
            return "SuccessFailureScreenNegativeButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$SuccessFailureScreenPositiveButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessFailureScreenPositiveButtonClicked extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuccessFailureScreenPositiveButtonClicked f3711a = new SuccessFailureScreenPositiveButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuccessFailureScreenPositiveButtonClicked);
        }

        public final int hashCode() {
            return -1127182350;
        }

        public final String toString() {
            return "SuccessFailureScreenPositiveButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$SwapOriginDestinationIntent;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwapOriginDestinationIntent extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwapOriginDestinationIntent f3712a = new SwapOriginDestinationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwapOriginDestinationIntent);
        }

        public final int hashCode() {
            return -127806246;
        }

        public final String toString() {
            return "SwapOriginDestinationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$TimePickerCancelButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimePickerCancelButtonClicked extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePickerCancelButtonClicked f3713a = new TimePickerCancelButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TimePickerCancelButtonClicked);
        }

        public final int hashCode() {
            return -780805527;
        }

        public final String toString() {
            return "TimePickerCancelButtonClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectridescreen/SelectRideIntent$TimePickerContinueButtonClicked;", "Lapp/chalo/home/ui/selectridescreen/SelectRideIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimePickerContinueButtonClicked extends SelectRideIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePickerContinueButtonClicked f3714a = new TimePickerContinueButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TimePickerContinueButtonClicked);
        }

        public final int hashCode() {
            return 1735997916;
        }

        public final String toString() {
            return "TimePickerContinueButtonClicked";
        }
    }
}
