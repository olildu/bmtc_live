package app.cash.sqldelight.driver.android;

import android.database.AbstractWindowedCursor;
import androidx.media3.exoplayer.upstream.CmcdData;
import defpackage.x5;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/cash/sqldelight/driver/android/Api28Impl;", "", "Landroid/database/AbstractWindowedCursor;", "", "windowSizeBytes", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/database/AbstractWindowedCursor;J)V", "sqldelight-android-driver_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Api28Impl {
    @JvmStatic
    public static final void a(AbstractWindowedCursor abstractWindowedCursor, long j) {
        Intrinsics.i(abstractWindowedCursor, "<this>");
        abstractWindowedCursor.setWindow(x5.a(j));
    }
}
