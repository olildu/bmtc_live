package app.chalo.userprofile.ui;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.py;
import defpackage.r30;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ToolbarAndProfilePicSectionUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarAndProfilePicSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarAndProfilePicSectionUISpecs f10342a;
    public final ToolbarUIState b;
    public final ProfileIconWithEditBtnUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;

    public ToolbarAndProfilePicSectionUIState(ToolbarUIState toolbarUIState, ProfileIconWithEditBtnUIState profileIconUIState, TextUIState.ChaloTextUIState headingUIState, TextUIState.ChaloTextUIState subHeadingUIState) {
        ToolbarAndProfilePicSectionUISpecs toolbarAndProfilePicSectionUISpecs = new ToolbarAndProfilePicSectionUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(profileIconUIState, "profileIconUIState");
        Intrinsics.i(headingUIState, "headingUIState");
        Intrinsics.i(subHeadingUIState, "subHeadingUIState");
        this.f10342a = toolbarAndProfilePicSectionUISpecs;
        this.b = toolbarUIState;
        this.c = profileIconUIState;
        this.d = headingUIState;
        this.e = subHeadingUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarAndProfilePicSectionUIState)) {
            return false;
        }
        ToolbarAndProfilePicSectionUIState toolbarAndProfilePicSectionUIState = (ToolbarAndProfilePicSectionUIState) obj;
        return Intrinsics.d(this.f10342a, toolbarAndProfilePicSectionUIState.f10342a) && Intrinsics.d(this.b, toolbarAndProfilePicSectionUIState.b) && Intrinsics.d(this.c, toolbarAndProfilePicSectionUIState.c) && Intrinsics.d(this.d, toolbarAndProfilePicSectionUIState.d) && Intrinsics.d(this.e, toolbarAndProfilePicSectionUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.f(this.d, (this.c.hashCode() + t8.d(this.b, this.f10342a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarAndProfilePicSectionUIState(specs=");
        sb.append(this.f10342a);
        sb.append(", toolbarUIState=");
        sb.append(this.b);
        sb.append(", profileIconUIState=");
        sb.append(this.c);
        sb.append(", headingUIState=");
        sb.append(this.d);
        sb.append(", subHeadingUIState=");
        return py.f(sb, this.e, ")");
    }
}
