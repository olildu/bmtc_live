package app.chalo.home.ui.regularbus;

import app.chalo.data.SpannableTextData;
import defpackage.cb0;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/SeatOccupancyBottomSheetData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatOccupancyBottomSheetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3664a;
    public final String b;
    public final String c;
    public final String d;
    public final SpannableTextData e;
    public final boolean f;

    public SeatOccupancyBottomSheetData(String str, String str2, String str3, String str4, SpannableTextData spannableTextData, boolean z) {
        this.f3664a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = spannableTextData;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatOccupancyBottomSheetData)) {
            return false;
        }
        SeatOccupancyBottomSheetData seatOccupancyBottomSheetData = (SeatOccupancyBottomSheetData) obj;
        return Intrinsics.d(this.f3664a, seatOccupancyBottomSheetData.f3664a) && Intrinsics.d(this.b, seatOccupancyBottomSheetData.b) && Intrinsics.d(this.c, seatOccupancyBottomSheetData.c) && Intrinsics.d(this.d, seatOccupancyBottomSheetData.d) && Intrinsics.d(this.e, seatOccupancyBottomSheetData.e) && this.f == seatOccupancyBottomSheetData.f;
    }

    public final int hashCode() {
        String str = this.f3664a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SpannableTextData spannableTextData = this.e;
        return ((iHashCode4 + (spannableTextData != null ? spannableTextData.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SeatOccupancyBottomSheetData(title=", this.f3664a, ", firstOccupancyText=", this.b, ", secondOccupancyText=");
        cb0.t(sbE, this.c, ", thirdOccupancyText=", this.d, ", seatOccupancyNoticeText=");
        sbE.append(this.e);
        sbE.append(", shouldShowLearnMore=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
