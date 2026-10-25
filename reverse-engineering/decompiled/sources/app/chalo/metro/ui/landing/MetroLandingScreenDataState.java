package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import defpackage.d;
import defpackage.dd;
import defpackage.gf;
import defpackage.r30;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroLandingScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5488a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final PickStopRequestType e;
    public final Map f;
    public final List g;
    public final List h;
    public final List i;
    public final MetroLineListItemState j;
    public final StopAppModel k;
    public final StopAppModel l;
    public final MetroLandingScreenBottomSheetType m;

    public MetroLandingScreenDataState(boolean z, String str, String str2, Boolean bool, PickStopRequestType pickStopRequestType, Map map, List list, List recentStopAndRouteBasedSearchedItems, List recentStopBasedSearchedItems, MetroLineListItemState metroLineListItemState, StopAppModel stopAppModel, StopAppModel stopAppModel2, MetroLandingScreenBottomSheetType bottomSheetState) {
        Intrinsics.i(pickStopRequestType, "pickStopRequestType");
        Intrinsics.i(recentStopAndRouteBasedSearchedItems, "recentStopAndRouteBasedSearchedItems");
        Intrinsics.i(recentStopBasedSearchedItems, "recentStopBasedSearchedItems");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        this.f5488a = z;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = pickStopRequestType;
        this.f = map;
        this.g = list;
        this.h = recentStopAndRouteBasedSearchedItems;
        this.i = recentStopBasedSearchedItems;
        this.j = metroLineListItemState;
        this.k = stopAppModel;
        this.l = stopAppModel2;
        this.m = bottomSheetState;
    }

    public static MetroLandingScreenDataState a(MetroLandingScreenDataState metroLandingScreenDataState, boolean z, String str, String str2, Boolean bool, PickStopRequestType pickStopRequestType, Map map, List list, List list2, List list3, MetroLineListItemState metroLineListItemState, StopAppModel stopAppModel, StopAppModel stopAppModel2, MetroLandingScreenBottomSheetType metroLandingScreenBottomSheetType, int i) {
        if ((i & 1) != 0) {
            z = metroLandingScreenDataState.f5488a;
        }
        boolean z2 = z;
        String str3 = (i & 2) != 0 ? metroLandingScreenDataState.b : str;
        String str4 = (i & 4) != 0 ? metroLandingScreenDataState.c : str2;
        Boolean bool2 = (i & 8) != 0 ? metroLandingScreenDataState.d : bool;
        PickStopRequestType pickStopRequestType2 = (i & 16) != 0 ? metroLandingScreenDataState.e : pickStopRequestType;
        Map linesToStopListMap = (i & 32) != 0 ? metroLandingScreenDataState.f : map;
        List list4 = (i & 64) != 0 ? metroLandingScreenDataState.g : list;
        List recentStopAndRouteBasedSearchedItems = (i & 128) != 0 ? metroLandingScreenDataState.h : list2;
        List recentStopBasedSearchedItems = (i & 256) != 0 ? metroLandingScreenDataState.i : list3;
        MetroLineListItemState metroLineListItemState2 = (i & 512) != 0 ? metroLandingScreenDataState.j : metroLineListItemState;
        StopAppModel stopAppModel3 = (i & 1024) != 0 ? metroLandingScreenDataState.k : stopAppModel;
        StopAppModel stopAppModel4 = (i & 2048) != 0 ? metroLandingScreenDataState.l : stopAppModel2;
        MetroLandingScreenBottomSheetType bottomSheetState = (i & 4096) != 0 ? metroLandingScreenDataState.m : metroLandingScreenBottomSheetType;
        metroLandingScreenDataState.getClass();
        Intrinsics.i(pickStopRequestType2, "pickStopRequestType");
        Intrinsics.i(linesToStopListMap, "linesToStopListMap");
        Intrinsics.i(recentStopAndRouteBasedSearchedItems, "recentStopAndRouteBasedSearchedItems");
        Intrinsics.i(recentStopBasedSearchedItems, "recentStopBasedSearchedItems");
        Intrinsics.i(bottomSheetState, "bottomSheetState");
        return new MetroLandingScreenDataState(z2, str3, str4, bool2, pickStopRequestType2, linesToStopListMap, list4, recentStopAndRouteBasedSearchedItems, recentStopBasedSearchedItems, metroLineListItemState2, stopAppModel3, stopAppModel4, bottomSheetState);
    }

    public final List b() {
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel;
        MetroLineListItemState metroLineListItemState = this.j;
        List list = (List) this.f.get((metroLineListItemState == null || (ondcMetroRouteSearchAppModel = metroLineListItemState.f5509a) == null) ? null : ondcMetroRouteSearchAppModel.f6766a);
        return list == null ? EmptyList.f17557a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLandingScreenDataState)) {
            return false;
        }
        MetroLandingScreenDataState metroLandingScreenDataState = (MetroLandingScreenDataState) obj;
        return this.f5488a == metroLandingScreenDataState.f5488a && Intrinsics.d(this.b, metroLandingScreenDataState.b) && Intrinsics.d(this.c, metroLandingScreenDataState.c) && Intrinsics.d(this.d, metroLandingScreenDataState.d) && this.e == metroLandingScreenDataState.e && Intrinsics.d(this.f, metroLandingScreenDataState.f) && Intrinsics.d(this.g, metroLandingScreenDataState.g) && Intrinsics.d(this.h, metroLandingScreenDataState.h) && Intrinsics.d(this.i, metroLandingScreenDataState.i) && Intrinsics.d(this.j, metroLandingScreenDataState.j) && Intrinsics.d(this.k, metroLandingScreenDataState.k) && Intrinsics.d(this.l, metroLandingScreenDataState.l) && this.m == metroLandingScreenDataState.m;
    }

    public final int hashCode() {
        int i = (this.f5488a ? 1231 : 1237) * 31;
        String str = this.b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iF = d.f(this.f, (this.e.hashCode() + ((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31);
        List list = this.g;
        int iB = r30.b(r30.b((iF + (list == null ? 0 : list.hashCode())) * 31, 31, this.h), 31, this.i);
        MetroLineListItemState metroLineListItemState = this.j;
        int iHashCode3 = (iB + (metroLineListItemState == null ? 0 : metroLineListItemState.hashCode())) * 31;
        StopAppModel stopAppModel = this.k;
        int iHashCode4 = (iHashCode3 + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
        StopAppModel stopAppModel2 = this.l;
        return this.m.hashCode() + ((iHashCode4 + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroLandingScreenDataState(showLoadingDialog=");
        sb.append(this.f5488a);
        sb.append(", ondcConfigId=");
        sb.append(this.b);
        sb.append(", ondcAgencyName=");
        gf.v(this.d, this.c, ", isRouteBasedFlow=", ", pickStopRequestType=", sb);
        sb.append(this.e);
        sb.append(", linesToStopListMap=");
        sb.append(this.f);
        sb.append(", metroLineItemStateList=");
        dd.o(sb, this.g, ", recentStopAndRouteBasedSearchedItems=", this.h, ", recentStopBasedSearchedItems=");
        sb.append(this.i);
        sb.append(", selectedLine=");
        sb.append(this.j);
        sb.append(", selectedFromStation=");
        sb.append(this.k);
        sb.append(", selectedToStation=");
        sb.append(this.l);
        sb.append(", bottomSheetState=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
