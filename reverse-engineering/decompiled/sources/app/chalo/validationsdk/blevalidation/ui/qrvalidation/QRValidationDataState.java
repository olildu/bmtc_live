package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import defpackage.b3;
import defpackage.cb0;
import defpackage.r30;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationDataState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRValidationDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductValidationData f10635a;
    public final boolean b;
    public final QRValidationScreenType c;
    public final ValidationProduct d;
    public final long e;
    public final long f;
    public final List g;
    public final PostPunchBottomSheetData h;
    public final String i;
    public final Long j;
    public final boolean k;
    public final boolean l;
    public final List m;
    public final QrScreenBottomSheetType n;
    public final TripPlannerItineraryUiModel o;
    public final boolean p;
    public final boolean q;

    public QRValidationDataState(ProductValidationData productValidationData, boolean z, QRValidationScreenType qrValidationScreenType, ValidationProduct validationProduct, long j, long j2, List qrCodeData, PostPunchBottomSheetData postPunchBottomSheetData, String str, Long l, boolean z2, boolean z3, List list, QrScreenBottomSheetType bottomSheetType, TripPlannerItineraryUiModel tripPlannerItineraryUiModel, boolean z4, boolean z5) {
        Intrinsics.i(qrValidationScreenType, "qrValidationScreenType");
        Intrinsics.i(qrCodeData, "qrCodeData");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        this.f10635a = productValidationData;
        this.b = z;
        this.c = qrValidationScreenType;
        this.d = validationProduct;
        this.e = j;
        this.f = j2;
        this.g = qrCodeData;
        this.h = postPunchBottomSheetData;
        this.i = str;
        this.j = l;
        this.k = z2;
        this.l = z3;
        this.m = list;
        this.n = bottomSheetType;
        this.o = tripPlannerItineraryUiModel;
        this.p = z4;
        this.q = z5;
    }

    public static QRValidationDataState a(QRValidationDataState qRValidationDataState, ProductValidationData productValidationData, boolean z, QRValidationScreenType qRValidationScreenType, ValidationProduct validationProduct, long j, long j2, ArrayList arrayList, PostPunchBottomSheetData postPunchBottomSheetData, String str, Long l, boolean z2, boolean z3, List list, QrScreenBottomSheetType qrScreenBottomSheetType, TripPlannerItineraryUiModel tripPlannerItineraryUiModel, boolean z4, boolean z5, int i) {
        ProductValidationData productValidationData2 = (i & 1) != 0 ? qRValidationDataState.f10635a : productValidationData;
        boolean z6 = (i & 2) != 0 ? qRValidationDataState.b : z;
        QRValidationScreenType qrValidationScreenType = (i & 4) != 0 ? qRValidationDataState.c : qRValidationScreenType;
        ValidationProduct validationProduct2 = (i & 8) != 0 ? qRValidationDataState.d : validationProduct;
        long j3 = (i & 16) != 0 ? qRValidationDataState.e : j;
        long j4 = (i & 32) != 0 ? qRValidationDataState.f : j2;
        List qrCodeData = (i & 64) != 0 ? qRValidationDataState.g : arrayList;
        PostPunchBottomSheetData postPunchBottomSheetData2 = (i & 128) != 0 ? qRValidationDataState.h : postPunchBottomSheetData;
        String str2 = (i & 256) != 0 ? qRValidationDataState.i : str;
        Long l2 = (i & 512) != 0 ? qRValidationDataState.j : l;
        boolean z7 = (i & 1024) != 0 ? qRValidationDataState.k : z2;
        boolean z8 = (i & 2048) != 0 ? qRValidationDataState.l : z3;
        ProductValidationData productValidationData3 = productValidationData2;
        List list2 = (i & 4096) != 0 ? qRValidationDataState.m : list;
        QrScreenBottomSheetType bottomSheetType = (i & 8192) != 0 ? qRValidationDataState.n : qrScreenBottomSheetType;
        boolean z9 = z6;
        TripPlannerItineraryUiModel tripPlannerItineraryUiModel2 = (i & 16384) != 0 ? qRValidationDataState.o : tripPlannerItineraryUiModel;
        boolean z10 = (i & 32768) != 0 ? qRValidationDataState.p : z4;
        boolean z11 = (i & 65536) != 0 ? qRValidationDataState.q : z5;
        qRValidationDataState.getClass();
        Intrinsics.i(qrValidationScreenType, "qrValidationScreenType");
        Intrinsics.i(qrCodeData, "qrCodeData");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        return new QRValidationDataState(productValidationData3, z9, qrValidationScreenType, validationProduct2, j3, j4, qrCodeData, postPunchBottomSheetData2, str2, l2, z7, z8, list2, bottomSheetType, tripPlannerItineraryUiModel2, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRValidationDataState)) {
            return false;
        }
        QRValidationDataState qRValidationDataState = (QRValidationDataState) obj;
        return Intrinsics.d(this.f10635a, qRValidationDataState.f10635a) && this.b == qRValidationDataState.b && this.c == qRValidationDataState.c && Intrinsics.d(this.d, qRValidationDataState.d) && this.e == qRValidationDataState.e && this.f == qRValidationDataState.f && Intrinsics.d(this.g, qRValidationDataState.g) && Intrinsics.d(this.h, qRValidationDataState.h) && Intrinsics.d(this.i, qRValidationDataState.i) && Intrinsics.d(this.j, qRValidationDataState.j) && this.k == qRValidationDataState.k && this.l == qRValidationDataState.l && Intrinsics.d(this.m, qRValidationDataState.m) && this.n == qRValidationDataState.n && Intrinsics.d(this.o, qRValidationDataState.o) && this.p == qRValidationDataState.p && this.q == qRValidationDataState.q;
    }

    public final int hashCode() {
        ProductValidationData productValidationData = this.f10635a;
        int iHashCode = (this.c.hashCode() + ((((productValidationData == null ? 0 : productValidationData.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
        ValidationProduct validationProduct = this.d;
        int iHashCode2 = validationProduct == null ? 0 : validationProduct.hashCode();
        long j = this.e;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int iB = r30.b((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.g);
        PostPunchBottomSheetData postPunchBottomSheetData = this.h;
        int iHashCode3 = (iB + (postPunchBottomSheetData == null ? 0 : postPunchBottomSheetData.hashCode())) * 31;
        String str = this.i;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.j;
        int iHashCode5 = (((((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31;
        List list = this.m;
        int iHashCode6 = (this.n.hashCode() + ((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        TripPlannerItineraryUiModel tripPlannerItineraryUiModel = this.o;
        return ((((iHashCode6 + (tripPlannerItineraryUiModel != null ? tripPlannerItineraryUiModel.hashCode() : 0)) * 31) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QRValidationDataState(productValidationData=");
        sb.append(this.f10635a);
        sb.append(", isExpiredProduct=");
        sb.append(this.b);
        sb.append(", qrValidationScreenType=");
        sb.append(this.c);
        sb.append(", validationProduct=");
        sb.append(this.d);
        sb.append(", lastValidityCheckTime=");
        sb.append(this.e);
        xs.r(this.f, ", lastQRUpdateTime=", ", qrCodeData=", sb);
        sb.append(this.g);
        sb.append(", postPunchBottomSheetData=");
        sb.append(this.h);
        sb.append(", transactionIdPostPunch=");
        cb0.r(this.j, this.i, ", punchTimeStampPostPunch=", ", isBLEEnabled=", sb);
        z40.r(sb, this.k, ", showBookingSupportButton=", this.l, ", bookingHelpFaqList=");
        sb.append(this.m);
        sb.append(", bottomSheetType=");
        sb.append(this.n);
        sb.append(", tripItineraryUiModel=");
        sb.append(this.o);
        sb.append(", shouldShowViewJourneyButton=");
        sb.append(this.p);
        sb.append(", showQrScreenLoadingDialogue=");
        return b3.g(")", sb, this.q);
    }
}
