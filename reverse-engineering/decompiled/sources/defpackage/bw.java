package defpackage;

import androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11234a;
    public final /* synthetic */ LazyListState b;

    public /* synthetic */ bw(LazyListState lazyListState, int i) {
        this.f11234a = i;
        this.b = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int firstVisibleItemIndex;
        switch (this.f11234a) {
            case 0:
                firstVisibleItemIndex = this.b.getFirstVisibleItemIndex();
                break;
            case 1:
                firstVisibleItemIndex = LazyLayoutSemanticStateKt.AnonymousClass1.totalItemsCount_delegate$lambda$0(this.b);
                break;
            case 2:
                firstVisibleItemIndex = this.b.getFirstVisibleItemIndex();
                break;
            default:
                List<LazyListItemInfo> visibleItemsInfo = this.b.getLayoutInfo().getVisibleItemsInfo();
                ArrayList arrayList = new ArrayList(CollectionsKt.v(visibleItemsInfo, 10));
                Iterator<T> it = visibleItemsInfo.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LazyListItemInfo) it.next()).getKey());
                }
                return arrayList;
        }
        return Integer.valueOf(firstVisibleItemIndex);
    }
}
