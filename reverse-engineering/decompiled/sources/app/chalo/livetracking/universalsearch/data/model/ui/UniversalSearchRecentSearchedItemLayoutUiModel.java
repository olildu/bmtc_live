package app.chalo.livetracking.universalsearch.data.model.ui;

import androidx.compose.ui.text.AnnotatedString;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.b3;
import defpackage.hq0;
import defpackage.pk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchRecentSearchedItemLayoutUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchRecentSearchedItemLayoutUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f5004a;
    public final AnnotatedString b;
    public final String c;
    public final IconType d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final List h;
    public final boolean i;

    public UniversalSearchRecentSearchedItemLayoutUiModel(IconType iconType, AnnotatedString title, String str, IconType iconType2, boolean z, String str2, boolean z2, List list, boolean z3, int i) {
        iconType2 = (i & 8) != 0 ? null : iconType2;
        z = (i & 16) != 0 ? false : z;
        str2 = (i & 32) != 0 ? null : str2;
        z2 = (i & 64) != 0 ? false : z2;
        list = (i & 128) != 0 ? null : list;
        Intrinsics.i(title, "title");
        this.f5004a = iconType;
        this.b = title;
        this.c = str;
        this.d = iconType2;
        this.e = z;
        this.f = str2;
        this.g = z2;
        this.h = list;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchRecentSearchedItemLayoutUiModel)) {
            return false;
        }
        UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel = (UniversalSearchRecentSearchedItemLayoutUiModel) obj;
        return this.f5004a == universalSearchRecentSearchedItemLayoutUiModel.f5004a && Intrinsics.d(this.b, universalSearchRecentSearchedItemLayoutUiModel.b) && Intrinsics.d(this.c, universalSearchRecentSearchedItemLayoutUiModel.c) && this.d == universalSearchRecentSearchedItemLayoutUiModel.d && this.e == universalSearchRecentSearchedItemLayoutUiModel.e && Intrinsics.d(this.f, universalSearchRecentSearchedItemLayoutUiModel.f) && this.g == universalSearchRecentSearchedItemLayoutUiModel.g && Intrinsics.d(this.h, universalSearchRecentSearchedItemLayoutUiModel.h) && this.i == universalSearchRecentSearchedItemLayoutUiModel.i;
    }

    public final int hashCode() {
        IconType iconType = this.f5004a;
        int iHashCode = (this.b.hashCode() + ((iconType == null ? 0 : iconType.hashCode()) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconType iconType2 = this.d;
        int iHashCode3 = (((iHashCode2 + (iconType2 == null ? 0 : iconType2.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        String str2 = this.f;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
        List list = this.h;
        return ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalSearchRecentSearchedItemLayoutUiModel(titleIconLeftSide=");
        sb.append(this.f5004a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subText=");
        sb.append(this.c);
        sb.append(", menuIconRightSide=");
        sb.append(this.d);
        sb.append(", shouldShowFavMenuIcon=");
        pk0.x(", busAgencyName=", this.f, ", isSpecialFeatureAc=", sb, this.e);
        hq0.w(sb, this.g, ", specialFeatureList=", this.h, ", shouldShowAgencyTag=");
        return b3.g(")", sb, this.i);
    }
}
