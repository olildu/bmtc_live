package defpackage;

import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class up1 {
    public static long a(WindowInfo windowInfo) {
        return DpSize.INSTANCE.m7385getUnspecifiedMYxV2XQ();
    }

    public static long b(WindowInfo windowInfo) {
        long j = Integer.MIN_VALUE;
        return IntSize.m7440constructorimpl((j & BodyPartID.bodyIdMax) | (j << 32));
    }

    public static int c(WindowInfo windowInfo) {
        return WindowInfoImpl.INSTANCE.getGlobalKeyboardModifiers$ui().getValue().getPackedValue();
    }
}
