package app.chalo.validationsdk.blevalidation.data.models.api;

import defpackage.cb0;
import defpackage.gf;
import defpackage.nf1;
import defpackage.py;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapOutDataOverBleApiModel;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TITOTapOutDataOverBleApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10495a;
    public final Long b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final Long j;
    public final Integer k;
    public final String l;
    public final String m;
    public final Integer n;
    public final String o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapOutDataOverBleApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/TITOTapOutDataOverBleApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TITOTapOutDataOverBleApiModel> serializer() {
            return TITOTapOutDataOverBleApiModel$$serializer.f10496a;
        }
    }

    public /* synthetic */ TITOTapOutDataOverBleApiModel(int i, Long l, Long l2, String str, String str2, Long l3, String str3, String str4, String str5, Long l4, Long l5, Integer num, String str6, String str7, Integer num2, String str8) {
        if (22503 != (i & 22503)) {
            PluginExceptionsKt.b(TITOTapOutDataOverBleApiModel$$serializer.f10496a.getDescriptor(), i, 22503);
            throw null;
        }
        this.f10495a = l;
        this.b = l2;
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = l4;
        this.j = l5;
        this.k = num;
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
        this.m = str7;
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num2;
        }
        this.o = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOTapOutDataOverBleApiModel)) {
            return false;
        }
        TITOTapOutDataOverBleApiModel tITOTapOutDataOverBleApiModel = (TITOTapOutDataOverBleApiModel) obj;
        return Intrinsics.d(this.f10495a, tITOTapOutDataOverBleApiModel.f10495a) && Intrinsics.d(this.b, tITOTapOutDataOverBleApiModel.b) && Intrinsics.d(this.c, tITOTapOutDataOverBleApiModel.c) && Intrinsics.d(this.d, tITOTapOutDataOverBleApiModel.d) && Intrinsics.d(this.e, tITOTapOutDataOverBleApiModel.e) && Intrinsics.d(this.f, tITOTapOutDataOverBleApiModel.f) && Intrinsics.d(this.g, tITOTapOutDataOverBleApiModel.g) && Intrinsics.d(this.h, tITOTapOutDataOverBleApiModel.h) && Intrinsics.d(this.i, tITOTapOutDataOverBleApiModel.i) && Intrinsics.d(this.j, tITOTapOutDataOverBleApiModel.j) && Intrinsics.d(this.k, tITOTapOutDataOverBleApiModel.k) && Intrinsics.d(this.l, tITOTapOutDataOverBleApiModel.l) && Intrinsics.d(this.m, tITOTapOutDataOverBleApiModel.m) && Intrinsics.d(this.n, tITOTapOutDataOverBleApiModel.n) && Intrinsics.d(this.o, tITOTapOutDataOverBleApiModel.o);
    }

    public final int hashCode() {
        Long l = this.f10495a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.j;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.n;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.o;
        return iHashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TITOTapOutDataOverBleApiModel(a=");
        sb.append(this.f10495a);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", c=");
        cb0.t(sb, this.c, ", d=", this.d, ", e=");
        py.t(this.e, ", f=", this.f, ", g=", sb);
        cb0.t(sb, this.g, ", h=", this.h, ", i=");
        nf1.w(sb, this.i, ", j=", this.j, ", k=");
        gf.w(this.k, ", l=", this.l, ", m=", sb);
        xs.u(this.n, this.m, ", n=", ", o=", sb);
        return vo1.p(sb, this.o, ")");
    }
}
