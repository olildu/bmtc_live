package app.chalo.ridehailing.feedback;

import androidx.webkit.Profile;
import app.chalo.ridefeedback.data.app.RideFeedbackBookingData;
import app.chalo.ridehailing.data.manager.RideHailingStaticTripDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/feedback/BookingContext;", "", "Auto", Profile.DEFAULT_PROFILE_NAME, "Lapp/chalo/ridehailing/feedback/BookingContext$Auto;", "Lapp/chalo/ridehailing/feedback/BookingContext$Default;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookingContext {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/BookingContext$Auto;", "Lapp/chalo/ridehailing/feedback/BookingContext;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Auto extends BookingContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RideHailingStaticTripDetails f9130a;

        public Auto(RideHailingStaticTripDetails tripDetails) {
            Intrinsics.i(tripDetails, "tripDetails");
            this.f9130a = tripDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Auto) && Intrinsics.d(this.f9130a, ((Auto) obj).f9130a);
        }

        public final int hashCode() {
            return this.f9130a.hashCode();
        }

        public final String toString() {
            return "Auto(tripDetails=" + this.f9130a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/BookingContext$Default;", "Lapp/chalo/ridehailing/feedback/BookingContext;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends BookingContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RideFeedbackBookingData f9131a;

        public Default(RideFeedbackBookingData bookingData) {
            Intrinsics.i(bookingData, "bookingData");
            this.f9131a = bookingData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Default) && Intrinsics.d(this.f9131a, ((Default) obj).f9131a);
        }

        public final int hashCode() {
            return this.f9131a.hashCode();
        }

        public final String toString() {
            return "Default(bookingData=" + this.f9131a + ")";
        }
    }
}
