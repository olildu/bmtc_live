package defpackage;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import in.juspay.hypersdk.analytics.LogPusherExp;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h30 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15788a;
    public final /* synthetic */ String b;

    public /* synthetic */ h30(String str, int i) {
        this.f15788a = i;
        this.b = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f15788a) {
            case 0:
                return FileStore.lambda$cleanupFileSystemDirs$0(this.b, file, str);
            default:
                return LogPusherExp.lambda$pushChannelFiles$5(this.b, file, str);
        }
    }
}
