package app.chalo.ridehailing.data.manager;

import app.chalo.ridehailing.data.app.RideHailingBookingDriverDetailsAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingWaypointAppModel;
import app.chalo.ridehailing.data.app.RideHailingVehicleDetailsAppModel;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/manager/RideHailingStaticTripDetails;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideHailingStaticTripDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9125a;
    public final RideHailingBookingWaypointAppModel b;
    public final RideHailingBookingWaypointAppModel c;
    public final RideHailingBookingDriverDetailsAppModel d;
    public final RideHailingVehicleDetailsAppModel e;
    public final String f;
    public final long g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/manager/RideHailingStaticTripDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/manager/RideHailingStaticTripDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideHailingStaticTripDetails> serializer() {
            return RideHailingStaticTripDetails$$serializer.f9126a;
        }
    }

    public /* synthetic */ RideHailingStaticTripDetails(int i, String str, RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel, RideHailingBookingWaypointAppModel rideHailingBookingWaypointAppModel2, RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel, RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel, String str2, long j, String str3) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(RideHailingStaticTripDetails$$serializer.f9126a.getDescriptor(), i, 127);
            throw null;
        }
        this.f9125a = str;
        this.b = rideHailingBookingWaypointAppModel;
        this.c = rideHailingBookingWaypointAppModel2;
        this.d = rideHailingBookingDriverDetailsAppModel;
        this.e = rideHailingVehicleDetailsAppModel;
        this.f = str2;
        this.g = j;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingStaticTripDetails)) {
            return false;
        }
        RideHailingStaticTripDetails rideHailingStaticTripDetails = (RideHailingStaticTripDetails) obj;
        return Intrinsics.d(this.f9125a, rideHailingStaticTripDetails.f9125a) && Intrinsics.d(this.b, rideHailingStaticTripDetails.b) && Intrinsics.d(this.c, rideHailingStaticTripDetails.c) && Intrinsics.d(this.d, rideHailingStaticTripDetails.d) && Intrinsics.d(this.e, rideHailingStaticTripDetails.e) && Intrinsics.d(this.f, rideHailingStaticTripDetails.f) && this.g == rideHailingStaticTripDetails.g && Intrinsics.d(this.h, rideHailingStaticTripDetails.h);
    }

    public final int hashCode() {
        int iE = nf1.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f9125a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
        long j = this.g;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.h;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideHailingStaticTripDetails(tripId=");
        sb.append(this.f9125a);
        sb.append(", pickup=");
        sb.append(this.b);
        sb.append(", drop=");
        sb.append(this.c);
        sb.append(", driver=");
        sb.append(this.d);
        sb.append(", vehicle=");
        sb.append(this.e);
        sb.append(", otp=");
        sb.append(this.f);
        sb.append(", amount=");
        dd.k(this.g, ", paymentMode=", this.h, sb);
        sb.append(")");
        return sb.toString();
    }
}
