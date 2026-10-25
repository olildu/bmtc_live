package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import defpackage.pk0;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductModificationReasonsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7354a;
    public final PremiumBusProductModificationDialogType b;
    public final PremiumReserveTicketOptionAction c;
    public final boolean d;
    public final PremiumBusBottomSheetTypeUIState e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final PBAvailableSlotsTripAppModel k;
    public final PremiumBusProductModificationReasonAppModel l;
    public final ProductModificationScreenType m;
    public final String n;
    public final Integer o;
    public final List p;

    public PremiumBusProductModificationReasonsViewState(List list, PremiumBusProductModificationDialogType premiumBusProductModificationDialogType, PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, boolean z, PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState, String str, boolean z2, String str2, String str3, boolean z3, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, ProductModificationScreenType productModificationScreenType, String str4, Integer num, List seatSelectedForReschedule) {
        Intrinsics.i(productModificationScreenType, "productModificationScreenType");
        Intrinsics.i(seatSelectedForReschedule, "seatSelectedForReschedule");
        this.f7354a = list;
        this.b = premiumBusProductModificationDialogType;
        this.c = premiumReserveTicketOptionAction;
        this.d = z;
        this.e = premiumBusBottomSheetTypeUIState;
        this.f = str;
        this.g = z2;
        this.h = str2;
        this.i = str3;
        this.j = z3;
        this.k = pBAvailableSlotsTripAppModel;
        this.l = premiumBusProductModificationReasonAppModel;
        this.m = productModificationScreenType;
        this.n = str4;
        this.o = num;
        this.p = seatSelectedForReschedule;
    }

    public static PremiumBusProductModificationReasonsViewState a(PremiumBusProductModificationReasonsViewState premiumBusProductModificationReasonsViewState, List list, PremiumBusProductModificationDialogType premiumBusProductModificationDialogType, PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState, String str, boolean z, String str2, String str3, boolean z2, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, ProductModificationScreenType productModificationScreenType, String str4, Integer num, List list2, int i) {
        List list3 = (i & 1) != 0 ? premiumBusProductModificationReasonsViewState.f7354a : list;
        PremiumBusProductModificationDialogType premiumBusProductModificationDialogType2 = (i & 2) != 0 ? premiumBusProductModificationReasonsViewState.b : premiumBusProductModificationDialogType;
        PremiumReserveTicketOptionAction premiumReserveTicketOptionAction2 = (i & 4) != 0 ? premiumBusProductModificationReasonsViewState.c : premiumReserveTicketOptionAction;
        boolean z3 = (i & 8) != 0 ? premiumBusProductModificationReasonsViewState.d : true;
        PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState2 = (i & 16) != 0 ? premiumBusProductModificationReasonsViewState.e : premiumBusBottomSheetTypeUIState;
        String str5 = (i & 32) != 0 ? premiumBusProductModificationReasonsViewState.f : str;
        boolean z4 = (i & 64) != 0 ? premiumBusProductModificationReasonsViewState.g : z;
        String str6 = (i & 128) != 0 ? premiumBusProductModificationReasonsViewState.h : str2;
        String str7 = (i & 256) != 0 ? premiumBusProductModificationReasonsViewState.i : str3;
        boolean z5 = (i & 512) != 0 ? premiumBusProductModificationReasonsViewState.j : z2;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2 = (i & 1024) != 0 ? premiumBusProductModificationReasonsViewState.k : pBAvailableSlotsTripAppModel;
        PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel2 = (i & 2048) != 0 ? premiumBusProductModificationReasonsViewState.l : premiumBusProductModificationReasonAppModel;
        ProductModificationScreenType productModificationScreenType2 = (i & 4096) != 0 ? premiumBusProductModificationReasonsViewState.m : productModificationScreenType;
        String str8 = (i & 8192) != 0 ? premiumBusProductModificationReasonsViewState.n : str4;
        List list4 = list3;
        Integer num2 = (i & 16384) != 0 ? premiumBusProductModificationReasonsViewState.o : num;
        List seatSelectedForReschedule = (i & 32768) != 0 ? premiumBusProductModificationReasonsViewState.p : list2;
        premiumBusProductModificationReasonsViewState.getClass();
        Intrinsics.i(productModificationScreenType2, "productModificationScreenType");
        Intrinsics.i(seatSelectedForReschedule, "seatSelectedForReschedule");
        return new PremiumBusProductModificationReasonsViewState(list4, premiumBusProductModificationDialogType2, premiumReserveTicketOptionAction2, z3, premiumBusBottomSheetTypeUIState2, str5, z4, str6, str7, z5, pBAvailableSlotsTripAppModel2, premiumBusProductModificationReasonAppModel2, productModificationScreenType2, str8, num2, seatSelectedForReschedule);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductModificationReasonsViewState)) {
            return false;
        }
        PremiumBusProductModificationReasonsViewState premiumBusProductModificationReasonsViewState = (PremiumBusProductModificationReasonsViewState) obj;
        return Intrinsics.d(this.f7354a, premiumBusProductModificationReasonsViewState.f7354a) && this.b == premiumBusProductModificationReasonsViewState.b && this.c == premiumBusProductModificationReasonsViewState.c && this.d == premiumBusProductModificationReasonsViewState.d && Intrinsics.d(this.e, premiumBusProductModificationReasonsViewState.e) && Intrinsics.d(this.f, premiumBusProductModificationReasonsViewState.f) && this.g == premiumBusProductModificationReasonsViewState.g && Intrinsics.d(this.h, premiumBusProductModificationReasonsViewState.h) && Intrinsics.d(this.i, premiumBusProductModificationReasonsViewState.i) && this.j == premiumBusProductModificationReasonsViewState.j && Intrinsics.d(this.k, premiumBusProductModificationReasonsViewState.k) && Intrinsics.d(this.l, premiumBusProductModificationReasonsViewState.l) && this.m == premiumBusProductModificationReasonsViewState.m && Intrinsics.d(this.n, premiumBusProductModificationReasonsViewState.n) && Intrinsics.d(this.o, premiumBusProductModificationReasonsViewState.o) && Intrinsics.d(this.p, premiumBusProductModificationReasonsViewState.p);
    }

    public final int hashCode() {
        List list = this.f7354a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PremiumBusProductModificationDialogType premiumBusProductModificationDialogType = this.b;
        int iHashCode2 = (iHashCode + (premiumBusProductModificationDialogType == null ? 0 : premiumBusProductModificationDialogType.hashCode())) * 31;
        PremiumReserveTicketOptionAction premiumReserveTicketOptionAction = this.c;
        int iHashCode3 = (((iHashCode2 + (premiumReserveTicketOptionAction == null ? 0 : premiumReserveTicketOptionAction.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState = this.e;
        int iHashCode4 = (iHashCode3 + (premiumBusBottomSheetTypeUIState == null ? 0 : premiumBusBottomSheetTypeUIState.hashCode())) * 31;
        String str = this.f;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
        String str2 = this.h;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode7 = (((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.k;
        int iHashCode8 = (iHashCode7 + (pBAvailableSlotsTripAppModel == null ? 0 : pBAvailableSlotsTripAppModel.hashCode())) * 31;
        PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel = this.l;
        int iHashCode9 = (this.m.hashCode() + ((iHashCode8 + (premiumBusProductModificationReasonAppModel == null ? 0 : premiumBusProductModificationReasonAppModel.hashCode())) * 31)) * 31;
        String str4 = this.n;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.o;
        return this.p.hashCode() + ((iHashCode10 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusProductModificationReasonsViewState(possibleReasons=");
        sb.append(this.f7354a);
        sb.append(", dialogType=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", shouldShowActionSuccessScreen=");
        sb.append(this.d);
        sb.append(", bottomSheetType=");
        sb.append(this.e);
        sb.append(", actionSuccessScreenMessage=");
        sb.append(this.f);
        sb.append(", isFetchingReasons=");
        pk0.x(", orderCreationErrorMsg=", this.h, ", snackBarErrorMsg=", sb, this.g);
        t10.s(this.i, ", isLoading=", ", selectedSlot=", sb, this.j);
        sb.append(this.k);
        sb.append(", selectedReason=");
        sb.append(this.l);
        sb.append(", productModificationScreenType=");
        sb.append(this.m);
        sb.append(", tripIdToReschedule=");
        sb.append(this.n);
        sb.append(", noOfSeatSelectedInCurrentBooking=");
        sb.append(this.o);
        sb.append(", seatSelectedForReschedule=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
