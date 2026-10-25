package app.chalo.home.ui.regularbus;

import app.chalo.ads.UnifiedAdSlot;
import app.chalo.data.TextFormatAppModel;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.b3;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusPageDisplayItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusPageDisplayItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3632a;
    public final String b;
    public final TextFormatAppModel c;
    public final String d;
    public final List e;
    public final IconType f;
    public final RegularBusPageFeature g;
    public final RegularBusPageSectionDisplayType h;
    public final String i;
    public final String j;
    public final ChaloCtaDisplayType k;
    public final List l;
    public final String m;
    public final List n;
    public final String o;
    public final IconType p;
    public final ImageResourceSectionAppModel q;
    public final Integer r;
    public final String s;
    public final UnifiedAdSlot t;
    public final boolean u;

    public RegularBusPageDisplayItemData(boolean z, String str, TextFormatAppModel textFormatAppModel, String str2, List list, IconType iconType, RegularBusPageFeature regularBusPageFeature, RegularBusPageSectionDisplayType displayType, String str3, String str4, ChaloCtaDisplayType sectionCtaDisplayType, List faqList, String str5, List productList, String str6, IconType iconType2, ImageResourceSectionAppModel imageResourceSectionAppModel, Integer num, String str7, UnifiedAdSlot unifiedAdSlot, boolean z2) {
        Intrinsics.i(displayType, "displayType");
        Intrinsics.i(sectionCtaDisplayType, "sectionCtaDisplayType");
        Intrinsics.i(faqList, "faqList");
        Intrinsics.i(productList, "productList");
        Intrinsics.i(unifiedAdSlot, "unifiedAdSlot");
        this.f3632a = z;
        this.b = str;
        this.c = textFormatAppModel;
        this.d = str2;
        this.e = list;
        this.f = iconType;
        this.g = regularBusPageFeature;
        this.h = displayType;
        this.i = str3;
        this.j = str4;
        this.k = sectionCtaDisplayType;
        this.l = faqList;
        this.m = str5;
        this.n = productList;
        this.o = str6;
        this.p = iconType2;
        this.q = imageResourceSectionAppModel;
        this.r = num;
        this.s = str7;
        this.t = unifiedAdSlot;
        this.u = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusPageDisplayItemData)) {
            return false;
        }
        RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) obj;
        return this.f3632a == regularBusPageDisplayItemData.f3632a && Intrinsics.d(this.b, regularBusPageDisplayItemData.b) && Intrinsics.d(this.c, regularBusPageDisplayItemData.c) && Intrinsics.d(this.d, regularBusPageDisplayItemData.d) && Intrinsics.d(this.e, regularBusPageDisplayItemData.e) && this.f == regularBusPageDisplayItemData.f && this.g == regularBusPageDisplayItemData.g && this.h == regularBusPageDisplayItemData.h && Intrinsics.d(this.i, regularBusPageDisplayItemData.i) && Intrinsics.d(this.j, regularBusPageDisplayItemData.j) && this.k == regularBusPageDisplayItemData.k && Intrinsics.d(this.l, regularBusPageDisplayItemData.l) && Intrinsics.d(this.m, regularBusPageDisplayItemData.m) && Intrinsics.d(this.n, regularBusPageDisplayItemData.n) && Intrinsics.d(this.o, regularBusPageDisplayItemData.o) && this.p == regularBusPageDisplayItemData.p && Intrinsics.d(this.q, regularBusPageDisplayItemData.q) && Intrinsics.d(this.r, regularBusPageDisplayItemData.r) && Intrinsics.d(this.s, regularBusPageDisplayItemData.s) && this.t == regularBusPageDisplayItemData.t && this.u == regularBusPageDisplayItemData.u;
    }

    public final int hashCode() {
        int i = (this.f3632a ? 1231 : 1237) * 31;
        String str = this.b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        TextFormatAppModel textFormatAppModel = this.c;
        int iHashCode2 = (iHashCode + (textFormatAppModel == null ? 0 : textFormatAppModel.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        IconType iconType = this.f;
        int iHashCode5 = (iHashCode4 + (iconType == null ? 0 : iconType.hashCode())) * 31;
        RegularBusPageFeature regularBusPageFeature = this.g;
        int iHashCode6 = (this.h.hashCode() + ((iHashCode5 + (regularBusPageFeature == null ? 0 : regularBusPageFeature.hashCode())) * 31)) * 31;
        String str3 = this.i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iB = r30.b((this.k.hashCode() + ((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.l);
        String str5 = this.m;
        int iB2 = r30.b((iB + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n);
        String str6 = this.o;
        int iHashCode8 = (iB2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        IconType iconType2 = this.p;
        int iHashCode9 = (iHashCode8 + (iconType2 == null ? 0 : iconType2.hashCode())) * 31;
        ImageResourceSectionAppModel imageResourceSectionAppModel = this.q;
        int iHashCode10 = (iHashCode9 + (imageResourceSectionAppModel == null ? 0 : imageResourceSectionAppModel.hashCode())) * 31;
        Integer num = this.r;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.s;
        return ((this.t.hashCode() + ((iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31)) * 31) + (this.u ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularBusPageDisplayItemData(shouldHighlight=");
        sb.append(this.f3632a);
        sb.append(", plotlineWidgetId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", desc=");
        sb.append(this.d);
        sb.append(", quickPaymentSectionDataList=");
        sb.append(this.e);
        sb.append(", icon=");
        sb.append(this.f);
        sb.append(", featureType=");
        sb.append(this.g);
        sb.append(", displayType=");
        sb.append(this.h);
        sb.append(", sectionCta=");
        cb0.t(sb, this.i, ", sectionTitleCta=", this.j, ", sectionCtaDisplayType=");
        sb.append(this.k);
        sb.append(", faqList=");
        sb.append(this.l);
        sb.append(", sectionHeader=");
        pk0.w(this.m, ", productList=", ", imageUrl=", sb, this.n);
        sb.append(this.o);
        sb.append(", imageFallbackId=");
        sb.append(this.p);
        sb.append(", imageResource=");
        sb.append(this.q);
        sb.append(", maxHeightDp=");
        sb.append(this.r);
        sb.append(", sectionId=");
        sb.append(this.s);
        sb.append(", unifiedAdSlot=");
        sb.append(this.t);
        sb.append(", isFullWidth=");
        return b3.g(")", sb, this.u);
    }

    public RegularBusPageDisplayItemData(boolean z, String str, TextFormatAppModel textFormatAppModel, String str2, ArrayList arrayList, IconType iconType, RegularBusPageFeature regularBusPageFeature, RegularBusPageSectionDisplayType regularBusPageSectionDisplayType, String str3, String str4, ChaloCtaDisplayType chaloCtaDisplayType, List list, String str5, ArrayList arrayList2, String str6, IconType iconType2, ImageResourceSectionAppModel imageResourceSectionAppModel, Integer num, String str7, UnifiedAdSlot unifiedAdSlot, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : textFormatAppModel, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : iconType, (i & 64) != 0 ? null : regularBusPageFeature, regularBusPageSectionDisplayType, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? ChaloCtaDisplayType.UNKNOWN : chaloCtaDisplayType, (i & 2048) != 0 ? EmptyList.f17557a : list, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? EmptyList.f17557a : arrayList2, (i & 16384) != 0 ? null : str6, (32768 & i) != 0 ? null : iconType2, (65536 & i) != 0 ? null : imageResourceSectionAppModel, (131072 & i) != 0 ? null : num, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? UnifiedAdSlot.REGULAR_BUS_INLINE_ADAPTIVE : unifiedAdSlot, (i & 1048576) != 0 ? false : z2);
    }
}
