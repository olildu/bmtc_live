package app.chalo.uistate.radiobutton;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/radiobutton/RadioButtonUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RadioButtonUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10065a;
    public final UiEventHandler b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;
    public final ChaloColorToken e;

    public RadioButtonUIState(boolean z, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        uiEventHandler$Companion$fromLambda$1 = (i & 2) != 0 ? null : uiEventHandler$Companion$fromLambda$1;
        ChaloColorToken chaloColorToken = (i & 16) != 0 ? ChaloColorToken.Shadow.f9850a : ChaloColorToken.ShadyGray.f9851a;
        this.f10065a = z;
        this.b = uiEventHandler$Companion$fromLambda$1;
        this.c = ChaloColorToken.OrangePrimary.f9835a;
        this.d = chaloColorToken;
        this.e = ChaloColorToken.LightGray.f9814a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioButtonUIState)) {
            return false;
        }
        RadioButtonUIState radioButtonUIState = (RadioButtonUIState) obj;
        return this.f10065a == radioButtonUIState.f10065a && Intrinsics.d(this.b, radioButtonUIState.b) && this.c.equals(radioButtonUIState.c) && this.d.equals(radioButtonUIState.d) && this.e.equals(radioButtonUIState.e);
    }

    public final int hashCode() {
        int i = (this.f10065a ? 1231 : 1237) * 31;
        UiEventHandler uiEventHandler = this.b;
        return this.e.hashCode() + z40.b(this.d, z40.b(this.c, (((i + (uiEventHandler == null ? 0 : uiEventHandler.hashCode())) * 31) + 1231) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioButtonUIState(isSelected=");
        sb.append(this.f10065a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", isEnabled=true, selectedColor=");
        sb.append(this.c);
        sb.append(", unselectedColorToken=");
        sb.append(this.d);
        sb.append(", disabledColor=");
        return pk0.j(sb, this.e, ")");
    }
}
