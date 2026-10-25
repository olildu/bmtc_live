package app.chalo.premiumbus.ui.stopselection;

import app.chalo.uistate.dialog.DatePickerUIState;
import defpackage.pk0;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PremiumBusStopSelectionViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusStopSelectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7986a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final PBStopSelectionScreenBottomSheetType f;
    public final List g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final DatePickerUIState m;
    public final SelectedDateAndTime n;

    public /* synthetic */ PremiumBusStopSelectionViewState() {
        this(null, false, false, null, null, null, null, false, null, false, false, null, null, null);
    }

    public static PremiumBusStopSelectionViewState a(PremiumBusStopSelectionViewState premiumBusStopSelectionViewState, Boolean bool, boolean z, boolean z2, String str, String str2, PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, List list, boolean z3, String str3, boolean z4, boolean z5, String str4, SelectedDateAndTime selectedDateAndTime, int i) {
        Boolean bool2 = (i & 1) != 0 ? premiumBusStopSelectionViewState.f7986a : bool;
        boolean z6 = (i & 2) != 0 ? premiumBusStopSelectionViewState.b : z;
        boolean z7 = (i & 4) != 0 ? premiumBusStopSelectionViewState.c : z2;
        String str5 = (i & 8) != 0 ? premiumBusStopSelectionViewState.d : str;
        String str6 = (i & 16) != 0 ? premiumBusStopSelectionViewState.e : str2;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType2 = (i & 32) != 0 ? premiumBusStopSelectionViewState.f : pBStopSelectionScreenBottomSheetType;
        List list2 = (i & 64) != 0 ? premiumBusStopSelectionViewState.g : list;
        boolean z8 = (i & 128) != 0 ? premiumBusStopSelectionViewState.h : z3;
        String str7 = (i & 256) != 0 ? premiumBusStopSelectionViewState.i : str3;
        premiumBusStopSelectionViewState.getClass();
        boolean z9 = (i & 1024) != 0 ? premiumBusStopSelectionViewState.j : z4;
        boolean z10 = (i & 2048) != 0 ? premiumBusStopSelectionViewState.k : z5;
        String str8 = (i & 4096) != 0 ? premiumBusStopSelectionViewState.l : str4;
        premiumBusStopSelectionViewState.getClass();
        DatePickerUIState datePickerUIState = (i & 16384) != 0 ? premiumBusStopSelectionViewState.m : null;
        SelectedDateAndTime selectedDateAndTime2 = (i & 32768) != 0 ? premiumBusStopSelectionViewState.n : selectedDateAndTime;
        premiumBusStopSelectionViewState.getClass();
        premiumBusStopSelectionViewState.getClass();
        return new PremiumBusStopSelectionViewState(bool2, z6, z7, str5, str6, pBStopSelectionScreenBottomSheetType2, list2, z8, str7, z9, z10, str8, datePickerUIState, selectedDateAndTime2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusStopSelectionViewState)) {
            return false;
        }
        PremiumBusStopSelectionViewState premiumBusStopSelectionViewState = (PremiumBusStopSelectionViewState) obj;
        return Intrinsics.d(this.f7986a, premiumBusStopSelectionViewState.f7986a) && this.b == premiumBusStopSelectionViewState.b && this.c == premiumBusStopSelectionViewState.c && Intrinsics.d(this.d, premiumBusStopSelectionViewState.d) && Intrinsics.d(this.e, premiumBusStopSelectionViewState.e) && Intrinsics.d(this.f, premiumBusStopSelectionViewState.f) && Intrinsics.d(this.g, premiumBusStopSelectionViewState.g) && this.h == premiumBusStopSelectionViewState.h && Intrinsics.d(this.i, premiumBusStopSelectionViewState.i) && this.j == premiumBusStopSelectionViewState.j && this.k == premiumBusStopSelectionViewState.k && Intrinsics.d(this.l, premiumBusStopSelectionViewState.l) && Intrinsics.d(this.m, premiumBusStopSelectionViewState.m) && Intrinsics.d(this.n, premiumBusStopSelectionViewState.n);
    }

    public final int hashCode() {
        Boolean bool = this.f7986a;
        int iHashCode = (((((bool == null ? 0 : bool.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = this.f;
        int iHashCode4 = (iHashCode3 + (pBStopSelectionScreenBottomSheetType == null ? 0 : pBStopSelectionScreenBottomSheetType.hashCode())) * 31;
        List list = this.g;
        int iHashCode5 = (((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str3 = this.i;
        int iHashCode6 = (((((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 961) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31;
        String str4 = this.l;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + 1237) * 31;
        DatePickerUIState datePickerUIState = this.m;
        int iHashCode8 = (iHashCode7 + (datePickerUIState == null ? 0 : datePickerUIState.hashCode())) * 31;
        SelectedDateAndTime selectedDateAndTime = this.n;
        return (iHashCode8 + (selectedDateAndTime != null ? selectedDateAndTime.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusStopSelectionViewState(shouldShowNewLandingScreen=");
        sb.append(this.f7986a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", shouldEnableProceedBtn=");
        pk0.x(", fromStopSelectedName=", this.d, ", toStopSelectedName=", sb, this.c);
        sb.append(this.e);
        sb.append(", bottomSheetType=");
        sb.append(this.f);
        sb.append(", originDestinationPairsFromPastPurchases=");
        sb.append(this.g);
        sb.append(", supportContactNoAvailable=");
        sb.append(this.h);
        sb.append(", landingScreenImageUrl=");
        t10.s(this.i, ", routeId=null, isCurrentLocationAvailable=", ", isPassPurchaseFromAllProducts=", sb, this.j);
        pk0.x(", cityName=", this.l, ", showNotificationsScreen=false, datePickerUIState=", sb, this.k);
        sb.append(this.m);
        sb.append(", selectedDateAndTime=");
        sb.append(this.n);
        sb.append(", defaultTime=null)");
        return sb.toString();
    }

    public PremiumBusStopSelectionViewState(Boolean bool, boolean z, boolean z2, String str, String str2, PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, List list, boolean z3, String str3, boolean z4, boolean z5, String str4, DatePickerUIState datePickerUIState, SelectedDateAndTime selectedDateAndTime) {
        this.f7986a = bool;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = pBStopSelectionScreenBottomSheetType;
        this.g = list;
        this.h = z3;
        this.i = str3;
        this.j = z4;
        this.k = z5;
        this.l = str4;
        this.m = datePickerUIState;
        this.n = selectedDateAndTime;
    }
}
