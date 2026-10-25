package defpackage;

import android.app.usage.StorageStatsManager;
import android.content.pm.ApkChecksum;
import android.os.storage.StorageVolume;
import androidx.arch.core.util.Function;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xp1 implements Function {
    public static /* bridge */ /* synthetic */ StorageStatsManager a(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum b(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ StorageVolume d(Object obj) {
        return (StorageVolume) obj;
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
    }
}
