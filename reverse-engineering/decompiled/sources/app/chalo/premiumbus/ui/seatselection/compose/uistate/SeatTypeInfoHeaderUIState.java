package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatTypeInfoHeaderUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatTypeInfoHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7788a;
    public final ChaloColorToken b;
    public final ChaloPadding c;

    public SeatTypeInfoHeaderUIState(ListBuilder listBuilder, int i) {
        List seatTypeInfoHeader = listBuilder;
        seatTypeInfoHeader = (i & 1) != 0 ? EmptyList.f17557a : seatTypeInfoHeader;
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        Intrinsics.i(seatTypeInfoHeader, "seatTypeInfoHeader");
        this.f7788a = seatTypeInfoHeader;
        this.b = ChaloColorToken.White.f9870a;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatTypeInfoHeaderUIState)) {
            return false;
        }
        SeatTypeInfoHeaderUIState seatTypeInfoHeaderUIState = (SeatTypeInfoHeaderUIState) obj;
        return Intrinsics.d(this.f7788a, seatTypeInfoHeaderUIState.f7788a) && Intrinsics.d(this.b, seatTypeInfoHeaderUIState.b) && Intrinsics.d(this.c, seatTypeInfoHeaderUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f7788a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeatTypeInfoHeaderUIState(seatTypeInfoHeader=");
        sb.append(this.f7788a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", contentPadding=");
        return py.e(sb, this.c, ")");
    }
}
