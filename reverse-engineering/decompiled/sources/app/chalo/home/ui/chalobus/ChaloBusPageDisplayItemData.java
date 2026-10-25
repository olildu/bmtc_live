package app.chalo.home.ui.chalobus;

import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusPageDisplayItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusPageDisplayItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3248a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final IconType g;
    public final ChaloBusPageFeature h;
    public final ChaloBusPageSectionDisplayType i;
    public final String j;
    public final ChaloCtaDisplayType k;

    public ChaloBusPageDisplayItemData(boolean z, String str, String str2, String str3, String str4, ArrayList arrayList, IconType iconType, ChaloBusPageFeature featureType, ChaloBusPageSectionDisplayType displayType, String str5, ChaloCtaDisplayType sectionCtaDisplayType, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str4 = (i & 16) != 0 ? null : str4;
        arrayList = (i & 32) != 0 ? null : arrayList;
        iconType = (i & 64) != 0 ? null : iconType;
        str5 = (i & 512) != 0 ? null : str5;
        sectionCtaDisplayType = (i & 1024) != 0 ? ChaloCtaDisplayType.ARROW : sectionCtaDisplayType;
        Intrinsics.i(featureType, "featureType");
        Intrinsics.i(displayType, "displayType");
        Intrinsics.i(sectionCtaDisplayType, "sectionCtaDisplayType");
        this.f3248a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList;
        this.g = iconType;
        this.h = featureType;
        this.i = displayType;
        this.j = str5;
        this.k = sectionCtaDisplayType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusPageDisplayItemData)) {
            return false;
        }
        ChaloBusPageDisplayItemData chaloBusPageDisplayItemData = (ChaloBusPageDisplayItemData) obj;
        return this.f3248a == chaloBusPageDisplayItemData.f3248a && Intrinsics.d(this.b, chaloBusPageDisplayItemData.b) && Intrinsics.d(this.c, chaloBusPageDisplayItemData.c) && Intrinsics.d(this.d, chaloBusPageDisplayItemData.d) && Intrinsics.d(this.e, chaloBusPageDisplayItemData.e) && Intrinsics.d(this.f, chaloBusPageDisplayItemData.f) && this.g == chaloBusPageDisplayItemData.g && this.h == chaloBusPageDisplayItemData.h && this.i == chaloBusPageDisplayItemData.i && Intrinsics.d(this.j, chaloBusPageDisplayItemData.j) && this.k == chaloBusPageDisplayItemData.k;
    }

    public final int hashCode() {
        int i = (this.f3248a ? 1231 : 1237) * 31;
        String str = this.b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        IconType iconType = this.g;
        int iHashCode6 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode5 + (iconType == null ? 0 : iconType.hashCode())) * 31)) * 31)) * 31;
        String str5 = this.j;
        return this.k.hashCode() + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloBusPageDisplayItemData(shouldHighlight=");
        sb.append(this.f3248a);
        sb.append(", plotlineWidgetId=");
        sb.append(this.b);
        sb.append(", sectionHeader=");
        cb0.t(sb, this.c, ", title=", this.d, ", desc=");
        pk0.w(this.e, ", productDataList=", ", icon=", sb, this.f);
        sb.append(this.g);
        sb.append(", featureType=");
        sb.append(this.h);
        sb.append(", displayType=");
        sb.append(this.i);
        sb.append(", sectionCta=");
        sb.append(this.j);
        sb.append(", sectionCtaDisplayType=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
