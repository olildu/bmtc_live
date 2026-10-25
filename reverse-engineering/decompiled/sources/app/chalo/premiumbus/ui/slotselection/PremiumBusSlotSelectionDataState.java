package app.chalo.premiumbus.ui.slotselection;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.utils.StringResourcesBase;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSlotSelectionDataState {
    public final SelectedPassInfo A;
    public final List B;
    public final List C;
    public final List D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7859a;
    public final boolean b;
    public final boolean c;
    public final SlotSelectionErrorScreenType d;
    public final StringResourcesBase.GenericErrorMsgWithErrorCode e;
    public final PBSlotSelectionScreenBottomSheetType f;
    public final Map g;
    public final Long h;
    public final PBAvailableSlotsTripAppModel i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final String o;
    public final PremiumBusProductPurchaseFlowType p;
    public final PBStopPlaceSelectedAppModel q;
    public final PBStopPlaceSelectedAppModel r;
    public final boolean s;
    public final Long t;
    public final Long u;
    public final List v;
    public final int w;
    public final PassPurchaseNudgeType x;
    public final boolean y;
    public final BookingSelectionType z;

    public PremiumBusSlotSelectionDataState(boolean z, boolean z2, boolean z3, SlotSelectionErrorScreenType slotSelectionErrorScreenType, StringResourcesBase.GenericErrorMsgWithErrorCode genericErrorMsgWithErrorCode, PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType, Map map, Long l, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, int i, String str, String str2, String str3, boolean z4, String str4, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, boolean z5, Long l2, Long l3, List odPairList, int i2, PassPurchaseNudgeType passPurchaseNudgeType, boolean z6, BookingSelectionType bookingSelectionType, SelectedPassInfo selectedPassInfo, List slotAvailableOnDatesInfo, List slotsSelectedForBulkBooking, List initialNearbySlotsForAnalytics) {
        Intrinsics.i(odPairList, "odPairList");
        Intrinsics.i(bookingSelectionType, "bookingSelectionType");
        Intrinsics.i(slotAvailableOnDatesInfo, "slotAvailableOnDatesInfo");
        Intrinsics.i(slotsSelectedForBulkBooking, "slotsSelectedForBulkBooking");
        Intrinsics.i(initialNearbySlotsForAnalytics, "initialNearbySlotsForAnalytics");
        this.f7859a = z;
        this.b = z2;
        this.c = z3;
        this.d = slotSelectionErrorScreenType;
        this.e = genericErrorMsgWithErrorCode;
        this.f = pBSlotSelectionScreenBottomSheetType;
        this.g = map;
        this.h = l;
        this.i = pBAvailableSlotsTripAppModel;
        this.j = i;
        this.k = str;
        this.l = str2;
        this.m = str3;
        this.n = z4;
        this.o = str4;
        this.p = premiumBusProductPurchaseFlowType;
        this.q = pBStopPlaceSelectedAppModel;
        this.r = pBStopPlaceSelectedAppModel2;
        this.s = z5;
        this.t = l2;
        this.u = l3;
        this.v = odPairList;
        this.w = i2;
        this.x = passPurchaseNudgeType;
        this.y = z6;
        this.z = bookingSelectionType;
        this.A = selectedPassInfo;
        this.B = slotAvailableOnDatesInfo;
        this.C = slotsSelectedForBulkBooking;
        this.D = initialNearbySlotsForAnalytics;
    }

    public static PremiumBusSlotSelectionDataState a(PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState, boolean z, boolean z2, boolean z3, SlotSelectionErrorScreenType slotSelectionErrorScreenType, StringResourcesBase.GenericErrorMsgWithErrorCode genericErrorMsgWithErrorCode, PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType, Map map, Long l, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, int i, String str, String str2, String str3, boolean z4, String str4, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, boolean z5, Long l2, Long l3, List list, int i2, PassPurchaseNudgeType passPurchaseNudgeType, boolean z6, BookingSelectionType bookingSelectionType, SelectedPassInfo selectedPassInfo, List list2, List list3, List list4, int i3) {
        boolean z7 = (i3 & 1) != 0 ? premiumBusSlotSelectionDataState.f7859a : z;
        boolean z8 = (i3 & 2) != 0 ? premiumBusSlotSelectionDataState.b : z2;
        boolean z9 = (i3 & 4) != 0 ? premiumBusSlotSelectionDataState.c : z3;
        SlotSelectionErrorScreenType slotSelectionErrorScreenType2 = (i3 & 8) != 0 ? premiumBusSlotSelectionDataState.d : slotSelectionErrorScreenType;
        StringResourcesBase.GenericErrorMsgWithErrorCode genericErrorMsgWithErrorCode2 = (i3 & 16) != 0 ? premiumBusSlotSelectionDataState.e : genericErrorMsgWithErrorCode;
        PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType2 = (i3 & 32) != 0 ? premiumBusSlotSelectionDataState.f : pBSlotSelectionScreenBottomSheetType;
        Map map2 = (i3 & 64) != 0 ? premiumBusSlotSelectionDataState.g : map;
        Long l4 = (i3 & 128) != 0 ? premiumBusSlotSelectionDataState.h : l;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2 = (i3 & 256) != 0 ? premiumBusSlotSelectionDataState.i : pBAvailableSlotsTripAppModel;
        int i4 = (i3 & 512) != 0 ? premiumBusSlotSelectionDataState.j : i;
        premiumBusSlotSelectionDataState.getClass();
        premiumBusSlotSelectionDataState.getClass();
        String str5 = (i3 & 4096) != 0 ? premiumBusSlotSelectionDataState.k : str;
        String str6 = (i3 & 8192) != 0 ? premiumBusSlotSelectionDataState.l : str2;
        String str7 = (i3 & 16384) != 0 ? premiumBusSlotSelectionDataState.m : str3;
        boolean z10 = (32768 & i3) != 0 ? premiumBusSlotSelectionDataState.n : z4;
        String str8 = (i3 & 65536) != 0 ? premiumBusSlotSelectionDataState.o : str4;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType2 = (i3 & 131072) != 0 ? premiumBusSlotSelectionDataState.p : premiumBusProductPurchaseFlowType;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = (i3 & 262144) != 0 ? premiumBusSlotSelectionDataState.q : pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = (i3 & 524288) != 0 ? premiumBusSlotSelectionDataState.r : pBStopPlaceSelectedAppModel2;
        boolean z11 = (i3 & 1048576) != 0 ? premiumBusSlotSelectionDataState.s : z5;
        Long l5 = (i3 & 2097152) != 0 ? premiumBusSlotSelectionDataState.t : l2;
        Long l6 = (i3 & 4194304) != 0 ? premiumBusSlotSelectionDataState.u : l3;
        List odPairList = (i3 & 8388608) != 0 ? premiumBusSlotSelectionDataState.v : list;
        boolean z12 = z7;
        int i5 = (i3 & 16777216) != 0 ? premiumBusSlotSelectionDataState.w : i2;
        PassPurchaseNudgeType passPurchaseNudgeType2 = (i3 & 33554432) != 0 ? premiumBusSlotSelectionDataState.x : passPurchaseNudgeType;
        boolean z13 = (i3 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? premiumBusSlotSelectionDataState.y : z6;
        BookingSelectionType bookingSelectionType2 = (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? premiumBusSlotSelectionDataState.z : bookingSelectionType;
        boolean z14 = z8;
        SelectedPassInfo selectedPassInfo2 = (i3 & 268435456) != 0 ? premiumBusSlotSelectionDataState.A : selectedPassInfo;
        List slotAvailableOnDatesInfo = (i3 & 536870912) != 0 ? premiumBusSlotSelectionDataState.B : list2;
        boolean z15 = z9;
        List slotsSelectedForBulkBooking = (i3 & 1073741824) != 0 ? premiumBusSlotSelectionDataState.C : list3;
        SlotSelectionErrorScreenType slotSelectionErrorScreenType3 = slotSelectionErrorScreenType2;
        List initialNearbySlotsForAnalytics = (i3 & Integer.MIN_VALUE) != 0 ? premiumBusSlotSelectionDataState.D : list4;
        premiumBusSlotSelectionDataState.getClass();
        Intrinsics.i(odPairList, "odPairList");
        Intrinsics.i(bookingSelectionType2, "bookingSelectionType");
        Intrinsics.i(slotAvailableOnDatesInfo, "slotAvailableOnDatesInfo");
        Intrinsics.i(slotsSelectedForBulkBooking, "slotsSelectedForBulkBooking");
        Intrinsics.i(initialNearbySlotsForAnalytics, "initialNearbySlotsForAnalytics");
        return new PremiumBusSlotSelectionDataState(z12, z14, z15, slotSelectionErrorScreenType3, genericErrorMsgWithErrorCode2, pBSlotSelectionScreenBottomSheetType2, map2, l4, pBAvailableSlotsTripAppModel2, i4, str5, str6, str7, z10, str8, premiumBusProductPurchaseFlowType2, pBStopPlaceSelectedAppModel3, pBStopPlaceSelectedAppModel4, z11, l5, l6, odPairList, i5, passPurchaseNudgeType2, z13, bookingSelectionType2, selectedPassInfo2, slotAvailableOnDatesInfo, slotsSelectedForBulkBooking, initialNearbySlotsForAnalytics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSlotSelectionDataState)) {
            return false;
        }
        PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) obj;
        return this.f7859a == premiumBusSlotSelectionDataState.f7859a && this.b == premiumBusSlotSelectionDataState.b && this.c == premiumBusSlotSelectionDataState.c && this.d == premiumBusSlotSelectionDataState.d && Intrinsics.d(this.e, premiumBusSlotSelectionDataState.e) && Intrinsics.d(this.f, premiumBusSlotSelectionDataState.f) && Intrinsics.d(this.g, premiumBusSlotSelectionDataState.g) && Intrinsics.d(this.h, premiumBusSlotSelectionDataState.h) && Intrinsics.d(this.i, premiumBusSlotSelectionDataState.i) && this.j == premiumBusSlotSelectionDataState.j && Intrinsics.d(this.k, premiumBusSlotSelectionDataState.k) && Intrinsics.d(this.l, premiumBusSlotSelectionDataState.l) && Intrinsics.d(this.m, premiumBusSlotSelectionDataState.m) && this.n == premiumBusSlotSelectionDataState.n && Intrinsics.d(this.o, premiumBusSlotSelectionDataState.o) && Intrinsics.d(this.p, premiumBusSlotSelectionDataState.p) && Intrinsics.d(this.q, premiumBusSlotSelectionDataState.q) && Intrinsics.d(this.r, premiumBusSlotSelectionDataState.r) && this.s == premiumBusSlotSelectionDataState.s && Intrinsics.d(this.t, premiumBusSlotSelectionDataState.t) && Intrinsics.d(this.u, premiumBusSlotSelectionDataState.u) && Intrinsics.d(this.v, premiumBusSlotSelectionDataState.v) && this.w == premiumBusSlotSelectionDataState.w && Intrinsics.d(this.x, premiumBusSlotSelectionDataState.x) && this.y == premiumBusSlotSelectionDataState.y && this.z == premiumBusSlotSelectionDataState.z && Intrinsics.d(this.A, premiumBusSlotSelectionDataState.A) && Intrinsics.d(this.B, premiumBusSlotSelectionDataState.B) && Intrinsics.d(this.C, premiumBusSlotSelectionDataState.C) && Intrinsics.d(this.D, premiumBusSlotSelectionDataState.D);
    }

    public final int hashCode() {
        int i = (((((this.f7859a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        SlotSelectionErrorScreenType slotSelectionErrorScreenType = this.d;
        int iHashCode = (i + (slotSelectionErrorScreenType == null ? 0 : slotSelectionErrorScreenType.hashCode())) * 31;
        StringResourcesBase.GenericErrorMsgWithErrorCode genericErrorMsgWithErrorCode = this.e;
        int i2 = (iHashCode + (genericErrorMsgWithErrorCode == null ? 0 : genericErrorMsgWithErrorCode.b)) * 31;
        PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType = this.f;
        int iHashCode2 = (i2 + (pBSlotSelectionScreenBottomSheetType == null ? 0 : pBSlotSelectionScreenBottomSheetType.hashCode())) * 31;
        Map map = this.g;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.h;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.i;
        int iHashCode5 = (((((iHashCode4 + (pBAvailableSlotsTripAppModel == null ? 0 : pBAvailableSlotsTripAppModel.hashCode())) * 31) + this.j) * 31) + 1237) * 961;
        String str = this.k;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode8 = (((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.n ? 1231 : 1237)) * 31;
        String str4 = this.o;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = this.p;
        int iHashCode10 = (iHashCode9 + (premiumBusProductPurchaseFlowType == null ? 0 : premiumBusProductPurchaseFlowType.hashCode())) * 31;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.q;
        int iHashCode11 = (iHashCode10 + (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode())) * 31;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.r;
        int iHashCode12 = (((iHashCode11 + (pBStopPlaceSelectedAppModel2 == null ? 0 : pBStopPlaceSelectedAppModel2.hashCode())) * 31) + (this.s ? 1231 : 1237)) * 31;
        Long l2 = this.t;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.u;
        int iB = (r30.b((iHashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.v) + this.w) * 31;
        PassPurchaseNudgeType passPurchaseNudgeType = this.x;
        int iHashCode14 = (this.z.hashCode() + ((((iB + (passPurchaseNudgeType == null ? 0 : passPurchaseNudgeType.hashCode())) * 31) + (this.y ? 1231 : 1237)) * 31)) * 31;
        SelectedPassInfo selectedPassInfo = this.A;
        return this.D.hashCode() + r30.b(r30.b((iHashCode14 + (selectedPassInfo != null ? selectedPassInfo.hashCode() : 0)) * 31, 31, this.B), 31, this.C);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PremiumBusSlotSelectionDataState(initialFetching=", ", isLoading=", ", isFetchingSlots=", this.f7859a, this.b);
        sbR.append(this.c);
        sbR.append(", errorScreen=");
        sbR.append(this.d);
        sbR.append(", errorMsg=");
        sbR.append(this.e);
        sbR.append(", bottomSheetType=");
        sbR.append(this.f);
        sbR.append(", sectionInfoMap=");
        sbR.append(this.g);
        sbR.append(", selectedSectionId=");
        sbR.append(this.h);
        sbR.append(", selectedSlot=");
        sbR.append(this.i);
        sbR.append(", odCardIndex=");
        sbR.append(this.j);
        sbR.append(", shouldShowOrderCreationErrorDialog=false, orderCreationErrorDialogCopy=null, productConfigIdFromInput=");
        cb0.t(sbR, this.k, ", fromStopSelectedName=", this.l, ", toStopSelectedName=");
        t10.s(this.m, ", showSnackBar=", ", snackBarMessage=", sbR, this.n);
        sbR.append(this.o);
        sbR.append(", premiumBusProductPurchaseFlowType=");
        sbR.append(this.p);
        sbR.append(", fromStopOrPlaceSelected=");
        sbR.append(this.q);
        sbR.append(", toStopOrPlaceSelected=");
        sbR.append(this.r);
        sbR.append(", showPbPreBookingBuyPassNudgeCard=");
        sbR.append(this.s);
        sbR.append(", preferredTimeElapsedSinceMidNight=");
        sbR.append(this.t);
        sbR.append(", preferredTimeInMillis=");
        sbR.append(this.u);
        sbR.append(", odPairList=");
        sbR.append(this.v);
        sbR.append(", pageSize=");
        sbR.append(this.w);
        sbR.append(", passPurchaseNudgeType=");
        sbR.append(this.x);
        sbR.append(", showMultipleRideBookingButton=");
        sbR.append(this.y);
        sbR.append(", bookingSelectionType=");
        sbR.append(this.z);
        sbR.append(", selectedPassInfo=");
        sbR.append(this.A);
        sbR.append(", slotAvailableOnDatesInfo=");
        sbR.append(this.B);
        sbR.append(", slotsSelectedForBulkBooking=");
        sbR.append(this.C);
        sbR.append(", initialNearbySlotsForAnalytics=");
        sbR.append(this.D);
        sbR.append(")");
        return sbR.toString();
    }
}
