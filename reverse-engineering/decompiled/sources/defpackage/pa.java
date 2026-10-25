package defpackage;

import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pa {
    public static /* synthetic */ Object a(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return basicTooltipState.show(mutatePriority, continuation);
    }
}
