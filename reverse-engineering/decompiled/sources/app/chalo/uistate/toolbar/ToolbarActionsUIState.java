package app.chalo.uistate.toolbar;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarActionsUIState;", "Lapp/chalo/uistate/toolbar/ToolbarBaseActionUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarActionsUIState extends ToolbarBaseActionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiEventHandler f10116a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ToolbarActionSpec d;

    public ToolbarActionsUIState(UiEventHandler actionEventHandler, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ToolbarActionSpec specs) {
        Intrinsics.i(actionEventHandler, "actionEventHandler");
        Intrinsics.i(specs, "specs");
        this.f10116a = actionEventHandler;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = specs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarActionsUIState)) {
            return false;
        }
        ToolbarActionsUIState toolbarActionsUIState = (ToolbarActionsUIState) obj;
        return Intrinsics.d(this.f10116a, toolbarActionsUIState.f10116a) && Intrinsics.d(this.b, toolbarActionsUIState.b) && Intrinsics.d(this.c, toolbarActionsUIState.c) && Intrinsics.d(this.d, toolbarActionsUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10116a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        int iHashCode2 = (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.d.hashCode() + ((iHashCode2 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ToolbarActionsUIState(actionEventHandler=" + this.f10116a + ", icon=" + this.b + ", text=" + this.c + ", specs=" + this.d + ")";
    }

    public /* synthetic */ ToolbarActionsUIState(UiEventHandler uiEventHandler, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ToolbarActionSpec toolbarActionSpec, int i) {
        this(uiEventHandler, (i & 2) != 0 ? null : imageUIState, (i & 4) != 0 ? null : chaloTextUIState, (i & 8) != 0 ? new ToolbarActionSpec((ChaloPadding) null, (UIShape) null, (BorderUISpec) null, 15) : toolbarActionSpec);
    }
}
