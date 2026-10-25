package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnScope;
import androidx.compose.ui.Modifier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kt {
    public static /* synthetic */ Modifier a(ContextualFlowColumnScope contextualFlowColumnScope, Modifier modifier, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxColumnWidth");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return contextualFlowColumnScope.fillMaxColumnWidth(modifier, f);
    }
}
