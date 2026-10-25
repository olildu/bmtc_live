package defpackage;

import androidx.compose.runtime.MutableIntState;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class nk0 {
    public static Integer a(MutableIntState mutableIntState) {
        return Integer.valueOf(mutableIntState.getIntValue());
    }

    public static void c(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}
