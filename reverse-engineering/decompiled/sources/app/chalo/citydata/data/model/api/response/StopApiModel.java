package app.chalo.citydata.data.model.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/StopApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1693a;
    public final String b;
    public final double c;
    public final double d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/StopApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/StopApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopApiModel> serializer() {
            return StopApiModel$$serializer.f1694a;
        }
    }

    public /* synthetic */ StopApiModel(int i, String str, String str2, double d, double d2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f1693a = null;
        } else {
            this.f1693a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = -1.0d;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = -1.0d;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = "BUS";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopApiModel)) {
            return false;
        }
        StopApiModel stopApiModel = (StopApiModel) obj;
        return Intrinsics.d(this.f1693a, stopApiModel.f1693a) && Intrinsics.d(this.b, stopApiModel.b) && Double.compare(this.c, stopApiModel.c) == 0 && Double.compare(this.d, stopApiModel.d) == 0 && Intrinsics.d(this.e, stopApiModel.e) && Intrinsics.d(this.f, stopApiModel.f) && Intrinsics.d(this.g, stopApiModel.g);
    }

    public final int hashCode() {
        String str = this.f1693a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        int i = (iHashCode2 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.d);
        int iE = nf1.e((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode3 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopApiModel(stopId=", this.f1693a, ", stopName=", this.b, ", stopLat=");
        sbE.append(this.c);
        pk0.z(sbE, ", stopLon=", this.d, ", stationType=");
        cb0.t(sbE, this.e, ", stopAddress=", this.f, ", partnerStopId=");
        return vo1.p(sbE, this.g, ")");
    }
}
