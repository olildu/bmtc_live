package app.chalo.instantticket.data.model.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/InstantTicketRouteDetailsApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketRouteDetailsApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3871a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/InstantTicketRouteDetailsApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/InstantTicketRouteDetailsApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketRouteDetailsApiModel> serializer() {
            return InstantTicketRouteDetailsApiModel$$serializer.f3872a;
        }
    }

    public /* synthetic */ InstantTicketRouteDetailsApiModel(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(InstantTicketRouteDetailsApiModel$$serializer.f3872a.getDescriptor(), i, 63);
            throw null;
        }
        this.f3871a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketRouteDetailsApiModel)) {
            return false;
        }
        InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel = (InstantTicketRouteDetailsApiModel) obj;
        return Intrinsics.d(this.f3871a, instantTicketRouteDetailsApiModel.f3871a) && Intrinsics.d(this.b, instantTicketRouteDetailsApiModel.b) && Intrinsics.d(this.c, instantTicketRouteDetailsApiModel.c) && Intrinsics.d(this.d, instantTicketRouteDetailsApiModel.d) && Intrinsics.d(this.e, instantTicketRouteDetailsApiModel.e) && Intrinsics.d(this.f, instantTicketRouteDetailsApiModel.f);
    }

    public final int hashCode() {
        String str = this.f3871a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketRouteDetailsApiModel(routeId=", this.f3871a, ", routeName=", this.b, ", startStopId=");
        cb0.t(sbE, this.c, ", startStopName=", this.d, ", endStopId=");
        return r30.i(sbE, this.e, ", endStopName=", this.f, ")");
    }
}
