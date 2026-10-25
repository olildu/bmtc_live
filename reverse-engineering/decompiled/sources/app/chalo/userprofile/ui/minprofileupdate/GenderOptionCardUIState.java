package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/GenderOptionCardUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderOptionCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10380a;
    public final ImageUIState b;
    public final boolean c;
    public final ChaloColorToken d;
    public final BorderUISpec e;
    public final UiEventHandler$Companion$fromLambda$1 f;
    public final GenderOptionCardUISpec g;

    public GenderOptionCardUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, boolean z, ChaloColorToken chaloColorToken, BorderUISpec borderUISpec, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        GenderOptionCardUISpec genderOptionCardUISpec = new GenderOptionCardUISpec();
        this.f10380a = chaloTextUIState;
        this.b = imageUIState;
        this.c = z;
        this.d = chaloColorToken;
        this.e = borderUISpec;
        this.f = uiEventHandler$Companion$fromLambda$1;
        this.g = genderOptionCardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderOptionCardUIState)) {
            return false;
        }
        GenderOptionCardUIState genderOptionCardUIState = (GenderOptionCardUIState) obj;
        return Intrinsics.d(this.f10380a, genderOptionCardUIState.f10380a) && Intrinsics.d(this.b, genderOptionCardUIState.b) && this.c == genderOptionCardUIState.c && Intrinsics.d(this.d, genderOptionCardUIState.d) && Intrinsics.d(this.e, genderOptionCardUIState.e) && Intrinsics.d(this.f, genderOptionCardUIState.f) && Intrinsics.d(this.g, genderOptionCardUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gf.a(this.f, (this.e.hashCode() + z40.b(this.d, (r30.e(this.b, this.f10380a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "GenderOptionCardUIState(title=" + this.f10380a + ", image=" + this.b + ", isSelected=" + this.c + ", backgroundColor=" + this.d + ", borderSpec=" + this.e + ", eventHandler=" + this.f + ", spec=" + this.g + ")";
    }
}
