package defpackage;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import com.google.common.base.Function;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b20 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11162a;
    public final /* synthetic */ AnalyticsCollector b;

    public /* synthetic */ b20(AnalyticsCollector analyticsCollector, int i) {
        this.f11162a = i;
        this.b = analyticsCollector;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f11162a) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(this.b, (Clock) obj);
            default:
                return ExoPlayer.Builder.lambda$new$13(this.b, (Clock) obj);
        }
    }
}
