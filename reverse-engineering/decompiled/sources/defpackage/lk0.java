package defpackage;

import androidx.compose.runtime.MutableDoubleState;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class lk0 {
    public static Double a(MutableDoubleState mutableDoubleState) {
        return Double.valueOf(mutableDoubleState.getDoubleValue());
    }

    public static void c(MutableDoubleState mutableDoubleState, double d) {
        mutableDoubleState.setDoubleValue(d);
    }
}
