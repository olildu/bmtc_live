package defpackage;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.adster.sdk.mediation.adster.AdFullScreenActivity;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j1 implements OnApplyWindowInsetsListener, ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17362a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(Object obj, int i, int i2) {
        this.c = obj;
        this.f17362a = i;
        this.b = i2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onSurfaceSizeChanged((AnalyticsListener.EventTime) this.c, this.f17362a, this.b);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return AdFullScreenActivity.applyInsetsPadding$lambda$4((AdFullScreenActivity) this.c, this.f17362a, this.b, view, windowInsetsCompat);
    }
}
