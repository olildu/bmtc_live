package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19693a;
    public final /* synthetic */ LazyListState b;
    public final /* synthetic */ MutableIntState c;

    public /* synthetic */ tv0(LazyListState lazyListState, MutableIntState mutableIntState, int i) {
        this.f19693a = i;
        this.b = lazyListState;
        this.c = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int intValue;
        int intValue2;
        switch (this.f19693a) {
            case 0:
                MutableIntState mutableIntState = this.c;
                int intValue3 = mutableIntState.getIntValue();
                LazyListState lazyListState = this.b;
                if (intValue3 <= 0) {
                    intValue = lazyListState.getFirstVisibleItemIndex() + 1;
                } else {
                    int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
                    int intValue4 = mutableIntState.getIntValue() / 3;
                    intValue = (((mutableIntState.getIntValue() / 2) + firstVisibleItemScrollOffset) / (intValue4 >= 1 ? intValue4 : 1)) + lazyListState.getFirstVisibleItemIndex();
                }
                return Integer.valueOf(intValue);
            default:
                MutableIntState mutableIntState2 = this.c;
                int intValue5 = mutableIntState2.getIntValue();
                LazyListState lazyListState2 = this.b;
                if (intValue5 <= 0) {
                    intValue2 = lazyListState2.getFirstVisibleItemIndex() + 2;
                } else {
                    int firstVisibleItemScrollOffset2 = lazyListState2.getFirstVisibleItemScrollOffset();
                    int intValue6 = mutableIntState2.getIntValue() / 5;
                    if (intValue6 < 1) {
                        intValue6 = 1;
                    }
                    intValue2 = (((mutableIntState2.getIntValue() / 2) + firstVisibleItemScrollOffset2) / intValue6) + lazyListState2.getFirstVisibleItemIndex();
                }
                return Integer.valueOf(intValue2);
        }
    }
}
