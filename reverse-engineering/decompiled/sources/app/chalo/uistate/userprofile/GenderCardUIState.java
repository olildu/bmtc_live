package app.chalo.uistate.userprofile;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/userprofile/GenderCardUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenderCardSpec f10127a;
    public final TextUIState b;
    public final ImageUIState c;
    public final boolean d;
    public final UiEventHandler e;

    public GenderCardUIState(GenderCardSpec spec, TextUIState textUIState, ImageUIState imageUIState, boolean z, UiEventHandler uiEventHandler) {
        Intrinsics.i(spec, "spec");
        this.f10127a = spec;
        this.b = textUIState;
        this.c = imageUIState;
        this.d = z;
        this.e = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderCardUIState)) {
            return false;
        }
        GenderCardUIState genderCardUIState = (GenderCardUIState) obj;
        return Intrinsics.d(this.f10127a, genderCardUIState.f10127a) && Intrinsics.d(this.b, genderCardUIState.b) && Intrinsics.d(this.c, genderCardUIState.c) && this.d == genderCardUIState.d && Intrinsics.d(this.e, genderCardUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((r30.e(this.c, pk0.c(this.b, this.f10127a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "GenderCardUIState(spec=" + this.f10127a + ", title=" + this.b + ", image=" + this.c + ", isSelected=" + this.d + ", eventHandler=" + this.e + ")";
    }
}
