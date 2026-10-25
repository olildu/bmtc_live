package app.chalo.home.ui.savedplacesandrides;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlaceUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SavedPlaceUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedPlaceUISpecs f3677a = new SavedPlaceUISpecs();
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ImageUIState e;
    public final ImageUIState f;
    public final UiEventHandler g;

    public SavedPlaceUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState2, ImageUIState imageUIState3, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = imageUIState2;
        this.f = imageUIState3;
        this.g = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedPlaceUIState)) {
            return false;
        }
        SavedPlaceUIState savedPlaceUIState = (SavedPlaceUIState) obj;
        return Intrinsics.d(this.f3677a, savedPlaceUIState.f3677a) && Intrinsics.d(this.b, savedPlaceUIState.b) && Intrinsics.d(this.c, savedPlaceUIState.c) && Intrinsics.d(this.d, savedPlaceUIState.d) && Intrinsics.d(this.e, savedPlaceUIState.e) && Intrinsics.d(this.f, savedPlaceUIState.f) && Intrinsics.d(this.g, savedPlaceUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.e(this.b, this.f3677a.hashCode() * 31, 31), 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        int iHashCode2 = (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        ImageUIState imageUIState2 = this.f;
        int iHashCode3 = (iHashCode2 + (imageUIState2 == null ? 0 : imageUIState2.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.g;
        return iHashCode3 + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedPlaceUIState(specs=");
        sb.append(this.f3677a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        r30.p(sb, this.c, ", displayName=", this.d, ", editIconUIState=");
        sb.append(this.e);
        sb.append(", deleteIconUIState=");
        sb.append(this.f);
        sb.append(", onCardClick=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
