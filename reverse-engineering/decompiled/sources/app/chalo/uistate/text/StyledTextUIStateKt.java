package app.chalo.uistate.text;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StyledTextUIStateKt {
    public static final boolean a(TextUIState.StyledTextUIState styledTextUIState) {
        Intrinsics.i(styledTextUIState, "<this>");
        List<StyledTextDataUIState> list = styledTextUIState.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (StyledTextDataUIState styledTextDataUIState : list) {
            Intrinsics.i(styledTextDataUIState, "<this>");
            if (styledTextDataUIState.g != null) {
                return true;
            }
        }
        return false;
    }
}
