package app.chalo.compose.components;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1852a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PagerState d;

    public /* synthetic */ a(int i, PagerState pagerState, CoroutineScope coroutineScope) {
        this.f1852a = 0;
        this.b = coroutineScope;
        this.d = pagerState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1852a) {
            case 0:
                BuildersKt.d(this.b, null, null, new ChaloScrollableTabRowKt$ChaloScrollableTabRow$2$1$1$1$1(this.c, this.d, null), 3);
                break;
            case 1:
                BuildersKt.d(this.b, null, null, new HorizontalImageDialogViewerKt$ImagePager$1$1$1$1(this.c, this.d, null), 3);
                break;
            default:
                BuildersKt.d(this.b, null, null, new HorizontalImageDialogViewerKt$ImagePager$1$3$1$1(this.c, this.d, null), 3);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ a(CoroutineScope coroutineScope, int i, PagerState pagerState, int i2) {
        this.f1852a = i2;
        this.b = coroutineScope;
        this.c = i;
        this.d = pagerState;
    }
}
