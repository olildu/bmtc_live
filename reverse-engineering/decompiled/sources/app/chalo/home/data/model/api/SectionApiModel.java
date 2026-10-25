package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.p41;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/SectionApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SectionApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2902a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final String n;
    public final String o;
    public final Integer p;
    public final String q;
    public final Integer r;
    public final String s;
    public final Boolean t;
    public final String u;
    public final String v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/SectionApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/SectionApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SectionApiModel> serializer() {
            return SectionApiModel$$serializer.f2903a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        w = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new p41(22)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new p41(23)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ SectionApiModel(int i, String str, String str2, String str3, int i2, List list, String str4, String str5, String str6, String str7, List list2, String str8, String str9, Boolean bool, String str10, String str11, Integer num, String str12, Integer num2, String str13, Boolean bool2, String str14, String str15) {
        if (1033 != (i & 1033)) {
            PluginExceptionsKt.b(SectionApiModel$$serializer.f2903a.getDescriptor(), i, 1033);
            throw null;
        }
        this.f2902a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
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
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        this.k = str8;
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str11;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str12;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str13;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool2;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str14;
        }
        if ((i & 2097152) == 0) {
            this.v = null;
        } else {
            this.v = str15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionApiModel)) {
            return false;
        }
        SectionApiModel sectionApiModel = (SectionApiModel) obj;
        return Intrinsics.d(this.f2902a, sectionApiModel.f2902a) && Intrinsics.d(this.b, sectionApiModel.b) && Intrinsics.d(this.c, sectionApiModel.c) && this.d == sectionApiModel.d && Intrinsics.d(this.e, sectionApiModel.e) && Intrinsics.d(this.f, sectionApiModel.f) && Intrinsics.d(this.g, sectionApiModel.g) && Intrinsics.d(this.h, sectionApiModel.h) && Intrinsics.d(this.i, sectionApiModel.i) && Intrinsics.d(this.j, sectionApiModel.j) && Intrinsics.d(this.k, sectionApiModel.k) && Intrinsics.d(this.l, sectionApiModel.l) && Intrinsics.d(this.m, sectionApiModel.m) && Intrinsics.d(this.n, sectionApiModel.n) && Intrinsics.d(this.o, sectionApiModel.o) && Intrinsics.d(this.p, sectionApiModel.p) && Intrinsics.d(this.q, sectionApiModel.q) && Intrinsics.d(this.r, sectionApiModel.r) && Intrinsics.d(this.s, sectionApiModel.s) && Intrinsics.d(this.t, sectionApiModel.t) && Intrinsics.d(this.u, sectionApiModel.u) && Intrinsics.d(this.v, sectionApiModel.v);
    }

    public final int hashCode() {
        int iHashCode = this.f2902a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31;
        List list = this.e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.j;
        int iE = nf1.e((iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.k);
        String str7 = this.l;
        int iHashCode9 = (iE + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.p;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.q;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num2 = this.r;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str11 = this.s;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.t;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str12 = this.u;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.v;
        return iHashCode18 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SectionApiModel(sectionId=", this.f2902a, ", plotlineWidgetId=", this.b, ", sectionHeader=");
        cb0.o(this.d, this.c, ", sectionPriority=", ", faqQnA=", sbE);
        cb0.s(", sectionTitle=", this.f, ", sectionDesc=", sbE, this.e);
        cb0.t(sbE, this.g, ", sectionCta=", this.h, ", sectionTitleCta=");
        pk0.w(this.i, ", sectionItems=", ", sectionType=", sbE, this.j);
        cb0.t(sbE, this.k, ", adSlot=", this.l, ", shouldHighlight=");
        hq0.t(this.m, ", sectionCtaDisplayType=", this.n, ", sectionIconId=", sbE);
        xs.u(this.p, this.o, ", maxHeightDp=", ", backgroundImageUrl=", sbE);
        xs.u(this.r, this.q, ", contentPadding=", ", placement=", sbE);
        gf.v(this.t, this.s, ", showDivider=", ", onClickUrl=", sbE);
        return r30.i(sbE, this.u, ", ctaType=", this.v, ")");
    }
}
