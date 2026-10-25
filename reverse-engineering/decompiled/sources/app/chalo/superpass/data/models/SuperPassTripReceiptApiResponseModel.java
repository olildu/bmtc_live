package app.chalo.superpass.data.models;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.jg1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/SuperPassTripReceiptApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassTripReceiptApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9533a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final RouteNamingSchemeType j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/SuperPassTripReceiptApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/SuperPassTripReceiptApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassTripReceiptApiResponseModel> serializer() {
            return SuperPassTripReceiptApiResponseModel$$serializer.f9534a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new Lazy[]{null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new jg1(9)), null, LazyKt.a(lazyThreadSafetyMode, new jg1(10))};
    }

    public /* synthetic */ SuperPassTripReceiptApiResponseModel(int i, long j, Long l, String str, String str2, String str3, String str4, String str5, List list, String str6, RouteNamingSchemeType routeNamingSchemeType) {
        if (129 != (i & TsExtractor.TS_STREAM_TYPE_AC3)) {
            PluginExceptionsKt.b(SuperPassTripReceiptApiResponseModel$$serializer.f9534a.getDescriptor(), i, TsExtractor.TS_STREAM_TYPE_AC3);
            throw null;
        }
        this.f9533a = j;
        if ((i & 2) == 0) {
            this.b = -1L;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
        this.h = list;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = RouteNamingSchemeType.DEFAULT;
        } else {
            this.j = routeNamingSchemeType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassTripReceiptApiResponseModel)) {
            return false;
        }
        SuperPassTripReceiptApiResponseModel superPassTripReceiptApiResponseModel = (SuperPassTripReceiptApiResponseModel) obj;
        return this.f9533a == superPassTripReceiptApiResponseModel.f9533a && Intrinsics.d(this.b, superPassTripReceiptApiResponseModel.b) && Intrinsics.d(this.c, superPassTripReceiptApiResponseModel.c) && Intrinsics.d(this.d, superPassTripReceiptApiResponseModel.d) && Intrinsics.d(this.e, superPassTripReceiptApiResponseModel.e) && Intrinsics.d(this.f, superPassTripReceiptApiResponseModel.f) && Intrinsics.d(this.g, superPassTripReceiptApiResponseModel.g) && Intrinsics.d(this.h, superPassTripReceiptApiResponseModel.h) && Intrinsics.d(this.i, superPassTripReceiptApiResponseModel.i) && this.j == superPassTripReceiptApiResponseModel.j;
    }

    public final int hashCode() {
        long j = this.f9533a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.b;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        RouteNamingSchemeType routeNamingSchemeType = this.j;
        return iHashCode8 + (routeNamingSchemeType != null ? routeNamingSchemeType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassTripReceiptApiResponseModel(activationTime=");
        sb.append(this.f9533a);
        sb.append(", punchTime=");
        sb.append(this.b);
        cb0.t(sb, ", vehicleNo=", this.c, ", conductorId=", this.d);
        cb0.t(sb, ", startStop=", this.e, ", endStop=", this.f);
        sb.append(", routeName=");
        sb.append(this.g);
        sb.append(", specialFeatures=");
        sb.append(this.h);
        sb.append(", via=");
        sb.append(this.i);
        sb.append(", routeNamingSchemeType=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
