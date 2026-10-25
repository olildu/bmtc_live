package app.chalo.metro.ui.landing.uistate;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/LineSelectionBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineSelectionBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineSelectionBottomSheetSpec f5517a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final List d;

    public LineSelectionBottomSheetUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, List lineList) {
        LineSelectionBottomSheetSpec lineSelectionBottomSheetSpec = new LineSelectionBottomSheetSpec();
        Intrinsics.i(lineList, "lineList");
        this.f5517a = lineSelectionBottomSheetSpec;
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = lineList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelectionBottomSheetUIState)) {
            return false;
        }
        LineSelectionBottomSheetUIState lineSelectionBottomSheetUIState = (LineSelectionBottomSheetUIState) obj;
        return Intrinsics.d(this.f5517a, lineSelectionBottomSheetUIState.f5517a) && Intrinsics.d(this.b, lineSelectionBottomSheetUIState.b) && Intrinsics.d(this.c, lineSelectionBottomSheetUIState.c) && Intrinsics.d(this.d, lineSelectionBottomSheetUIState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f5517a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "LineSelectionBottomSheetUIState(spec=" + this.f5517a + ", title=" + this.b + ", crossIcon=" + this.c + ", lineList=" + this.d + ")";
    }
}
