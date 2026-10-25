package app.chalo.resultstatemanager.universalsearch;

import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/universalsearch/UniversalSearchResultState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchResultState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9060a;
    public final String b;
    public final String c;
    public final String d;

    public UniversalSearchResultState(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        this.f9060a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchResultState)) {
            return false;
        }
        UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) obj;
        return Intrinsics.d(this.f9060a, universalSearchResultState.f9060a) && Intrinsics.d(this.b, universalSearchResultState.b) && Intrinsics.d(this.c, universalSearchResultState.c) && Intrinsics.d(this.d, universalSearchResultState.d);
    }

    public final int hashCode() {
        String str = this.f9060a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return r30.i(dd.e("UniversalSearchResultState(resultStopString=", this.f9060a, ", resultPlaceString=", this.b, ", resultSpecialStatus="), this.c, ", citySelectionResultString=", this.d, ")");
    }
}
