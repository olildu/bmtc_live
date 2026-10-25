package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/TabItemUiState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabItemUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabItemSpecs f4623a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler c;
    public final boolean d;

    public TabItemUiState(TabItemSpecs tabItemSpecs, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler uiEventHandler, boolean z) {
        this.f4623a = tabItemSpecs;
        this.b = chaloTextUIState;
        this.c = uiEventHandler;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabItemUiState)) {
            return false;
        }
        TabItemUiState tabItemUiState = (TabItemUiState) obj;
        return Intrinsics.d(this.f4623a, tabItemUiState.f4623a) && Intrinsics.d(this.b, tabItemUiState.b) && Intrinsics.d(this.c, tabItemUiState.c) && this.d == tabItemUiState.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + r30.f(this.b, this.f4623a.hashCode() * 31, 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "TabItemUiState(specs=" + this.f4623a + ", name=" + this.b + ", clickHandler=" + this.c + ", isSelected=" + this.d + ")";
    }

    public /* synthetic */ TabItemUiState(TextUIState.ChaloTextUIState chaloTextUIState, boolean z) {
        this(new TabItemSpecs(null, 7), chaloTextUIState, UiEventHandler.Companion.f9897a, z);
    }
}
