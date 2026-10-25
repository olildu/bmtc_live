package app.chalo.validationsdk.blevalidation.data.models.api;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.py;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapDataOverBleApiModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/DataOverBleApiModel;", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TITOTapDataOverBleApiModel extends DataOverBleApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final Long k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;
    public final String p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapDataOverBleApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapDataOverBleApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TITOTapDataOverBleApiModel> serializer() {
            return TITOTapDataOverBleApiModel$$serializer.f10492a;
        }
    }

    public /* synthetic */ TITOTapDataOverBleApiModel(int i, String str, Long l, String str2, String str3, Long l2, String str4, String str5, String str6, Long l3, Long l4, String str7, String str8, String str9, Integer num, String str10) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = l3;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = l4;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = str8;
        }
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = str9;
        }
        if ((i & 8192) == 0) {
            this.o = null;
        } else {
            this.o = num;
        }
        if ((i & 16384) == 0) {
            this.p = null;
        } else {
            this.p = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOTapDataOverBleApiModel)) {
            return false;
        }
        TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel = (TITOTapDataOverBleApiModel) obj;
        return Intrinsics.d(this.b, tITOTapDataOverBleApiModel.b) && Intrinsics.d(this.c, tITOTapDataOverBleApiModel.c) && Intrinsics.d(this.d, tITOTapDataOverBleApiModel.d) && Intrinsics.d(this.e, tITOTapDataOverBleApiModel.e) && Intrinsics.d(this.f, tITOTapDataOverBleApiModel.f) && Intrinsics.d(this.g, tITOTapDataOverBleApiModel.g) && Intrinsics.d(this.h, tITOTapDataOverBleApiModel.h) && Intrinsics.d(this.i, tITOTapDataOverBleApiModel.i) && Intrinsics.d(this.j, tITOTapDataOverBleApiModel.j) && Intrinsics.d(this.k, tITOTapDataOverBleApiModel.k) && Intrinsics.d(this.l, tITOTapDataOverBleApiModel.l) && Intrinsics.d(this.m, tITOTapDataOverBleApiModel.m) && Intrinsics.d(this.n, tITOTapDataOverBleApiModel.n) && Intrinsics.d(this.o, tITOTapDataOverBleApiModel.o) && Intrinsics.d(this.p, tITOTapDataOverBleApiModel.p);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l3 = this.j;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        int iHashCode10 = (iHashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str7 = this.l;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.n;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.o;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.p;
        return iHashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TITOTapDataOverBleApiModel(a=");
        sb.append(this.b);
        sb.append(", b=");
        sb.append(this.c);
        sb.append(", c=");
        cb0.t(sb, this.d, ", d=", this.e, ", e=");
        py.t(this.f, ", f=", this.g, ", g=", sb);
        cb0.t(sb, this.h, ", h=", this.i, ", i=");
        nf1.w(sb, this.j, ", j=", this.k, ", k=");
        cb0.t(sb, this.l, ", l=", this.m, ", m=");
        xs.u(this.o, this.n, ", n=", ", o=", sb);
        return vo1.p(sb, this.p, ")");
    }
}
