package app.chalo.bookingsuccess;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessScreenDetail;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingSuccessScreenDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1152a;
    public final String b;
    public final IconType c;
    public final String d;
    public final LottieType e;
    public final String f;
    public final String g;
    public final boolean h;

    public BookingSuccessScreenDetail(String successMsg, String str, IconType iconType, String str2, LottieType lottieType, String str3, String str4, int i) {
        str = (i & 2) != 0 ? null : str;
        iconType = (i & 4) != 0 ? null : iconType;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        boolean z = (i & 256) == 0;
        Intrinsics.i(successMsg, "successMsg");
        this.f1152a = successMsg;
        this.b = str;
        this.c = iconType;
        this.d = str2;
        this.e = lottieType;
        this.f = str3;
        this.g = str4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingSuccessScreenDetail)) {
            return false;
        }
        BookingSuccessScreenDetail bookingSuccessScreenDetail = (BookingSuccessScreenDetail) obj;
        return Intrinsics.d(this.f1152a, bookingSuccessScreenDetail.f1152a) && Intrinsics.d(this.b, bookingSuccessScreenDetail.b) && this.c == bookingSuccessScreenDetail.c && Intrinsics.d(this.d, bookingSuccessScreenDetail.d) && this.e == bookingSuccessScreenDetail.e && Intrinsics.d(this.f, bookingSuccessScreenDetail.f) && Intrinsics.d(this.g, bookingSuccessScreenDetail.g) && this.h == bookingSuccessScreenDetail.h;
    }

    public final int hashCode() {
        int iHashCode = this.f1152a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconType iconType = this.c;
        int iHashCode3 = (iHashCode2 + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LottieType lottieType = this.e;
        int iHashCode5 = (iHashCode4 + (lottieType == null ? 0 : lottieType.hashCode())) * 961;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BookingSuccessScreenDetail(successMsg=", this.f1152a, ", description=", this.b, ", descriptionImage=");
        sbE.append(this.c);
        sbE.append(", descriptionSubtext=");
        sbE.append(this.d);
        sbE.append(", gif=");
        sbE.append(this.e);
        sbE.append(", icon=null, positiveBtnText=");
        sbE.append(this.f);
        sbE.append(", negativeBtnText=");
        sbE.append(this.g);
        sbE.append(", showConfetti=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
