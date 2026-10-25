package app.chalo.premiumbus.ui.seatselection;

import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.userprofile.Gender;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusSeatSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7724a;
    public final boolean b;
    public final PremiumBusSeatSelectionFlowType c;
    public final List d;
    public final Integer e;
    public final List f;
    public final boolean g;
    public final String h;
    public final SeatSelectionDialogType i;
    public final boolean j;
    public final GenderPreferenceSelectionStates k;
    public final SeatSelectionBottomSheetType l;
    public final Gender m;
    public final boolean n;
    public final Integer o;

    public PremiumBusSeatSelectionDataState(boolean z, boolean z2, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, List seatInfoList, Integer num, List alreadySelectedSeats, boolean z3, String str, SeatSelectionDialogType seatSelectionDialogType, boolean z4, GenderPreferenceSelectionStates genderPreferenceSelectionStates, SeatSelectionBottomSheetType seatSelectionBottomSheetType, Gender gender, boolean z5, Integer num2) {
        Intrinsics.i(seatInfoList, "seatInfoList");
        Intrinsics.i(alreadySelectedSeats, "alreadySelectedSeats");
        this.f7724a = z;
        this.b = z2;
        this.c = premiumBusSeatSelectionFlowType;
        this.d = seatInfoList;
        this.e = num;
        this.f = alreadySelectedSeats;
        this.g = z3;
        this.h = str;
        this.i = seatSelectionDialogType;
        this.j = z4;
        this.k = genderPreferenceSelectionStates;
        this.l = seatSelectionBottomSheetType;
        this.m = gender;
        this.n = z5;
        this.o = num2;
    }

    public static PremiumBusSeatSelectionDataState a(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, boolean z, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, List list, Integer num, List list2, boolean z2, String str, SeatSelectionDialogType.SeatChangeConfirmationDialog seatChangeConfirmationDialog, boolean z3, GenderPreferenceSelectionStates genderPreferenceSelectionStates, SeatSelectionBottomSheetType seatSelectionBottomSheetType, Gender gender, Integer num2, int i) {
        premiumBusSeatSelectionDataState.getClass();
        boolean z4 = (i & 2) != 0 ? premiumBusSeatSelectionDataState.f7724a : z;
        boolean z5 = (i & 4) != 0 ? premiumBusSeatSelectionDataState.b : true;
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType2 = (i & 8) != 0 ? premiumBusSeatSelectionDataState.c : premiumBusSeatSelectionFlowType;
        List seatInfoList = (i & 16) != 0 ? premiumBusSeatSelectionDataState.d : list;
        Integer num3 = (i & 32) != 0 ? premiumBusSeatSelectionDataState.e : num;
        List alreadySelectedSeats = (i & 64) != 0 ? premiumBusSeatSelectionDataState.f : list2;
        boolean z6 = (i & 128) != 0 ? premiumBusSeatSelectionDataState.g : z2;
        String str2 = (i & 256) != 0 ? premiumBusSeatSelectionDataState.h : str;
        SeatSelectionDialogType seatSelectionDialogType = (i & 512) != 0 ? premiumBusSeatSelectionDataState.i : seatChangeConfirmationDialog;
        boolean z7 = (i & 1024) != 0 ? premiumBusSeatSelectionDataState.j : z3;
        GenderPreferenceSelectionStates genderPreferenceSelectionStates2 = (i & 2048) != 0 ? premiumBusSeatSelectionDataState.k : genderPreferenceSelectionStates;
        SeatSelectionBottomSheetType seatSelectionBottomSheetType2 = (i & 4096) != 0 ? premiumBusSeatSelectionDataState.l : seatSelectionBottomSheetType;
        Gender gender2 = (i & 8192) != 0 ? premiumBusSeatSelectionDataState.m : gender;
        boolean z8 = (i & 16384) != 0 ? premiumBusSeatSelectionDataState.n : true;
        Integer num4 = (i & 32768) != 0 ? premiumBusSeatSelectionDataState.o : num2;
        premiumBusSeatSelectionDataState.getClass();
        Intrinsics.i(seatInfoList, "seatInfoList");
        Intrinsics.i(alreadySelectedSeats, "alreadySelectedSeats");
        return new PremiumBusSeatSelectionDataState(z4, z5, premiumBusSeatSelectionFlowType2, seatInfoList, num3, alreadySelectedSeats, z6, str2, seatSelectionDialogType, z7, genderPreferenceSelectionStates2, seatSelectionBottomSheetType2, gender2, z8, num4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSeatSelectionDataState)) {
            return false;
        }
        PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState = (PremiumBusSeatSelectionDataState) obj;
        return this.f7724a == premiumBusSeatSelectionDataState.f7724a && this.b == premiumBusSeatSelectionDataState.b && Intrinsics.d(this.c, premiumBusSeatSelectionDataState.c) && Intrinsics.d(this.d, premiumBusSeatSelectionDataState.d) && Intrinsics.d(this.e, premiumBusSeatSelectionDataState.e) && Intrinsics.d(this.f, premiumBusSeatSelectionDataState.f) && this.g == premiumBusSeatSelectionDataState.g && Intrinsics.d(this.h, premiumBusSeatSelectionDataState.h) && Intrinsics.d(this.i, premiumBusSeatSelectionDataState.i) && this.j == premiumBusSeatSelectionDataState.j && this.k == premiumBusSeatSelectionDataState.k && Intrinsics.d(this.l, premiumBusSeatSelectionDataState.l) && this.m == premiumBusSeatSelectionDataState.m && this.n == premiumBusSeatSelectionDataState.n && Intrinsics.d(this.o, premiumBusSeatSelectionDataState.o);
    }

    public final int hashCode() {
        int i = (((this.f7724a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = this.c;
        int iB = r30.b((i + (premiumBusSeatSelectionFlowType == null ? 0 : premiumBusSeatSelectionFlowType.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int iB2 = (r30.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.f) + (this.g ? 1231 : 1237)) * 31;
        String str = this.h;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        SeatSelectionDialogType seatSelectionDialogType = this.i;
        int iHashCode2 = (((iHashCode + (seatSelectionDialogType == null ? 0 : seatSelectionDialogType.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31;
        GenderPreferenceSelectionStates genderPreferenceSelectionStates = this.k;
        int iHashCode3 = (iHashCode2 + (genderPreferenceSelectionStates == null ? 0 : genderPreferenceSelectionStates.hashCode())) * 31;
        SeatSelectionBottomSheetType seatSelectionBottomSheetType = this.l;
        int iHashCode4 = (iHashCode3 + (seatSelectionBottomSheetType == null ? 0 : seatSelectionBottomSheetType.hashCode())) * 31;
        Gender gender = this.m;
        int iHashCode5 = (((iHashCode4 + (gender == null ? 0 : gender.hashCode())) * 31) + (this.n ? 1231 : 1237)) * 31;
        Integer num2 = this.o;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PremiumBusSeatSelectionDataState(selectedTrip=null, isLoading=", ", errorOccurred=", ", seatSelectionFlowType=", this.f7724a, this.b);
        sbR.append(this.c);
        sbR.append(", seatInfoList=");
        sbR.append(this.d);
        sbR.append(", maxSeatSelectionAllowed=");
        sbR.append(this.e);
        sbR.append(", alreadySelectedSeats=");
        sbR.append(this.f);
        sbR.append(", showSeatChangeSuccessScreen=");
        pk0.x(", bookingId=", this.h, ", seatSelectionDialogType=", sbR, this.g);
        sbR.append(this.i);
        sbR.append(", areAllSeatsAreAlreadyBooked=");
        sbR.append(this.j);
        sbR.append(", genderPreferenceSelectionState=");
        sbR.append(this.k);
        sbR.append(", seatSelectionBottomSheetType=");
        sbR.append(this.l);
        sbR.append(", gender=");
        sbR.append(this.m);
        sbR.append(", isUserInteractedWithSeatsLayout=");
        sbR.append(this.n);
        sbR.append(", desiredPassengerCount=");
        return pk0.k(sbR, this.o, ")");
    }
}
