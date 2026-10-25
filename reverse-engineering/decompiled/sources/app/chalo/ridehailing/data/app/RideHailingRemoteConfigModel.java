package app.chalo.ridehailing.data.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.x11;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingRemoteConfigModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideHailingRemoteConfigModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(27))};
    public static final RideHailingRemoteConfigModel e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;
    public static final List m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9115a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingRemoteConfigModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/app/RideHailingRemoteConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "Lapp/chalo/ridehailing/data/app/PostRideFeedbackSubtagConfigData;", "PREMIUM_BUS_TIMING_SUBTAGS", "Ljava/util/List;", "PREMIUM_BUS_DRIVER_BEHAVIOUR_SUBTAGS", "PREMIUM_BUS_COMFORT_AND_CLEANLINESS_SUBTAGS", "PREMIUM_BUS_ROUTE_AND_STOPS_SUBTAGS", "PREMIUM_BUS_APP_AND_TRACKING_SUBTAGS", "PREMIUM_BUS_SAFETY_CONCERN_SUBTAGS", "Lapp/chalo/ridehailing/data/app/UserFeedbackReasonConfigData;", "PREMIUM_BUS_NEGATIVE_REASONS", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideHailingRemoteConfigModel> serializer() {
            return RideHailingRemoteConfigModel$$serializer.f9116a;
        }
    }

    static {
        RideHailingRemoteConfigModel rideHailingRemoteConfigModel = new RideHailingRemoteConfigModel("rideHailingTicket", CollectionsKt.S(new UserFeedbackRatingConfigData(1, "What went wrong?", CollectionsKt.S(new UserFeedbackReasonConfigData("Demanded extra cash", false), new UserFeedbackReasonConfigData("Different vehicle", false), new UserFeedbackReasonConfigData("Unprofessional behaviour", false), new UserFeedbackReasonConfigData("Unsafe ride", false), new UserFeedbackReasonConfigData("Other", true))), new UserFeedbackRatingConfigData(2, "What went wrong?", CollectionsKt.S(new UserFeedbackReasonConfigData("Demanded extra cash", false), new UserFeedbackReasonConfigData("Different vehicle", false), new UserFeedbackReasonConfigData("Unprofessional behaviour", false), new UserFeedbackReasonConfigData("Unsafe ride", false), new UserFeedbackReasonConfigData("Other", true))), new UserFeedbackRatingConfigData(3, "What went wrong?", CollectionsKt.S(new UserFeedbackReasonConfigData("Demanded extra cash", false), new UserFeedbackReasonConfigData("Different vehicle", false), new UserFeedbackReasonConfigData("Unprofessional behaviour", false), new UserFeedbackReasonConfigData("Unsafe ride", false), new UserFeedbackReasonConfigData("Other", true))), new UserFeedbackRatingConfigData(4, "What did you like?", CollectionsKt.S(new UserFeedbackReasonConfigData("Smooth driving", false), new UserFeedbackReasonConfigData("Reached early", false), new UserFeedbackReasonConfigData("Professional behaviour", false), new UserFeedbackReasonConfigData("Safety", false), new UserFeedbackReasonConfigData("Other", true))), new UserFeedbackRatingConfigData(5, "What did you like?", CollectionsKt.S(new UserFeedbackReasonConfigData("Smooth driving", false), new UserFeedbackReasonConfigData("Reached early", false), new UserFeedbackReasonConfigData("Professional behaviour", false), new UserFeedbackReasonConfigData("Safety", false), new UserFeedbackReasonConfigData("Other", true)))));
        e = rideHailingRemoteConfigModel;
        Boolean bool = Boolean.TRUE;
        List listS = CollectionsKt.S(new PostRideFeedbackSubtagConfigData("bus_arrived_late", "Bus arrived late", bool), new PostRideFeedbackSubtagConfigData("bus_cancelled", "Bus was cancelled", bool), new PostRideFeedbackSubtagConfigData("bus_left_before_pickup_time", "Bus left before pick up time", bool), new PostRideFeedbackSubtagConfigData("longer_travel_than_expected", "Longer travel than expected", bool), new PostRideFeedbackSubtagConfigData("rescheduling_unavailable", "Rescheduling unavailable", bool));
        f = listS;
        List listS2 = CollectionsKt.S(new PostRideFeedbackSubtagConfigData("driving_too_slowly", "Driving too slowly", bool), new PostRideFeedbackSubtagConfigData("rash_aggressive_driving", "Rash / aggressive driving", bool), new PostRideFeedbackSubtagConfigData("phone_use_while_driving", "Phone use while driving", bool), new PostRideFeedbackSubtagConfigData("missed_my_pickup_stop", "Missed my pickup stop", bool), new PostRideFeedbackSubtagConfigData("dropped_at_wrong_location", "Dropped at wrong location", bool), new PostRideFeedbackSubtagConfigData("rude_or_disrespectful", "Rude or disrespectful", bool), new PostRideFeedbackSubtagConfigData("took_an_unplanned_route", "Took an unplanned route", bool));
        g = listS2;
        List listS3 = CollectionsKt.S(new PostRideFeedbackSubtagConfigData("uncomfortable_broken_seat", "Uncomfortable / broken seat", bool), new PostRideFeedbackSubtagConfigData("bus_was_unclean", "Bus was unclean", bool), new PostRideFeedbackSubtagConfigData("ac_too_cold", "AC too cold", bool), new PostRideFeedbackSubtagConfigData("ac_not_working", "AC not working", bool), new PostRideFeedbackSubtagConfigData("excessive_noise", "Excessive noise", bool), new PostRideFeedbackSubtagConfigData("bad_smell", "Bad smell", bool), new PostRideFeedbackSubtagConfigData("charger_not_working", "Charger not working", bool));
        h = listS3;
        List listS4 = CollectionsKt.S(new PostRideFeedbackSubtagConfigData("stop_condition_is_not_good", "Stop condition is not good", bool), new PostRideFeedbackSubtagConfigData("stop_is_far_from_my_location", "Stop is far from my location", bool), new PostRideFeedbackSubtagConfigData("too_many_stops", "Too many stops", bool), new PostRideFeedbackSubtagConfigData("bus_skipped_a_scheduled_stop", "Bus skipped a scheduled stop", bool));
        i = listS4;
        List listS5 = CollectionsKt.S(new PostRideFeedbackSubtagConfigData("live_location_was_wrong", "Live location was wrong", bool), new PostRideFeedbackSubtagConfigData("eta_was_inaccurate", "ETA was inaccurate", bool), new PostRideFeedbackSubtagConfigData("ticket_validation_failed", "Ticket validation failed", bool), new PostRideFeedbackSubtagConfigData("seat_changed_without_notice", "Seat changed without notice", bool), new PostRideFeedbackSubtagConfigData("app_was_slow_unresponsive", "App was slow / unresponsive", bool));
        j = listS5;
        List listS6 = CollectionsKt.S(new PostRideFeedbackSubtagConfigData("unsafe_dangerous_situation", "Unsafe / dangerous situation", bool), new PostRideFeedbackSubtagConfigData("pickup_drop_stop_not_safe", "Pick up/drop stop not safe", bool), new PostRideFeedbackSubtagConfigData("rash_driving_overspeeding", "Rash driving/ Overspeeding", bool), new PostRideFeedbackSubtagConfigData("improper_staff_behaviour", "Improper staff behaviour", bool));
        k = listS6;
        List listS7 = CollectionsKt.S(new UserFeedbackReasonConfigData("Bus timings", false, listS), new UserFeedbackReasonConfigData("Driver behaviour", false, listS2), new UserFeedbackReasonConfigData("Comfort and cleanliness", false, listS3), new UserFeedbackReasonConfigData("Route and stops", false, listS4), new UserFeedbackReasonConfigData("App and tracking", false, listS5), new UserFeedbackReasonConfigData("Safety concern", false, listS6));
        l = listS7;
        m = CollectionsKt.S(rideHailingRemoteConfigModel, new RideHailingRemoteConfigModel("premiumReserveTicket", CollectionsKt.S(new UserFeedbackRatingConfigData(1, "What went wrong with your ride?", listS7), new UserFeedbackRatingConfigData(2, "What went wrong with your ride?", listS7), new UserFeedbackRatingConfigData(3, "What could have been better on your ride?", listS7), new UserFeedbackRatingConfigData(4, "What could have been better on your ride?", listS7), new UserFeedbackRatingConfigData(5, "What made this ride great?", CollectionsKt.S(new UserFeedbackReasonConfigData("Punctual & on time", false), new UserFeedbackReasonConfigData("Smooth & comfortable ride", false), new UserFeedbackReasonConfigData("Bus was clean", false), new UserFeedbackReasonConfigData("Driver was excellent", false), new UserFeedbackReasonConfigData("AC was perfect", false), new UserFeedbackReasonConfigData("Easy booking experience", false), new UserFeedbackReasonConfigData("Great value for money", false), new UserFeedbackReasonConfigData("Other", true))))));
    }

    public RideHailingRemoteConfigModel(String str, List userTripCompletionFeedbackReasons) {
        Intrinsics.i(userTripCompletionFeedbackReasons, "userTripCompletionFeedbackReasons");
        this.f9115a = "mobileTicket";
        this.b = str;
        this.c = userTripCompletionFeedbackReasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingRemoteConfigModel)) {
            return false;
        }
        RideHailingRemoteConfigModel rideHailingRemoteConfigModel = (RideHailingRemoteConfigModel) obj;
        return Intrinsics.d(this.f9115a, rideHailingRemoteConfigModel.f9115a) && Intrinsics.d(this.b, rideHailingRemoteConfigModel.b) && Intrinsics.d(this.c, rideHailingRemoteConfigModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f9115a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(dd.e("RideHailingRemoteConfigModel(productType=", this.f9115a, ", productSubType=", this.b, ", userTripCompletionFeedbackReasons="), this.c, ")");
    }

    public /* synthetic */ RideHailingRemoteConfigModel(List list, int i2, String str, String str2) {
        if (7 != (i2 & 7)) {
            PluginExceptionsKt.b(RideHailingRemoteConfigModel$$serializer.f9116a.getDescriptor(), i2, 7);
            throw null;
        }
        this.f9115a = str;
        this.b = str2;
        this.c = list;
    }
}
