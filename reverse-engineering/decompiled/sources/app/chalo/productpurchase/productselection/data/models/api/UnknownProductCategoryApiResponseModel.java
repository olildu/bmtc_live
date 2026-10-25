package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.ll1;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductCategoryApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UnknownProductCategoryApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] q = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(28)), null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8619a;
    public final String b;
    public final Integer c;
    public final List d;
    public final Integer e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final Integer k;
    public final String l;
    public final Integer m;
    public final Integer n;
    public final String o;
    public final Boolean p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductCategoryApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductCategoryApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UnknownProductCategoryApiResponseModel> serializer() {
            return UnknownProductCategoryApiResponseModel$$serializer.f8620a;
        }
    }

    public /* synthetic */ UnknownProductCategoryApiResponseModel(int i, String str, String str2, Integer num, List list, Integer num2, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, Integer num3, String str5, Integer num4, Integer num5, String str6, Boolean bool4) {
        if (65535 != (i & 65535)) {
            PluginExceptionsKt.b(UnknownProductCategoryApiResponseModel$$serializer.f8620a.getDescriptor(), i, 65535);
            throw null;
        }
        this.f8619a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
        this.e = num2;
        this.f = bool;
        this.g = bool2;
        this.h = str3;
        this.i = bool3;
        this.j = str4;
        this.k = num3;
        this.l = str5;
        this.m = num4;
        this.n = num5;
        this.o = str6;
        this.p = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductCategoryApiResponseModel)) {
            return false;
        }
        UnknownProductCategoryApiResponseModel unknownProductCategoryApiResponseModel = (UnknownProductCategoryApiResponseModel) obj;
        return Intrinsics.d(this.f8619a, unknownProductCategoryApiResponseModel.f8619a) && Intrinsics.d(this.b, unknownProductCategoryApiResponseModel.b) && Intrinsics.d(this.c, unknownProductCategoryApiResponseModel.c) && Intrinsics.d(this.d, unknownProductCategoryApiResponseModel.d) && Intrinsics.d(this.e, unknownProductCategoryApiResponseModel.e) && Intrinsics.d(this.f, unknownProductCategoryApiResponseModel.f) && Intrinsics.d(this.g, unknownProductCategoryApiResponseModel.g) && Intrinsics.d(this.h, unknownProductCategoryApiResponseModel.h) && Intrinsics.d(this.i, unknownProductCategoryApiResponseModel.i) && Intrinsics.d(this.j, unknownProductCategoryApiResponseModel.j) && Intrinsics.d(this.k, unknownProductCategoryApiResponseModel.k) && Intrinsics.d(this.l, unknownProductCategoryApiResponseModel.l) && Intrinsics.d(this.m, unknownProductCategoryApiResponseModel.m) && Intrinsics.d(this.n, unknownProductCategoryApiResponseModel.n) && Intrinsics.d(this.o, unknownProductCategoryApiResponseModel.o) && Intrinsics.d(this.p, unknownProductCategoryApiResponseModel.p);
    }

    public final int hashCode() {
        String str = this.f8619a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.m;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.n;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool4 = this.p;
        return iHashCode15 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UnknownProductCategoryApiResponseModel(id=", this.f8619a, ", name=", this.b, ", displayOrder=");
        sbE.append(this.c);
        sbE.append(", proofs=");
        sbE.append(this.d);
        sbE.append(", pos=");
        sbE.append(this.e);
        sbE.append(", isActive=");
        sbE.append(this.f);
        sbE.append(", isRenewable=");
        hq0.t(this.g, ", documentsDesc=", this.h, ", isVerificationRequired=", sbE);
        hq0.t(this.i, ", info=", this.j, ", maxIssueCount=", sbE);
        gf.w(this.k, ", inactiveReason=", this.l, ", maxPricePerTrip=", sbE);
        pk0.y(sbE, this.m, ", maxTripsPerDay=", this.n, ", infoNote=");
        sbE.append(this.o);
        sbE.append(", isVisible=");
        sbE.append(this.p);
        sbE.append(")");
        return sbE.toString();
    }
}
