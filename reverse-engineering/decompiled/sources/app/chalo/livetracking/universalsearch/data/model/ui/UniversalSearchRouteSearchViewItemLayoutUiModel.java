package app.chalo.livetracking.universalsearch.data.model.ui;

import androidx.compose.ui.text.AnnotatedString;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchRouteSearchViewItemLayoutUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchRouteSearchViewItemLayoutUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f5005a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final AnnotatedString f;
    public final List g;
    public final boolean h;

    public UniversalSearchRouteSearchViewItemLayoutUiModel(IconType iconType, String str, boolean z, boolean z2, String str2, AnnotatedString routeNameViewText, List list, boolean z3) {
        Intrinsics.i(routeNameViewText, "routeNameViewText");
        this.f5005a = iconType;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = routeNameViewText;
        this.g = list;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchRouteSearchViewItemLayoutUiModel)) {
            return false;
        }
        UniversalSearchRouteSearchViewItemLayoutUiModel universalSearchRouteSearchViewItemLayoutUiModel = (UniversalSearchRouteSearchViewItemLayoutUiModel) obj;
        return this.f5005a == universalSearchRouteSearchViewItemLayoutUiModel.f5005a && Intrinsics.d(this.b, universalSearchRouteSearchViewItemLayoutUiModel.b) && this.c == universalSearchRouteSearchViewItemLayoutUiModel.c && this.d == universalSearchRouteSearchViewItemLayoutUiModel.d && Intrinsics.d(this.e, universalSearchRouteSearchViewItemLayoutUiModel.e) && Intrinsics.d(this.f, universalSearchRouteSearchViewItemLayoutUiModel.f) && Intrinsics.d(this.g, universalSearchRouteSearchViewItemLayoutUiModel.g) && this.h == universalSearchRouteSearchViewItemLayoutUiModel.h;
    }

    public final int hashCode() {
        IconType iconType = this.f5005a;
        int iHashCode = (iconType == null ? 0 : iconType.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List list = this.g;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalSearchRouteSearchViewItemLayoutUiModel(modeIcon=");
        sb.append(this.f5005a);
        sb.append(", agencyName=");
        sb.append(this.b);
        sb.append(", isFreeRide=");
        z40.r(sb, this.c, ", isSpecialFeatureAc=", this.d, ", stopNameViewText=");
        sb.append(this.e);
        sb.append(", routeNameViewText=");
        sb.append((Object) this.f);
        sb.append(", specialFeatureList=");
        sb.append(this.g);
        sb.append(", shouldShowAgencyTag=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
