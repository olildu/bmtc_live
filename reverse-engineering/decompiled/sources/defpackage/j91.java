package defpackage;

import android.os.SystemClock;
import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j91 {
    static {
        SimpleBasePlayer.PositionSupplier positionSupplier = SimpleBasePlayer.PositionSupplier.ZERO;
    }

    public static SimpleBasePlayer.PositionSupplier a(long j) {
        return new i91(j);
    }

    public static SimpleBasePlayer.PositionSupplier b(final long j, final float f) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new SimpleBasePlayer.PositionSupplier() { // from class: h91
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return j91.d(j, jElapsedRealtime, f);
            }
        };
    }

    public static /* synthetic */ long d(long j, long j2, float f) {
        return j + ((long) ((SystemClock.elapsedRealtime() - j2) * f));
    }

    public static /* synthetic */ long c(long j) {
        return j;
    }
}
