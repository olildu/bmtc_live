package defpackage;

import androidx.compose.runtime.MutableLongState;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ok0 {
    public static Long a(MutableLongState mutableLongState) {
        return Long.valueOf(mutableLongState.getLongValue());
    }

    public static void c(MutableLongState mutableLongState, long j) {
        mutableLongState.setLongValue(j);
    }
}
