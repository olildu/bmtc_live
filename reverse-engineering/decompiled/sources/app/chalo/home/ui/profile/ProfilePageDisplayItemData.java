package app.chalo.home.ui.profile;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfilePageDisplayItemData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfilePageDisplayItemData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3593a;
    public final String b;
    public final IconType c;
    public final float d;
    public final ChaloPadding e;
    public final ProfilePageFeature f;
    public final ProfilePageItemDisplayType g;
    public final ProfileDrawerCardData h;

    public ProfilePageDisplayItemData(String str, String str2, IconType iconType, float f, ChaloPadding chaloPadding, ProfilePageFeature profilePageFeature, ProfilePageItemDisplayType displayType, ProfileDrawerCardData profileDrawerCardData, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        iconType = (i & 4) != 0 ? null : iconType;
        f = (i & 8) != 0 ? ChaloThemeHelper.a().j : f;
        chaloPadding = (i & 16) != 0 ? null : chaloPadding;
        profilePageFeature = (i & 32) != 0 ? null : profilePageFeature;
        profileDrawerCardData = (i & 128) != 0 ? null : profileDrawerCardData;
        Intrinsics.i(displayType, "displayType");
        this.f3593a = str;
        this.b = str2;
        this.c = iconType;
        this.d = f;
        this.e = chaloPadding;
        this.f = profilePageFeature;
        this.g = displayType;
        this.h = profileDrawerCardData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePageDisplayItemData)) {
            return false;
        }
        ProfilePageDisplayItemData profilePageDisplayItemData = (ProfilePageDisplayItemData) obj;
        return Intrinsics.d(this.f3593a, profilePageDisplayItemData.f3593a) && Intrinsics.d(this.b, profilePageDisplayItemData.b) && this.c == profilePageDisplayItemData.c && Dp.m7283equalsimpl0(this.d, profilePageDisplayItemData.d) && Intrinsics.d(this.e, profilePageDisplayItemData.e) && this.f == profilePageDisplayItemData.f && this.g == profilePageDisplayItemData.g && Intrinsics.d(this.h, profilePageDisplayItemData.h);
    }

    public final int hashCode() {
        String str = this.f3593a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconType iconType = this.c;
        int iA = uf0.a(this.d, (iHashCode2 + (iconType == null ? 0 : iconType.hashCode())) * 31, 31);
        ChaloPadding chaloPadding = this.e;
        int iHashCode3 = (iA + (chaloPadding == null ? 0 : chaloPadding.hashCode())) * 31;
        ProfilePageFeature profilePageFeature = this.f;
        int iHashCode4 = (this.g.hashCode() + ((iHashCode3 + (profilePageFeature == null ? 0 : profilePageFeature.hashCode())) * 31)) * 31;
        ProfileDrawerCardData profileDrawerCardData = this.h;
        return iHashCode4 + (profileDrawerCardData != null ? profileDrawerCardData.hashCode() : 0);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbE = dd.e("ProfilePageDisplayItemData(title=", this.f3593a, ", desc=", this.b, ", icon=");
        sbE.append(this.c);
        sbE.append(", iconSize=");
        sbE.append(strM7289toStringimpl);
        sbE.append(", iconPadding=");
        sbE.append(this.e);
        sbE.append(", featureType=");
        sbE.append(this.f);
        sbE.append(", displayType=");
        sbE.append(this.g);
        sbE.append(", profileCardData=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
