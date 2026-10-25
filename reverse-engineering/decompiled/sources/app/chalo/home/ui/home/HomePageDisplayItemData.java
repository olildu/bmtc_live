package app.chalo.home.ui.home;

import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.dd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomePageDisplayItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomePageDisplayItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3532a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final IconType f;
    public final HomePageFeature g;
    public final HomePageSectionDisplayType h;
    public final boolean i;
    public final Integer j;
    public final String k;
    public final ImageResourceSectionAppModel l;

    public /* synthetic */ HomePageDisplayItemData(String str, String str2, String str3, String str4, ArrayList arrayList, IconType iconType, HomePageFeature homePageFeature, HomePageSectionDisplayType homePageSectionDisplayType, boolean z, Integer num, String str5, ImageResourceSectionAppModel imageResourceSectionAppModel, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : iconType, (i & 64) != 0 ? null : homePageFeature, homePageSectionDisplayType, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : imageResourceSectionAppModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePageDisplayItemData)) {
            return false;
        }
        HomePageDisplayItemData homePageDisplayItemData = (HomePageDisplayItemData) obj;
        return Intrinsics.d(this.f3532a, homePageDisplayItemData.f3532a) && Intrinsics.d(this.b, homePageDisplayItemData.b) && Intrinsics.d(this.c, homePageDisplayItemData.c) && Intrinsics.d(this.d, homePageDisplayItemData.d) && Intrinsics.d(this.e, homePageDisplayItemData.e) && this.f == homePageDisplayItemData.f && this.g == homePageDisplayItemData.g && this.h == homePageDisplayItemData.h && this.i == homePageDisplayItemData.i && Intrinsics.d(this.j, homePageDisplayItemData.j) && Intrinsics.d(this.k, homePageDisplayItemData.k) && Intrinsics.d(this.l, homePageDisplayItemData.l);
    }

    public final int hashCode() {
        String str = this.f3532a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        IconType iconType = this.f;
        int iHashCode6 = (iHashCode5 + (iconType == null ? 0 : iconType.hashCode())) * 31;
        HomePageFeature homePageFeature = this.g;
        int iHashCode7 = (((this.h.hashCode() + ((iHashCode6 + (homePageFeature == null ? 0 : homePageFeature.hashCode())) * 31)) * 31) + (this.i ? 1231 : 1237)) * 31;
        Integer num = this.j;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImageResourceSectionAppModel imageResourceSectionAppModel = this.l;
        return iHashCode9 + (imageResourceSectionAppModel != null ? imageResourceSectionAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("HomePageDisplayItemData(sectionHeader=", this.f3532a, ", plotlineWidgetId=", this.b, ", title=");
        cb0.t(sbE, this.c, ", desc=", this.d, ", gridItemDataList=");
        sbE.append(this.e);
        sbE.append(", icon=");
        sbE.append(this.f);
        sbE.append(", featureType=");
        sbE.append(this.g);
        sbE.append(", displayType=");
        sbE.append(this.h);
        sbE.append(", shouldHighlight=");
        sbE.append(this.i);
        sbE.append(", maxHeightDp=");
        sbE.append(this.j);
        sbE.append(", sectionId=");
        sbE.append(this.k);
        sbE.append(", imageResource=");
        sbE.append(this.l);
        sbE.append(")");
        return sbE.toString();
    }

    public HomePageDisplayItemData(String str, String str2, String str3, String str4, List list, IconType iconType, HomePageFeature homePageFeature, HomePageSectionDisplayType displayType, boolean z, Integer num, String str5, ImageResourceSectionAppModel imageResourceSectionAppModel) {
        Intrinsics.i(displayType, "displayType");
        this.f3532a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = iconType;
        this.g = homePageFeature;
        this.h = displayType;
        this.i = z;
        this.j = num;
        this.k = str5;
        this.l = imageResourceSectionAppModel;
    }
}
