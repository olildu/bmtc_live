package app.chalo.ridehailing.data.api.request;

import defpackage.cb0;
import defpackage.x11;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/api/request/RideHailingBookingFeedbackRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideHailingBookingFeedbackRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9098a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/api/request/RideHailingBookingFeedbackRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/api/request/RideHailingBookingFeedbackRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideHailingBookingFeedbackRequestApiModel> serializer() {
            return RideHailingBookingFeedbackRequestApiModel$$serializer.f9099a;
        }
    }

    public /* synthetic */ RideHailingBookingFeedbackRequestApiModel(int i, String str, int i2, String str2, String str3, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(RideHailingBookingFeedbackRequestApiModel$$serializer.f9099a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9098a = str;
        this.b = i2;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingBookingFeedbackRequestApiModel)) {
            return false;
        }
        RideHailingBookingFeedbackRequestApiModel rideHailingBookingFeedbackRequestApiModel = (RideHailingBookingFeedbackRequestApiModel) obj;
        return Intrinsics.d(this.f9098a, rideHailingBookingFeedbackRequestApiModel.f9098a) && this.b == rideHailingBookingFeedbackRequestApiModel.b && Intrinsics.d(this.c, rideHailingBookingFeedbackRequestApiModel.c) && Intrinsics.d(this.d, rideHailingBookingFeedbackRequestApiModel.d) && Intrinsics.d(this.e, rideHailingBookingFeedbackRequestApiModel.e);
    }

    public final int hashCode() {
        int iHashCode = ((this.f9098a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "RideHailingBookingFeedbackRequestApiModel(bookingId=", this.f9098a, ", rating=", ", tag=");
        cb0.t(sbM, this.c, ", comment=", this.d, ", subtags=");
        return xs.l(sbM, this.e, ")");
    }

    public RideHailingBookingFeedbackRequestApiModel(int i, String bookingId, String str, String str2, List list) {
        Intrinsics.i(bookingId, "bookingId");
        this.f9098a = bookingId;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = list;
    }
}
