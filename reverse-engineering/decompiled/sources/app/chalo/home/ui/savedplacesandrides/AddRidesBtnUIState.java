package app.chalo.home.ui.savedplacesandrides;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/AddRidesBtnUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddRidesBtnUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f3670a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;

    public AddRidesBtnUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState icon, TextUIState.ChaloTextUIState chaloTextUIState) {
        Intrinsics.i(icon, "icon");
        this.f3670a = icon;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddRidesBtnUIState)) {
            return false;
        }
        AddRidesBtnUIState addRidesBtnUIState = (AddRidesBtnUIState) obj;
        return Intrinsics.d(this.f3670a, addRidesBtnUIState.f3670a) && this.b.equals(addRidesBtnUIState.b) && this.c.equals(addRidesBtnUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f3670a.hashCode() * 31, 31);
    }

    public final String toString() {
        return nf1.n(pk0.n("AddRidesBtnUIState(icon=", this.f3670a, ", text=", this.b, ", onClick="), this.c, ")");
    }
}
