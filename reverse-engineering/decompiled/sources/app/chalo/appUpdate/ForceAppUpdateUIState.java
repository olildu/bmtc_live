package app.chalo.appUpdate;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ForceAppUpdateUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ForceAppUpdateSpecs f953a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final ButtonUIState e;
    public final TextUIState.ChaloTextUIState f;

    public ForceAppUpdateUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState titleUIState, TextUIState.ChaloTextUIState subTitleUIState, ButtonUIState updateBtnUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        ForceAppUpdateSpecs forceAppUpdateSpecs = new ForceAppUpdateSpecs();
        Intrinsics.i(imageUIState, "imageUIState");
        Intrinsics.i(titleUIState, "titleUIState");
        Intrinsics.i(subTitleUIState, "subTitleUIState");
        Intrinsics.i(updateBtnUIState, "updateBtnUIState");
        this.f953a = forceAppUpdateSpecs;
        this.b = imageUIState;
        this.c = titleUIState;
        this.d = subTitleUIState;
        this.e = updateBtnUIState;
        this.f = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceAppUpdateUIState)) {
            return false;
        }
        ForceAppUpdateUIState forceAppUpdateUIState = (ForceAppUpdateUIState) obj;
        return Intrinsics.d(this.f953a, forceAppUpdateUIState.f953a) && Intrinsics.d(this.b, forceAppUpdateUIState.b) && Intrinsics.d(this.c, forceAppUpdateUIState.c) && Intrinsics.d(this.d, forceAppUpdateUIState.d) && Intrinsics.d(this.e, forceAppUpdateUIState.e) && Intrinsics.d(this.f, forceAppUpdateUIState.f);
    }

    public final int hashCode() {
        int iD = r30.d(this.e, r30.f(this.d, r30.f(this.c, r30.e(this.b, this.f953a.hashCode() * 31, 31), 31), 31), 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.f;
        return iD + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForceAppUpdateUIState(specs=");
        sb.append(this.f953a);
        sb.append(", imageUIState=");
        sb.append(this.b);
        sb.append(", titleUIState=");
        r30.p(sb, this.c, ", subTitleUIState=", this.d, ", updateBtnUIState=");
        sb.append(this.e);
        sb.append(", remindLaterUIState=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
