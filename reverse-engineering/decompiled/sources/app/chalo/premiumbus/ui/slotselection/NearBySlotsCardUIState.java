package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NearBySlotsCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearBySlotsCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearBySlotsCardUISpecs f7809a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final ImageUIState d;

    public NearBySlotsCardUIState(ImageUIState closeButtonUIState, TextUIState.ChaloTextUIState titleDate, List list) {
        NearBySlotsCardUISpecs nearBySlotsCardUISpecs = new NearBySlotsCardUISpecs();
        Intrinsics.i(titleDate, "titleDate");
        Intrinsics.i(closeButtonUIState, "closeButtonUIState");
        this.f7809a = nearBySlotsCardUISpecs;
        this.b = titleDate;
        this.c = list;
        this.d = closeButtonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearBySlotsCardUIState)) {
            return false;
        }
        NearBySlotsCardUIState nearBySlotsCardUIState = (NearBySlotsCardUIState) obj;
        return Intrinsics.d(this.f7809a, nearBySlotsCardUIState.f7809a) && Intrinsics.d(this.b, nearBySlotsCardUIState.b) && Intrinsics.d(this.c, nearBySlotsCardUIState.c) && Intrinsics.d(this.d, nearBySlotsCardUIState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7809a.hashCode() * 31, 31);
        List list = this.c;
        return this.d.hashCode() + ((iF + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "NearBySlotsCardUIState(specs=" + this.f7809a + ", titleDate=" + this.b + ", nearByCardUIState=" + this.c + ", closeButtonUIState=" + this.d + ")";
    }
}
