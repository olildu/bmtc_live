package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import app.chalo.data.ProductBookingBranding;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerDataState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRScannerDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10720a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final boolean j;
    public final boolean k;
    public final QRValidationBottomSheetType l;
    public final ProductBookingBranding m;
    public final String n;

    static {
        ProductBookingBranding.Companion companion = ProductBookingBranding.INSTANCE;
    }

    public QRScannerDataState(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, Long l, boolean z2, boolean z3, QRValidationBottomSheetType qRValidationBottomSheetType, ProductBookingBranding productBrandingType, String str8) {
        Intrinsics.i(productBrandingType, "productBrandingType");
        this.f10720a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = z2;
        this.k = z3;
        this.l = qRValidationBottomSheetType;
        this.m = productBrandingType;
        this.n = str8;
    }

    public static QRScannerDataState a(QRScannerDataState qRScannerDataState, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, boolean z, boolean z2, QRValidationBottomSheetType.ValidationFailed validationFailed, ProductBookingBranding productBookingBranding, String str8, int i) {
        String bookingId = (i & 1) != 0 ? qRScannerDataState.f10720a : str;
        boolean z3 = (i & 2) != 0 ? qRScannerDataState.b : true;
        String routeName = (i & 4) != 0 ? qRScannerDataState.c : str2;
        String startStopName = (i & 8) != 0 ? qRScannerDataState.d : str3;
        String endStopName = (i & 16) != 0 ? qRScannerDataState.e : str4;
        String str9 = (i & 32) != 0 ? qRScannerDataState.f : str5;
        String qrCodeData = (i & 64) != 0 ? qRScannerDataState.g : str6;
        String str10 = (i & 128) != 0 ? qRScannerDataState.h : str7;
        Long l2 = (i & 256) != 0 ? qRScannerDataState.i : l;
        boolean z4 = (i & 512) != 0 ? qRScannerDataState.j : z;
        boolean z5 = (i & 1024) != 0 ? qRScannerDataState.k : z2;
        QRValidationBottomSheetType qRValidationBottomSheetType = (i & 2048) != 0 ? qRScannerDataState.l : validationFailed;
        ProductBookingBranding productBrandingType = (i & 4096) != 0 ? qRScannerDataState.m : productBookingBranding;
        String str11 = (i & 8192) != 0 ? qRScannerDataState.n : str8;
        qRScannerDataState.getClass();
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(qrCodeData, "qrCodeData");
        Intrinsics.i(productBrandingType, "productBrandingType");
        return new QRScannerDataState(bookingId, z3, routeName, startStopName, endStopName, str9, qrCodeData, str10, l2, z4, z5, qRValidationBottomSheetType, productBrandingType, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRScannerDataState)) {
            return false;
        }
        QRScannerDataState qRScannerDataState = (QRScannerDataState) obj;
        return Intrinsics.d(this.f10720a, qRScannerDataState.f10720a) && this.b == qRScannerDataState.b && Intrinsics.d(this.c, qRScannerDataState.c) && Intrinsics.d(this.d, qRScannerDataState.d) && Intrinsics.d(this.e, qRScannerDataState.e) && Intrinsics.d(this.f, qRScannerDataState.f) && Intrinsics.d(this.g, qRScannerDataState.g) && Intrinsics.d(this.h, qRScannerDataState.h) && Intrinsics.d(this.i, qRScannerDataState.i) && this.j == qRScannerDataState.j && this.k == qRScannerDataState.k && Intrinsics.d(this.l, qRScannerDataState.l) && Intrinsics.d(this.m, qRScannerDataState.m) && Intrinsics.d(this.n, qRScannerDataState.n);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(((this.f10720a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31;
        QRValidationBottomSheetType qRValidationBottomSheetType = this.l;
        int iHashCode3 = (this.m.hashCode() + ((iHashCode2 + (qRValidationBottomSheetType == null ? 0 : qRValidationBottomSheetType.hashCode())) * 31)) * 31;
        String str3 = this.n;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("QRScannerDataState(bookingId=", this.f10720a, ", shouldEnableValidateDetailsButton=", ", routeName=", this.b);
        cb0.t(sbM, this.c, ", startStopName=", this.d, ", endStopName=");
        cb0.t(sbM, this.e, ", ticketReferenceNumber=", this.f, ", qrCodeData=");
        cb0.t(sbM, this.g, ", amount=", this.h, ", expiryTimeInMillis=");
        sbM.append(this.i);
        sbM.append(", errorOccurred=");
        sbM.append(this.j);
        sbM.append(", isLoading=");
        sbM.append(this.k);
        sbM.append(", bottomSheetType=");
        sbM.append(this.l);
        sbM.append(", productBrandingType=");
        sbM.append(this.m);
        sbM.append(", productColorSchemeHex=");
        sbM.append(this.n);
        sbM.append(")");
        return sbM.toString();
    }
}
