package app.chalo.uistate.checkbox;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/checkbox/ChaloCheckBoxUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCheckBoxUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckBoxUISpecs f9927a = new CheckBoxUISpecs();
    public final boolean b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public ChaloCheckBoxUIState(boolean z, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = z;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCheckBoxUIState)) {
            return false;
        }
        ChaloCheckBoxUIState chaloCheckBoxUIState = (ChaloCheckBoxUIState) obj;
        return Intrinsics.d(this.f9927a, chaloCheckBoxUIState.f9927a) && this.b == chaloCheckBoxUIState.b && Intrinsics.d(this.c, chaloCheckBoxUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f9927a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloCheckBoxUIState(spec=");
        sb.append(this.f9927a);
        sb.append(", isChecked=");
        sb.append(this.b);
        sb.append(", eventHandler=");
        return nf1.n(sb, this.c, ")");
    }
}
