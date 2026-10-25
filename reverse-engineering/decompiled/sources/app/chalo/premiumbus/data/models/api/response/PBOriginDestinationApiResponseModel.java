package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.eo0;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PBOriginDestinationApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBOriginDestinationApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] m = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new eo0(24)), null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7028a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final Long k;
    public final String l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PBOriginDestinationApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PBOriginDestinationApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBOriginDestinationApiResponseModel> serializer() {
            return PBOriginDestinationApiResponseModel$$serializer.f7029a;
        }
    }

    public /* synthetic */ PBOriginDestinationApiResponseModel(int i, List list, String str, String str2, String str3, Long l, Long l2, String str4, String str5, String str6, Long l3, Long l4, String str7) {
        if (4092 != (i & 4092)) {
            PluginExceptionsKt.b(PBOriginDestinationApiResponseModel$$serializer.f7029a.getDescriptor(), i, 4092);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f7028a = null;
        } else {
            this.f7028a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = l2;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = l3;
        this.k = l4;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBOriginDestinationApiResponseModel)) {
            return false;
        }
        PBOriginDestinationApiResponseModel pBOriginDestinationApiResponseModel = (PBOriginDestinationApiResponseModel) obj;
        return Intrinsics.d(this.f7028a, pBOriginDestinationApiResponseModel.f7028a) && Intrinsics.d(this.b, pBOriginDestinationApiResponseModel.b) && Intrinsics.d(this.c, pBOriginDestinationApiResponseModel.c) && Intrinsics.d(this.d, pBOriginDestinationApiResponseModel.d) && Intrinsics.d(this.e, pBOriginDestinationApiResponseModel.e) && Intrinsics.d(this.f, pBOriginDestinationApiResponseModel.f) && Intrinsics.d(this.g, pBOriginDestinationApiResponseModel.g) && Intrinsics.d(this.h, pBOriginDestinationApiResponseModel.h) && Intrinsics.d(this.i, pBOriginDestinationApiResponseModel.i) && Intrinsics.d(this.j, pBOriginDestinationApiResponseModel.j) && Intrinsics.d(this.k, pBOriginDestinationApiResponseModel.k) && Intrinsics.d(this.l, pBOriginDestinationApiResponseModel.l);
    }

    public final int hashCode() {
        List list = this.f7028a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        int iHashCode11 = (iHashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str7 = this.l;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBOriginDestinationApiResponseModel(routeIds=");
        sb.append(this.f7028a);
        sb.append(", specialTag=");
        sb.append(this.b);
        sb.append(", fromStopId=");
        cb0.t(sb, this.c, ", fromStopName=", this.d, ", timeToReachFromStop=");
        nf1.w(sb, this.e, ", distanceToReachFromStop=", this.f, ", modeToReachFromStop=");
        cb0.t(sb, this.g, ", toStopId=", this.h, ", toStopName=");
        cb0.r(this.j, this.i, ", timeToReachToStop=", ", distanceToReachToStop=", sb);
        sb.append(this.k);
        sb.append(", modeToReachToStop=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
