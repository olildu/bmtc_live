package app.chalo.models.ondc;

import defpackage.cb0;
import defpackage.py;
import defpackage.uf0;
import defpackage.yn0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketReceiptApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] m = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5628a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ondc/OndcTicketReceiptApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketReceiptApiModel> serializer() {
            return OndcTicketReceiptApiModel$$serializer.f5629a;
        }
    }

    public /* synthetic */ OndcTicketReceiptApiModel(int i, String str, Long l, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.b(OndcTicketReceiptApiModel$$serializer.f5629a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f5628a = str;
        this.b = l;
        this.c = l2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketReceiptApiModel)) {
            return false;
        }
        OndcTicketReceiptApiModel ondcTicketReceiptApiModel = (OndcTicketReceiptApiModel) obj;
        return Intrinsics.d(this.f5628a, ondcTicketReceiptApiModel.f5628a) && Intrinsics.d(this.b, ondcTicketReceiptApiModel.b) && Intrinsics.d(this.c, ondcTicketReceiptApiModel.c) && Intrinsics.d(this.d, ondcTicketReceiptApiModel.d) && Intrinsics.d(this.e, ondcTicketReceiptApiModel.e) && Intrinsics.d(this.f, ondcTicketReceiptApiModel.f) && Intrinsics.d(this.g, ondcTicketReceiptApiModel.g) && Intrinsics.d(this.h, ondcTicketReceiptApiModel.h) && Intrinsics.d(this.i, ondcTicketReceiptApiModel.i) && Intrinsics.d(this.j, ondcTicketReceiptApiModel.j) && Intrinsics.d(this.k, ondcTicketReceiptApiModel.k) && Intrinsics.d(this.l, ondcTicketReceiptApiModel.l);
    }

    public final int hashCode() {
        String str = this.f5628a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.l;
        return iHashCode11 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OndcTicketReceiptApiModel(bookingId=");
        sb.append(this.f5628a);
        sb.append(", punchTime=");
        sb.append(this.b);
        sb.append(", amount=");
        py.t(this.c, ", conductorId=", this.d, ", vehicleNo=", sb);
        cb0.t(sb, this.e, ", routeName=", this.f, ", startStopName=");
        cb0.t(sb, this.g, ", endStopName=", this.h, ", productType=");
        cb0.t(sb, this.i, ", productSubType=", this.j, ", userId=");
        return uf0.p(this.k, ", passengerDetails=", ")", sb, this.l);
    }
}
