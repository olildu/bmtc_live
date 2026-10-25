package app.chalo.premiumbus.data.models.api.response;

import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.pw0;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumReserveTicketReceiptApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumReserveTicketReceiptApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7058a;
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
    public final RefundInfoApiModel m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumReserveTicketReceiptApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumReserveTicketReceiptApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumReserveTicketReceiptApiResponseModel> serializer() {
            return PremiumReserveTicketReceiptApiResponseModel$$serializer.f7059a;
        }
    }

    public /* synthetic */ PremiumReserveTicketReceiptApiResponseModel(int i, String str, Long l, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, RefundInfoApiModel refundInfoApiModel) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.b(PremiumReserveTicketReceiptApiResponseModel$$serializer.f7059a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f7058a = str;
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
        this.m = refundInfoApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketReceiptApiResponseModel)) {
            return false;
        }
        PremiumReserveTicketReceiptApiResponseModel premiumReserveTicketReceiptApiResponseModel = (PremiumReserveTicketReceiptApiResponseModel) obj;
        return Intrinsics.d(this.f7058a, premiumReserveTicketReceiptApiResponseModel.f7058a) && Intrinsics.d(this.b, premiumReserveTicketReceiptApiResponseModel.b) && Intrinsics.d(this.c, premiumReserveTicketReceiptApiResponseModel.c) && Intrinsics.d(this.d, premiumReserveTicketReceiptApiResponseModel.d) && Intrinsics.d(this.e, premiumReserveTicketReceiptApiResponseModel.e) && Intrinsics.d(this.f, premiumReserveTicketReceiptApiResponseModel.f) && Intrinsics.d(this.g, premiumReserveTicketReceiptApiResponseModel.g) && Intrinsics.d(this.h, premiumReserveTicketReceiptApiResponseModel.h) && Intrinsics.d(this.i, premiumReserveTicketReceiptApiResponseModel.i) && Intrinsics.d(this.j, premiumReserveTicketReceiptApiResponseModel.j) && Intrinsics.d(this.k, premiumReserveTicketReceiptApiResponseModel.k) && Intrinsics.d(this.l, premiumReserveTicketReceiptApiResponseModel.l) && Intrinsics.d(this.m, premiumReserveTicketReceiptApiResponseModel.m);
    }

    public final int hashCode() {
        String str = this.f7058a;
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
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        RefundInfoApiModel refundInfoApiModel = this.m;
        return iHashCode12 + (refundInfoApiModel != null ? refundInfoApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumReserveTicketReceiptApiResponseModel(bookingId=");
        sb.append(this.f7058a);
        sb.append(", punchTime=");
        sb.append(this.b);
        sb.append(", amount=");
        py.t(this.c, ", conductorId=", this.d, ", vehicleNo=", sb);
        cb0.t(sb, this.e, ", routeName=", this.f, ", startStopName=");
        cb0.t(sb, this.g, ", endStopName=", this.h, ", productType=");
        cb0.t(sb, this.i, ", productSubType=", this.j, ", userId=");
        pk0.w(this.k, ", passengerDetails=", ", refundInfo=", sb, this.l);
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
