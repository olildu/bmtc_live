package defpackage;

import androidx.compose.foundation.pager.PagerState;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15725a;
    public final /* synthetic */ PagerState b;

    public /* synthetic */ ge0(PagerState pagerState, int i) {
        this.f15725a = i;
        this.b = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int pageCount;
        switch (this.f15725a) {
            case 0:
                pageCount = this.b.getPageCount();
                break;
            case 1:
                pageCount = this.b.getPageCount();
                break;
            case 2:
                pageCount = this.b.getCurrentPage();
                break;
            case 3:
                pageCount = PagerState.settledPage_delegate$lambda$0(this.b);
                break;
            case 4:
                pageCount = PagerState.targetPage_delegate$lambda$0(this.b);
                break;
            case 5:
                pageCount = this.b.getPageCount();
                break;
            case 6:
                pageCount = this.b.getCurrentPage();
                break;
            case 7:
                PagerState pagerState = this.b;
                return new Pair(Integer.valueOf(pagerState.getCurrentPage()), Boolean.valueOf(pagerState.isScrollInProgress()));
            default:
                PagerState pagerState2 = this.b;
                return new Pair(Integer.valueOf(pagerState2.getCurrentPage()), Boolean.valueOf(pagerState2.isScrollInProgress()));
        }
        return Integer.valueOf(pageCount);
    }
}
