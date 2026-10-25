package defpackage;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusTargetModifierNode;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r40 {
    public static /* synthetic */ boolean a(FocusTargetModifierNode focusTargetModifierNode, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i2 & 1) != 0) {
            i = FocusDirection.INSTANCE.m4244getEnterdhqQ8s();
        }
        return focusTargetModifierNode.mo4272requestFocus3ESFkO8(i);
    }
}
