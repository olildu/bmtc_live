package app.chalo.livetracking.universalsearch.ui;

import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchedDataItem;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerViewState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalPickerViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UniversalSearchRecentSearchedDataItem f5084a;
    public final List b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final SearchScreenLayoutType f;
    public final SearchErrorScreen g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final UniversalSearchFlowSource l;
    public final UniversalSearchOptions m;
    public final DestinationAfterUniversalSearch n;
    public final ChaloTransitMode o;
    public final UniversalSearchAdditionalEventProperties p;
    public final boolean q;
    public final UniversalSearchDescriptiveLocationAppModel r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final String v;
    public final UniversalPickerHeaderIcon w;

    public UniversalPickerViewState(UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem, List universalSearchItem, String str, boolean z, boolean z2, SearchScreenLayoutType layoutType, SearchErrorScreen searchErrorScreen, boolean z3, boolean z4, boolean z5, String str2, UniversalSearchFlowSource source, UniversalSearchOptions universalSearchOptions, DestinationAfterUniversalSearch destinationAfterUniversalSearch, ChaloTransitMode transitMode, UniversalSearchAdditionalEventProperties universalSearchAdditionalEventProperties, boolean z6, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, boolean z7, boolean z8, String str3, String str4, UniversalPickerHeaderIcon universalPickerHeaderIcon) {
        Intrinsics.i(universalSearchItem, "universalSearchItem");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(source, "source");
        Intrinsics.i(destinationAfterUniversalSearch, "destinationAfterUniversalSearch");
        Intrinsics.i(transitMode, "transitMode");
        this.f5084a = universalSearchRecentSearchedDataItem;
        this.b = universalSearchItem;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = layoutType;
        this.g = searchErrorScreen;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = str2;
        this.l = source;
        this.m = universalSearchOptions;
        this.n = destinationAfterUniversalSearch;
        this.o = transitMode;
        this.p = universalSearchAdditionalEventProperties;
        this.q = z6;
        this.r = universalSearchDescriptiveLocationAppModel;
        this.s = z7;
        this.t = z8;
        this.u = str3;
        this.v = str4;
        this.w = universalPickerHeaderIcon;
    }

    public static UniversalPickerViewState a(UniversalPickerViewState universalPickerViewState, UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem, List list, String str, boolean z, boolean z2, SearchScreenLayoutType searchScreenLayoutType, SearchErrorScreen searchErrorScreen, boolean z3, boolean z4, boolean z5, String str2, UniversalSearchFlowSource universalSearchFlowSource, UniversalSearchOptions universalSearchOptions, DestinationAfterUniversalSearch destinationAfterUniversalSearch, ChaloTransitMode chaloTransitMode, UniversalSearchAdditionalEventProperties universalSearchAdditionalEventProperties, boolean z6, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, boolean z7, boolean z8, String str3, String str4, UniversalPickerHeaderIcon universalPickerHeaderIcon, int i) {
        UniversalSearchRecentSearchedDataItem recentSearchUiData = (i & 1) != 0 ? universalPickerViewState.f5084a : universalSearchRecentSearchedDataItem;
        List universalSearchItem = (i & 2) != 0 ? universalPickerViewState.b : list;
        String searchBarPlaceHolderString = (i & 4) != 0 ? universalPickerViewState.c : str;
        boolean z9 = (i & 8) != 0 ? universalPickerViewState.d : z;
        boolean z10 = (i & 16) != 0 ? universalPickerViewState.e : z2;
        SearchScreenLayoutType layoutType = (i & 32) != 0 ? universalPickerViewState.f : searchScreenLayoutType;
        SearchErrorScreen errorLayout = (i & 64) != 0 ? universalPickerViewState.g : searchErrorScreen;
        boolean z11 = (i & 128) != 0 ? universalPickerViewState.h : z3;
        boolean z12 = (i & 256) != 0 ? universalPickerViewState.i : z4;
        boolean z13 = (i & 512) != 0 ? universalPickerViewState.j : z5;
        String currentQuery = (i & 1024) != 0 ? universalPickerViewState.k : str2;
        UniversalSearchFlowSource source = (i & 2048) != 0 ? universalPickerViewState.l : universalSearchFlowSource;
        UniversalSearchOptions universalSearchOptions2 = (i & 4096) != 0 ? universalPickerViewState.m : universalSearchOptions;
        DestinationAfterUniversalSearch destinationAfterUniversalSearch2 = (i & 8192) != 0 ? universalPickerViewState.n : destinationAfterUniversalSearch;
        boolean z14 = z9;
        ChaloTransitMode transitMode = (i & 16384) != 0 ? universalPickerViewState.o : chaloTransitMode;
        UniversalSearchAdditionalEventProperties additionalEventProperties = (i & 32768) != 0 ? universalPickerViewState.p : universalSearchAdditionalEventProperties;
        boolean z15 = z10;
        boolean z16 = (i & 65536) != 0 ? universalPickerViewState.q : z6;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = (i & 131072) != 0 ? universalPickerViewState.r : universalSearchDescriptiveLocationAppModel;
        boolean z17 = (i & 262144) != 0 ? universalPickerViewState.s : z7;
        boolean z18 = (i & 524288) != 0 ? universalPickerViewState.t : z8;
        String str5 = (i & 1048576) != 0 ? universalPickerViewState.u : str3;
        String str6 = (i & 2097152) != 0 ? universalPickerViewState.v : str4;
        UniversalPickerHeaderIcon universalPickerHeaderIcon2 = (i & 4194304) != 0 ? universalPickerViewState.w : universalPickerHeaderIcon;
        universalPickerViewState.getClass();
        Intrinsics.i(recentSearchUiData, "recentSearchUiData");
        Intrinsics.i(universalSearchItem, "universalSearchItem");
        Intrinsics.i(searchBarPlaceHolderString, "searchBarPlaceHolderString");
        Intrinsics.i(layoutType, "layoutType");
        Intrinsics.i(errorLayout, "errorLayout");
        Intrinsics.i(currentQuery, "currentQuery");
        Intrinsics.i(source, "source");
        Intrinsics.i(universalSearchOptions2, "universalSearchOptions");
        Intrinsics.i(destinationAfterUniversalSearch2, "destinationAfterUniversalSearch");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(additionalEventProperties, "additionalEventProperties");
        return new UniversalPickerViewState(recentSearchUiData, universalSearchItem, searchBarPlaceHolderString, z14, z15, layoutType, errorLayout, z11, z12, z13, currentQuery, source, universalSearchOptions2, destinationAfterUniversalSearch2, transitMode, additionalEventProperties, z16, universalSearchDescriptiveLocationAppModel2, z17, z18, str5, str6, universalPickerHeaderIcon2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPickerViewState)) {
            return false;
        }
        UniversalPickerViewState universalPickerViewState = (UniversalPickerViewState) obj;
        return Intrinsics.d(this.f5084a, universalPickerViewState.f5084a) && Intrinsics.d(this.b, universalPickerViewState.b) && Intrinsics.d(this.c, universalPickerViewState.c) && this.d == universalPickerViewState.d && this.e == universalPickerViewState.e && this.f == universalPickerViewState.f && Intrinsics.d(this.g, universalPickerViewState.g) && this.h == universalPickerViewState.h && this.i == universalPickerViewState.i && this.j == universalPickerViewState.j && Intrinsics.d(this.k, universalPickerViewState.k) && this.l == universalPickerViewState.l && Intrinsics.d(this.m, universalPickerViewState.m) && this.n == universalPickerViewState.n && this.o == universalPickerViewState.o && Intrinsics.d(this.p, universalPickerViewState.p) && this.q == universalPickerViewState.q && Intrinsics.d(this.r, universalPickerViewState.r) && this.s == universalPickerViewState.s && this.t == universalPickerViewState.t && Intrinsics.d(this.u, universalPickerViewState.u) && Intrinsics.d(this.v, universalPickerViewState.v) && this.w == universalPickerViewState.w;
    }

    public final int hashCode() {
        int iHashCode = (((this.p.hashCode() + n21.c(this.o, (this.n.hashCode() + ((this.m.f10141a.hashCode() + ((this.l.hashCode() + nf1.e((((((((this.g.hashCode() + ((this.f.hashCode() + ((((nf1.e(r30.b(this.f5084a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31, 31, this.k)) * 31)) * 31)) * 31, 31)) * 31) + (this.q ? 1231 : 1237)) * 31;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = this.r;
        int iHashCode2 = (((((iHashCode + (universalSearchDescriptiveLocationAppModel == null ? 0 : universalSearchDescriptiveLocationAppModel.hashCode())) * 31) + (this.s ? 1231 : 1237)) * 31) + (this.t ? 1231 : 1237)) * 31;
        String str = this.u;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.v;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalPickerHeaderIcon universalPickerHeaderIcon = this.w;
        return iHashCode4 + (universalPickerHeaderIcon != null ? universalPickerHeaderIcon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalPickerViewState(recentSearchUiData=");
        sb.append(this.f5084a);
        sb.append(", universalSearchItem=");
        sb.append(this.b);
        sb.append(", searchBarPlaceHolderString=");
        t10.s(this.c, ", isRouteItemExpanded=", ", shouldShowAgencyTag=", sb, this.d);
        sb.append(this.e);
        sb.append(", layoutType=");
        sb.append(this.f);
        sb.append(", errorLayout=");
        sb.append(this.g);
        sb.append(", isLoading=");
        sb.append(this.h);
        sb.append(", showLoadingDialog=");
        z40.r(sb, this.i, ", clearSearchBar=", this.j, ", currentQuery=");
        sb.append(this.k);
        sb.append(", source=");
        sb.append(this.l);
        sb.append(", universalSearchOptions=");
        sb.append(this.m);
        sb.append(", destinationAfterUniversalSearch=");
        sb.append(this.n);
        sb.append(", transitMode=");
        sb.append(this.o);
        sb.append(", additionalEventProperties=");
        sb.append(this.p);
        sb.append(", showChaloBusCard=");
        sb.append(this.q);
        sb.append(", currentLocation=");
        sb.append(this.r);
        sb.append(", showCurrentLocationItem=");
        z40.r(sb, this.s, ", showLocationPermissionRationaleDialog=", this.t, ", headerTitle=");
        cb0.t(sb, this.u, ", headerStepIndicator=", this.v, ", headerIcon=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UniversalPickerViewState() {
        EmptyList emptyList = EmptyList.f17557a;
        this(new UniversalSearchRecentSearchedDataItem(emptyList, false, false), emptyList, "", false, true, SearchScreenLayoutType.RECENT_RESULT_SCREEN, new SearchErrorScreen.NoResultFound(""), false, false, false, "", UniversalSearchFlowSource.UNKNOWN, new UniversalSearchOptions(SetsKt.g(UniversalSearchOption.ALL.INSTANCE)), DestinationAfterUniversalSearch.ACTIVITY_RESULT, ChaloTransitMode.BUS, new UniversalSearchAdditionalEventProperties(31, 0L, (String) null, (String) null, (String) null), false, null, false, false, null, null, null);
    }
}
