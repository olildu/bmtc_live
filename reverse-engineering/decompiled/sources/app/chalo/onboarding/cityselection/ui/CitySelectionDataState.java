package app.chalo.onboarding.cityselection.ui;

import defpackage.b3;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionDataState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CitySelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6616a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public CitySelectionDataState(List list, String str, String searchQuery, List list2, boolean z, boolean z2, boolean z3) {
        Intrinsics.i(searchQuery, "searchQuery");
        this.f6616a = list;
        this.b = str;
        this.c = searchQuery;
        this.d = list2;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static CitySelectionDataState a(CitySelectionDataState citySelectionDataState, List list, String str, String str2, List list2, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = citySelectionDataState.f6616a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            str = citySelectionDataState.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = citySelectionDataState.c;
        }
        String searchQuery = str2;
        if ((i & 8) != 0) {
            list2 = citySelectionDataState.d;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            z = citySelectionDataState.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = citySelectionDataState.f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            z3 = citySelectionDataState.g;
        }
        citySelectionDataState.getClass();
        Intrinsics.i(searchQuery, "searchQuery");
        return new CitySelectionDataState(list3, str3, searchQuery, list4, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitySelectionDataState)) {
            return false;
        }
        CitySelectionDataState citySelectionDataState = (CitySelectionDataState) obj;
        return Intrinsics.d(this.f6616a, citySelectionDataState.f6616a) && Intrinsics.d(this.b, citySelectionDataState.b) && Intrinsics.d(this.c, citySelectionDataState.c) && Intrinsics.d(this.d, citySelectionDataState.d) && this.e == citySelectionDataState.e && this.f == citySelectionDataState.f && this.g == citySelectionDataState.g;
    }

    public final int hashCode() {
        List list = this.f6616a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iE = nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        List list2 = this.d;
        return ((((((iE + (list2 != null ? list2.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CitySelectionDataState(cities=");
        sb.append(this.f6616a);
        sb.append(", currentlySelectedCityId=");
        sb.append(this.b);
        sb.append(", searchQuery=");
        pk0.w(this.c, ", filteredCities=", ", showLoadingSpinner=", sb, this.d);
        z40.r(sb, this.e, ", shouldShowError=", this.f, ", shouldShowSearchPanel=");
        return b3.g(")", sb, this.g);
    }

    public /* synthetic */ CitySelectionDataState(String str, int i) {
        this(null, null, (i & 4) != 0 ? "" : str, null, false, false, false);
    }
}
