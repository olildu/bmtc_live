package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DropDownMenuUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DropDownMenuUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9995a;
    public final UiEventHandler b;
    public final DropDownMenuUISpecs c;

    public DropDownMenuUIState(List optionsMenu, DropDownMenuUISpecs dropDownMenuUISpecs, int i) {
        if ((i & 4) != 0) {
            dropDownMenuUISpecs = new DropDownMenuUISpecs(ChaloColorToken.White.f9870a, ChaloThemeHelper.a().f, null);
        }
        Intrinsics.i(optionsMenu, "optionsMenu");
        this.f9995a = optionsMenu;
        this.b = UiEventHandler.Companion.f9897a;
        this.c = dropDownMenuUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropDownMenuUIState)) {
            return false;
        }
        DropDownMenuUIState dropDownMenuUIState = (DropDownMenuUIState) obj;
        return Intrinsics.d(this.f9995a, dropDownMenuUIState.f9995a) && Intrinsics.d(this.b, dropDownMenuUIState.b) && Intrinsics.d(this.c, dropDownMenuUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f9995a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DropDownMenuUIState(optionsMenu=" + this.f9995a + ", dismissRequest=" + this.b + ", specs=" + this.c + ")";
    }
}
