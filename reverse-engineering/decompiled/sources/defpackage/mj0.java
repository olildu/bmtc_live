package defpackage;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class mj0 {
    static {
        Modifier.Companion companion = Modifier.INSTANCE;
    }

    public static Modifier a(Modifier modifier, Modifier modifier2) {
        return modifier2 == Modifier.INSTANCE ? modifier : new CombinedModifier(modifier, modifier2);
    }
}
