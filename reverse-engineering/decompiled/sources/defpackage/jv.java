package defpackage;

import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jv implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17441a;

    public /* synthetic */ jv(int i) {
        this.f17441a = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f17441a) {
            case 0:
                return DataSourceBitmapLoader.lambda$static$0();
            case 1:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            case 2:
                return new DefaultLoadControl();
            default:
                throw new IllegalStateException();
        }
    }
}
