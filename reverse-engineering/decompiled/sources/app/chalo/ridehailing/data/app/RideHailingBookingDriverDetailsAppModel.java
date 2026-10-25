package app.chalo.ridehailing.data.app;

import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingDriverDetailsAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideHailingBookingDriverDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9107a;
    public final Double b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingDriverDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/app/RideHailingBookingDriverDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideHailingBookingDriverDetailsAppModel> serializer() {
            return RideHailingBookingDriverDetailsAppModel$$serializer.f9108a;
        }
    }

    public /* synthetic */ RideHailingBookingDriverDetailsAppModel(int i, String str, Double d, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(RideHailingBookingDriverDetailsAppModel$$serializer.f9108a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9107a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingBookingDriverDetailsAppModel)) {
            return false;
        }
        RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel = (RideHailingBookingDriverDetailsAppModel) obj;
        return Intrinsics.d(this.f9107a, rideHailingBookingDriverDetailsAppModel.f9107a) && Intrinsics.d(this.b, rideHailingBookingDriverDetailsAppModel.b) && Intrinsics.d(this.c, rideHailingBookingDriverDetailsAppModel.c) && Intrinsics.d(this.d, rideHailingBookingDriverDetailsAppModel.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9107a.hashCode() * 31;
        Double d = this.b;
        int iE = nf1.e((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideHailingBookingDriverDetailsAppModel(name=");
        sb.append(this.f9107a);
        sb.append(", rating=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        return r30.i(sb, this.c, ", imageUrl=", this.d, ")");
    }
}
