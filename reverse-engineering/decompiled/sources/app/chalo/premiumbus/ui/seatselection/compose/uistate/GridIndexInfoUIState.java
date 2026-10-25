package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GridIndexInfoUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GridIndexInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7774a;
    public final ChaloColorToken b;
    public final UIShape c;

    public GridIndexInfoUIState(ArrayList arrayList, UIShape shape, int i) {
        List indexText = arrayList;
        indexText = (i & 1) != 0 ? EmptyList.f17557a : indexText;
        shape = (i & 4) != 0 ? ChaloThemeHelper.d.j : shape;
        Intrinsics.i(indexText, "indexText");
        Intrinsics.i(shape, "shape");
        this.f7774a = indexText;
        this.b = ChaloColorToken.GreyColor.f9806a;
        this.c = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridIndexInfoUIState)) {
            return false;
        }
        GridIndexInfoUIState gridIndexInfoUIState = (GridIndexInfoUIState) obj;
        return Intrinsics.d(this.f7774a, gridIndexInfoUIState.f7774a) && Intrinsics.d(this.b, gridIndexInfoUIState.b) && Intrinsics.d(this.c, gridIndexInfoUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f7774a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridIndexInfoUIState(indexText=");
        sb.append(this.f7774a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", shape=");
        return gf.j(sb, this.c, ")");
    }
}
