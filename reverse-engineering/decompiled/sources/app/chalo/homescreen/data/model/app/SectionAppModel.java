package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.gf;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/SectionAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SectionAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3811a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final String n;
    public final IconType o;
    public final Integer p;
    public final String q;
    public final Integer r;
    public final String s;
    public final Boolean t;
    public final String u;
    public final String v;

    public SectionAppModel(ArrayList arrayList, String str, String str2, String str3, String str4, String sectionId, ArrayList arrayList2, int i, String str5, String str6, String sectionType, String str7, Boolean bool, String str8, IconType iconType, Integer num, String str9, Integer num2, String str10, Boolean bool2, String str11, String str12) {
        Intrinsics.i(sectionId, "sectionId");
        Intrinsics.i(sectionType, "sectionType");
        this.f3811a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = sectionId;
        this.g = arrayList2;
        this.h = i;
        this.i = str5;
        this.j = str6;
        this.k = sectionType;
        this.l = str7;
        this.m = bool;
        this.n = str8;
        this.o = iconType;
        this.p = num;
        this.q = str9;
        this.r = num2;
        this.s = str10;
        this.t = bool2;
        this.u = str11;
        this.v = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionAppModel)) {
            return false;
        }
        SectionAppModel sectionAppModel = (SectionAppModel) obj;
        return Intrinsics.d(this.f3811a, sectionAppModel.f3811a) && Intrinsics.d(this.b, sectionAppModel.b) && Intrinsics.d(this.c, sectionAppModel.c) && Intrinsics.d(this.d, sectionAppModel.d) && Intrinsics.d(this.e, sectionAppModel.e) && Intrinsics.d(this.f, sectionAppModel.f) && Intrinsics.d(this.g, sectionAppModel.g) && this.h == sectionAppModel.h && Intrinsics.d(this.i, sectionAppModel.i) && Intrinsics.d(this.j, sectionAppModel.j) && Intrinsics.d(this.k, sectionAppModel.k) && Intrinsics.d(this.l, sectionAppModel.l) && Intrinsics.d(this.m, sectionAppModel.m) && Intrinsics.d(this.n, sectionAppModel.n) && this.o == sectionAppModel.o && Intrinsics.d(this.p, sectionAppModel.p) && Intrinsics.d(this.q, sectionAppModel.q) && Intrinsics.d(this.r, sectionAppModel.r) && Intrinsics.d(this.s, sectionAppModel.s) && Intrinsics.d(this.t, sectionAppModel.t) && Intrinsics.d(this.u, sectionAppModel.u) && Intrinsics.d(this.v, sectionAppModel.v);
    }

    public final int hashCode() {
        List list = this.f3811a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iE = nf1.e((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f);
        List list2 = this.g;
        int iHashCode5 = (((iE + (list2 == null ? 0 : list2.hashCode())) * 31) + this.h) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iE2 = nf1.e((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.k);
        String str7 = this.l;
        int iHashCode7 = (iE2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        IconType iconType = this.o;
        int iHashCode10 = (iHashCode9 + (iconType == null ? 0 : iconType.hashCode())) * 31;
        Integer num = this.p;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.q;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.r;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.s;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.t;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.u;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.v;
        return iHashCode16 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionAppModel(faqQnA=");
        sb.append(this.f3811a);
        sb.append(", plotlineWidgetId=");
        sb.append(this.b);
        sb.append(", sectionCta=");
        cb0.t(sb, this.c, ", sectionDesc=", this.d, ", sectionHeader=");
        cb0.t(sb, this.e, ", sectionId=", this.f, ", sectionItems=");
        sb.append(this.g);
        sb.append(", sectionPriority=");
        sb.append(this.h);
        sb.append(", sectionTitle=");
        cb0.t(sb, this.i, ", sectionTitleCta=", this.j, ", sectionType=");
        cb0.t(sb, this.k, ", adSlot=", this.l, ", shouldHighlight=");
        hq0.t(this.m, ", sectionCtaDisplayType=", this.n, ", sectionIconId=", sb);
        sb.append(this.o);
        sb.append(", maxHeightDp=");
        sb.append(this.p);
        sb.append(", backgroundImageUrl=");
        xs.u(this.r, this.q, ", contentPadding=", ", placement=", sb);
        gf.v(this.t, this.s, ", showDivider=", ", onClickUrl=", sb);
        return r30.i(sb, this.u, ", ctaType=", this.v, ")");
    }
}
