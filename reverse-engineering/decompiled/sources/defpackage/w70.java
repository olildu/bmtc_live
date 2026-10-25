package defpackage;

import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19900a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w70(int i, int i2, Object obj, int i3) {
        this.f19900a = i3;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19900a) {
            case 0:
                ((HomeComponent) this.d).l1(new HomeScreenFragmentViewIntent.UserProfilingHookDisplayedIntent(UserProfilingHookSlot.CHALO_BUS_STICKY_BANNER, Integer.valueOf(this.b), Integer.valueOf(this.c)));
                return Unit.f17538a;
            case 1:
                return Http2Connection.ReaderRunnable.ping$lambda$10((Http2Connection) this.d, this.b, this.c);
            case 2:
                return LazyGridStateKt.rememberLazyGridState$lambda$2$0(this.b, this.c, (LazyGridPrefetchStrategy) this.d);
            default:
                return LazyListStateKt.rememberLazyListState$lambda$2$0(this.b, this.c, (LazyListPrefetchStrategy) this.d);
        }
    }

    public /* synthetic */ w70(Object obj, int i, int i2, int i3) {
        this.f19900a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
