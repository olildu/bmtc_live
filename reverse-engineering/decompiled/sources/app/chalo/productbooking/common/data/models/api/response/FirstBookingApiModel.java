package app.chalo.productbooking.common.data.models.api.response;

import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/FirstBookingApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FirstBookingApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8118a;
    public final long b;
    public final long c;
    public final long d;
    public final MobileTicketProductStopDetailsApiModel e;
    public final MobileTicketProductStopDetailsApiModel f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/FirstBookingApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/FirstBookingApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FirstBookingApiModel> serializer() {
            return FirstBookingApiModel$$serializer.f8119a;
        }
    }

    public /* synthetic */ FirstBookingApiModel(int i, String str, long j, long j2, long j3, MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel, MobileTicketProductStopDetailsApiModel mobileTicketProductStopDetailsApiModel2, String str2, String str3) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(FirstBookingApiModel$$serializer.f8119a.getDescriptor(), i, 255);
            throw null;
        }
        this.f8118a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = mobileTicketProductStopDetailsApiModel;
        this.f = mobileTicketProductStopDetailsApiModel2;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirstBookingApiModel)) {
            return false;
        }
        FirstBookingApiModel firstBookingApiModel = (FirstBookingApiModel) obj;
        return Intrinsics.d(this.f8118a, firstBookingApiModel.f8118a) && this.b == firstBookingApiModel.b && this.c == firstBookingApiModel.c && this.d == firstBookingApiModel.d && Intrinsics.d(this.e, firstBookingApiModel.e) && Intrinsics.d(this.f, firstBookingApiModel.f) && Intrinsics.d(this.g, firstBookingApiModel.g) && Intrinsics.d(this.h, firstBookingApiModel.h);
    }

    public final int hashCode() {
        String str = this.f8118a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        return this.h.hashCode() + nf1.e((this.f.hashCode() + ((this.e.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "FirstBookingApiModel(bookingId=", this.f8118a, ", tripStartTime=");
        xs.r(this.c, ", tripSlotStartTime=", ", expiryTime=", sbM);
        sbM.append(this.d);
        sbM.append(", fromStopDetails=");
        sbM.append(this.e);
        sbM.append(", toStopDetails=");
        sbM.append(this.f);
        sbM.append(", routeId=");
        sbM.append(this.g);
        return z40.h(sbM, ", routeName=", this.h, ")");
    }
}
