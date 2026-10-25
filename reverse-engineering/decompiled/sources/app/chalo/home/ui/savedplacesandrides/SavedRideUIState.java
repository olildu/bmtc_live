package app.chalo.home.ui.savedplacesandrides;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedRideUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SavedRideUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedRideUISpecs f3695a = new SavedRideUISpecs();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ImageUIState e;
    public final ImageUIState f;
    public final ImageUIState g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SavedRideUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, ImageUIState imageUIState, ImageUIState imageUIState2, ImageUIState imageUIState3) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloTextUIState3;
        this.e = imageUIState;
        this.f = imageUIState2;
        this.g = imageUIState3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedRideUIState)) {
            return false;
        }
        SavedRideUIState savedRideUIState = (SavedRideUIState) obj;
        return Intrinsics.d(this.f3695a, savedRideUIState.f3695a) && Intrinsics.d(this.b, savedRideUIState.b) && Intrinsics.d(this.c, savedRideUIState.c) && Intrinsics.d(this.d, savedRideUIState.d) && Intrinsics.d(this.e, savedRideUIState.e) && Intrinsics.d(this.f, savedRideUIState.f) && Intrinsics.d(this.g, savedRideUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.e(this.f, r30.e(this.e, r30.f(this.d, r30.f(this.c, r30.f(this.b, this.f3695a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedRideUIState(specs=");
        sb.append(this.f3695a);
        sb.append(", originName=");
        sb.append(this.b);
        sb.append(", destinationName=");
        r30.p(sb, this.c, ", timeDisplay=", this.d, ", timeIcon=");
        sb.append(this.e);
        sb.append(", editIconUIState=");
        sb.append(this.f);
        sb.append(", deleteIconUIState=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
