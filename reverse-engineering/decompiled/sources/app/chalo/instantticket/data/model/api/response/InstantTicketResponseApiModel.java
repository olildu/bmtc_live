package app.chalo.instantticket.data.model.api.response;

import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.ea0;
import defpackage.py;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/InstantTicketResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ea0(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3869a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final InstantTicketRouteDetailsApiModel l;
    public final List m;
    public final Long n;
    public final RefundInfoApiModel o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/InstantTicketResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/InstantTicketResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketResponseApiModel> serializer() {
            return InstantTicketResponseApiModel$$serializer.f3870a;
        }
    }

    public /* synthetic */ InstantTicketResponseApiModel(int i, String str, String str2, String str3, Long l, Long l2, String str4, Long l3, String str5, String str6, String str7, String str8, InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel, List list, Long l4, RefundInfoApiModel refundInfoApiModel) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.b(InstantTicketResponseApiModel$$serializer.f3870a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f3869a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
        this.f = str4;
        this.g = l3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = instantTicketRouteDetailsApiModel;
        this.m = list;
        this.n = l4;
        this.o = refundInfoApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketResponseApiModel)) {
            return false;
        }
        InstantTicketResponseApiModel instantTicketResponseApiModel = (InstantTicketResponseApiModel) obj;
        return Intrinsics.d(this.f3869a, instantTicketResponseApiModel.f3869a) && Intrinsics.d(this.b, instantTicketResponseApiModel.b) && Intrinsics.d(this.c, instantTicketResponseApiModel.c) && Intrinsics.d(this.d, instantTicketResponseApiModel.d) && Intrinsics.d(this.e, instantTicketResponseApiModel.e) && Intrinsics.d(this.f, instantTicketResponseApiModel.f) && Intrinsics.d(this.g, instantTicketResponseApiModel.g) && Intrinsics.d(this.h, instantTicketResponseApiModel.h) && Intrinsics.d(this.i, instantTicketResponseApiModel.i) && Intrinsics.d(this.j, instantTicketResponseApiModel.j) && Intrinsics.d(this.k, instantTicketResponseApiModel.k) && Intrinsics.d(this.l, instantTicketResponseApiModel.l) && Intrinsics.d(this.m, instantTicketResponseApiModel.m) && Intrinsics.d(this.n, instantTicketResponseApiModel.n) && Intrinsics.d(this.o, instantTicketResponseApiModel.o);
    }

    public final int hashCode() {
        String str = this.f3869a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel = this.l;
        int iHashCode12 = (iHashCode11 + (instantTicketRouteDetailsApiModel == null ? 0 : instantTicketRouteDetailsApiModel.hashCode())) * 31;
        List list = this.m;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Long l4 = this.n;
        int iHashCode14 = (iHashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        RefundInfoApiModel refundInfoApiModel = this.o;
        return iHashCode14 + (refundInfoApiModel != null ? refundInfoApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketResponseApiModel(bookingId=", this.f3869a, ", userId=", this.b, ", productName=");
        cb0.r(this.d, this.c, ", bookingTime=", ", amount=", sbE);
        py.t(this.e, ", status=", this.f, ", punchTime=", sbE);
        py.t(this.g, ", city=", this.h, ", qrCode=", sbE);
        cb0.t(sbE, this.i, ", tone=", this.j, ", configurationId=");
        sbE.append(this.k);
        sbE.append(", routeDetails=");
        sbE.append(this.l);
        sbE.append(", passengerDetails=");
        sbE.append(this.m);
        sbE.append(", activationExpiryTime=");
        sbE.append(this.n);
        sbE.append(", refundInfo=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
