package app.chalo.uistate.bottomsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BottomSheetUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiSpec f9907a;
    public final BottomSheetEventHandler b;

    public BottomSheetUiState(BottomSheetUiSpec bottomSheetUiSpec, BottomSheetEventHandler eventHandler) {
        Intrinsics.i(eventHandler, "eventHandler");
        this.f9907a = bottomSheetUiSpec;
        this.b = eventHandler;
    }

    public static BottomSheetUiState a(BottomSheetUiState bottomSheetUiState, BottomSheetUiSpec bottomSheetUiSpec) {
        BottomSheetEventHandler eventHandler = bottomSheetUiState.b;
        bottomSheetUiState.getClass();
        Intrinsics.i(eventHandler, "eventHandler");
        return new BottomSheetUiState(bottomSheetUiSpec, eventHandler);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BottomSheetUiSpec getF9907a() {
        return this.f9907a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetUiState)) {
            return false;
        }
        BottomSheetUiState bottomSheetUiState = (BottomSheetUiState) obj;
        return Intrinsics.d(this.f9907a, bottomSheetUiState.f9907a) && Intrinsics.d(this.b, bottomSheetUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9907a.hashCode() * 31);
    }

    public final String toString() {
        return "BottomSheetUiState(sheetUiSpec=" + this.f9907a + ", eventHandler=" + this.b + ")";
    }

    public /* synthetic */ BottomSheetUiState(BottomSheetEventHandler bottomSheetEventHandler, int i) {
        this(new BottomSheetUiSpec(null, 15), (i & 2) != 0 ? new BottomSheetEventHandler(false, false, null, 127) : bottomSheetEventHandler);
    }
}
