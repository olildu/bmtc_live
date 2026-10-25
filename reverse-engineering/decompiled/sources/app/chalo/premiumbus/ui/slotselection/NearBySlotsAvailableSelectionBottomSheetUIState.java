package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearBySlotsAvailableSelectionBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearBySlotsAvailableSelectionBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearBySlotsAvailableSelectionBottomSheetUISpecs f7807a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final List d;
    public final ButtonUIState e;
    public final ButtonUIState f;
    public final ImageUIState g;

    public NearBySlotsAvailableSelectionBottomSheetUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState subtitle, List nearByCardUIStateList, ButtonUIState confirmRideButtonUIState, ButtonUIState buttonUIState, ImageUIState imageUIState) {
        NearBySlotsAvailableSelectionBottomSheetUISpecs nearBySlotsAvailableSelectionBottomSheetUISpecs = new NearBySlotsAvailableSelectionBottomSheetUISpecs();
        Intrinsics.i(title, "title");
        Intrinsics.i(subtitle, "subtitle");
        Intrinsics.i(nearByCardUIStateList, "nearByCardUIStateList");
        Intrinsics.i(confirmRideButtonUIState, "confirmRideButtonUIState");
        this.f7807a = nearBySlotsAvailableSelectionBottomSheetUISpecs;
        this.b = title;
        this.c = subtitle;
        this.d = nearByCardUIStateList;
        this.e = confirmRideButtonUIState;
        this.f = buttonUIState;
        this.g = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearBySlotsAvailableSelectionBottomSheetUIState)) {
            return false;
        }
        NearBySlotsAvailableSelectionBottomSheetUIState nearBySlotsAvailableSelectionBottomSheetUIState = (NearBySlotsAvailableSelectionBottomSheetUIState) obj;
        return Intrinsics.d(this.f7807a, nearBySlotsAvailableSelectionBottomSheetUIState.f7807a) && Intrinsics.d(this.b, nearBySlotsAvailableSelectionBottomSheetUIState.b) && Intrinsics.d(this.c, nearBySlotsAvailableSelectionBottomSheetUIState.c) && Intrinsics.d(this.d, nearBySlotsAvailableSelectionBottomSheetUIState.d) && Intrinsics.d(this.e, nearBySlotsAvailableSelectionBottomSheetUIState.e) && Intrinsics.d(this.f, nearBySlotsAvailableSelectionBottomSheetUIState.f) && Intrinsics.d(this.g, nearBySlotsAvailableSelectionBottomSheetUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.d(this.f, r30.d(this.e, r30.b(r30.f(this.c, r30.f(this.b, this.f7807a.hashCode() * 31, 31), 31), 31, this.d), 31), 31);
    }

    public final String toString() {
        return "NearBySlotsAvailableSelectionBottomSheetUIState(specs=" + this.f7807a + ", title=" + this.b + ", subtitle=" + this.c + ", nearByCardUIStateList=" + this.d + ", confirmRideButtonUIState=" + this.e + ", goBackButtonUIState=" + this.f + ", closeButtonUIState=" + this.g + ")";
    }
}
